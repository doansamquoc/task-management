package org.sam.tms.controller;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.sam.tms.dto.api.ApiResponse;
import org.sam.tms.dto.request.UserCreationRequest;
import org.sam.tms.dto.response.UserResponse;
import org.sam.tms.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserController {
	UserService service;

	@PostMapping("")
	@ResponseStatus(HttpStatus.CREATED)
	public ApiResponse<UserResponse> create(@RequestBody UserCreationRequest request) {
		return ApiResponse.of(service.create(request));
	}
}
