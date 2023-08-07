package com.ideaproject.domaininfo.configuration;

import software.amazon.awssdk.services.secretsmanager.SecretsManagerClient;

public class SecretsManagerServiceImpl extends SecretsManagerService {
    public SecretsManagerServiceImpl(SecretsManagerClient build) {
        super();
    }
}
