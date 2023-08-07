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
@Document(collection = "Insurance")
public class InsuranceDomain {
    @Id
    @JsonProperty("domainId")
    private Long domainId;

    @JsonProperty("insuranceName")
    private String insuranceName;
    @JsonProperty("insuranceStatus")
    private String insuranceStatus;

    @JsonProperty("location")
    private String location;

}
