<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html> <html>
<head>
<meta charset="UTF-8">
<title>Customers details</title> </head>
<body>
<%@page import="jsp_azure_test.DataHandler"%> 
<%@page import="java.sql.ResultSet"%>
<%
// We instantiate the data handler here, and get all the movies from the database 
final DataHandler handler = new DataHandler();
final ResultSet cust = handler.getAllcustomers();
%>
<!-- The table for displaying all the movie records --> 
<table cellspacing="2" cellpadding="2" border="1">
<tr> <!-- The table headers row --> <td align="center">
<h4>Customer name</h4> </td>
<td align="center">
<h4>Customer address</h4> </td>
<td align="center">
<h4>Category</h4> </td>

</tr> <%
while(cust.next()) { // For each movie_night record returned... // Extract the attribute values for every row returned
final String name = cust.getString("Customer_name");
final String address = cust.getString("Address");
final String category = cust.getString("category");
out.println("<tr>"); 
// Start printing out the new table row 
out.println( 
		// Print each attribute value
		"<td align=\"center\">" + name +
		"</td><td align=\"center\"> " + address +
		"</td><td align=\"center\"> " + category +
		"</td>");
out.println("</tr>"); 
}

%>
 </table>
 <a href="IP_Task_7_Ramesh_Abilash_searchcategform.jsp">Search customers by Category range.</a>
</body> 
</html>