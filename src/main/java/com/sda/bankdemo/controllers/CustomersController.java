package com.sda.bankdemo.controllers;


import com.sda.bankdemo.dto.CustomerDto;
import com.sda.bankdemo.services.CustomersService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/customers")
public class CustomersController {

    private final CustomersService customersService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<CustomerDto> getPage() {
        return customersService.getPage();
    }

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public CustomerDto getById(@PathVariable Long id) {
        return customersService.getById(id);
    }
}


