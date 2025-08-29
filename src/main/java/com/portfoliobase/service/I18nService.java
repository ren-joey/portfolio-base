package com.portfoliobase.service;

import com.portfoliobase.config.I18nConfig;
import com.portfoliobase.dto.tolgee.TolgeeKey;
import com.portfoliobase.dto.tolgee.TolgeeTranslationDto;
import com.portfoliobase.utils.Constants;
import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Locale;

@Service
@RequiredArgsConstructor
public class I18nService {
    public static final String X_API_KEY = "X-API-Key";
    private final I18nConfig i18nConfig;

    public void syncI18nFromTolgee() {
        TolgeeTranslationDto tolgeeTranslationDto = getTolgeeTranslation();
        for (TolgeeKey key: tolgeeTranslationDto.getEmbedded().getKeys()) {

        }
    }

    public TolgeeTranslationDto getTolgeeTranslation() {
        String apiKey = i18nConfig.getApiKey();
        String apiUrl = i18nConfig.getApiUrl();
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.set(X_API_KEY, apiKey);
        ResponseEntity<TolgeeTranslationDto> response = restTemplate.exchange(
            apiUrl,
            HttpMethod.GET,
            new HttpEntity<>(headers),
            TolgeeTranslationDto.class
        );
        return response.getBody();
    }
}
