package dev.abarmin.poc.merge;

import dev.abarmin.poc.merge.model.Address;
import dev.abarmin.poc.merge.model.Person;
import dev.abarmin.poc.merge.model.PersonEntity;
import org.mapstruct.*;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(
        componentModel = "spring"

//        unmappedSourcePolicy = ReportingPolicy.ERROR
)
public abstract class PersonEntityMapper {
    @Autowired
    private PersonRepository personRepository;

    @ObjectFactory
    public PersonEntity createPerson(Person person) {
        return personRepository.findById(10L)
                .orElse(new PersonEntity());
    }

    public Address fromEntity(AddressEntity entity) {
        return new Address();
    }

    public AddressEntity toEntity(Address address) {
        return new AddressEntity();
    }

    @Mapping(source = "personFirstName", target = "firstName")
    @Mapping(source = "personLastName", target = "lastName")
    public abstract Person map(PersonEntity entity);

    @InheritInverseConfiguration
    public abstract PersonEntity map(Person person);
}
