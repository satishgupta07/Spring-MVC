<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>    
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">

    <title>Hello, world!</title>
  </head>
  <body>
   
   <div class="container mt-5">
    <h3 class="text-center">${Header}</h3>
    <p class="text-center">${Desc}</p>
     <form action="processform" method="post">
	  <div class="form-group">
	    <label for="exampleInputEmail1">Email address</label>
	    <input type="email" class="form-control" id="exampleInputEmail1" 
	           aria-describedby="emailHelp" placeholder="Enter email"
	           name="email">
	  </div>
	   <div class="form-group">
	    <label for="userName">User Name</label>
	    <input type="text" class="form-control" id="userName" 
	           aria-describedby="emailHelp" placeholder="Enter User Name"
	           name="userName">
	  </div>
	   <div class="form-group">
	    <label for="userPassword">User Password</label>
	    <input type="password" class="form-control" id="userPassword" 
	           aria-describedby="emailHelp" placeholder="Enter Password"
	           name="password">
	  </div>
	  <div class="container text-center"> 
	      <button type="submit" class="btn btn-primary">Submit</button>
	  </div>
	</form>
	  
   </div>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" ></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" ></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
  </body>
</html>