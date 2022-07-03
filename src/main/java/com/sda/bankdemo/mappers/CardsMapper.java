package com.sda.bankdemo.mappers;

import com.sda.bankdemo.dto.CardDto;
import com.sda.bankdemo.dto.CustomerDto;
import com.sda.bankdemo.models.Card;
import com.sda.bankdemo.models.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CardsMapper {

    CardDto map(Card card);

    Card map(CardDto cardDto);
}
