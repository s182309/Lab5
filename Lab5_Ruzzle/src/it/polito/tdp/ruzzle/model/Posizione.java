package it.polito.tdp.ruzzle.model;

import java.util.ArrayList;
import java.util.List;

public class Posizione {

	private int riga;
	private int colonna;

	public Posizione(int riga, int colonna) {
		super();
		this.riga = riga;
		this.colonna = colonna;
	}

	public int getRiga() {
		return riga;
	}

	public void setRiga(int riga) {
		this.riga = riga;
	}

	public int getColonna() {
		return colonna;
	}

	public void setColonna(int colonna) {
		this.colonna = colonna;
	}

	public List<Posizione> getAdiacenti() {

		List<Posizione> adiacenti = new ArrayList<Posizione>();
		for (int i = this.riga - 1; i <= this.riga + 1; i++) {
			for (int j = this.colonna - 1; j <= this.colonna + 1; j++) {
				if(posizioneValida(new Posizione( i , j)))
				adiacenti.add(new Posizione(i, j));
			}
		}

		adiacenti.remove(new Posizione(riga, colonna));

		return adiacenti;

	}

	private boolean posizioneValida(Posizione pos) {

		if (pos.getRiga() < 1 || pos.getColonna() < 1 || pos.getRiga() > 4 || pos.getColonna() > 4)
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + colonna;
		result = prime * result + riga;
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
		Posizione other = (Posizione) obj;
		if (colonna != other.colonna)
			return false;
		if (riga != other.riga)
			return false;
		return true;
	}

	public static void main(String[] args) {
		Posizione p = new Posizione(2 , 4);
		for (Posizione c : p.getAdiacenti())
			System.out.println(c.riga + " " + c.colonna);
	}

}
