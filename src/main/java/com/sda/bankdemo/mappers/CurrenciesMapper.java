package com.sda.bankdemo.mappers;

import com.sda.bankdemo.dto.CurrencyDto;

import com.sda.bankdemo.models.Currency;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface CurrenciesMapper {

    CurrencyDto map(Currency currency);

    Currency map(CurrencyDto currencyDto);
}
