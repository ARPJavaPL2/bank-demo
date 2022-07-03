package com.sda.bankdemo.services;

import com.sda.bankdemo.dto.CustomerDto;
import com.sda.bankdemo.exceptions.ResourceNotFoundException;
import com.sda.bankdemo.exceptions.ResourceValidationException;
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
        Customer customer = customersRepository.findById(id)
                .orElseThrow(() -> getCustomerNotFoundException(id));
        return customersMapper.map(customer);
    }

    public List<CustomerDto> getPage() {
        return customersRepository.findAll().stream()
                .map(customer -> customersMapper.map(customer))
                .collect(Collectors.toList());
    }

    public void updateById(Long id, CustomerDto customerDto) {

        if (customersRepository.existsById(id)) {
            throw getCustomerNotFoundException(id);
        }

        Long customerDtoId = customerDto.getId();
        if (id.equals(customerDtoId)) {
            throw new ResourceValidationException(
                    String.format("Id parameter '%s' and customer id '%s' does not match",
                            id, customerDtoId)
            );
        }

        Customer customer = customersMapper.map(customerDto);
        customersRepository.save(customer);
    }

    public void deleteById(Long id) {
        customersRepository.deleteById(id);
    }

    private ResourceNotFoundException getCustomerNotFoundException(Long id) {
        return new ResourceNotFoundException(String.format("Customer with id '%s' not found", id));
    }
}
