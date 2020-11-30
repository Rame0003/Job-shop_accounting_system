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
String Category1 = request.getParameter("Cat1");
String Category2 = request.getParameter("Cat2"); 

/*
* If the user hasn't filled out all the time, movie name and duration. This is very simple
checking. */
if (Category1.equals("") || Category2.equals("")) 
{ 
	response.sendRedirect("searchcategform.jsp");
} 
else 
{
	int Category_1 = Integer.parseInt(Category1);
	int Category_2= Integer.parseInt(Category2);
	
	// Now perform the query with the data from the form.
	ResultSet success = handler.Categorized_customer(Category_1, Category_2);
	
	 // Confirm success to the user %>
		
		<h2>Was successfully performed.</h2>

            <a href="IP_Task_7_Ramesh_Abilash_getcategfinal.jsp">See all movie nights.</a>
            <%
        
    }
    %>
    </body>
</html>
