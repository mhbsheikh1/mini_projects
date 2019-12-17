<?php

include_once("config.php");

//fetching data in descending order (lastest entry first)

$sql = "SELECT DISTINCT worker_username,user_username, details
		FROM review
		where title like 'Maid'
		";
$result = mysqli_query($conn, $sql);

?>

<!DOCTYPE html>
<html>
<head>
	<title>View Maids Review</title>
	<style>
	
	body{
		background-image: url("pictures/driver1.jpg");
		background-attachment: fixed;
		background-repeat: no-repeat;
		background-size: cover;
	}
	table{
		width: 800px;
		margin: auto;
		text-align: center;
		table-layout: fixed;
	}
	table, tr, th, td{
		padding: 20px;
		color: white;
		border: 1px solid #080808;
		border-collapse: collapse;
		font-size: 18px;
		font-family: Arial;
		background: linear-gradient(top, #3c3c3c 0%, #222222 100%);
		background: -webkit-linear-gradient(top, #3c3c3c 0%, #222222 100%)
	}
	h1{
		color: red;
		text-transform: uppercase;
		font-weight: 900;
		text-align: center
	}
	
	
	
	
		
	</style>
</head>











<body>

	<h1>Maids Review</h1>

	<table>

    <tr>
		<th>Username</th>
		<th>Review By</th>
		<th >Details</th>
	</tr>

	<?php 
	while($res = mysqli_fetch_array($result)) { 
	?>
		<tr>	
		<td><?php echo $res['worker_username']; ?></td>
		<td><?php echo $res['user_username']; ?></td>
		<td><?php echo $res['details'];?></td>	
		</tr>

	<?php	
		}
	?>

	</table>



</body>
</html>