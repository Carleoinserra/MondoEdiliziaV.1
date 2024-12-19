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
    @Transactional
    public void inserisciVetrata(String nome, String vetro, String descrizione, double prezzo, String url) {
    	Prod_vetrata vetrata = new Prod_vetrata();
    	vetrata.setNome(nome);
    	vetrata.setVetro(vetro);
    	vetrata.setDescrizione(descrizione);
    	vetrata.setPrezzo(prezzo);
    	vetrata.setUrl(url);
 
        entityManager.persist(vetrata);
    
    
}
    @Transactional
    public void inserisciInfisso(String nome, String materiale, double prezzo, String descrizione, String url) {
        // Crea un nuovo oggetto Dip con i parametri forniti
        Prod_infisso infisso = new Prod_infisso();
        infisso.setNome(nome);
        infisso.setMateriale(materiale);
        infisso.setPrezzo(prezzo);
        infisso.setDescrizione(descrizione);
        infisso.setUrl(url);
        
        entityManager.persist(infisso);
    }
 
}