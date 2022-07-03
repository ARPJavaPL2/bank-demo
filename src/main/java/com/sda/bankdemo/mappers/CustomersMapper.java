package com.sda.bankdemo.mappers;

import com.sda.bankdemo.dto.CustomerDto;
import com.sda.bankdemo.models.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomersMapper {

    CustomerDto map(Customer customer);

    Customer map(CustomerDto customerDto);
}
