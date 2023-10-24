<?php
/* Initialize the session */
session_start();
 
/* Check if the user is logged in, if not then redirect him to login page */
if(!isset($_SESSION["logged"]) || $_SESSION["logged"] !== true){
    header("location: login.php");
    exit;
}
?>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Welcome</title>
    <link rel="stylesheet" href="bootstrap.css">
</head>
<body>
    <div class="wrapper">
        <h1>Hi, <b><?php echo ($_SESSION["username"]); ?></b>. Welcome</h1>
    </div>
    <p>
        <a href="logout.php" class="btn btn-primary">Log out</a>
    </p>
</body>
</html>