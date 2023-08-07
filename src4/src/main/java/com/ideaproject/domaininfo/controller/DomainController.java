package com.ideaproject.domaininfo.controller;

import com.ideaproject.domaininfo.exception.AlreadyExistException;
import com.ideaproject.domaininfo.exception.ErrorResponse;
import com.ideaproject.domaininfo.exception.NotExistException;
import com.ideaproject.domaininfo.model.AirlineDomain;
import com.ideaproject.domaininfo.model.BankingDomain;
import com.ideaproject.domaininfo.model.DomainUsers;
import com.ideaproject.domaininfo.model.InsuranceDomain;
import com.ideaproject.domaininfo.service.DomainUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class DomainController {

    @Autowired
    DomainUsersService dService;

    @PostMapping("/addDomainUser")
    public String saveDomainUser(@RequestBody DomainUsers user) {
        return dService.saveDomainUser(user);
    }
    @PostMapping("/addDomainUser/Banking")
    public String saveBankingDomain(@RequestBody BankingDomain Banking) {
        return dService.saveBankingDomainUser(Banking);
    }
    @PostMapping("/addDomainUser/Airline")
    public String saveAirlineDomain(@RequestBody AirlineDomain airline) {
        return dService.saveAirlineDomainUser(airline);
    }

    @PostMapping("/addDomainUser/Insurance")
    public String saveInsuranceDomain(@RequestBody InsuranceDomain insurance) {
        return dService.saveInsuranceDomainUser(insurance);
    }
    @GetMapping("/findAllDomainUsers")
    public List<DomainUsers> fetchDomainUsers() {
        List<DomainUsers> li = dService.fetchDomainUsers();
        return li;
    }

    @GetMapping("/findAllDomainUsers/Banks")
    public List<BankingDomain> fetchBanks() {
        List<BankingDomain> banks = dService.fetchBankingDomain();
        return banks;
    }

    @GetMapping("/findAllDomainUsers/Airline")
    public List<AirlineDomain> fetchFlights() {
        List<AirlineDomain> flights = dService.fetchAirlineDomain();
        return flights;
    }

    @GetMapping("/findAllDomainUsers/Insurances")
    public List<InsuranceDomain> fetchInsurances() {
        List<InsuranceDomain> insurances = dService.fetchInsuranceDomain();
        return insurances;
    }

    @DeleteMapping("/deleteDomainUsers/{id}")
    public String deleteDomainUserById(@PathVariable long id) {
        return dService.deleteDomainUserById(id);
    }

    @DeleteMapping("/deleteBank/{id}")
    public String deleteBank(@PathVariable long id) {
        return dService.deleteBank(id);
    }

    @DeleteMapping("/deleteAirline/{id}")
    public String deleteAirline(@PathVariable long id) {
        return dService.deleteAirline(id);
    }

    @DeleteMapping("/deleteInsurance/{insuranceName}")
    public String deleteInsurance(@PathVariable("insuranceName") String insuranceName) {
        return dService.deleteInsurance(insuranceName);
    }

    @ExceptionHandler(value = AlreadyExistException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public ErrorResponse handleCustomerAlreadyExistsException(AlreadyExistException ex)
    {
        return new ErrorResponse(HttpStatus.CONFLICT.value(),
                ex.getMessage());
    }

    @ExceptionHandler(value = NotExistException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse handleException(NotExistException ex)
    {
        return new ErrorResponse(HttpStatus.NOT_FOUND.value(), ex.getMessage());
    }

}
