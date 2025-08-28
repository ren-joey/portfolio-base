package com.portfoliobase.dto.tolgee;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TolgeeTranslationDto {
    @JsonProperty("_embedded")
    private Embedded embedded;

    @JsonProperty("page")
    private PageInfo page;
}