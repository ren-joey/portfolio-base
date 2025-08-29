package com.portfoliobase.config;

import com.portfoliobase.utils.Constants;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

@Component
@ConfigurationProperties(prefix = "tolgee")
@Getter
@Setter
public class I18nConfig {
    private String apiKey;
    private String apiUrl;
    private String projectId;
    private List<Locale> acceptedLanguages = Arrays.asList(
        Locale.forLanguageTag(Constants.I18n.EN_US),
        Locale.forLanguageTag(Constants.I18n.ZH_HANS),
        Locale.forLanguageTag(Constants.I18n.ZH_HANT_TW)
    );

    public String getApiUrl() {
        return String.format(apiUrl, projectId);
    }
}
