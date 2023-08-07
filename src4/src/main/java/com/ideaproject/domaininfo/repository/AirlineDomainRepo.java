package com.ideaproject.domaininfo.repository;

import com.ideaproject.domaininfo.model.AirlineDomain;
import com.ideaproject.domaininfo.model.BankingDomain;
import com.ideaproject.domaininfo.model.InsuranceDomain;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AirlineDomainRepo extends MongoRepository<AirlineDomain, Long> {
    @Query("{domainId:?0, airlineId:?1}")
    Optional<AirlineDomain> findByAirlineDomainID(long domainId, long airlineId);


    @Query(value = "{airlineId:?0}", delete = true)
    void deleteByAirlineDomainID(long airlineId);

    @Query("{airlineId:?0}")
    Optional<AirlineDomain> findByAirlineID(long airlineId);
}
