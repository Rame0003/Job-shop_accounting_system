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
<%@page import="java.sql.Array"%>
<%
// The handler is the one in charge of establishing the connection. 
DataHandler handler = new DataHandler();
// Get the attribute values passed from the input form.
String customer_name = request.getParameter("customer_name");
String customer_address = request.getParameter("customer_address"); 
String category = request.getParameter("category"); 

/*
* If the user hasn't filled out all the time, movie name and duration. This is very simple
checking. */
if (customer_name.equals("") || customer_address.equals("") || category.equals("")) 
{ 
	response.sendRedirect("addcustomerform.jsp");
} 
else 
{
	int cat = Integer.parseInt(category);
	
	// Now perform the query with the data from the form.
	boolean success = handler.addcustomer(customer_name, customer_address, cat);
	if (!success) { // Something went wrong %>
	<h2>There was a problem inserting the course</h2> <%
	} else 
		{ // Confirm success to the user %>
		<h2> Customer details:</h2>
		<ul>
		<li>Customer Name : <%=customer_name%></li> 
		<li>Customer Address : <%=customer_address%></li> 
		<li>category: <%=category%></li> 
		</ul>
		<h2>Was successfully inserted.</h2>

            <a href="IP_Task_7_Ramesh_Abilash_get_all_customers.jsp">See all Customers.</a>
            <%
        }
    }
    %>
    </body>
</html>
