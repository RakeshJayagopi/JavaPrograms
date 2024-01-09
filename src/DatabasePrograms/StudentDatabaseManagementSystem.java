package DatabasePrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentDatabaseManagementSystem {
	public Connection con;
	public Statement stmt;
	public StudentDatabaseManagementSystem()throws SQLException {
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ocean1","root","root");
		stmt=con.createStatement();
	}
	public void insertStudent(int rollno,String name,int age,int mark) throws SQLException {
		String query="insert into student (rollno,name,age,mark)values(?,?,?,?)";
		PreparedStatement preparedStatement= con.prepareStatement(query);
		preparedStatement.setInt(1, rollno);
		preparedStatement.setString(2, name);
		preparedStatement.setInt(3,age);
		preparedStatement.setInt(4, mark);
		preparedStatement.executeUpdate();
		System.out.println("inserted successfully");
	}
	
	public void updateStudent(String name,String fieldName,int fieldValue) throws SQLException{
		try {
			String query="update student set "+fieldName+"=? where name=?";
			PreparedStatement preparedStatement= con.prepareStatement(query);
			preparedStatement.setInt(1,fieldValue);
			preparedStatement.setString(2, name);
			preparedStatement.executeUpdate();
			System.out.println("Updated successfully");
		}catch(Exception e) {
			System.out.println("person not exists");
		}
	}
	
	public void readStudent(String name) throws SQLException {
		try {
			String query="select * from student where name=?";
			PreparedStatement preparedStatement= con.prepareStatement(query);
			preparedStatement.setString(1, name);
			ResultSet result = preparedStatement.executeQuery();
			while(result.next()) {
				System.out.println("Student Rollno: "+result.getInt("rollno"));
				System.out.println("Student name: "+result.getString("name"));
				System.out.println("Student age: "+result.getInt("age"));
				System.out.println("Student mark: "+result.getInt("mark"));
			}
			
		}catch(Exception e) {
			System.out.println("Person not exists");	
		}
		
	}
	public void deleteStudent(String name) throws SQLException {
		try {
			String query="delete from student where name=?";
			PreparedStatement preparedStatement= con.prepareStatement(query);
			preparedStatement.setString(1, name);
			preparedStatement.executeUpdate();
			System.out.println("Deleted successfully");
		}
		catch(Exception e) {
			System.out.println("Person not exists");
		}
		
	}
	public void menu() throws SQLException {
		
		Scanner s=new Scanner(System.in);
		while(true) {
			System.out.println("Student Database Management System");
			System.out.println("1->insert\n2->update\n3->read\n4->delete\n5->exit");
			System.out.println("Enter your choice");
			int choice=s.nextInt();
			if(choice==1) {
				System.out.println("Insert new student");
				System.out.println("Enter student rollno,name,age and mark");
				int rollno=s.nextInt();
				String name=s.next();
				int age=s.nextInt();
				int mark=s.nextInt();
				insertStudent(rollno, name, age, mark);
			}
			else if(choice==2) {
				System.out.println("update");
				System.out.println("Enter student name");
				String name=s.next();
				System.out.println("Enter field you want to change(age,mark,rollno) except name");
				String fieldName=s.next();
				int fieldValue = 0;
				if(fieldName.equalsIgnoreCase("age")) {
					System.out.println("Enter new Age value");
					fieldValue=s.nextInt();
				}
				else if(fieldName.equalsIgnoreCase("mark")) {
					System.out.println("Enter new Mark value");
					fieldValue=s.nextInt();
				}
				else if(fieldName.equalsIgnoreCase("rollno")){
					System.out.println("Enter new rollno value");
					fieldValue=s.nextInt();
				}
				updateStudent(name, fieldName, fieldValue);
			}
			else if(choice==3) {
				System.out.println("read");
				System.out.println("Enter student name");
				String name=s.next();
				readStudent(name);
				
			}
			
			else if(choice==4) {
				System.out.println("delete");
				System.out.println("Enter student name");
				String name=s.next();
				deleteStudent(name);
			}
			else if(choice==5) {
				System.out.println("exit");
				break;
			}
			else {
				System.out.println("invalid choice");
			}
		}
	}
	public static void main(String[] args) throws SQLException {
	
	
	StudentDatabaseManagementSystem obj=new StudentDatabaseManagementSystem();
	
	obj.menu();
	}
}
