<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%--
  Created by IntelliJ IDEA.
  User: Siri Patnam
  Date: 8/27/2018
  Time: 3:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Patient|Login</title>

    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <style>
        .marginstyle{
            margin-top: 50px;
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
            <li class="active"><a href="/welcome">Find Doc</a></li>
            <li><a href = "/pastappointments" >Past Appointments</a></li>
            <li><a href="/"> LogOut</a> </li>
        </ul>
    </div>
</nav>
<div class="container marginstyle">


    <h2>Welcome ${login.userName} !!</h2>

    <h3>Choose the doctor with whom you want to book the appointment for</h3>

    <sql:setDataSource var="database"
                       driver = "org.postgresql.Driver"
                       url="jdbc:postgresql://localhost:5432/postgres"
                       user="postgres" password="admin"/>

    <sql:query var="doctorlist" dataSource="${database}">
        SELECT * FROM appointment;
    </sql:query>

    <table class="table table-bordered">

        <thead>
        <tr>
            <th>DoctorName</th>
            <th>Specialization</th>
            <th>ZipCode</th>
            <th>Available slots</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="doctor" items="${doctorlist.rows}">
        <form action = "/welcome" method="post">
        <tr>
            <td><input type="hidden" name="docname" value = "${doctor.docname}">${doctor.docname}</td>
            <td><input type="hidden" name="speciality" value="${doctor.speciality}">${doctor.speciality}</td>
            <td><input type="hidden" name="zipcode" value="${doctor.zipcode}">${doctor.zipCode}</td>

            <td><input type="submit" value="Book" class="btn btn-success"></td>

        </tr>
        </form>
            </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
