package com.portfoliobase.entity;

import com.portfoliobase.entity.abstractentity.IdentityEntity;
import com.portfoliobase.utils.Constants;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class I18n extends IdentityEntity {
    @Column()
    private String i18nKey;

    @Column(name = Constants.I18n.EN_US_COLUMN)
    private String enUS;

    @Column(name = Constants.I18n.ZH_HANS_COLUMN)
    private String zhHans;

    @Column(name = Constants.I18n.ZH_HANT_TW_COLUMN)
    private String zhHantTW;

    @Column(nullable = false)
    private Long createdTime;

    @Column()
    private Long updatedTime;
}
