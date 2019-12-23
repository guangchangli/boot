package com.lgc.boot.service.impl;

import com.lgc.boot.service.AccountService;
import com.lgc.boot.validate.Account;
import org.springframework.stereotype.Service;

/**
 * @author lgc
 **/
@Service
public class AccountServiceImpl implements AccountService {

    @Override
    public boolean saveAccount(Account account) {
        return false;
    }
}
