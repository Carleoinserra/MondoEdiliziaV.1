package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Prod_vetrata {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	long id;
	String nome;
	
	String vetro;
	
	String descrizione;
	
	double prezzo;
	

}
