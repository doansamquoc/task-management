package org.sam.tms.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;
import org.sam.tms.dto.request.UserCreationRequest;
import org.sam.tms.dto.response.UserResponse;
import org.sam.tms.entity.User;

@Mapper(
	componentModel = "spring",
	nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
	unmappedSourcePolicy = ReportingPolicy.IGNORE,
	unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface UserMapper {
	User toEntity(UserCreationRequest request);

	UserResponse toDto(User user);
}
