<%--
  Created by IntelliJ IDEA.
  User: Siri Patnam
  Date: 8/27/2018
  Time: 12:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Patient|Register</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    <style>
        .marginstyle{
            margin: 50px;
        }
    </style>

</head>
<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">PatientFirst</a>
        </div>
        <ul class="nav navbar-nav">
            <li><a>Already a Member??</a></li>
            <li><a href="/login">Login</a> </li>
        </ul>
    </div>
</nav>
<body>
<div class="container marginstyle">
    <h2>COMPLETE THE FORM TO REGISTER</h2> <br>
    <form action="/register" method="post">
        <div class = "form group">
            <label for = "firstName">First Name:</label>
            <input type="text" name = "firstName" id = "firstName" placeholder="First Name"
                   class="form-control" style="width: 50%" required >
        </div>
        <br>
        <div class = "form group">
            <label for ="lastName">Last Name:</label>
            <input type="text" name = "lastName" id ="lastName" placeholder="Last Name"
                   class="form-control" required style="width: 50%">
        </div>
        <br>
        <div class = "form group">
            <label for ="gender">Gender:</label>
            <input type="text" name = "gender" id = "gender" placeholder="Gender"
                   class="form-control" required style="width: 50%">
        </div>
        <br>
        <div class = "form group">
            <label for = "email">E-mail:</label>
            <input type="email" name = "email" id = "email" placeholder="Email"
                   class="form-control" required style="width: 50%">
        </div>
        <br>
        <div class="form-group">
                <label for = "phoneNo">Phone #:</label>
            <input type="number" name="phoneNo" id ="phoneNo" placeholder="(xxx)-xxxx-xxxx"
            class="form-control" required style="width:50%">
        </div>
        <br>
        <div class = "form group">
            <label for ="userName">UserName:</label>
            <input type="text" name = "userName" id = "userName" placeholder="UserName"
                   class="form-control" required style="width: 50%">
        </div>
        <br>
        <div class = "form group">
            <label for = "password">Password:</label>
            <input type="password" name = "password" id = "password" placeholder="Password"
                   class="form-control" required style="width: 50%">
            <br>
        </div>

        <input type="submit" value="Register" class="btn btn-success">

    </form>
</div>

</body>
</html>
