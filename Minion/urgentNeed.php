<!doctype html>
<html>
	<head>
		<meta charset = "utf-8">
		<title>Urgent Need</title>
		<link rel = "stylesheet" href = "styleForSignup.css">
	</head>
	
	<!-- 
		this is comment 
	-->
	
	<body>
	
		<div class="box">
			<form action="" method="post" name="">
				<p>Urgent Need!</p>
				<input type="text" name="full_name" placeholder="Full Name">
				<input type="text" name="phone_no" placeholder="Phone No">
				<h4 style = "font-align:left; font-weight:100;">Looking For</h4>
				<input type="radio" name="looking_for" value="Driver">Driver<br />
				<input type="radio" name="looking_for" value="Maid">Maid<br />
				<input type="text" name="area" placeholder="Area">
				<input type="submit" name="submit" value = "Submit">
				<a href="mainpageForUser.php">Back</a>
			</form>
		</div>
		
	
	<?php
	//including the database connection file
	include_once("config.php");

	if(isset($_POST['submit'])) {	
	
	$full_name = $_POST['full_name'];
	$phone_no = $_POST['phone_no'];
	$looking_for = $_POST['looking_for'];
	$area = $_POST['area'];
	
				
	$sql = "INSERT  INTO urgentneed(full_name, phone_no, looking_for, area) 
								VALUES('$full_name', '$phone_no', '$looking_for', '$area')";
	
	$result = mysqli_query($conn, $sql);

	//header("Location: index.php");
	echo header("Location: successful.html"); 
		
	}


?>
	
	
		
	</body>
</html>