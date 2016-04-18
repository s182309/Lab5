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
			st.setString(1, s);
			ResultSet res = st.executeQuery();
			if(res.next()){
				return true;
			}
			return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public static void main (String[] args){
		ParolaDAO p = new ParolaDAO();
		System.out.println(p.isPresent("ciao"));
	}

}
