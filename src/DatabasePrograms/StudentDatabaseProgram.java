package DatabasePrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDatabaseProgram {
public static void main(String[] args) throws SQLException {
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ocean","root","root");
	Statement stmt = con.createStatement();

//	insert 
	
//	String query="insert into student (rollno,name,age,mark)values(1001,'ijass',20,450)";
//	int result = stmt.executeUpdate(query);
//	System.out.println("data inserted successfully "+result);
	
	
//	update
	
//	String query="update student set name='Thamizharasan' where rollno=1002";
//	
//	int value=stmt.executeUpdate(query);
//	
//	
	
//	delete
	
	String query="delete from student where rollno=1002";
	int value = stmt.executeUpdate(query);
	System.out.println(value);
	
//	read
	query="select * from student";
	ResultSet result = stmt.executeQuery(query);
	while(result.next()) {
		System.out.println(result.getInt("rollno"));
		System.out.println(result.getString("name"));
		System.out.println(result.getInt("age"));
		System.out.println(result.getInt("mark"));
		System.out.println("");
		
	}
	stmt.close();
	con.close();
}
}
