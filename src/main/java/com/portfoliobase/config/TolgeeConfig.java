package com.portfoliobase.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "tolgee")
@Getter
@Setter
public class TolgeeConfig {
    private String apiKey;
    private String apiUrl;
    private String projectId;

    public String getApiUrl() {
        return String.format(apiUrl, projectId);
    }
}
