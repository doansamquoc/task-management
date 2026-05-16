package com.sam.taskmanagement.mapper;

import com.sam.taskmanagement.dto.request.UserCreationRequest;
import com.sam.taskmanagement.dto.response.UserResponse;
import com.sam.taskmanagement.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

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
