package DatabasePrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TheatreDatabaseManagementSystem {
	public Connection con;
	public Statement stmt;
	public TheatreDatabaseManagementSystem()throws SQLException {
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pvrcinemas","root","root");
		stmt=con.createStatement();
	}
	public void insertCustomer(String name, String division, int seatno, int price) throws SQLException{
		String query="insert into customer (name, division, seatno, price)values(?,?,?,?)";
		PreparedStatement preparedStatement= con.prepareStatement(query);
		preparedStatement.setString(1, name);
		preparedStatement.setString(2, division);
		preparedStatement.setInt(3, seatno);
		preparedStatement.setInt(4, price);
		preparedStatement.executeUpdate();
		System.out.println("Customer details insert success");
	}
	public void updateCustomer(String name,String fieldName,int fieldValue) throws SQLException{
		try {
			String query="update customer set "+fieldName+"=? where name=?";
			PreparedStatement preparedStatement= con.prepareStatement(query);
			preparedStatement.setInt(1,fieldValue);
			preparedStatement.setString(2, name);
			preparedStatement.executeUpdate();
			System.out.println("Customer details update success");
		}catch(Exception e) {
			System.out.println("Customer information does not exist");
		}
	}
	public void readCustomer(String name) throws SQLException {
		try {
			String query="select * from customer where name=?";
			PreparedStatement preparedStatement= con.prepareStatement(query);
			preparedStatement.setString(1, name);
			ResultSet result = preparedStatement.executeQuery();
			while(result.next()) {
				System.out.println("Customer name: "+result.getString("name"));
				System.out.println("Seat division: "+result.getString("division"));
				System.out.println("Seat number: "+result.getInt("seatno"));
				System.out.println("Ticket price: "+result.getInt("price"));
			}
		}catch(Exception e) {
			System.out.println("Customer does not exist");	
		}
	}
	public void deleteCustomer(String name) throws SQLException {
		try {
			String query="delete from customer where name=?";
			PreparedStatement preparedStatement= con.prepareStatement(query);
			preparedStatement.setString(1, name);
			preparedStatement.executeUpdate();
			System.out.println("Customer details delete success");
		}
		catch(Exception e) {
			System.out.println("Customer information does not exist");
		}
	}
	public void menu() throws SQLException{
		Scanner s= new Scanner(System.in);
		while(true) {
			System.out.println("Theatre Database Management System");
			System.out.println("1->Insert\n2->Update\n3->Read\n4->Delete\n5->Exit");
			System.out.println("Enter your choice");
			int option=s.nextInt();
			if(option==1) {
				System.out.println("Insert new customer");
				System.out.println("Enter customer name, seat division, seat number, ticket price");
				String name=s.next();
				String division=s.next();
				int seatno=s.nextInt();
				int price=s.nextInt();
				insertCustomer(name, division, seatno, price);
	        }
			else if(option==2) {
				System.out.println("Update");
				System.out.println("Enter customer name");
				String name=s.next();
				System.out.println("Enter the field you want to change(division, seatno, price) except name");
				String fieldName=s.next();
				int fieldValue = 0;
				if(fieldName.equalsIgnoreCase("division")) {
					System.out.println("Enter type of division");
					fieldName=s.next();
				}
				else if(fieldName.equalsIgnoreCase("seatno")) {
					System.out.println("Enter new seat number value");
					fieldValue=s.nextInt();
				}
				else if(fieldName.equalsIgnoreCase("price")){
					System.out.println("Enter new ticket price value");
					fieldValue=s.nextInt();
				}
				updateCustomer(name, fieldName, fieldValue);
			}
			else if(option==3) {
				System.out.println("Read");
				System.out.println("Enter customer name");
				String name=s.next();
				readCustomer(name);
			}
			else if(option==4) {
				System.out.println("Delete");
				System.out.println("Enter customer name");
				String name=s.next();
				deleteCustomer(name);
			}
			else if(option==5) {
				System.out.println("Exit");
				break;
			}
			else {
				System.out.println("Invalid option");
			}
		}
	}
	public static void main(String[] args) throws SQLException {
	TheatreDatabaseManagementSystem obj=new TheatreDatabaseManagementSystem();
	obj.menu();
	}
}
