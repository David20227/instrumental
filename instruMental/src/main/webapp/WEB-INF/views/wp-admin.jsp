<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>loggin</title>
<style>
body{
	background-color:rgb(251, 254, 251 );
}
form{
	padding-top:3%;
	position: absolute;
	top:10%;
	width:25%;
	left:35%;
	background-color:white;
	box-shadow: rgba(0, 0, 0, 0.24) 0px 3px 8px;
	height:40vh;
	
}
#title{
	position:absolute;
}
label, input {
margin-left:10%;
}
.sm-3{
display:block;
margin-bottom:1em;
}

	input[type="text"], input[type="password"] {
		
		height:3vh;
		width:80%;
	}
	


 input[type='submit'] {
    background-color: rgb(76, 136, 213);
    color: white;
    padding: 3px auto;
	width:30%;
    height: 40px;
    margin-left:33%;
}

input[type='submit']:hover {
    filter: brightness(1.25);
    cursor: pointer;
}
 
 
 
 
</style>
</head>
<body>
<h1>Wp-admin</h1>
<form action="./logginadmin" method="POST">
  
   
      <!--   <h1 id="title"> InstruMental</h1>--> 
        
           <div class="sm-3">
            <label for="prueba">Nombre de usuario:</label>
            <input type="text"  placeholder="escriba su nombre">
            <span class="resultado"></span>
            </div>
            <div class="sm-3">
             <label for="exampleInputPassword1">Contraseña</label>
          <input type="password" class="form-control" id="exampleInputPassword1" name="password" placeholder="Password">
        </div>
       	<input type="checkbox" id="recordar" name="remember">
       	<label for="recordar">Recuérdame</label>
       	
        	<div><input type="submit"></div>
       
       
  	<c:if test="${param.error != null}"><div><p class="error">Usuario o contraseña no válidos</p></div></c:if>
	<c:if test="${param.logout != null}"><div><p class="logout">Sesión de usuario cerrada</p></div></c:if>
  
  
  
 
</form>
</body>
</html>