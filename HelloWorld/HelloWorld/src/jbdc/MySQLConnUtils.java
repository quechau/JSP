package jbdc;

import java.sql.*;

public class MySQLConnUtils {
	 // connect to MySQL.
	 public static Connection getMySQLConnection() throws SQLException,
	         ClassNotFoundException {
	     String hostName = "localhost";

	     String dbName = "testtutorialspointex";
	     String userName = "root";
	     String password = "abc123";

	     return getMySQLConnection(hostName, dbName, userName, password);
	 }

	 public static Connection getMySQLConnection(String hostName, String dbName,
	         String userName, String password) throws SQLException,
	         ClassNotFoundException {
	     // Declare class Driver for DB MySQL
	     // Java6 auto find Driver correctly.
	     Class.forName("com.mysql.jdbc.Driver");

	     String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;

	     Connection conn = DriverManager.getConnection(connectionURL, userName,
	             password);
	     return conn;
	 }

}
