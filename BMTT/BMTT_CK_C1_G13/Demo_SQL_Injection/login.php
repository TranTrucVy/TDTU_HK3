<?php
session_start();

if (isset($_SESSION["logged"]) && $_SESSION["logged"] === true)
{
    header("location: user.php");
    exit;
}
require_once "config.php";
$regex = '/[^a-zA-Z0-9]/';
$username =  "";
$password ="";
$username1 =  "";
$password1 = "";
if ($_SERVER["REQUEST_METHOD"] == "POST")
{

    /* Check if username is empty */
    if (empty(trim($_POST["username"])) || preg_match($regex,$_POST["username"],$matches))
    {
        $username1 = "Enter username.";
    }
    else
    {
        $username = $_POST["username"];
    }

    if (empty(trim($_POST["password"])) || preg_match($regex,$_POST["password"],$matches))
    {
        $password1 = "Enter password.";
    }
    else
    {
        $password = trim($_POST["password"]);
    }
    if (empty($username1) && empty($password1))
    {
        
        $sql = "SELECT * FROM users WHERE username = '$username' and password = '$password'";

        $result = mysqli_query($connect, $sql);
        $fetch = mysqli_fetch_assoc($result);
        if (mysqli_num_rows($result) > 0)
        {
            session_start();
            
            $_SESSION["id"] = $id;
            $_SESSION["logged"] = true;
            $_SESSION["username"] = $username;

            header("location: user.php");
        }
        else
        {
            $password1 = "Wrong password";
        }
        /* Close statement */
        mysqli_close($connect);
    }
}
?>
 
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet" href="bootstrap.css">
    <style type="text/css">
        body{ font: 14px ; }
        .wrapper{ width: 400px; padding: 20px; }
    </style>
</head>
<body>
    <div class="wrapper">
        <h2>Login</h2>
        <form action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>" method="post">
            <div class="form-group <?php echo (!empty($username1)) ? 'has-error' : ''; ?>">
                <label>Username </label>
                <input type="text" name="username" value="<?php echo $username; ?>">
                <span class="help-block"><?php echo $username1; ?></span>
            </div>    
            <div class="form-group <?php echo (!empty($password1)) ? 'has-error' : ''; ?>">
                <label>Password </label>
                <input type="password" name="password" >
                <span class="help-block"> <?php echo $password1; ?></span>
            </div>
            <div class="form-group">
                <input type="submit" class="btn btn-primary" value="Sign in">          
        </form>
    </div>    
</body>
</html>
