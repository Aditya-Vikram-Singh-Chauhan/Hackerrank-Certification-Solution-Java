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
@Document(collection = "Airline")
public class AirlineDomain {

    @Id
    @JsonProperty("domainId")
    private Long domainId;

    @JsonProperty("airlineId")
    private Long airlineId;
    @JsonProperty("airlineName")
    private String airlineName;

    @JsonProperty("departure")
    private String departure;

    @JsonProperty("arrival")
    private String arrival;
}
