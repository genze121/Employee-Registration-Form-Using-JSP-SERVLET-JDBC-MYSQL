<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="all_component/style.css">
<meta charset="ISO-8859-1">
<title>Employee Registration Form</title>
<%@include file="all_component/allcss.jsp"%>

</head>
<body style="background:#85FFBD;">
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-4 offset-md-4">
				<div class="card mt-5">
					<div class="card-header text-center test-make">
					<i class="fa fa-user-plus"></i> Employee Registration Form</div>
					<div class="card-body">
						<form action="register" method="post">
							<div class="form-group">
								<label>First Name</label> <input type="text" name="first_name"
									class="form-control" placeholder="Enter First Name">

							</div>

							<div class="form-group">
								<label>Last Name</label> <input type="text" name="last_name"
									class="form-control" placeholder="Enter Last Name">

							</div>

							<div class="form-group">
								<label>User Name</label> <input type="email" name="username"
									class="form-control" placeholder="Enter the Username">

							</div>

							<div class="form-group">
								<label>Password</label> <input type="password" name="password"
									class="form-control" placeholder="Enter the Password">

							</div>

							<div class="form-group">
								<label>Contact Number</label> <input type="text" name="contact"
									class="form-control" placeholder="Enter Your Contact Number">
							</div>

							<button type="submit" class="btn btn-danger badge-pill btn-block pt-2">Submit</button>
						</form>

					</div>

				</div>


			</div>


		</div>


	</div>

</body>
</html>