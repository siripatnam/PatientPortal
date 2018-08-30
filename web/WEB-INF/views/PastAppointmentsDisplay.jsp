<%--
  Created by IntelliJ IDEA.
  User: Siri Patnam
  Date: 8/29/2018
  Time: 5:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title></title>
    <title>Patient|Login</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
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
                <li><a href = "/welcome">Find Doc</a></li>
                <li><a href ="/pastappointments">Past Appointments</a></li>
                <li><a href="/login">LogOut</a> </li>
            </ul>
        </div>
    </nav>
    <div class="container marginstyle">

    <sql:setDataSource var="database"
                   driver = "org.postgresql.Driver"
                   url="jdbc:postgresql://localhost:5432/postgres"
                   user="postgres" password="admin"/>

<sql:query var="doctorlist" dataSource="${database}">
    SELECT * FROM bookeddata;
</sql:query>
<table class="table table-bordered">
    <h3>Your Previous appointments ${login.userName}</h3>
    <thead>
    <tr>
        <th>DoctorName</th>
        <th>Specialization</th>
        <th>ZipCode</th>
        <th>Patient Name</th>
        <th>Patient PhoneNo</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="doctor" items="${doctorlist.rows}">
        <form>
            <tr>
                <td><input type="hidden" name="docname" value = "${doctor.docname}">${doctor.docname}</td>
                <td><input type="hidden" name="speciality" value="${doctor.speciality}">${doctor.speciality}</td>
                <td><input type="hidden" name="zipcode" value="${doctor.zipcode}">${doctor.zipCode}</td>
                <td><input type="hidden" name="patientName" value = "${doctor.patientname}">${doctor.patientname}</td>
                <td><input type="hidden" name="phoneNo" value = "${doctor.phoneno}">${doctor.phoneno}</td>
            </tr>
        </form>
    </c:forEach>
    </tbody>
</table>
</div>
</body>
</html>
