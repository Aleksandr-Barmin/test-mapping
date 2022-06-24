package dev.abarmin.poc.merge;

import dev.abarmin.poc.merge.model.Person;
import org.mapstruct.*;

@Mapper(
        config = MapperConfiguration.class,
        uses = {
                AddressUpdater.class,
                PersonNameUpdater.class
        }
)
public interface PersonUpdater {
    Person update(
            Person source,
            @MappingTarget Person target
    );
}

// DTO -> conversion -> @Entity
// @Entity -> DTO
