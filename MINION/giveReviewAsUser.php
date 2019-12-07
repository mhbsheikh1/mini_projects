<!doctype html>
<html>
	<head>
		<meta charset = "utf-8">
		<title>Give Review</title>
		<link rel = "stylesheet" href = "styleForSignup.css">
	</head>
	
	<!-- 
		this is comment 
	-->
	
	<body>
	
		<div class="box">
			<form action="" method="post" name="">
				<p>Give Review</p>
				<input type="text" name="user_username" placeholder="Your Username" required>
				<input type="text" name="worker_username" placeholder="Opposite Person's Username" required>
				<h4 style = "font-align:left; font-weight:100;">Title</h4>
				<input type="radio" name="title" value="Driver">Driver<br />
				<input type="radio" name="title" value="Maid">Maid<br />
				<input type="radio" name="title" value="User">User<br />
				<input type="text" name="details" placeholder="Details">
				<input type="submit" name="submit" value = "Submit">
				<a href="mainpageForUser.php">Back</a>
			</form>
		</div>
		
	
	<?php
	//including the database connection file
	include_once("config.php");

	if(isset($_POST['submit'])) {	
	
	$user_username = $_POST['user_username'];
	$worker_username = $_POST['worker_username'];
	$title = $_POST['title'];
	$details = $_POST['details'];
	
				
	$sql = "INSERT  INTO review(user_username, worker_username, title, details) 
								VALUES('$user_username', '$worker_username', '$title', '$details')";
	
	$result = mysqli_query($conn, $sql);

	//header("Location: index.php");
	echo header("Location: successful.html"); 
		
	}


?>
	
	
		
	</body>
</html>