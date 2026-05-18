package org.sam.tms.dto.request;

import jakarta.validation.constraints.NotNull;
import org.sam.tms.enums.Priority;
import org.sam.tms.enums.TaskStatus;

import java.time.Instant;

public record TaskCreationRequest(
	String name,

	String description,

	TaskStatus status,

	Priority priority,

	Instant deadlineAt,

	@NotNull(message = "task.assginee_id.required")
	Long assigneeId
) {}
