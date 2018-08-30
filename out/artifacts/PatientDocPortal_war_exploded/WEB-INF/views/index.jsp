<%--
  Created by IntelliJ IDEA.
  User: Siri Patnam
  Date: 8/27/2018
  Time: 12:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri ="http://www.springframework.org/tags/form" prefix="form" %>
<html>
  <head>
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
          .error{
              font-color: red;
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
              <li><a>New User?</a></li>
              <li><a href="/register">Sign Up</a> </li>
          </ul>
      </div>
  </nav>
  <div class = "container marginstyle">
    <form:form action="/login" method="post" modelAttribute="login">
      <div class="form-group">
        <label for ="userName">UserName:</label>
        <form:input type="text" path="userName" name = "userName" id = "userName" placeholder="User Name"
               class="form-control"  style="width: 50%;" />
          <form:errors path="userName" cssClass="style:error"/>
      </div>
      <div class = "form-group">
        <label for ="password">Password:</label>
        <input type="password" name = "password" id ="password"
               class="form-control" placeholder="Password" style="width: 50%;">
      </div>

        <input type="submit" value="Login" class="btn btn-success">
      <div style="color:red" >${error}</div>
        <%--<input type="submit" value="SignUp" class="btn btn-primary" onclick="location.href = 'regiter.jsp'">--%>


    </form:form>
  </div>

  </body>
</html>
