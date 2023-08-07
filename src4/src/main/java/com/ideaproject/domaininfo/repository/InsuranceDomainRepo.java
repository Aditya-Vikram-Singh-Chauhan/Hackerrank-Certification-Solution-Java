package com.ideaproject.domaininfo.repository;

import com.ideaproject.domaininfo.model.BankingDomain;
import com.ideaproject.domaininfo.model.InsuranceDomain;
import io.micrometer.core.instrument.config.validate.Validated;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InsuranceDomainRepo extends MongoRepository<InsuranceDomain, Long> {

    @Query("{domainId:?0, insuranceName:?1}")
    Optional<InsuranceDomain> findByInsuranceDomainID(long domainId, String insuranceName);

    @Query(value = "{insuranceName:?0}", delete = true)
    void deleteByInsuranceDomainID(String insuranceName);
    @Query("{insuranceName:?0}")
    Optional<InsuranceDomain> findByInsuranceName(String insuranceName);
}
