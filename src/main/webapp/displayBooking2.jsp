<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.multiplex.beans.Booking"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<script>
function fun(){
	alert("Ticket cancelled successfully");
}
		
</script>
<body>

<h1>Booking Details </h1>

<form action="SearchBooking2" method="post">

<input name="bookingId" type="number" placeholder="Enter Booking ID for cancellation of tickets">
<button type="submit">Search</button>


</form>

<br>
<form action="DelTicket" method="post">
	<table border=2>
		<tr>
			<th>BookingId</th>
			<th>ShowId</th>
			<th>UserId</th>
			<th>BookedDate</th>
			<th>ShowDate</th>
			<th>Cancellation</th>
		</tr>

<tr><td>${booking.getBookingId()}</td>
<td>${booking.getShowId()}</td>
<td>${booking.getUserId()}</td>
<td>${booking.getBookedDate()}</td>
<td>${booking.getShowDate()}</td>
	<%
	Booking booking = (Booking)request.getAttribute("booking");
        int f = booking.getShowId();
        if(f==0){
            %>            
            <td>Invalid Booking</td>
        <%
            } else {
        %>
            <td><button onclick="fun()" id="but1" type="submit">Cancel</button></td>
        <%
            }
        %>
</tr>
</table>




<input type="hidden" name="bId" value="${requestScope.booking.getBookingId()}"/>

</form>


</body>
</html>