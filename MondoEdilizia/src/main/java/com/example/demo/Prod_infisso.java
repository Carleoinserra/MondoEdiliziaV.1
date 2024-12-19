package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Prod_infisso {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	long id;
	
	String nome;
	String materiale;
	double prezzo;
	String descrizione;

}
