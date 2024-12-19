package com.example.demo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
 
import java.util.List;
 
@Service
public class ProdService {
 
	 @PersistenceContext
	  private EntityManager entityManager;
 
    @Transactional
    public void inserisciParquet(String nome, String materiale,String collezione, String descrizione, double prezzo, String url) {
    	Prod_parquet parquet = new Prod_parquet();
    	parquet.setNome(nome);
    	parquet.setMateriale(materiale);
    	parquet.setDescrizione(descrizione);
    	parquet.setCollezione(collezione);
    	parquet.setPrezzo(prezzo);
    	parquet.setUrl(url);
 
        entityManager.persist(parquet);
    }
    
    @Transactional
    public void inserisciParapetto(String nome, String descrizione,String spessore, double prezzo, String url) {
    	Prod_parapetto p1 = new Prod_parapetto();
    	p1.setNome(nome);
    	p1.setDescrizione(descrizione);
    	p1.setSpessore(spessore);
    	p1.setPrezzo(prezzo);
    	p1.setUrl(url);
    	
 
        entityManager.persist(p1);
    }
 
}