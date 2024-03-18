<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="style.css">
<title>Insert title here</title>
</head>
<body>
	
		
		
        <form action="serv1" method="post">
        
            <div>
            
                <h1>Sign up</h1>
                
                <p>Name</p>
                <input type="text" name="name" required="required">
                <% if(request.getAttribute("err") !=null){%>
			                 <p style="color: red"><%=request.getAttribute("err")%></p> 
				<%} %></br>
                <p>Password</p>
                <input type="text" name="password" required="required" ><br>
                <input type="hidden" name="action" value="create"> 
                <button type="submit">Login</button>
                <a href="index.jsp"  style="color: black;">Login</a>
                
            </div>
        </form>
    
</body>
</html>