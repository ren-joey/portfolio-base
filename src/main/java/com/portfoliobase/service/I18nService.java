package com.portfoliobase.service;

import com.portfoliobase.config.TolgeeConfig;
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
    public static final String X_API_KEY = "X_API_KEY";
    private final TolgeeConfig tolgeeConfig;

    public void syncI18nFromTolgee() {
        TolgeeTranslationDto tolgeeTranslationDto = getTolgeeTranslation();
        // 建立 Locale
        Locale enUS = Locale.forLanguageTag(Constants.I18n.EN_US);
        Locale zhHans = Locale.forLanguageTag(Constants.I18n.ZH_HANS);
        Locale zhHantTW = Locale.forLanguageTag(Constants.I18n.ZH_HANT_TW);
    }

    public TolgeeTranslationDto getTolgeeTranslation() {
        String apiKey = tolgeeConfig.getApiKey();
        String apiUrl = tolgeeConfig.getApiUrl();
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
