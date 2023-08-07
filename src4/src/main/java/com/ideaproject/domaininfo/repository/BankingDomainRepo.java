package com.ideaproject.domaininfo.repository;
import com.ideaproject.domaininfo.model.BankingDomain;
import com.ideaproject.domaininfo.model.DomainUsers;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BankingDomainRepo extends MongoRepository<BankingDomain, Long> {

    @Query("{domainId:?0, bankId:?1}")
    Optional<BankingDomain> findByBankDomainID(long domainId, long bankId);

    @Query(value = "{bankId:?0}", delete = true)
    void deleteByBankDomainID(long bankId);

    @Query("{bankId:?0}")
    Optional<BankingDomain> findByBankID(long bankId);

}
