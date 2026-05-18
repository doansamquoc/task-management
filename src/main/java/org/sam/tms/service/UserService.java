package org.sam.tms.service;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.sam.tms.dto.request.UserCreationRequest;
import org.sam.tms.dto.response.UserResponse;
import org.sam.tms.entity.User;
import org.sam.tms.mapper.UserMapper;
import org.sam.tms.repository.UserRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserService {
	UserMapper mapper;
	UserRepository repository;

	public UserResponse create(UserCreationRequest request) {
		User user = mapper.toEntity(request);
		return mapper.toDto(repository.save(user));
	}

	public boolean existsById(@NonNull Long id) {
		return repository.existsById(id);
	}
}
