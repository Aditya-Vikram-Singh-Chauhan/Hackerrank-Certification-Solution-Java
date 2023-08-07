package com.ideaproject.domaininfo.serviceimpl;

import com.ideaproject.domaininfo.exception.AlreadyExistException;
import com.ideaproject.domaininfo.exception.NotExistException;
import com.ideaproject.domaininfo.model.AirlineDomain;
import com.ideaproject.domaininfo.model.BankingDomain;
import com.ideaproject.domaininfo.model.DomainUsers;
import com.ideaproject.domaininfo.model.InsuranceDomain;
import com.ideaproject.domaininfo.repository.AirlineDomainRepo;
import com.ideaproject.domaininfo.repository.BankingDomainRepo;
import com.ideaproject.domaininfo.repository.DomainUserRepo;
import com.ideaproject.domaininfo.repository.InsuranceDomainRepo;
import com.ideaproject.domaininfo.service.DomainUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DomainUsersServiceImpl implements DomainUsersService {

    @Autowired
    DomainUserRepo domainUserRepo;

    @Autowired
    BankingDomainRepo bankingDomainRepo;

    @Autowired
    AirlineDomainRepo airlineDomainRepo;

    @Autowired
    InsuranceDomainRepo insuranceDomainRepo;


    @Override
    public String saveDomainUser(DomainUsers user) {
        Optional<DomainUsers> existingUser = domainUserRepo.findByUserID(user.getUserId());
        if(existingUser.isPresent() && existingUser.get().getUserId() == user.getUserId()){
            throw new AlreadyExistException("User already exists!");
        }
        else{
            domainUserRepo.save(user);
            return "Added Successfully";
        }
    }

    @Override
    public String saveBankingDomainUser(BankingDomain Banking) {
        Optional<BankingDomain> bd = bankingDomainRepo.findByBankDomainID(Banking.getDomainId(), Banking.getBankId());
        //System.out.println(bd.get().getBankId()+"  "+ Banking.getBankId());
        if (bd.isPresent() && bd.get().getBankId() == Banking.getBankId()) {
            throw new AlreadyExistException("Bank already exists!");
        } else {
            bankingDomainRepo.save(Banking);
            return "Added Successfully";
        }
    }

    @Override
    public String saveAirlineDomainUser(AirlineDomain airline) {
        Optional<AirlineDomain> ad = airlineDomainRepo.findByAirlineDomainID(airline.getDomainId(), airline.getAirlineId());
        //sSystem.out.println(ad.get().getAirlineId()+"  "+airline.getAirlineId());
        if(ad.isPresent() && ad.get().getAirlineId() == airline.getAirlineId()){
            throw new AlreadyExistException("Airline already exists!");
        }
        else{
            airlineDomainRepo.save(airline);
            return  "Added Successfully";
        }
    }

    @Override
    public String saveInsuranceDomainUser(InsuranceDomain insurance) {
        Optional<InsuranceDomain> ido = insuranceDomainRepo.findByInsuranceDomainID(insurance.getDomainId(),insurance.getInsuranceName());
        //System.out.println(ido.get().get_id()+" "+insurance.get_id());
        if(ido.isPresent() && ido.get().getInsuranceName().equalsIgnoreCase(insurance.getInsuranceName())){
            throw new AlreadyExistException("Insurance already exists!");
        }
        else{
            insuranceDomainRepo.save(insurance);
            return  "Added Successfully";
        }

    }

    @Override
    public List<DomainUsers> fetchDomainUsers() {
        List<DomainUsers> li =domainUserRepo.findAll();
        return li;
    }

    @Override
    public List<BankingDomain> fetchBankingDomain() {
        List<BankingDomain> banks = bankingDomainRepo.findAll();
        return banks;
    }

    @Override
    public List<AirlineDomain> fetchAirlineDomain() {
        List<AirlineDomain> flights = airlineDomainRepo.findAll();
        return flights;
    }

    @Override
    public List<InsuranceDomain> fetchInsuranceDomain() {
        List<InsuranceDomain> insurance = insuranceDomainRepo.findAll();
        return insurance;
    }

    @Override
    public String deleteDomainUserById(long id) {
        if(domainUserRepo.findByUserID(id).isPresent() && domainUserRepo.findByUserID(id).get().getUserId() == id){
            domainUserRepo.deleteByUserID(id);
            return "Deleted Successfully";
        }
        else{
            throw new NotExistException("User does not exists!");
        }

    }

    @Override
    public String deleteBank(Long bankId) {
        Optional<BankingDomain> bdo = bankingDomainRepo.findByBankID(bankId);
        if (bdo.isPresent() && bdo.get().getBankId() == bankId){
            bankingDomainRepo.deleteByBankDomainID(bankId);
            return "Deleted Successfully";
        }
        else{
            throw new NotExistException("Bank does not exists!");
        }
    }

    @Override
    public String deleteAirline(Long airlineId) {
        Optional<AirlineDomain> ado = airlineDomainRepo.findByAirlineID(airlineId);
        if (ado.isPresent() && ado.get().getAirlineId() == airlineId){
            airlineDomainRepo.deleteByAirlineDomainID(airlineId);
            return "Deleted Successfully";
        }
        else{
            throw new NotExistException("Airline does not exists!");
        }
    }

    @Override
    public String deleteInsurance(String insuranceName) {
        Optional<InsuranceDomain> idoo = insuranceDomainRepo.findByInsuranceName(insuranceName);
        if(idoo.isPresent() && idoo.get().getInsuranceName().equalsIgnoreCase(insuranceName)){
            insuranceDomainRepo.deleteByInsuranceDomainID(insuranceName);
            return "Deleted Successfully";
        }
        else{
            throw new NotExistException("Insurance does not exists!");
        }
    }
}
