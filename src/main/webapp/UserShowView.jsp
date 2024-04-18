<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> 
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>shows Avilable </h1>
	<table  border="1",cellpadding="9">
		<tr>
			<th>ShowId</th>
			<th>Hall</th>
			<th>Mname</th>
			<th>SlotId</th>
			<th>SeatType</th>
			<th>getTotalSeat</th>
			<th>SeatAvailable</th>
			<th>Price</th>
			<th>From date</th>
			<th>To date</th>
			<th>Link</th>
		</tr>
		<c:forEach items="${requestScope.showlist}" var="show">
			<tr>
				<td>${show.getShowId() }</td>
				<td>${show.getHall() }</td>
				<td>${show.getMname() }</td>
				<td>${show.getSlotId() }</td>
				<td>${show.getSeatType() }</td>
				<td>${show.getTotalSeat() }</td>
				<td>${show.getSeatAvailable() }</td>
				<td>${show.getPrice() }</td>
				<td>${show.getFromdate() }</td>
				<td>${show.getTodate() }</td>
				<td><a href="${show.getLink()}">to see about movie</a></td>
			</tr>
		</c:forEach>
		
	</table>
	<a href="userlogin.html">Please login to book ticket</a></br>
</body>
</html>