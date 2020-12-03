<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Laptop Cart</title>
</head>
<body>

	<table border="1" bordercolor="red" align = "center" width="500" cellpadding="10%">
		<thead>
			<tr>
				<th>ID</th>
				<th>BRAND</th>
				<th>PRICE</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="laptop" items="${listOfLaptop}">
				<tr>
					<td align = "center">${laptop.id}</td>
					<td align = "center">${laptop.brand}</td>
					<td align = "center">${laptop.price}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>