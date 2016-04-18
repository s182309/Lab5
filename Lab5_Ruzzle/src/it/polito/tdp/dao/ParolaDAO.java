package it.polito.tdp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class ParolaDAO {
	
	Set <String> dictionary;
	
	private String jdbcURL;
	
	public ParolaDAO () {
		jdbcURL = "jdbc:mysql://localhost/dizionario?user=root&password=root";
		dictionary = new HashSet <String>() ;
	}
	
	public void load(){
		
		try {
			Connection conn = DriverManager.getConnection(jdbcURL);
			String sql = "select nome from parola";
			PreparedStatement st = conn.prepareStatement(sql);
			ResultSet res = st.executeQuery();
			while(res.next()){
				dictionary.add(res.getString("nome"));
			}
			res.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public boolean isPresent(String s){
		return dictionary.contains(s);
	}
	
	public boolean isContenuto(String s){
		for(String str : dictionary)
			if(str.contains(s))
				return true;
		return false;
	}
	
	public static void main (String[] args){
		ParolaDAO p = new ParolaDAO();
		p.load();
		System.out.println(p.isContenuto("ciao"));
	}

}
