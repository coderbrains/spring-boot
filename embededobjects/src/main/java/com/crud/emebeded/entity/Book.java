package com.crud.emebeded.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "book_details")
public class Book {

	@Id
	private int id;
	private String name;
	private int price;
	@OneToOne(cascade = CascadeType.ALL)
	private Author author;
	
}
