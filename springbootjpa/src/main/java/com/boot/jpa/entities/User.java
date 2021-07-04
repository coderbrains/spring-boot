package com.boot.jpa.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter 
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
	@Id
	private int id;
	private String name;
	private String about;
	private String address;
	
}
