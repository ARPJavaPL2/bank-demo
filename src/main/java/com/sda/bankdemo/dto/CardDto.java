package com.sda.bankdemo.dto;

import com.sda.bankdemo.enums.CardType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CardDto {

    private Long id;
    private String cardNumber;
    private LocalDate expiredDate;
    private String csvCode;
    private CardType cardType;
    private AccountDto account;

}
