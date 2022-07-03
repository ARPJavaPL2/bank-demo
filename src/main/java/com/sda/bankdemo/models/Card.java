package com.sda.bankdemo.models;

import com.sda.bankdemo.enums.CardType;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false, length = 16)
    private String cardNumber;

    @Column(nullable = false)
    private LocalDate expiredDate;

    @Column(nullable = false, length = 3)
    private String csvCode;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 10)
    private CardType cardType;

    @ManyToOne(fetch = FetchType.LAZY)
    private Account account;

}
