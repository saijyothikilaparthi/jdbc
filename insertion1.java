package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class insertion1 {
	public static final String Driver="com.mysql.cj.jdbc.Driver";
	public static final String url="jdbc:mysql://localhost:3306/?user=root";
	public static final String username="root";
	public static final String password="root";
	public static Connection conn;
	public static PreparedStatement pmst;
	public static void main(String[] args)
	{
		try {
			Class.forName(Driver);
			Connection conn=DriverManager.getConnection(url,username,password);
			String sql="create database people";
			PreparedStatement pmst=conn.prepareStatement(sql);
			pmst.executeUpdate();
			conn.close();
			pmst.close();
			
		} catch (Exception e) {
			System.out.println("error");
		}
	}
}

