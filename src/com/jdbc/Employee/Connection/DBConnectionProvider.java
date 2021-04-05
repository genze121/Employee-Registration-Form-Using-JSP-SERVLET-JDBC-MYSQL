package com.jdbc.Employee.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnectionProvider {

	private static String JDBC_DRIVER;
	static {
		try {
			JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
			Class.forName(JDBC_DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// Connecting to the DB
	@SuppressWarnings("unused")
	public static Connection getConnection() {

		String JDBC_URL = "jdbc:mysql://localhost:3306/employee_register";
		String USERNAME = "root";
		String PASSWORD = "root";
		Connection con = null;
		try {
			if (con == null || con != null) {
				con = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
				System.out.println("Connected Successfully!!!");
			} else {
				System.out.println("Something went wromg while connecting.Please Check once again!!!");
			}
		} catch (SQLException e) {
			printSQLException(e);
		}
		return con;
	}

	// Closing the Resources
	public static void closeResources(PreparedStatement ps, Connection con) {

		try {
			if (ps != null && !ps.isClosed()) {
				ps.close();
			}
			if (con != null && !con.isClosed()) {
				con.close();
			}
			System.out.println("Connection is closed successfully!!!");
		} catch (SQLException e) {
			printSQLException(e);
		}
	}

	public static void printSQLException(SQLException ex) {
		for (Throwable e : ex) {
			if (e instanceof SQLException) {
				e.printStackTrace(System.err);
				System.err.println("SQL State:- " + ((SQLException) e).getSQLState());
				System.err.println("Error Code:- " + ((SQLException) e).getErrorCode());
				System.err.println("Message:- " + ((SQLException) e).getMessage());
				Throwable t = ex.getCause();
				while (t != null) {
					t = t.getCause();
				}

			}
		}

	}
}
