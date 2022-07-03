package com.sda.bankdemo.services;

import com.sda.bankdemo.dto.CustomerDto;
import com.sda.bankdemo.mappers.CustomersMapper;
import com.sda.bankdemo.models.Customer;
import com.sda.bankdemo.repositories.CustomersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CustomersService {

    private final CustomersMapper customersMapper;
    private final CustomersRepository customersRepository;

    public void create(CustomerDto customerDto) {
        Customer customer = customersMapper.map(customerDto);
        customersRepository.save(customer);
    }

    public CustomerDto getById(Long id) {
        Customer customer = customersRepository.getReferenceById(id);
        return customersMapper.map(customer);
    }

    public List<CustomerDto> getPage() {
        return customersRepository.findAll().stream()
                .map(customer -> customersMapper.map(customer))
                .collect(Collectors.toList());
    }

    public void update() {


    }

    public void deleteById(Long id) {
        customersRepository.deleteById(id);
    }
}
