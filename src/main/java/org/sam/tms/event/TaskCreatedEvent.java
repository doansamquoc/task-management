package org.sam.tms.event;

import org.sam.tms.entity.Task;

public record TaskCreatedEvent(Task task) {}