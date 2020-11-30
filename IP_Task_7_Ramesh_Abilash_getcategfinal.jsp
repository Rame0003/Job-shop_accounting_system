<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<title>Query Result</title>
</head>

<body>

<%@page import="jsp_azure_test.DataHandler"%>
<%@page import="java.sql.ResultSet"%>
<%
// The handler is the one in charge of establishing the connection. 
String Category1 = request.getParameter("Cat1");
String Category2 = request.getParameter("Cat2"); 
int Category_1 = Integer.parseInt(Category1);
int Category_2= Integer.parseInt(Category2);

final DataHandler handler = new DataHandler();
final ResultSet cust = handler.Categorized_customer(Category_1, Category_2);
%>
<!-- The table for displaying all the movie records --> 
<table cellspacing="2" cellpadding="2" border="1">
<tr> <!-- The table headers row --> 
<td align="center">
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
 <a href="get_all_movies.jsp">See all customers.</a>
</body> 
</html>