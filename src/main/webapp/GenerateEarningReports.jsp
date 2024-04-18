<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" 
integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" 
integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" 
integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" 
integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<title>Insert title here</title>
<style>
body {
  padding-left: 100px;
}
button{
	 background-color:	#D0D0D0;
	 border: none;
	  color: black;
  padding: 7px 9px;
  text-align: center;
  font-size: 13px;
  margin: 4px 2px;
 
 
}
</style>
</head>
<body>
<form action="ReportServlet" method="post" style="margin-top: 20px;">

<h3 style="margin-left: 350px;"><i><u>Genarate Earning Report</u></i></h3><br><br>
<label style="margin-left: 270px;">FromDate:</label>
  <input type="date" id="fromdate" name="from-date" style="margin-left: 20px;">
  <label style="margin-left: 50px;">ToDate:</label>
  <input type="date" id="todate" name="to-date" style="margin-left: 20px;"><br><br>
 <button type="submit" style="margin-left: 500px;">Generate</button>
 </form>
 <br>
 <div class="row justify-content-center">
<table class="table table-striped table-bordered" style="margin-right: 50px; width: 600px;" >
  <thead>
    <tr>
      <th >From-Date</th>
      <th >To-Date</th>
      <th>Total-Price</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      
      <td>${requestScope.fromdate}</td>
      <td>${requestScope.todate}</td>
      <td>${requestScope.sum}</td>
    </tr>
   
    
  </tbody>
</table>
</div>
 
</body>
</html>