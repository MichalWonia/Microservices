<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${devices.brandName} devices</title>
</head>
<body>

<h3> List of ${devices.brandName} devices </h3>
<hr/>

<table border="1">
    <thead>
    <tr>
    <td>Name</td>
    <td>Type</td>
    </tr>
    </thead>

        <c:forEach var="device" items="${devices.devices}">

        <tr>
        <td> ${device.name} </td>
        <td> ${device.type} </td>
        </tr>

        </c:forEach>
</table>

</ul>
</body>
</html>