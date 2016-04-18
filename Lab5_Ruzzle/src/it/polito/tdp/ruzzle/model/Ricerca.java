package it.polito.tdp.ruzzle.model;

import java.util.ArrayList;
import java.util.List;

import it.polito.tdp.dao.ParolaDAO;

public class Ricerca {
	
	private ParolaDAO dao = new ParolaDAO();
	List<Parola> result = new ArrayList <Parola>();
	
	
	public List <String> cercaParole (Quadrato q){
		
		List <String> parole = new ArrayList <String>();
		
		int step=0;
		
		for(int i = 0; i<q.getLato()*q.getLato() ; i++){
			Parola par = new Parola();
			Posizione gen = q.getPosizioni().get(i);
			par.set(gen);
		riempiLista(q , parole , step , par , gen);
		
		}
		
		return parole;
		
	}
	
	public void riempiLista ( Quadrato q , List<String> parole , int step , Parola par , Posizione gen ){
		
		//condizione di uscita momentaneamente errata : condizione di uscita eventuale: posizioni adiacenti tutti occupati
		//o prossima posizione è outofbound
		if( step==q.getLato()*q.getLato()-1){
			return;
		}
		else{
			
			
			for(Posizione ins : gen.getAdiacenti(q)) { 
				
				if(  par.contains(ins) == false ) {
					
					par.set(ins);
					
					//controllo se ne vale la pena continuare e stampare
					String s = par.toString(q);
					
					if(dao.isContenuto(s)==true) {
						
					
					if(s.length()>1 && parole.contains(s)==false && dao.isPresent(s)){
						parole.add(s);
						Parola temp = new Parola(par);
						result.add(temp);
						System.out.println(s);
					}
					riempiLista ( q , parole , step+1 , par , ins);
					}
					par.remove(ins);
					
				}
			}	
			
	    }
			
	}
	
/*	private Posizione ritornaPosizioneValida(Quadrato q ,Posizione corr , Parola par){
		for(int i=0 ; i<16 ; i++){
			Posizione ins = q.getPosizioni().get(i);
			if(posizioneValida(corr , ins) && par.contains(ins)==false)
				return ins;
		}
		return null;
	}
	*/
	
	/*
	private boolean canContinue(Quadrato q , Parola par , Posizione p ){
		for(int i = 0 ; i< 16 ; i++){
			if( posizioneValida( p , q.getPosizioni().get(i) ) && par.canInsert(q.get(q.getPosizioni().get(i))))
				return true;
		}
		return false;
			
	}*/
	
	
	public static void main (String[] args){
		Quadrato q = new Quadrato(4);
		Ricerca r = new Ricerca();
		System.out.println(q.toString());
		List <String> list = r.cercaParole(q);
		
	}

}
