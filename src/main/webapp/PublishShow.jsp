<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
body{
background-color:#D3D3D3;}
table {
  border-spacing: 11px;
}
span.normal{
  font-weight: normal;
}
</style>
<title>Publish Show Details</title>
</head>
<body>
<form action="PublishShowDetailsServlet" method="post">
<h1 align="center">Publish Show Details</h1>
<br><br><br><br><br>
<table align= "center" border="0">
<tr>
<th align="left">MovieName</th>
<td><input type="text"  name="MovieName" required/></td>
</tr>
<tr>
<th align="left">HallId</th> 
<td><select name="HallId">
  <option>Screen1</option>
  <option>Screen2</option>
  <option>Screen3</option>
  </select>
</td> 
</tr>
<tr>
<th align="left">SlotNo</th> 
<td><select name="SlotNo">
  <option>1 MorningShow</option>
  <option>2 MatineeShow</option>
  <option>3 EveningShow</option>
  <option>4 NightShow</option>
  </select>
</td> 
</tr>  
<tr>
 <th align="left">From Date</th>
<td>
<input type="date" name="FromDate" required>
</td>
</tr>
<tr>
 <th align="left">To Date</th>
<td>
<input type="date" name="ToDate" required>
</td>
</tr>
 <tr>
<th></th>
<td>
<button type="submit">Update</button> 
</td>
</tr>
</table> 
</form>
</body>
</html>
