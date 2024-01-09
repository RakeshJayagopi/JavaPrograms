package jdbcPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseExampleProgram {
public static void main(String[] args) throws SQLException {
//	Connection con=DriverManager.getConnections("jdbc:mysql://localhost:3306/ocean","root","root");  
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ocean","root","root");
	
}
}
