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
@Document(collection = "users")
public class DomainUsers {

    @Id
    @JsonProperty("userId")
    private Long userId;


    @JsonProperty("name")
    private String name;

    @JsonProperty("age")
    private int age;

    @JsonProperty("address")
    private String address;

    @JsonProperty("contact")
    private String contact;
}
