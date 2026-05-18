package org.sam.tms.dto.response;

import org.sam.tms.enums.Priority;
import org.sam.tms.enums.TaskStatus;

import java.time.Instant;

public record TaskResponse(
	String name,
	String description,
	TaskStatus status,
	Priority priority,
	Instant deadlineAt,
	Instant completedAt,
	Instant canceledAt,
	Long assignorId,
	Long assigneeId,
	Instant createdAt,
	Instant updatedAt
) {}
