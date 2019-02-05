package main.java;

import java.sql.*;

import com.Mao.BackEndDev.datalayer.DbConnections.JdbcDbData;

public class Validate extends JdbcDbData
{

	
	     public Validate() throws ClassNotFoundException, SQLException {
		super();
		// TODO Auto-generated constructor stub
	}

		public static boolean checkUser(String name,String password) 
	     {
	      boolean st =false;
	      try{

	    	  PreparedStatement ps = prepareQuery("select id from register where name=? and password=?");
	    	  
	    	    ps.setString(1, name);
				ps.setString(2, password);
	            ResultSet rs =ps.executeQuery();
	            st = rs.next();
	        
	      }catch(Exception e)
	      {
	          e.printStackTrace();
	      }
	         return st;                 
	  }

		private static PreparedStatement prepareQuery(String string) {
			// TODO Auto-generated method stub
			return null;
		}   
	}