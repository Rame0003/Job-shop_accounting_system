<!DOCTYPE html> <html>
<head>
<meta charset="UTF-8">
<title>Add Customer</title> </head>
<body>
<h2>Adding a new customer to the customer list</h2>
<!--
Form for collecting user input for the new movie_night record. 
Upon form submission, add_movie.jsp file will be invoked.
-->

<form action="IP_Task_7_Ramesh_Abilash_add_customer.jsp">
<!-- The form organized in an HTML table for better clarity. --> 
<table border=1>
<tr>
<th colspan="2">Enter the Customer details:</th>
</tr> 
<tr><td>Customer name:</td> 
<td><div style="text-align: center;"> 
<input type=text name=customer_name>
</div></td>
</tr> 
<tr>
<td>Customer address:</td>
 <td>
 <div style="text-align: center;"> 
 <input type=text name=customer_address> 
 </div></td>
 </tr> 
 <tr>
<td>Category:</td>
<td><div style="text-align: center;">
 <input type=text name=category> 
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
<a href="IP_Task_7_Ramesh_Abilash_get_all_customers.jsp">See all Customers.</a>
</body>
</html>
