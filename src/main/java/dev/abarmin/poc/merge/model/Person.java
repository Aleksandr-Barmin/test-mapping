package dev.abarmin.poc.merge.model;

import lombok.Data;

import java.util.Collection;

@Data
public class Person {
    private String firstName;
    private String lastName;

    private Address address;
    private PersonName personName;

    private Collection<Address> addresses;
    private Collection<String> aliases;
}
