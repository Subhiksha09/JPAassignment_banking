package com.capgemini.BankingApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.BankingApplication.bean.Account;
import com.capgemini.BankingApplication.service.AccountService;

@RestController
public class AccountController {
	@Autowired
	private AccountService accountService;
	
	@GetMapping("/account")
	public List<Account> getAllAccounts(){
		return accountService.getAllAccounts();	
	}
	
	@GetMapping("/account/{acc_id}")
	public Account getAccount(@PathVariable long acc_id) {
		return accountService.getAccount(acc_id);
	}
	
	
	
	@DeleteMapping("account/{acc_id}")
	public void delete(@PathVariable long acc_id) {
		accountService.deleteAccount(acc_id);
	}
	
	
}