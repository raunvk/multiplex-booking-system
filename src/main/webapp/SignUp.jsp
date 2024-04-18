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
<title>User Registration</title>
</head>
<body>
<form action="RegistrationServlet" method="post">
<h1 align="center">Sign-Up</h1>
<br><br><br><br><br>
<table align= "center" border="0">
<tr>
<th align="left">Name</th> 
<td><input type="text" name="UserName" size="20" required/></td> 
</tr>
<tr>
<th align="left">Email</th>
<td><input type="email"  name="EmailId" required/></td>
</tr>
<tr>
<th align="left">Mobile Number</th>
<td><input type="tel"  name="MobileNo"  maxlength="10" minlength="10" required>
</td>
</tr>
<tr>
<th align="left">User Type</th> 
<td><select name="UserType">
  <option value="User" >User</option>
  <option value="Admin" >Admin</option>
  </select>
</td> 
</tr>
<tr>
<th align="left">Password</th>
<td><input type="password"  name ="Password" required/></td>
</tr>
<tr>
<th align="left">Confirm Password</th>
<td><input type="Password"  name="Repass" required></td>
</tr>
  <tr>
 <th></th>
 <td>
<button type="submit">Submit</button> 
</td>
</tr>
<tr>
<th ><span class="normal">Already Have an account?</span></th>
<td><a href="SignIn.jsp"/>Sign-In</td>
</tr>
</table> 
</form>
</body>
</html>