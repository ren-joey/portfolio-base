package com.portfoliobase.controller;

import com.portfoliobase.service.I18nService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class I18nController {
    private final I18nService i18nService;

    @GetMapping("/i18n/sync")
    public void syncI18nFromTolgee() {
        i18nService.syncI18nFromTolgee();
    }
}
