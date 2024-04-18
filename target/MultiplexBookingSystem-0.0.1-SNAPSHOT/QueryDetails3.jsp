<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.multiplex.beans.Movie, com.multiplex.beans.Shows, com.multiplex.beans.Hall"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Deloitte Multiplex</title>

<style>
  .tbl { border-collapse: collapse; width:300px; }
  .tbl th, .tbl td { padding: 5px; border: solid 1px #777;}
  .tbl th { background-color:#1A237E; color:#FFFFFF }
  .tbl-separate { border-collapse: separate; border-spacing: 5px;}
  
  
.center {
border: 3px dashed #448AFF;
text-align: center;
}

.center2 {
txt-align: center;
}

</style>


</head>

<body>

<div class="center">
<h1 style="color:#1A237E">Welcome to Deloitte Multiplex</h1>


<br><br>

<table class="tbl" style="margin-left:auto;margin-right:auto;">

<tr>
<th>Show ID</th>
<th>Hall ID</th>
<th>Movie ID</th>
<th>Slot No.</th>
<th>From (Date)</th>
<th>To (Date)</th>
<th>Book/Cancel</th>
</tr>

<tr>

<td>${requestScope.shows.getShowId()}</td>
<td>${requestScope.shows.getHallId()}</td>
<td>${requestScope.shows.getMovieId()}</td>
<td>${requestScope.shows.getSlotNo()}</td>
<td>${requestScope.shows.getFromDate()}</td>
<td>${requestScope.shows.getToDate()}</td>
<td><button type="button" style="background-color:#00C853; border:#00C853; color:#FFFFFF; border-radius:3px;">Book</button>
<button type="button" style="background-color:#00C853; border:#00C853; color:#FFFFFF; border-radius:3px;">Cancel</button></td>

</tr>

</table>

<br><br>

</div>

</body>
</html>