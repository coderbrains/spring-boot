package com.crud.embeded.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="book")

public class Book {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int bookId;
	private String bookName;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Author Author; 
}
