package com.capgemini.BankingApplication.repositories;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.BankingApplication.bean.Loan;



public interface LoanRepository extends CrudRepository<Loan, Integer>{

}
