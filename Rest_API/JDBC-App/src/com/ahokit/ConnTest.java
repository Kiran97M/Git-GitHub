package com.ahokit;


import java.sql.*;

	 public class ConnTest{
	 
	 public static void main(String[] args)throws Exception{
		 
	 oracle.jdbc.OracleDriver driver  = new oracle.jdbc.OracleDriver();
	  
	  DriverManager.registerDriver(driver);
	  
	  Connection con 
	  = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
	  
	  if (con == null)
	   System.out.println("System Connection is not established");
	  else 
		 System.out.println("System Connection is  established");
	 
	 
	 }
	 
	 }
