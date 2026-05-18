package com.sam.taskmanagement.event.listener;

import com.sam.taskmanagement.event.TaskCreatedEvent;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class TaskListener {
	@EventListener
	public void handlerTaskCreated(TaskCreatedEvent event) {
	}
}
