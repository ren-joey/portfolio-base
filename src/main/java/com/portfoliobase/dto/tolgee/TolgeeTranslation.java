package com.portfoliobase.dto.tolgee;

import lombok.Data;

@Data
public class TolgeeTranslation {
    private Long id;
    private String text;
    private String state;
    private boolean outdated;
}