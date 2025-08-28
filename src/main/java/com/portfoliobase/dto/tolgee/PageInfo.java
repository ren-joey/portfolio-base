package com.portfoliobase.dto.tolgee;

import lombok.Data;

@Data
public class PageInfo {
    private int size;
    private int totalElements;
    private int totalPages;
    private int number;
}