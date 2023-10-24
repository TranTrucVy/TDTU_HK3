<?php
$connect = mysqli_connect('localhost', 'root', '', 'sqli');
if($connect === false){
    die("Cannot connect. " . mysqli_connect_error());
}
?>