package com.icons.icons.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name= "Continente")
@Getter
@Setter

public class ContinenteEntity {

	
	
	@Id
	@Column
	@GeneratedValue (strategy = GenerationType.SEQUENCE)
	private Long id;
	private String imagen;
	private String denominacion;
	
	
	
}
