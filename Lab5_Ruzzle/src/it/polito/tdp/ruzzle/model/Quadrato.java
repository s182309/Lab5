package it.polito.tdp.ruzzle.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Quadrato {
	
	private static int N;
	private Map <Posizione , String> caselle;
	private List <Posizione> posizioni;
	private String stringa;
	
	public Quadrato(Integer lato){
		this.N = lato;
		caselle = new HashMap <Posizione , String>();
		posizioni = new ArrayList <Posizione>();
		stringa = this.randomString();
		int k = 0;
		for(int i=1 ; i<=N ; i++){
			for(int j = 1 ; j<=N ; j++){
				posizioni.add(new Posizione( i , j));
				caselle.put(new Posizione( i , j), String.valueOf(stringa.charAt(k)).toUpperCase());
				k++;
			}		
		}
	}
	
	public String get(Posizione p){
		return caselle.get(p);
	}
	
	public List<Posizione> getPosizioni(){
		return posizioni;
	}
	
	public String getStringa(){
		return stringa;
	}
	
	public String toString(){
		String s = "";
		for(int i=1 ; i<=N ; i++){
			for(int j = 1 ; j<=N ; j++)
				s += caselle.get(new Posizione( i , j))+" ";
			s+= "\n";
		}
			return s;
		
	}
	
	public int getLato(){
		return N;
	}
	
	
	private String randomString(){
		Random r = new Random();
		String s = "abucdaeofghieijklimneopoqrstuauvwxyz" ;
		String res = "";
		for(int i=0 ; i<N*N ; i++)
			res += String.valueOf(s.charAt(r.nextInt(31)));
		return res;
	}
	
	public static void main(String[] args){
		Quadrato q = new Quadrato(4);
		for(int i=1 ; i<=4 ; i++){
			for(int j = 1 ; j<=4 ; j++)
				System.out.print( q.get(new Posizione( i , j)) +" ");
			System.out.print("\n");
		}
	}

}
