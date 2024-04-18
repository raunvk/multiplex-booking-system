<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  import ="java.util.*" import ="For.show.*" %>
  <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> 
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head> 
<body>
	
	<table  border="1" , cellpadding="9">
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
			<th>ToBook</th>
			<th>link</th>
		</tr>
		<%-- <% List<ShowUser> showlist= (List<ShowUser>)request.getAttribute("showlist"); %>
		<%= showlist %> --%>
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
				<td><form action="booking" method="post">
					<input type = "hidden" id="ShowId" name = "ShowId" value="${show.getShowId() }">
					<input type = "hidden" id="Hall" name = "Hall" value="${show.getHall() }">
					<input type = "hidden" id="Mname" name = "Mname" value="${show.getMname() }">
					<input type = "hidden" id="SlotId" name = "SlotId" value="${show.getSlotId() }">
					<input type = "hidden" id="SeatType" name = "SeatType" value="${show.getSeatType() }">
					<input type = "hidden" id="TotalSeat" name = "TotalSeat" value="${show.getTotalSeat() }">
					<input type = "hidden" id="SeatAvailable" name = "SeatAvailable" value="${show.getSeatAvailable() }">
					<input type = "hidden" id="Price" name = "Price" value="${show.getPrice() }">
					<input type = "hidden" id="Fromdate" name = "Fromdate" value="${show.getFromdate() }">
					<input type = "hidden" id="Todate" name = "Todate" value="${show.getTodate() }">
					<input type = "hidden" id="uid" name = "uid" value="${requestScope.uid }">
					<input type = "hidden" id="Link" name = "Link" value="${show.getLink()}">
					<input type = "hidden" id="Mid" name = "Mid" value="${show.getMid()}">
					<input type = "hidden" id="Hallid" name = "Hallid" value="${show.getHallid()}">
					<input type = "hidden" id="Seatid" name = "Seatid" value="${show.getSeatid()}">
					<input type = "hidden" id="noofseat" name = "noofseat" value="1">
					Show Date<input type ="text" id = "showdate" name = "showdate">
					<input type = "submit" value = "to book click here">
					</form></td>
				<td><a href="${show.getLink()}">to see about movie</a></td>
			</tr>
		</c:forEach>
		
	</table>
	
	
</body>
</html>