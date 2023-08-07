package com.ideaproject.domaininfo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Banking")
public class BankingDomain {
    @Id
    @JsonProperty("domainId")
    private Long domainId;

    @JsonProperty("bankId")
    private Long bankId;
    @JsonProperty("bankName")
    private String bankName;

    @JsonProperty("ifsc")
    private int ifsc;

    @JsonProperty("address")
    private String address;

    @JsonProperty("contact")
    private String contact;
}
