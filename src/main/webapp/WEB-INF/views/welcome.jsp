<%--
  Created by IntelliJ IDEA.
  User: 1034511
  Date: 04-10-2022
  Time: 14:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tennis Player Application</title>
</head>
<body>

<h1>Welcome back</h1>
<h2>Player Name is : <i> ${PlayerName} </i> </h2>
<%@page import="java.time.LocalDate"%>
<%
        System.out.println("Hello, this from JSP, "+request.getAttribute("PlayerName"));
        LocalDate getCutrrentDate = LocalDate.now();
    System.out.println(getCutrrentDate);
        %>

<h1>Tody Date: <%=  getCutrrentDate%></h1>

<form action="/player.do" method="post">
    <label>Player Name:</label>
    <input type="text" name="name" />
    <label>Player Id:</label>
    <input type="text" name="id" />
    <input type="submit" value="Enter" />
</form>

</body>
</html>
