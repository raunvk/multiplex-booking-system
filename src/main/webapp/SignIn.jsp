<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
body{
background-color:#D3D3D3;}
table {
  border-spacing: 12px;
 }
 span.normal{
  font-weight: normal;
 }
</style>
<title>User Login</title>
</head>
<body>
<form action="LoginServlet" method="post">
<h1 align="center">Sign-In</h1>
<br><br><br><br><br>
<table align= "center" border="0">

<tr>
<th align="left">EmailId</th>
<td><input type="email"  name="EmailId" size="25"  required/></td>
</tr>
<tr>
<th align="left">Password</th>
<td><input type="password"  name ="Password" size="25"  required/></td>
</tr>
 <tr>
 <th></th>
 <td>
<button type="submit">Sign-In</button> 
</td>
</tr>
<tr>
<th ><span class="normal">Don't have an account?</span></th>
<td><a href="SignUp.jsp"/>Sign-Up</td>
</tr>
</table> 
</form>
</body>
</html>