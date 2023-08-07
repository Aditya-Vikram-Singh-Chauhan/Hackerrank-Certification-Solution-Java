package com.ideaproject.domaininfo.repository;

import com.ideaproject.domaininfo.model.BankingDomain;
import com.ideaproject.domaininfo.model.DomainUsers;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DomainUserRepo extends MongoRepository<DomainUsers, Long> {



    @Query(value = "{userId:?0}", delete = true)
    void deleteByUserID(long bankId);

    @Query("{userId:?0}")
    Optional<DomainUsers> findByUserID(long UserId);
}
