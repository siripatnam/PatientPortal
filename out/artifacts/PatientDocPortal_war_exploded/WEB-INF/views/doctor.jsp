<%--
  Created by IntelliJ IDEA.
  User: Siri Patnam
  Date: 8/29/2018
  Time: 2:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
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
<body>

<div class="container marginstyle">

    <h3>The Doctor details are</h3>
    <div align="center">
        <table class="table">
            <thead class="thead-dark">
            <tr>
                <th scope="col">Doctor Name</th>
                <th scope="col">Specialization</th>
                <th scope="col">ZipCode</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>${doctor.docname}</td>
                <td>${doctor.speciality}</td>
                <td>${doctor.zipcode}</td>
            </tr>
            </tbody>
        </table>
    </div>

    <h2>Enter the Patient Details to confirm the appointment </h2>

    <form action="/confirmAppointment" method="post">
    <div class="form-group">
        <label for ="patientName">PatientName:</label>
        <input type="text" name = "patientName" id = "patientName" placeholder="Patient Name"
               class="form-control" style="width: 50%;" >
    </div>
    <div class = "form-group">
        <label for ="phoneNo">Phone no:</label>
        <input type="text" name = "phoneNo" id ="phoneNo"
               class="form-control" placeholder="(XXX)-XXX-XXXX" style="width: 50%;">
    </div>




    <input type="submit" value="Confirm Booking" class="btn btn-success">
</form>
</div>
</body>
</html>
