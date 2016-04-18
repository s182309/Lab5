package it.polito.tdp.ruzzle.model;

import java.util.ArrayList;
import java.util.List;

public class Parola {
	
	private List<Posizione> parola;
	
	public Parola (){
		
		parola = new ArrayList <Posizione> ();
	}
	
	public Parola( Parola p){
		this.parola = p.parola;
	}
	
	
	public void set(Posizione s){
			parola.add(s);
	
	}
	
	public List<Posizione> get(){
		return parola;
	}
	
	public void remove(Posizione s){
		
		parola.remove(s)  ;
		
//		else
//			throw new RuntimeException("Casella vuota");
	}
	
	public boolean contains(Posizione p){
		return parola.contains(p);
	}
	
	public Integer size(){
		return parola.size();
	}
	
	public String toString(Quadrato q){
		String s = "";
		for(Posizione position : this.get())
			s += q.get(position);
		
		return s;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((parola == null) ? 0 : parola.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parola other = (Parola) obj;
		if (parola == null) {
			if (other.parola != null)
				return false;
		} else if (!parola.equals(other.parola))
			return false;
		return true;
	}

	
	
	
	

}
