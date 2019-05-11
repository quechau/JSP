package jbdc;

import java.sql.*;

public class QueryDataExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection connection = MySQLConnUtils.getMySQLConnection();
		if (connection != null) {
			System.out.println("Success!");
		}
		Statement stmt = connection.createStatement();
		// Insert a record into the table.
		System.out.println("Inserting a new record...");

		String sqlCmd = "INSERT INTO testtutorialspointex.customers VALUES (10, 'David', 24, 'VietNam', 4500)";
		stmt.executeUpdate(sqlCmd);
		sqlCmd = "SELECT * FROM testtutorialspointex.customers";
		ResultSet rs = stmt.executeQuery(sqlCmd);
		while (rs.next()) {
			// Retrieve by column name
			int id = rs.getInt("id");
			String name = rs.getString("name");
			int age = rs.getInt("age");
			String address = rs.getString("address");
			int salary = rs.getInt("salary");
			// Display values
			System.out.print("ID: " + id + "\t, ");
			System.out.print("name: " + name + "\t, ");
			System.out.print("Age: " + age + "\t, ");
			System.out.print("address: " + address + "\t, ");
			System.out.println("salary" + salary);
			
		}
	
		rs.close();
		stmt.close();
		connection.close();

	}

}
