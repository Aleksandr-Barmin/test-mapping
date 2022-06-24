package dev.abarmin.poc.merge.model;

import dev.abarmin.poc.merge.AddressEntity;
import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class PersonEntity {
    private Long id;
    private String personFirstName;
    private String personLastName;

    private AddressEntity address;
}
