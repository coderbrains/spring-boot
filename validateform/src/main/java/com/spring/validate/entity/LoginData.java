package com.spring.validate.entity;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoginData {
	
	@NotBlank(message = "username field cannot be blank")
	@Size(max = 20,min = 2, message="The username is between 2 to 20 char")
	private String username;
	
	@Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message= "The emial id is not correct.")
	private String email;

	@AssertTrue(message = "This must be checked.")
	private boolean check;
	
}
