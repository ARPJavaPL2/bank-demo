package com.sda.bankdemo.repositories;

import com.sda.bankdemo.models.Currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrenciesRepository extends JpaRepository<Currency, Long> {
}
