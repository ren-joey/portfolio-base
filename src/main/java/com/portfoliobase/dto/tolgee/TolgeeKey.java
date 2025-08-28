package com.portfoliobase.dto.tolgee;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class TolgeeKey {
    private String keyName; // e.g. "b.KEY"
    private List<TolgeeTag> keyTags;
    private Map<String, TolgeeTranslation> translations;
}