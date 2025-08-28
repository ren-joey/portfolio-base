package com.portfoliobase.service;

import com.portfoliobase.config.TolgeeConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class I18nService {
    private final TolgeeConfig tolgeeConfig;

    public void syncI18nFromTolgee() {
        String apiKey = tolgeeConfig.getApiKey();
        String apiUrl = tolgeeConfig.getApiUrl();
        RestTemplate restTemplate = new RestTemplate();
        // Tolgee 串到一半
        RequestEntity<>
        restTemplate.exchange(
            apiUrl,
        )
    }
}
