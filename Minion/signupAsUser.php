<!doctype html>
<html>
	<head>
		<meta charset = "utf-8">
		<title>Sign Up As User</title>
		<link rel = "stylesheet" href = "styleForSignup.css">
	</head>
	
	<!-- 
		this is comment 
	-->
	
	<body>
	
		<div class="box">
			<form action="" method="post" name="">
				<p>*fill this form with valid informations!</p>
				
				<input type="text" name="full_name" placeholder="Full Name" required>
				<input type="text" name="email" placeholder="Email" required>
				<input type="text" name="phone_no" placeholder="Phone Number" required>
				<input type="text" name="username" placeholder="Username" required>
				<input type="Password" name="password" placeholder="Password" required>
				<input type="text" name="address" placeholder="Address" required>
				<input type="submit" name="signup" value = "Sign Up">
				<a href="minion.html">Home</a>
			</form>
		</div>
		
	
	<?php
	//including the database connection file
	include_once("config.php");

	if(isset($_POST['signup'])) {	
	
	$full_name = $_POST['full_name'];
	$email = $_POST['email'];
	$phone_no = $_POST['phone_no'];
	$username = $_POST['username'];
	$password = $_POST['password'];
	$address = $_POST['address'];
	$signup = $_POST['signup'];

	
				
	$sql = "INSERT  INTO signupasuser(full_name, email, phone_no, username, password, address) 
								VALUES('$full_name', '$email', '$phone_no', '$username', '$password', '$address')";
	
	$result = mysqli_query($conn, $sql);

	//header("Location: index.php");
	echo header("Location: signupSuccessful.html"); 
		
	}


	?>
	
	
		
	</body>
</html>