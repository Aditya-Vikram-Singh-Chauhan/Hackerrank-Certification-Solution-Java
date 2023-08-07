package com.ideaproject.domaininfo.configuration;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import software.amazon.awssdk.auth.credentials.AwsCredentials;

/**
 * The program implements an application for
 * policy action using Microservice
 * Create,Update,Cancel
 * This Impl is using to accesing the secretkey and accesskey
 *
 * @author nitesh
 * @version 1.0
 * @since 2022-04-01
 */
@NoArgsConstructor
@Service
public class AwsCredentialsImpl implements AwsCredentials {

    String secretKey;
    String accessKey;

    public AwsCredentialsImpl(String secretKey, String accessKey) {
        this.secretKey = secretKey;
        this.accessKey = accessKey;
    }

    @Override
    public String accessKeyId() {
        return this.accessKey;
    }

    @Override
    public String secretAccessKey() {
        return this.secretKey;
    }


}
