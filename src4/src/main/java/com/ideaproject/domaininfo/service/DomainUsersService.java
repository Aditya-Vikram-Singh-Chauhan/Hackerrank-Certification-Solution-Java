package com.ideaproject.domaininfo.service;

import com.ideaproject.domaininfo.model.AirlineDomain;
import com.ideaproject.domaininfo.model.BankingDomain;
import com.ideaproject.domaininfo.model.DomainUsers;
import com.ideaproject.domaininfo.model.InsuranceDomain;

import java.util.List;

public interface DomainUsersService {

    String saveDomainUser(DomainUsers user); //Add User

    String saveBankingDomainUser(BankingDomain Banking);

    String saveAirlineDomainUser(AirlineDomain airline);

    String saveInsuranceDomainUser(InsuranceDomain insurance);

    List<DomainUsers> fetchDomainUsers();//Fetch all users

    List<BankingDomain> fetchBankingDomain();

    List<AirlineDomain> fetchAirlineDomain();

    List<InsuranceDomain> fetchInsuranceDomain();

    String deleteDomainUserById(long id);//Delete user by ID

    String deleteBank(Long bankId);

    String deleteAirline(Long airlineId);

    String deleteInsurance(String insuranceName);
}
