package it.polito.tdp.ruzzle.model;

import java.util.HashMap;
import java.util.Map;

public class RuzzleModel {
	
	
	
	public Map< Parola , String> genera(Quadrato q){
	    
		Ricerca ric = new Ricerca();
	    
		Map <Parola , String> listaParole = ric.cercaParole(q);
	    
		return listaParole;
	}
}
