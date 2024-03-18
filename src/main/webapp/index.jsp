<html>
<head>
    <title>Login Page</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    
    
        <form action="serv1" method="post">
            <div>
                <h1>Login</h1>
                <p>Name</p>
                <input type="text" name="name" required="required">
                <p>Password</p>
                <input type="text" name="password" required="required" ><br>
                <button type="submit">Login</button>
                <a href="sign.jsp" style="color: black;">Sign up</a>
                <input type="hidden" name="action" value="login"> 
            </div>
        </form>
    
</body>
</html>