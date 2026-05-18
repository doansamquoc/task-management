package org.sam.tms.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;
import org.sam.tms.dto.request.TaskCreationRequest;
import org.sam.tms.dto.response.TaskResponse;
import org.sam.tms.entity.Task;

@Mapper(
	componentModel = "spring",
	nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
	unmappedSourcePolicy = ReportingPolicy.IGNORE,
	unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface TaskMapper {
	Task toEntity(TaskCreationRequest request);

	TaskResponse toResponse(Task task);
}
