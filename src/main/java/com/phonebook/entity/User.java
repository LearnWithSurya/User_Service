package com.phonebook.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="user_service")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
	@Id
	@Column(name="user_id")
	private String userId;
	
	@Column(name = "user_name",length = 20)
	private String name;
	
	@Column(name="user_email",unique = true)
	private String email;
	
	
	private String about;

}
