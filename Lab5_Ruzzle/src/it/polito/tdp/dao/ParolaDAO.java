package it.polito.tdp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ParolaDAO {
	
	private String jdbcURL;
	
	public ParolaDAO () {
		jdbcURL = "jdbc:mysql://localhost/dizionario?user=root&password=root";
	}
	
	public boolean isPresent(String s){
		
		try {
			Connection conn = DriverManager.getConnection(jdbcURL);
			String sql = "select nome from parola where nome = ? ";
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, s.toLowerCase());
			ResultSet res = st.executeQuery();
			if(res.next()){
				res.close();
				conn.close();
				return true;
			}
			res.close();
			conn.close();
			return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean isContenuto(String s){
		
		try {
			Connection conn = DriverManager.getConnection(jdbcURL);
			String sql = "select nome from parola";
			PreparedStatement st = conn.prepareStatement(sql);
			ResultSet res = st.executeQuery();
			while(res.next()){
				if( res.getString("nome").contains(s.toLowerCase()) ){
				
				res.close();
				conn.close();
				return true;
				}
			}
			res.close();
			conn.close();
			return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
	
	public static void main (String[] args){
		ParolaDAO p = new ParolaDAO();
		long in = System.nanoTime();
		System.out.println(p.isContenuto("risp"));
		long end = System.nanoTime();
		System.out.println( (end-in)/1000000000+" s" );
	}

}
