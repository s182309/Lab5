package it.polito.tdp.ruzzle.model;

import java.util.ArrayList;
import java.util.List;

import it.polito.tdp.dao.ParolaDAO;

public class Ricerca {
	
	private ParolaDAO dao = new ParolaDAO();
	
	
	
	public List <String> cercaParole (Quadrato q){
		
		List <String> parole = new ArrayList <String>();
		
		int step=0;
		
		for(int i = 0; i<16 ; i++){
			Parola par = new Parola();
			Posizione gen = q.getPosizioni().get(i);
			par.set(gen);
		riempiLista(q , parole , step , par , gen);
		
		}
		
		return parole;
		
	}
	
	public void riempiLista ( Quadrato q , List<String> parole , int step , Parola par , Posizione gen){
		
		//condizione di uscita momentaneamente errata : condizione di uscita eventuale: posizioni adiacenti tutti occupati
		//o prossima posizione è outofbound
		if( step==15){
			return;
		}
		else{
			
			
			for(Posizione ins : gen.getAdiacenti()) { 
				
				if(  par.contains(ins) == false ) {
					
					par.set(ins);
					stampaParola(q , parole , par);
					riempiLista ( q , parole , step+1 , par , ins );
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
	
	private void stampaParola(Quadrato q , List<String> parole , Parola par){
		String s = "";
		for(Posizione position : par.get())
			s += q.get(position);
		
		if(s.length()>1 && parole.contains(s)==false && dao.isPresent(s)){
			parole.add(s);
			System.out.println(s);
		}
		
	}
	
	public static void main (String[] args){
		Quadrato q = new Quadrato();
		Ricerca r = new Ricerca();
		System.out.println(q.toString());
		List <String> list = r.cercaParole(q);
		
	
		
	}

}
