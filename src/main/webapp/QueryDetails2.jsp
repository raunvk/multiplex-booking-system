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

<br>

<form action="SearchMovie" method="post">

<input name="movieName" type="text" placeholder="Enter Movie Here" style="width:325px;">
<button type="submit" style="background-color:#00C853; border:#00C853; color:#FFFFFF; border-radius:3px; padding-left:5px; padding-right:5px;">Search</button>

</form>

<br><br>

<form action="DisplayShows" method="post" id="myForm">
<table class="tbl" style="margin-left:auto;margin-right:auto;">

<tr>
<th>Movie ID</th>
<th>Movie Name</th>
<th>Movie Info</th>
</tr>

<tr><td>${requestScope.movies.getMovieId()}</td>
<td>${requestScope.movies.getMovieName()}</td>
<input type="hidden" name="mId" value="${requestScope.movies.getMovieId()}"/>

<td><button type="button" onclick="myFunction()" style="background-color:#00C853; border:#00C853; color:#FFFFFF; border-radius:3px;">Click Here</button></td></tr>




</table>
</form>

<script>
function myFunction() {
  document.getElementById("myForm").submit();
}
</script>

<br><br>

</div>

</body>
</html>