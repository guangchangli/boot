package com.lgc.boot.web;

import com.lgc.boot.service.AccountService;
import com.lgc.boot.validate.Account;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author lgc
 **/
@RestController
public class ValidatorController {


    final
    AccountService accountService;

    public ValidatorController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/saveAccount")
    public String saveAccount(@RequestBody @Valid Account account) {
        System.out.println(accountService.saveAccount(account));
        return accountService.saveAccount(account) ? "保存成功" : "保存失败";
    }
}
