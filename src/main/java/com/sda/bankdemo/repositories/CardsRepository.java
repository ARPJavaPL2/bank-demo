package com.sda.bankdemo.repositories;

import com.sda.bankdemo.models.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardsRepository extends JpaRepository<Card, Long> {
}
