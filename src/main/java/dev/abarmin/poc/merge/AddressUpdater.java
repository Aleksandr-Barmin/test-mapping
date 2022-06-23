package dev.abarmin.poc.merge;

import dev.abarmin.poc.merge.model.Address;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(
        componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE
)
public interface AddressUpdater {
    Address update(Address source, @MappingTarget Address target);
}
