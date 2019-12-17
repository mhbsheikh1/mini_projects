<?php
$error=''; 
if(isset($_POST['login'])){
 if(empty($_POST['username']) || empty($_POST['password'])){
 $error = "Username or Password is Invalid";
 }
 else
 {

 $username=$_POST['username'];
 $password=$_POST['password'];

 $conn = mysqli_connect("localhost", "root", "");

 $db = mysqli_select_db($conn, "project1");
 
 $query = mysqli_query($conn, "SELECT * FROM signupasworker WHERE password='$password' AND username='$username'");
 
 $rows = mysqli_num_rows($query);
 if($rows == 1){
 header("Location: mainpageForWorker.php"); 
 }
 else
 {
 echo header("Location: loginFailed.html"); 
 }
 mysqli_close($conn); 
 }
}
 
?>