package com.spring.entity;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class LoginCredentials {
	
	
	@NotBlank(message = "username cannot be blank.")
	@Size(min = 3 , max = 20 , message = "Size of the message must be between 3 to 20")
	private String userName;
	
	@Pattern(regexp ="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$" , message= "Please enter the valid email")
	private String email;
	
	@AssertTrue(message = "Please check the terms and conditions.")
	private boolean agreed;

}
