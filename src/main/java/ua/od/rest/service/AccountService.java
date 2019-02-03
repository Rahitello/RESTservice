package ua.od.rest.service;

import ua.od.rest.dto.AccountDto;
import ua.od.rest.entity.AccountEntity;

public interface AccountService {

    String verify(AccountDto account);
    String newUser(AccountDto accountDto);

}
