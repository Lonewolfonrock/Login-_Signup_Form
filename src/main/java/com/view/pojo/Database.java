package com.view.pojo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Database {
	private Connection con;
	
	String name;
	String password;
	boolean succes= false;
	
	
	
	
	
	
	public Database(String name, String password) {
		super();
		this.name = name;
		this.password = password;
		
	}
	

	public void createConnection() {
		
		String url ="jdbc:postgresql://localhost:5432/java";
		String password="doggos";
		String name="postgres";
		try {
			Class.forName("org.postgresql.Driver");
			 con = DriverManager.getConnection(url,name,password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Some error occuer in driver");
		}
	}
	
	public void insert() {
		
		createConnection();
		try {
			
			String sql = "INSERT INTO person (name, password) VALUES (?, ?)";
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setString(1, name);
			pstm.setString(2, password);
			pstm.executeUpdate();
			succes=true;
			pstm.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Some error occuer in sql");

		}
	}
		public boolean isSuccess() {
        return succes;
		}
	
}
