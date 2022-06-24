package dev.abarmin.poc.merge;

import dev.abarmin.poc.merge.model.Person;
import org.mapstruct.*;

@Mapper(
        componentModel = "spring",
        uses = {
                AddressUpdater.class,
                PersonNameUpdater.class
        },

        unmappedSourcePolicy = ReportingPolicy.ERROR,
        unmappedTargetPolicy = ReportingPolicy.ERROR,

        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE
)
public interface PersonUpdater {
    Person update(
            Person source,
            @MappingTarget Person target
    );
}

// DTO -> conversion -> @Entity
// @Entity -> DTO
