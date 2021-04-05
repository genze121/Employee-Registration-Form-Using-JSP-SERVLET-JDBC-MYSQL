package com.Employee.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jdbc.Employee.Connection.DBConnectionProvider;
import com.jdbc.Employee.DAO.EmployeeDAO;
import com.jdbc.Employee.Entity.Employee;

/**
 * Servlet implementation class EmployeeControllerr
 */
//url to fetch the complete data from the front-end
@WebServlet("/register")
public class EmployeeControllerr extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Accepting the Data's from the Front-End(Registration Form of Employee)

		String firstname = request.getParameter("first_name");
		String lastname = request.getParameter("last_name");
		String username_ = request.getParameter("username");
		String password_ = request.getParameter("password");
		String contact_ = request.getParameter("contact");

		Employee employee = new Employee();
		employee.setFirstname(firstname);
		employee.setLastname(lastname);
		employee.setUsername(username_);
		employee.setPassword(password_);
		employee.setContact(contact_);

		EmployeeDAO empDAO = new EmployeeDAO();
		boolean testRegister = empDAO.registerEmployee(employee);
		if (testRegister) {
			System.out.println("Registered Successfully!!!");
		} else {
			System.out.println("Something went wrong!!!");
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");
		dispatcher.forward(request, response);
	}

}
