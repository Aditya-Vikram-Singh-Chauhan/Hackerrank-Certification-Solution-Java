package com.ideaproject.domaininfo.configuration;


import com.fasterxml.jackson.databind.JsonNode;
import com.ideaproject.domaininfo.model.DomainInfoConstant;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.auth.credentials.AwsCredentials;
import software.amazon.awssdk.auth.credentials.AwsCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.secretsmanager.SecretsManagerClient;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;



@Configuration
public class DataSourceConfig {

    @Value("${sqs.region}")
    private String awsRegion;
    @Value("${secret.queue.name}")
    private String secretManager;
    @Value("${sqs.access.key}")
    private String accessKey;
    @Value("${sqs.secret.key}")
    private String secretKey;



    /*@Bean
    public DataSource getDataSource() {

        Map<String, String> mapdata=null;
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url(mapdata.get(DomainInfoConstant.DB_URL));
        dataSourceBuilder.username(mapdata.get(DomainInfoConstant.DB_USERNAME));
        dataSourceBuilder.password(mapdata.get(DomainInfoConstant.DB_PASSWORD));

        return dataSourceBuilder.build();

    }*/


    public Map<String, String> getSecret() {
        Map map = new HashMap<String, String>();
        SecretsManagerService secretmanagerService = new SecretsManagerServiceImpl(SecretsManagerClient.builder()
                .region(Region.of(awsRegion)).credentialsProvider(new AwsCredentialsProvider() {
                    @Override
                    public AwsCredentials resolveCredentials() {
                        AwsCredentials awsCredentials = new AwsCredentialsImpl(secretKey, accessKey);
                        return awsCredentials;
                    }
                })
                .build());

        JsonNode jsonNode = secretmanagerService.getSecrets(secretManager);
        map.put(DomainInfoConstant.DB_URL, jsonNode.at(DomainInfoConstant.DB_CREDENTIAL_URL).asText());
        map.put(DomainInfoConstant.DB_USERNAME, jsonNode.at(DomainInfoConstant.DB_CREDENTIAL_USERNAME).asText());
        map.put(DomainInfoConstant.DB_PASSWORD, jsonNode.at(DomainInfoConstant.DB_CREDENTIAL_PASSWORD).asText());
        return map;
    }


}
