package com.sda.bankdemo.repositories;

import com.sda.bankdemo.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomersRepository extends JpaRepository<Customer, Long> {

}
