<%--
  Created by IntelliJ IDEA.
  User: Siri Patnam
  Date: 8/27/2018
  Time: 5:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>PastAppointments</title>
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
<body>
    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href="#">PatientFirst</a>
            </div>
            <ul class="nav navbar-nav">
                <li><a href = "/welcome">Find Doc</a></li>
                <li><a href="/login">LogOut</a> </li>
            </ul>
        </div>
    </nav>
    <div class="container marginstyle">

    <h3> Search by patient name</h3>
    <form action="/pastAppointmentsDisplay" method="post">
    <div class="form-group">
        <label for ="patientName">PatientName:</label>
        <input type="text" name = "patientName" id = "patientName" placeholder="User Name"
               class="form-control" style="width: 50%;" >
    </div>
    <input type="submit" value="Search" class="btn btn-primary">
    </form>
</div>
</body>
</html>
