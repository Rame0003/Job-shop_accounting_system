<!DOCTYPE html> <html>
<head>
<meta charset="UTF-8">
<title> Search Customer</title> </head>
<body>
<h2>Search for customers within a category range</h2>
<!--
Form for collecting user input for the new movie_night record. 
Upon form submission, add_movie.jsp file will be invoked.
-->

<form action="IP_Task_7_Ramesh_Abilash_getcategfinal.jsp">
<!-- The form organized in an HTML table for better clarity. --> 
<table border=1>
<tr>
<th colspan="2">Enter the Customer category range:</th>
</tr> 
<tr><td>Category begins:</td> 
<td><div style="text-align: center;"> 
<input type=text name=Cat1>
</div></td>
</tr> 
<tr>
<td>Category Ends at:</td>
 <td>
 <div style="text-align: center;"> 
 <input type=text name=Cat2> 
 </div></td>
 </tr> 
 
<tr>
<td><div style="text-align: center;"> 
<input type=reset value=Clear> 
</div></td>
<td>
<div style="text-align: center;">
 <input type=submit value=Insert>
 </div></td>
</tr> 
</table>
</form> 
  <a href="IP_Task_7_Ramesh_Abilash_get_all_customer.jsp">See all Customers.</a>
</body>
</html>