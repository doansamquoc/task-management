package org.sam.tms.dto.request;

public record UserCreationRequest(
	String email,
	String username,
	String displayName,
	String password
) {}
