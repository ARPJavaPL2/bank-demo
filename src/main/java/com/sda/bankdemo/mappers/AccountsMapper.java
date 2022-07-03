package com.sda.bankdemo.mappers;

import com.sda.bankdemo.dto.AccountDto;
import com.sda.bankdemo.models.Account;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AccountsMapper {

    AccountDto map(Account account);

    Account map(AccountDto accountDto);
}
