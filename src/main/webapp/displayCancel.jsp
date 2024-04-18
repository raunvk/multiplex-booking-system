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


<h1>Booking Details </h1>


<form action="SearchBooking2" method="post">

<input name="bookingId" type="number" placeholder="Enter Booking ID for cancellation of tickets">
<button type="submit">Search</button>

</form>

<br>

	<table border=1>
		<tr>
			<th>BookingId</th>
			<th>ShowId</th>
			<th>UserId</th>
			<th>BookedDate</th>
			<th>ShowDate</th>
			<th>Cancellation</th>
		</tr>
<c:forEach items="${requestScope.booking}" var="booking">
<tr><td>${booking.getBookingId()}</td>
<td>${booking.getShowId()}</td>
<td>${booking.getUserId()}</td>
<td>${booking.getBookedDate()}</td>
<td>${booking.getShowDate()}</td>
<td><button onclick="fun()" id="but1" type="submit">Cancel</button></td>
</tr>
</c:forEach>
		
		
	</table>

</body>
</html>