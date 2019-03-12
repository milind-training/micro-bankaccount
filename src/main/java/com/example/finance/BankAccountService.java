package com.example.finance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bankAccounts")
public class BankAccountService {
	
	@Autowired
	private BankAccountDao bankAccountDao;
	private static int count = 0;
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public BankAccount create(BankAccount bankAccount)
	{
		return bankAccountDao.create();
	}
	
	@RequestMapping(value="/{bankAccountId}", method=RequestMethod.GET)
	public BankAccount getBankAcount(@PathVariable String bankAccountId) throws InterruptedException
	{
		/*
		 * if(count++ > 2) Thread.sleep(1100);
		 */
		return bankAccountDao.get(Integer.valueOf(bankAccountId));
	}

}
