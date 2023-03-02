package password_generator;

import java.sql.*;
import java.io.*;


public class Connection {
    
   public  Statement stm;
        
//    public static void main(String [] args) throws IOException
	Connection()
        {
            
            
            //stm = conn.createStatement();
	try 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	}catch(ClassNotFoundException cnfe)
	{
		System.out.println("could not find out the JDBC driver");
	}
	
        //connect to database
	
	try
	{
            //Connection conn;
		//conn = DriverManager.getConnection(connectionUrl,username,password);
             java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pass","root","5566");
            stm=conn.createStatement();
		System.out.println("Connection successfully");
                
                
	}catch(SQLException sqle)
	{
		System.out.println("connection failed");
		System.out.println(sqle);
	}
}
    
//}
//public static void main(String [] args) throws IOException
//{
//    new Connection();
//}

}

   
