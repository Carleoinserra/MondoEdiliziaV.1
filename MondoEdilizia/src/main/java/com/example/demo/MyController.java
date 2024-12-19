package com.example.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	
	@Autowired
	ProdService p1;
	
	
	@GetMapping("/")
	public String  hello() {
		
		//p1.createMobile("poltrona", "Divani&Divani",180, "ciao1.jpeg");
		
		//p1.updatePrezzo("poltrona", 280);
		
		//p1.updateUrl("poltrona", "ciacia.jpg");
		
		//ArrayList<mobili> lista = p1.getAllProd();
		
		
		
		
		return "form";
		
		
		
	}
	@ResponseBody
	@PostMapping("/addP")
	public String addP(@RequestParam("nome") String nome, 
	@RequestParam("materiale") String materiale,
	@RequestParam("collezione") String collezione,
	@RequestParam("descrizione") String descrizione,
	@RequestParam("prezzo") double prezzo,
	@RequestParam("url") String url
	) {
		
		p1.inserisciParquet(nome, materiale, collezione, descrizione, prezzo, url);
		
		return "parquet aggiunto";
		
	}
	
	@ResponseBody
	@PostMapping("/addPa")
	public String addP(@RequestParam("nome") String nome, 
	@RequestParam("spessore") String spessore,
	@RequestParam("descrizione") String descrizione,
	
	@RequestParam("prezzo") double prezzo,
	@RequestParam("url") String url
	) {
		
		p1.inserisciParapetto(nome, descrizione, spessore, prezzo, url);
		
		return "parquet aggiunto";
		
	}
	

}

