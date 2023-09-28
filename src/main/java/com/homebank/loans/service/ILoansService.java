package com.homebank.loans.service;

import com.homebank.loans.dto.LoansDto;

public interface ILoansService {

    void createLoan(String mobileNumber);


    LoansDto fetchLoan(String mobileNumber);


    boolean updateLoan(LoansDto loansDto);



}
