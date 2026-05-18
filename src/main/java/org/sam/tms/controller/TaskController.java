package org.sam.tms.controller;

import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.sam.tms.dto.request.TaskCreationRequest;
import org.sam.tms.dto.response.TaskResponse;
import org.sam.tms.service.TaskService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/tasks")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class TaskController {
	TaskService service;

	@PostMapping("")
	public TaskResponse create(@Valid @RequestBody TaskCreationRequest request) {
		return service.create(1L, request);
	}

	@GetMapping("")
	public String helloWorld() {
		return "Hello World! Brook! How are u today?";
	}
}
