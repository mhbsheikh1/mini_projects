<?php

include_once("config.php");

//fetching data in descending order (lastest entry first)

$sql = "SELECT S.Name, S.ID, S.Address
		FROM student S
		";
$result = mysqli_query($conn, $sql);

?>

<!DOCTYPE html>
<html>
<head>
	<title>View Student Information</title>
	<style>
		table, th, td{
		border: 1px solid black; 
		border-collapse: collapse;	
		}
	</style>
</head>
<body>

	<h1>Student Information</h1>
	<hr>

	<table>

       <tr>
    <th>Name</th>
    <th >ID</th>
    <th>Address</th>

  </tr>

	<?php 
	while($res = mysqli_fetch_array($result)) { 
	?>
		<tr>	
		<td><?php echo $res['Name']; ?></td>

		<td><?php echo $res['ID'];?></td>		
        <td><?php echo $res['Address'];?></td>
		</tr>

	<?php	
		}
		?>

	</table>



</body>
</html>