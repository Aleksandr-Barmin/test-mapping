package dev.abarmin.poc.merge;

import dev.abarmin.poc.merge.model.PersonName;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(
        componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE
)
public interface PersonNameUpdater {
    PersonName update(
            PersonName source,
            @MappingTarget PersonName target
    );
}
