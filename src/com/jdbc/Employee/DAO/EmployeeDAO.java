package com.jdbc.Employee.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jdbc.Employee.Connection.DBConnectionProvider;
import com.jdbc.Employee.Entity.Employee;

public class EmployeeDAO {
	
	
	// Query for registering the Employee Details
	private static final String INSERT_SQL_QUERY = "insert into employee"
			+ "(first_name,last_name,username,password,contact)" + "values(?,?,?,?,?)";

	// Saving the Employee Details
	public boolean registerEmployee(Employee employee) {
		boolean emp = false;
		PreparedStatement ps = null;
		Connection con=null;
		try {
			con = DBConnectionProvider.getConnection();
			ps = con.prepareStatement(INSERT_SQL_QUERY);
			ps.setString(1, employee.getFirstname());
			ps.setString(2, employee.getLastname());
			ps.setString(3, employee.getUsername());
			ps.setString(4, employee.getPassword());
			ps.setString(5, employee.getContact());

			int registeredEmp = ps.executeUpdate();
			if (registeredEmp == 1 || registeredEmp > 0) {
				emp = true;
			}
		} catch (SQLException e) {
			DBConnectionProvider.printSQLException(e);
		}

		return emp;
	}

}
