package org.sam.tms.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import org.sam.tms.enums.Gender;
import org.sam.tms.enums.Role;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User extends BaseEntity {
	@Column(name = "username", unique = true)
	String username;

	@Column(name = "password")
	String password;

	@Column(name = "email")
	String email;

	@Column(name = "display_name")
	String displayName;

	@Enumerated(EnumType.STRING)
	@Column(name = "gender")
	Gender gender;

	@Column(name = "dob")
	LocalDate dob;

	@Column(name = "avatar")
	String avatar;

	@Builder.Default
	@Column(name = "role")
	@Enumerated(EnumType.STRING)
	Role role = Role.USER;

	@OneToMany(
		mappedBy = "assignor", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true
	)
	List<Task> assignedTasks;

	@OneToMany(
		mappedBy = "assignee", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true
	)
	List<Task> receivedTasks;
}
