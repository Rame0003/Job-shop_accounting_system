import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.DataInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class FinalDemo
{
    
    public static void Insert_Customer(String Name, String Address, int category)//Defining class for Procedure 1
	{

        String query = "{ call Insert_Customer(?, ?, ?) }"; //Calling procedure 
        ResultSet rs;
    	// Connect to database
        final String hostName = "hw-cs4513.database.windows.net"; 
        final String dbName = "CS-DSA-4513-HW2";
        final String user = "Rame0003";
        final String password = "SmoothCriminal147!";
        final String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;host NameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        try 
        (final Connection connection = DriverManager.getConnection(url)) //Establishing Connection
        {
        	final String schema = connection.getSchema(); 
        	System.out.println("Successful connection - Schema:" + schema); 
        	System.out.println("Inserting Customer details");
            try
            (final Connection conn = DriverManager.getConnection(url);
            		CallableStatement stmt = conn.prepareCall(query)) 
            {
            											//Providing parameters to the procedure
            	stmt.setString(1, Name);
            	stmt.setString(2, Address);
            	stmt.setInt(3, category);
            	rs = stmt.executeQuery();				//Query execution
            	}
            catch (SQLException ex)
            {
            	System.out.println(ex.getMessage());
            	}
            }
        catch (SQLException e)
        {
			throw new RuntimeException(e);
		}
    }

    public static void Insert_Department(int Department_No, String Details)//Defining class for Procedure 2
	{
        String query = "{ call Insert_Department(?, ?) }"; //Calling procedure 
        ResultSet rs;
    	// Connect to database
        final String hostName = "hw-cs4513.database.windows.net"; 
        final String dbName = "CS-DSA-4513-HW2";
        final String user = "Rame0003";
        final String password = "SmoothCriminal147!";
        final String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;host NameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        try 
        (final Connection connection = DriverManager.getConnection(url)) //Establishing Connection
        {
        	final String schema = connection.getSchema(); 
        	System.out.println("Successful connection - Schema:" + schema); 
        	System.out.println("Inserting Department details");
            try
            (final Connection conn = DriverManager.getConnection(url);
            		CallableStatement stmt = conn.prepareCall(query))
            {
            											//Providing parameters to the procedure
            	stmt.setInt(1, Department_No);
            	stmt.setString(2, Details);
            	rs = stmt.executeQuery();				//Query execution
            	}
            catch (SQLException ex)
            {
            	System.out.println(ex.getMessage());
            	}
            }
        catch (SQLException e)
        {
			throw new RuntimeException(e);
		}
    }

    public static void Insert_Assembly(int Assembly_ID, String Date, String Details, String Customer_name)//Defining class for Procedure 3
	{
        String query = "{ call Insert_Assembly(?, ?, ?, ?) }"; //Calling procedure 
        ResultSet rs;
    	// Connect to database
        final String hostName = "hw-cs4513.database.windows.net"; 
        final String dbName = "CS-DSA-4513-HW2";
        final String user = "Rame0003";
        final String password = "SmoothCriminal147!";
        final String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;host NameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        try 
        (final Connection connection = DriverManager.getConnection(url)) //Establishing Connection
        {
        	final String schema = connection.getSchema(); 
        	System.out.println("Successful connection - Schema:" + schema); 
        	System.out.println("Inserting Customer details");
            try
            (final Connection conn = DriverManager.getConnection(url);
            		CallableStatement stmt = conn.prepareCall(query))
            {
            											//Providing parameters to the procedure
            	stmt.setInt(1, Assembly_ID);
            	stmt.setString(2, Date);
                stmt.setString(3, Details);
                stmt.setString(4, Customer_name);
            	rs = stmt.executeQuery();				//Query execution
            	}
            catch (SQLException ex)
            {
            	System.out.println(ex.getMessage());
            	}
            }
        catch (SQLException e)
        {
			throw new RuntimeException(e);
		}
    }

    public static void Insert_Process(int PID, String Details, int Department_No)//Defining class for Procedure 4
	{
        String query = "{ call Insert_Process(?, ?, ?) }"; //Calling procedure 
        ResultSet rs;
    	// Connect to database
        final String hostName = "hw-cs4513.database.windows.net"; 
        final String dbName = "CS-DSA-4513-HW2";
        final String user = "Rame0003";
        final String password = "SmoothCriminal147!";
        final String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;host NameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        try 
        (final Connection connection = DriverManager.getConnection(url)) //Establishing Connection
        {
        	final String schema = connection.getSchema(); 
        	System.out.println("Successful connection - Schema:" + schema); 
        	System.out.println("Inserting Customer details");
            try
            (final Connection conn = DriverManager.getConnection(url);
            		CallableStatement stmt = conn.prepareCall(query))
            {
            											//Providing parameters to the procedure
            	stmt.setInt(1, PID);
                stmt.setString(2, Details);
                stmt.setInt(3, Department_No);
            	rs = stmt.executeQuery();				//Query execution
            	}
            catch (SQLException ex)
            {
            	System.out.println(ex.getMessage());
            	}
            }
        catch (SQLException e)
        {
			throw new RuntimeException(e);
		}
    }

    public static void Insert_Fit_Process(int PID, String Fit_Type )//Defining class for Procedure 5
	{
        String query = "{ call Insert_Fit_Process(?, ?) }"; //Calling procedure 
        ResultSet rs;
    	// Connect to database
        final String hostName = "hw-cs4513.database.windows.net"; 
        final String dbName = "CS-DSA-4513-HW2";
        final String user = "Rame0003";
        final String password = "SmoothCriminal147!";
        final String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;host NameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        try 
        (final Connection connection = DriverManager.getConnection(url)) //Establishing Connection
        {
        	final String schema = connection.getSchema(); 
        	System.out.println("Successful connection - Schema:" + schema); 
        	System.out.println("Inserting Customer details");
            try
            (final Connection conn = DriverManager.getConnection(url);
            		CallableStatement stmt = conn.prepareCall(query))
            {
            											//Providing parameters to the procedure
            	stmt.setInt(1, PID);
                stmt.setString(2, Fit_Type);
            	rs = stmt.executeQuery();				//Query execution
            	}
            catch (SQLException ex)
            {
            	System.out.println(ex.getMessage());
            	}
            }
        catch (SQLException e)
        {
			throw new RuntimeException(e);
		}
    }

    public static void Insert_Paint_Process(int PID, String Paint_Type, String Painting_method )//Defining class for Procedure 6
	{
        String query = "{ call Insert_Paint_Process(?, ?, ?) }"; //Calling procedure 
        ResultSet rs;
    	// Connect to database
        final String hostName = "hw-cs4513.database.windows.net"; 
        final String dbName = "CS-DSA-4513-HW2";
        final String user = "Rame0003";
        final String password = "SmoothCriminal147!";
        final String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;host NameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        try 
        (final Connection connection = DriverManager.getConnection(url)) //Establishing Connection
        {
        	final String schema = connection.getSchema(); 
        	System.out.println("Successful connection - Schema:" + schema); 
        	System.out.println("Inserting Customer details");
            try
            (final Connection conn = DriverManager.getConnection(url);
            		CallableStatement stmt = conn.prepareCall(query))
            {
            											//Providing parameters to the procedure
            	stmt.setInt(1, PID);
                stmt.setString(2, Paint_Type);
                stmt.setString(3, Painting_method);
            	rs = stmt.executeQuery();				//Query execution
            	}
            catch (SQLException ex)
            {
            	System.out.println(ex.getMessage());
            	}
            }
        catch (SQLException e)
        {
			throw new RuntimeException(e);
		}
    }

    public static void Insert_Cut_Process(int PID, String Cut_Type, String Machine_type)//Defining class for Procedure 7
	{
        String query = "{ call Insert_Cut_Process(?, ?, ?) }"; //Calling procedure 
        ResultSet rs;
    	// Connect to database
        final String hostName = "hw-cs4513.database.windows.net"; 
        final String dbName = "CS-DSA-4513-HW2";
        final String user = "Rame0003";
        final String password = "SmoothCriminal147!";
        final String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;host NameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        try 
        (final Connection connection = DriverManager.getConnection(url)) //Establishing Connection
        {
        	final String schema = connection.getSchema(); 
        	System.out.println("Successful connection - Schema:" + schema); 
        	System.out.println("Inserting Customer details");
            try
            (final Connection conn = DriverManager.getConnection(url);
            		CallableStatement stmt = conn.prepareCall(query))
            {
            											//Providing parameters to the procedure
            	stmt.setInt(1, PID);
                stmt.setString(2, Cut_Type);
                stmt.setString(3, Machine_type);
            	rs = stmt.executeQuery();				//Query execution
            	}
            catch (SQLException ex)
            {
            	System.out.println(ex.getMessage());
            	}
            }
        catch (SQLException e)
        {
			throw new RuntimeException(e);
		}
    }
    
    public static void Insert_Assembly_Account(String A_Account_no, String Date, String Assembly_ID, float Details1)//Defining class for Procedure 8
	{
        String query = "{ call Insert_Assembly_Account(?, ?, ?, ?) }"; //Calling procedure 
        ResultSet rs;
    	// Connect to database
        final String hostName = "hw-cs4513.database.windows.net"; 
        final String dbName = "CS-DSA-4513-HW2";
        final String user = "Rame0003";
        final String password = "SmoothCriminal147!";
        final String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;host NameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        try 
        (final Connection connection = DriverManager.getConnection(url)) //Establishing Connection
        {
        	final String schema = connection.getSchema(); 
        	System.out.println("Successful connection - Schema:" + schema); 
        	System.out.println("Inserting Customer details");
            try
            (final Connection conn = DriverManager.getConnection(url);
            		CallableStatement stmt = conn.prepareCall(query))
            {
            											//Providing parameters to the procedure
                stmt.setString(1, A_Account_no);
                stmt.setString(2, Date);
                stmt.setString(3, Assembly_ID);;
                stmt.setFloat(4, Details1);
            	rs = stmt.executeQuery();				//Query execution
            	}
            catch (SQLException ex)
            {
            	System.out.println(ex.getMessage());
            	}
            }
        catch (SQLException e)
        {
			throw new RuntimeException(e);
		}
    }
    
    public static void Insert_Department_Account(String D_Account_no, String Date,  int Department_No, float Details2)//Defining class for Procedure 9
	{
        String query = "{ call Insert_Department_Account(?, ?, ?, ?) }"; //Calling procedure 
        ResultSet rs;
    	// Connect to database
        final String hostName = "hw-cs4513.database.windows.net"; 
        final String dbName = "CS-DSA-4513-HW2";
        final String user = "Rame0003";
        final String password = "SmoothCriminal147!";
        final String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;host NameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        try 
        (final Connection connection = DriverManager.getConnection(url)) //Establishing Connection
        {
        	final String schema = connection.getSchema(); 
        	System.out.println("Successful connection - Schema:" + schema); 
        	System.out.println("Inserting Customer details");
            try
            (final Connection conn = DriverManager.getConnection(url);
            		CallableStatement stmt = conn.prepareCall(query))
            {
                //Providing parameters to the procedure
                stmt.setString(1, D_Account_no);
                stmt.setString(2, Date);
                stmt.setInt(3, Department_No);
                stmt.setFloat(4, Details2);
                
                rs = stmt.executeQuery();				//Query execution
            }
            catch (SQLException ex)
            {
            	System.out.println(ex.getMessage());
            	}
            }
        catch (SQLException e)
        {
			throw new RuntimeException(e);
		}
    }
    
    public static void Insert_Process_Account(String P_Account_no, String Date, int PID, float Details3)//Defining class for Procedure 10
	{
    
    String query = "{ call Insert_Process_Account(?, ?, ?, ?) }"; //Calling procedure 
        ResultSet rs;
    	// Connect to database
        final String hostName = "hw-cs4513.database.windows.net"; 
        final String dbName = "CS-DSA-4513-HW2";
        final String user = "Rame0003";
        final String password = "SmoothCriminal147!";
        final String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;host NameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        try 
        (final Connection connection = DriverManager.getConnection(url)) //Establishing Connection
        {
        	final String schema = connection.getSchema(); 
        	System.out.println("Successful connection - Schema:" + schema); 
        	System.out.println("Inserting Customer details");
            try
            (final Connection conn = DriverManager.getConnection(url);
            		CallableStatement stmt = conn.prepareCall(query))
            {
                //Providing parameters to the procedure
                stmt.setString(1, P_Account_no);
                stmt.setString(2, Date);
                stmt.setInt(3, PID);
                stmt.setFloat(4, Details3);
                rs = stmt.executeQuery();				//Query execution
            }
            catch (SQLException ex)
            {
            	System.out.println(ex.getMessage());
            	}
            }
        catch (SQLException e)
        {
			throw new RuntimeException(e);
		}
    }
    
    public static void Insert_Job(int Job_No, String Start_date)//Defining class for Procedure 11
	{
        String query = "{ call Insert_Job(?, ?) }"; //Calling procedure 
        ResultSet rs;
    	// Connect to database
        final String hostName = "hw-cs4513.database.windows.net"; 
        final String dbName = "CS-DSA-4513-HW2";
        final String user = "Rame0003";
        final String password = "SmoothCriminal147!";
        final String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;host NameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        try 
        (final Connection connection = DriverManager.getConnection(url)) //Establishing Connection
        {
        	final String schema = connection.getSchema(); 
        	System.out.println("Successful connection - Schema:" + schema); 
        	System.out.println("Inserting Customer details");
            try
            (final Connection conn = DriverManager.getConnection(url);
            		CallableStatement stmt = conn.prepareCall(query))
            {
                //Providing parameters to the procedure
                stmt.setInt(1, Job_No);
                stmt.setString(2, Start_date);
                rs = stmt.executeQuery();				//Query execution
            }
            catch (SQLException ex)
            {
            	System.out.println(ex.getMessage());
            	}
            }
        catch (SQLException e)
        {
			throw new RuntimeException(e);
		}
    }

    public static void Insert_Manufactures(int PID, int AID, int Job_no_R)//Defining class for Procedure 12
	{
        String query = "{ call Insert_Manufactures(?, ?, ?) }"; //Calling procedure 
        ResultSet rs;
    	// Connect to database
        final String hostName = "hw-cs4513.database.windows.net"; 
        final String dbName = "CS-DSA-4513-HW2";
        final String user = "Rame0003";
        final String password = "SmoothCriminal147!";
        final String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;host NameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        try 
        (final Connection connection = DriverManager.getConnection(url)) //Establishing Connection
        {
        	final String schema = connection.getSchema(); 
        	System.out.println("Successful connection - Schema:" + schema); 
        	System.out.println("Inserting Customer details");
            try
            (final Connection conn = DriverManager.getConnection(url);
            		CallableStatement stmt = conn.prepareCall(query))
            {
                //Providing parameters to the procedure
                stmt.setInt(1, PID);
                stmt.setInt(2, AID);
                stmt.setInt(3, Job_no_R);
                rs = stmt.executeQuery();//Query execution
            }
            catch (SQLException ex)
            {
            	System.out.println(ex.getMessage());
            	}
            }
        catch (SQLException e)
        {
			throw new RuntimeException(e);
		}
    }

    public static void Insert_Fit_Job(int FJob, String End_date , int labor_time)//Defining class for Procedure 13
	{
        String query = "{ call Insert_Fit_Job(?, ?, ?) }"; //Calling procedure 
        ResultSet rs;
    	// Connect to database
        final String hostName = "hw-cs4513.database.windows.net"; 
        final String dbName = "CS-DSA-4513-HW2";
        final String user = "Rame0003";
        final String password = "SmoothCriminal147!";
        final String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;host NameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        try 
        (final Connection connection = DriverManager.getConnection(url)) //Establishing Connection
        {
        	final String schema = connection.getSchema(); 
        	System.out.println("Successful connection - Schema:" + schema); 
        	System.out.println("Inserting Customer details");
            try
            (final Connection conn = DriverManager.getConnection(url);
            		CallableStatement stmt = conn.prepareCall(query))
            {
            											//Providing parameters to the procedure
            	stmt.setInt(1, FJob);
                stmt.setString(2, End_date);
                stmt.setInt(3, labor_time);
            	rs = stmt.executeQuery();				//Query execution
            	}
            catch (SQLException ex)
            {
            	System.out.println(ex.getMessage());
            	}
            }
        catch (SQLException e)
        {
			throw new RuntimeException(e);
		}
    }

    public static void Insert_Paint_Job(int PJob, String End_date, String color, float volume, int labor_time)//Defining class for Procedure 14
       { String query = "{ call Insert_Paint_Job(?, ?, ?, ?, ?) }"; //Calling procedure 
        ResultSet rs;
    	// Connect to database
        final String hostName = "hw-cs4513.database.windows.net"; 
        final String dbName = "CS-DSA-4513-HW2";
        final String user = "Rame0003";
        final String password = "SmoothCriminal147!";
        final String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;host NameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        try 
        (final Connection connection = DriverManager.getConnection(url)) //Establishing Connection
        {
        	final String schema = connection.getSchema(); 
        	System.out.println("Successful connection - Schema:" + schema); 
        	System.out.println("Inserting Customer details");
            try
            (final Connection conn = DriverManager.getConnection(url);
            		CallableStatement stmt = conn.prepareCall(query))
            {
            											//Providing parameters to the procedure
                stmt.setInt(1, PJob);
                stmt.setString(2, End_date);
                stmt.setString(3, color);
                stmt.setFloat(4, volume);
                stmt.setInt(5, labor_time);

            	rs = stmt.executeQuery();				//Query execution
            	}
            catch (SQLException ex)
            {
            	System.out.println(ex.getMessage());
            	}
            }
        catch (SQLException e)
        {
			throw new RuntimeException(e);
		}
    }

    public static void Insert_Cut_Job(int CJob, String End_date, String Machine_type, int Machine_used_time, String Material_used, int labor_time)//Defining class for Procedure 15
       { String query = "{ call Insert_Cut_Job(?, ?, ?, ?, ?, ?) }"; //Calling procedure 
        ResultSet rs;
    	// Connect to database
        final String hostName = "hw-cs4513.database.windows.net"; 
        final String dbName = "CS-DSA-4513-HW2";
        final String user = "Rame0003";
        final String password = "SmoothCriminal147!";
        final String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;host NameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        try 
        (final Connection connection = DriverManager.getConnection(url)) //Establishing Connection
        {
        	final String schema = connection.getSchema(); 
        	System.out.println("Successful connection - Schema:" + schema); 
        	System.out.println("Inserting Customer details");
            try
            (final Connection conn = DriverManager.getConnection(url);
            		CallableStatement stmt = conn.prepareCall(query))
            {
            											//Providing parameters to the procedure
                stmt.setInt(1, CJob);
                stmt.setString(2, End_date);
                stmt.setString(3, Machine_type);
                stmt.setInt(4, Machine_used_time);
                stmt.setString(5, Material_used);
                stmt.setInt(6, labor_time);


            	rs = stmt.executeQuery();				//Query execution
            	}
            catch (SQLException ex)
            {
            	System.out.println(ex.getMessage());
            	}
            }
        catch (SQLException e)
        {
			throw new RuntimeException(e);
		}
    }

    
    public static void Insert_Transaction(int Transaction_ID, float Sup_cost, int Job_no, String Assembly_Account_No, String Department_Account_no, String Process_Account_no)//Defining class for Procedure 16
	{
        String query = "{ call Insert_Transaction(?, ?, ?, ?, ?, ?) }"; //Calling procedure 
        ResultSet rs;
    	// Connect to database
        final String hostName = "hw-cs4513.database.windows.net"; 
        final String dbName = "CS-DSA-4513-HW2";
        final String user = "Rame0003";
        final String password = "SmoothCriminal147!";
        final String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;host NameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        try 
        (final Connection connection = DriverManager.getConnection(url)) //Establishing Connection
        {
        	final String schema = connection.getSchema(); 
        	System.out.println("Successful connection - Schema:" + schema); 
        	System.out.println("Inserting Customer details");
            try
            (final Connection conn = DriverManager.getConnection(url);
            		CallableStatement stmt = conn.prepareCall(query))
            {
            											//Providing parameters to the procedure
                stmt.setInt(1, Transaction_ID);
                stmt.setFloat(2, Sup_cost);
                stmt.setInt(3, Job_no);
                stmt.setString(4, Assembly_Account_No);
                stmt.setString(5, Department_Account_no);
                stmt.setString(6, Process_Account_no);
                

            	rs = stmt.executeQuery();				//Query execution
            }
                
            catch (SQLException ex)
            {
            	System.out.println(ex.getMessage());
            	}
            }
        catch (SQLException e)
        {
			throw new RuntimeException(e);
		}
    }


    
    public static void Total_labor_Time(String Date, int DNo)//Defining class for Procedure 17
	{
        String query = "{ call Total_labor_Time(?, ?) }"; //Calling procedure 
        ResultSet rs;
    	// Connect to database
        final String hostName = "hw-cs4513.database.windows.net"; 
        final String dbName = "CS-DSA-4513-HW2";
        final String user = "Rame0003";
        final String password = "SmoothCriminal147!";
        final String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;host NameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        try 
        (final Connection connection = DriverManager.getConnection(url)) //Establishing Connection
        {
        	final String schema = connection.getSchema(); 
        	System.out.println("Successful connection - Schema:" + schema); 
        	System.out.println("Inserting Customer details");
            try
            (final Connection conn = DriverManager.getConnection(url);
            		CallableStatement stmt = conn.prepareCall(query))
            {
            											//Providing parameters to the procedure
                stmt.setString(1, Date);
                stmt.setInt(2, DNo);
                
                

            	rs = stmt.executeQuery();				//Query execution
                
                while (rs.next()) 
                {
                    System.out.println("Total Labor Time per department= " + rs.getInt(1));
                }    
            
            }
            catch (SQLException ex)
            {
            	System.out.println(ex.getMessage());
            	}
            }
        catch (SQLException e)
        {
			throw new RuntimeException(e);
		}
    }


    public static void Retrieve_cost(int AID)//Defining class for Procedure 18
	{
        String query = "{ call Retrieve_cost(?) }"; //Calling procedure 
        ResultSet rs;
    	// Connect to database
        final String hostName = "hw-cs4513.database.windows.net"; 
        final String dbName = "CS-DSA-4513-HW2";
        final String user = "Rame0003";
        final String password = "SmoothCriminal147!";
        final String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;host NameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        try 
        (final Connection connection = DriverManager.getConnection(url)) //Establishing Connection
        {
        	final String schema = connection.getSchema(); 
        	System.out.println("Successful connection - Schema:" + schema); 
        	System.out.println("Inserting Customer details");
            try
            (final Connection conn = DriverManager.getConnection(url);
            		CallableStatement stmt = conn.prepareCall(query))
            {
                stmt.setInt(1, AID); //Providing parameters to the procedure
                
            	rs = stmt.executeQuery();				//Query execution
                while (rs.next()) 
                {
                    System.out.println("Total cost per assembly= " + rs.getInt(1));
                }    
            }
            catch (SQLException ex)
            {
            	System.out.println(ex.getMessage());
            	}
            }
        catch (SQLException e)
        {
			throw new RuntimeException(e);
		}
    }
    
    
    public static void Processes_Per_assembly(int AID)//Defining class for Procedure 19
	{
        String query = "{ call Processes_Per_assembly(?) }"; //Calling procedure 
        ResultSet rs;
    	// Connect to database
        final String hostName = "hw-cs4513.database.windows.net"; 
        final String dbName = "CS-DSA-4513-HW2";
        final String user = "Rame0003";
        final String password = "SmoothCriminal147!";
        final String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;host NameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        try 
        (final Connection connection = DriverManager.getConnection(url)) 
        {
        	final String schema = connection.getSchema(); 
        	System.out.println("Successful connection - Schema:" + schema); 
        	System.out.println("Inserting Customer details");
            try
            (final Connection conn = DriverManager.getConnection(url);
            		CallableStatement stmt = conn.prepareCall(query))
            {
            											//Providing parameters to the procedure
                stmt.setInt(1, AID);
                
            	rs = stmt.executeQuery();			//Query execution
                
                while (rs.next()) 
                {
                    System.out.println("Process ID= " + rs.getInt(1) + " Assembly ID" +rs.getInt(2)+
                    " Start date" + rs.getString(3) + " Department number" + rs.getInt(4));
                }  

            }
            catch (SQLException ex)
            {
            	System.out.println(ex.getMessage());
            	}
            }
        catch (SQLException e)
        {
			throw new RuntimeException(e);
		}
    }
    
    public static void All_Job_info_Fit(String End_Date, int DNo)//Defining class for Procedure 20
	{
        String query = "{ call All_Job_info_Fit(?, ?) }"; //Calling procedure 
        ResultSet rs;
    	// Connect to database
        final String hostName = "hw-cs4513.database.windows.net"; 
        final String dbName = "CS-DSA-4513-HW2";
        final String user = "Rame0003";
        final String password = "SmoothCriminal147!";
        final String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;host NameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        try 
        (final Connection connection = DriverManager.getConnection(url)) 
        {
        	final String schema = connection.getSchema(); 
        	System.out.println("Successful connection - Schema:" + schema); 
        	System.out.println("Inserting Customer details");
            try
            (final Connection conn = DriverManager.getConnection(url);
            CallableStatement stmt = conn.prepareCall(query))
            {
            											//Providing parameters to the procedure
                stmt.setString(1, End_Date);
                stmt.setInt(2, DNo);
                
            	rs = stmt.executeQuery();				//Query execution
                
                while (rs.next()) 
                {
                    System.out.println("Job No = " + rs.getInt(1) + ", End Date = " + rs.getString(2) + 
                          " Labor time = " + rs.getInt(3));
                }
            
            }
            catch (SQLException ex)
            {
            	System.out.println(ex.getMessage());
            	}
            }
        catch (SQLException e)
        {
			throw new RuntimeException(e);
		}
    }

    public static void All_Job_info_Paint(String End_Date, int DNo)//Defining class for Procedure 21
	{
        String query = "{ call All_Job_info_Paint(?, ?) }"; //Calling procedure 
        ResultSet rs;
    	// Connect to database
        final String hostName = "hw-cs4513.database.windows.net"; 
        final String dbName = "CS-DSA-4513-HW2";
        final String user = "Rame0003";
        final String password = "SmoothCriminal147!";
        final String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;host NameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        try 
        (final Connection connection = DriverManager.getConnection(url)) 
        {
        	final String schema = connection.getSchema(); 
        	System.out.println("Successful connection - Schema:" + schema); 
        	System.out.println("Inserting Customer details");
            try
            (final Connection conn = DriverManager.getConnection(url);
            CallableStatement stmt = conn.prepareCall(query))
            {
            											//Providing parameters to the procedure
                stmt.setString(1, End_Date);
                stmt.setInt(2, DNo);
                
            	rs = stmt.executeQuery();				//Query execution
                
                while (rs.next()) 
                {
                    System.out.println("Job No = " + rs.getInt(1) + ", End Date = " + rs.getString(2) + 
                    ", Color= " + rs.getString(3) + ", Volume= " + rs.getFloat(4) + 
                    " Labor time = " + rs.getInt(5));
                }
            
            }
            catch (SQLException ex)
            {
            	System.out.println(ex.getMessage());
            	}
            }
        catch (SQLException e)
        {
			throw new RuntimeException(e);
		}
    }

    public static void All_Job_info_Cut(String End_Date, int DNo)//Defining class for Procedure 22
	{
        String query = "{ call All_Job_info_Cut(?, ?) }"; //Calling procedure 
        ResultSet rs;
    	// Connect to database
        final String hostName = "hw-cs4513.database.windows.net"; 
        final String dbName = "CS-DSA-4513-HW2";
        final String user = "Rame0003";
        final String password = "SmoothCriminal147!";
        final String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;host NameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        try 
        (final Connection connection = DriverManager.getConnection(url)) 
        {
        	final String schema = connection.getSchema(); 
        	System.out.println("Successful connection - Schema:" + schema); 
        	System.out.println("Inserting Customer details");
            try
            (final Connection conn = DriverManager.getConnection(url);
            CallableStatement stmt = conn.prepareCall(query))
            {
            											//Providing parameters to the procedure
                stmt.setString(1, End_Date);
                stmt.setInt(2, DNo);
                
            	rs = stmt.executeQuery();				//Query execution
                while (rs.next()) 
                {
                    System.out.println("Job No = " + rs.getInt(1) + ", End Date = " + rs.getString(2) + 
                    ", Machine Type= " + rs.getString(3) + ", Machine use duration= " + rs.getInt(4) + 
                    ", Material used= " + rs.getString(5) + " Labor time = " + rs.getInt(6));
                }

            
            }
            catch (SQLException ex)
            {
            	System.out.println(ex.getMessage());
            	}
            }
        catch (SQLException e)
        {
			throw new RuntimeException(e);
		}
    }
    
    public static void Categorized_customer(int cat1, int cat2)//Defining class for Procedure 23
	{
        String query = "{ call Categorized_customer(?, ?) }"; //Calling procedure 
        ResultSet rs;
    	// Connect to database
        final String hostName = "hw-cs4513.database.windows.net"; 
        final String dbName = "CS-DSA-4513-HW2";
        final String user = "Rame0003";
        final String password = "SmoothCriminal147!";
        final String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;host NameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        try 
        (final Connection connection = DriverManager.getConnection(url)) 
        {
        	final String schema = connection.getSchema(); 
        	System.out.println("Successful connection - Schema:" + schema); 
        	System.out.println("Inserting Customer details");
            try
            (final Connection conn = DriverManager.getConnection(url);
            		CallableStatement stmt = conn.prepareCall(query))
            {
            											//Providing parameters to the procedure
                stmt.setInt(1, cat1);
                stmt.setInt(2, cat2);
                
            	rs = stmt.executeQuery();				//Query execution
                while (rs.next()) 
                {
                    System.out.println("Customer name = " + rs.getString(1) + ", Address = " + rs.getString(2) + 
                    ", Category= " + rs.getInt(3));
                }
            }
            catch (SQLException ex)
            {
            	System.out.println(ex.getMessage());
            	}
            }
        catch (SQLException e)
        {
			throw new RuntimeException(e);
		}
    }
   
    public static void Search_Jobs(int job1, int job2)//Defining class for Procedure 24
	{
        String query = "{ call Search_Jobs(?, ?) }"; //Calling procedure 
        ResultSet rs;
    	// Connect to database
        final String hostName = "hw-cs4513.database.windows.net"; 
        final String dbName = "CS-DSA-4513-HW2";
        final String user = "Rame0003";
        final String password = "SmoothCriminal147!";
        final String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;host NameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        try 
        (final Connection connection = DriverManager.getConnection(url)) 
        {
        	final String schema = connection.getSchema(); 
        	System.out.println("Successful connection - Schema:" + schema); 
        	System.out.println("Inserting Customer details");
            try
            (final Connection conn = DriverManager.getConnection(url);
            		CallableStatement stmt = conn.prepareCall(query))
            {
            											//Providing parameters to the procedure
                stmt.setInt(1, job1);
                stmt.setInt(2, job2);
                
            	rs = stmt.executeQuery();				//Query execution
            
            }
            catch (SQLException ex)
            {
            	System.out.println(ex.getMessage());
            	}
            }
        catch (SQLException e)
        {
			throw new RuntimeException(e);
		}
    }
   

    public static void Update_paint(String color, int job)//Defining class for Procedure 25
	{
        String query = "{ call Update_paint(?, ?) }"; //Calling procedure 
        ResultSet rs;
    	// Connect to database
        final String hostName = "hw-cs4513.database.windows.net"; 
        final String dbName = "CS-DSA-4513-HW2";
        final String user = "Rame0003";
        final String password = "SmoothCriminal147!";
        final String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;host NameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
        try 
        (final Connection connection = DriverManager.getConnection(url)) 
        {
        	final String schema = connection.getSchema(); 
        	System.out.println("Successful connection - Schema:" + schema); 
        	System.out.println("Inserting Customer details");
            try
            (final Connection conn = DriverManager.getConnection(url);
            		CallableStatement stmt = conn.prepareCall(query))
            {
            											//Providing parameters to the procedure
                stmt.setString(1, color);
                stmt.setInt(2, job);
                
            	rs = stmt.executeQuery();				//Query execution
                while (rs.next()) 
                {
                    System.out.println("Job No = " + rs.getInt(1) + ", End Date = " + rs.getString(2) + 
                    ", Color= " + rs.getString(3) + ", Volume= " + rs.getFloat(4) + 
                    " Labor time = " + rs.getInt(5));
                }
            
            }
            catch (SQLException ex)
            {
            	System.out.println(ex.getMessage());
            	}
            }
        catch (SQLException e)
        {
			throw new RuntimeException(e);
		}
    }
   


//Defining class for Procedure 26
    public static void select_customer() throws SQLException,IOException,SQLServerException 
	{
        String query = "{ call select_customer() }"; //Calling procedure #1
    	// Connect to database
        final String hostName = "hw-cs4513.database.windows.net"; 
        final String dbName = "CS-DSA-4513-HW2";
        final String user = "Rame0003";
        final String password = "SmoothCriminal147!";
        final String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;host NameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password); 
        final Connection connection = DriverManager.getConnection(url);

        	Statement stmt1 = connection.createStatement();
            	ResultSet rs = stmt1.executeQuery(query);
            	String string = null;
            	System.out.println("Enter output file name");
                BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

            	String name= (br1.readLine());
            	BufferedWriter export = new BufferedWriter(new FileWriter("C:\\Users\\kssdh\\Downloads"+name));
            	while(rs.next())
            	{
            	string= rs.getString("Customer_name")+" "+rs.getString("Address")+" "+rs.getString("Category");
            	export.write(string);
            	export.write("\n");
            	}            	

            	
            	System.out.println("file exported succesfully");
            	export.close();

    }

    //Defining class for Procedure 27
    
    public static void import_file() throws SQLException,IOException,SQLServerException,NullPointerException//Defining class for Procedure 1
	{
    	// Connect to database
		 final String hostName = "hw-cs4513.database.windows.net"; 
	        final String dbName = "CS-DSA-4513-HW2";
	        final String user = "Rame0003";
	        final String password = "SmoothCriminal147!";
	        final String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;host NameInCertificate=*.database.windows.net;loginTimeout=30;", hostName, dbName, user, password);
	        final Connection connection = DriverManager.getConnection(url);

        	Statement stmt1 = connection.createStatement();
            	

                BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
                                  	
            	System.out.println("Enter File path ");
            	
            	String csvF = (br1.readLine());            	
            	
            	BufferedReader br = null;
                String line = "";
                String cvsSplit = ",";
                
                try {

                    br = new BufferedReader(new FileReader(csvF));
                    while ((line = br.readLine()) != null) {

                        // use comma as separator
                        String[] c = line.split(cvsSplit);
                                                
                        System.out.println("customer [name= " + c[0] + " , Address=" + c[1] + ",Category= \" + c[2] + \"]");   
                        
                        
                        stmt1.executeUpdate("insert into customer values('"+ c[0]+ "','" + c[1]+ "','"+ c[2]+ "')");

                    }

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    if (br != null) {
                        try {
                            br.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
	    		
           
        }

    //Printing options to user
    public static void main(String[] args) throws IOException, SQLServerException, NullPointerException, SQLException
	{
		String nl = System.getProperty("line.separator");
        System.out.println("1. Insert New Customer" + nl + "2. Insert new department" 
        + nl + "3. Insert new assembly" + nl + "4. Insert new process and select process type"+ nl + "5. Insert Account details and account type"
        + nl + "6. Insert job number and enter relation"+ nl + "7. Select Type of job and enter job details"+ nl+ "8. Insert transaction and Sup-cost"
        + nl+ "9. Retrieve the cost incurred on an assembly-id"
        + nl+ "10. Retrieve the total labor time within a department for jobs completed in the department during a given date "
        + nl+ "11. Retrieve the processes through which a given assembly-id has passed so far and the department responsible for each process"
        + nl+ "12. Retrieve the jobs completed during a given date in a given department "+ nl+ "13. Retrieve the customers (in name order) whose category is in a given range"
        + nl+ "14. Delete all cut-jobs whose job-no is in a given range"+ nl+ "15. Change the color of a given paint job"+ nl+
        "16. Import data from CSV" +nl+ "17. Export data into .txt"+nl+"18. Quit loop");
		
        while (true)
        
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Please Enter Option Number: ");//Obtaining user input for option
    		
            int option;
    		option = Integer.parseInt(br.readLine());
            
            if(option==1)
            {
                System.out.println("Please enter customer name: ");//Input customer name
                String Name = (br.readLine());

                System.out.println("Please enter customer's address");//Input customer's address
                String Address = (br.readLine());
                
                System.out.println("Please enter category");//Input customer category
                int category= Integer.parseInt(br.readLine());

                Insert_Customer(Name, Address, category);
            }

            if(option==2)
            {
                System.out.println("Please enter Department number: ");//Input Department number
                int Department_No = Integer.parseInt(br.readLine());

                System.out.println("Please enter Department details");//Input Department details
                String Details = (br.readLine());
                
                Insert_Department(Department_No, Details);
            }

            if(option==3)
            {
                System.out.println("Please enter Assembly ID: ");//Input Assembly ID
                int Assembly_ID = Integer.parseInt(br.readLine());
                
                System.out.println("Please enter Date of order");//Input customer's address
                String Date = (br.readLine());//May go wrong. Always enter date as yyyymmdd

                System.out.println("Please enter more details about assembly");
                String Details= (br.readLine());

                System.out.println("Please enter Customer name");
                String Customer_name= (br.readLine());
                
                Insert_Assembly(Assembly_ID, Date, Details, Customer_name);
            }
            
            if(option==4)
            {
                System.out.println("Please enter Process ID: ");//Input Process ID
                int PID = Integer.parseInt(br.readLine());

                System.out.println("Please enter Process details");
                String Details= (br.readLine());
                
                System.out.println("Please enter Department in-charge: ");//Input Department No
                int Department_No = Integer.parseInt(br.readLine());

                Insert_Process(PID, Details, Department_No);

                System.out.println("Continue to Process Type: ");
                
                
                while(true)
                {
                    System.out.println("Please enter Process Type: ");//Input Process type
                    String ptype = (br.readLine());

                    if("Fit".equals(ptype))
                    {
                        System.out.println("Please enter Process ID: ");//Input Process ID
                        int FPID = Integer.parseInt(br.readLine());

                        System.out.println("Please enter Fit type");
                        String Fit_Type= (br.readLine());

                       
                        Insert_Fit_Process(FPID, Fit_Type);
                    }

                    else if("Paint".equals(ptype))
                    {
                        System.out.println("Please enter Process ID: ");//Input Process ID
                        int PPID = Integer.parseInt(br.readLine());

                        System.out.println("Please enter Paint type");// Input paint type
                        String Paint_Type= (br.readLine());

                        System.out.println("Please enter Paint method");// Input paint method
                        String Painting_method= (br.readLine());

                        
                        Insert_Paint_Process(PPID, Paint_Type, Painting_method);
                    
                    }

                    else if("Cut".equals(ptype))
                    {
                        System.out.println("Please enter Process ID: ");//Input Process ID
                        int CPID = Integer.parseInt(br.readLine());

                        System.out.println("Please enter Cut type"); //Input cut type
                        String Cut_Type= (br.readLine());

                        System.out.println("Please enter type of Machine used"); //Input machine details
                        String Machine_type= (br.readLine());

                        
                        Insert_Cut_Process(CPID, Cut_Type, Machine_type);
                    
                    }
                    else if("End".equals(ptype))
                    {
                        break;  //Breaks loop to choose other options
                    }
                }
                
            }

            if(option==5)
            {
                
                while(true)
                {
                	System.out.println("Please enter Account Type:");//Input Assembly ID
                    String Account_no =(br.readLine());
                   

                    if("Assembly".equals(Account_no))
                    {
                        System.out.println("Please enter Account No: ");//Input Process ID
                        String A_Account_no = (br.readLine());

                        System.out.println("Please enter Date of order");//Input Established date
                        String Date = (br.readLine());//May go wrong. Always enter date as yyyymmdd


                        System.out.println("Please enter Assembly ID linked to account");
                        String Assembly_ID= (br.readLine());

                        System.out.println("Please enter Balance: ");//Input Process ID
                        float Details1 = Float.parseFloat(br.readLine());

                        Insert_Assembly_Account(A_Account_no, Date, Assembly_ID, Details1);
                    }

                    else if("Department".equals(Account_no))
                    {
                        System.out.println("Please enter Account No: ");//Input Process ID
                        String D_Account_no = (br.readLine());

                        System.out.println("Please enter Date of order");//Input Established date
                        String Date = (br.readLine());//May go wrong. Always enter date as yyyymmdd

                        System.out.println("Please enter Department No linked to account");
                        int Department_No= Integer.parseInt(br.readLine());

                        System.out.println("Please enter Balance: ");//Input Process ID
                        float Details2 = Float.parseFloat(br.readLine());

                        Insert_Department_Account(D_Account_no, Date, Department_No, Details2);
                    }

                    else if("Process".equals(Account_no))
                    {
                        System.out.println("Please enter Account No: ");//Input Process ID
                        String P_Account_no = (br.readLine());

                        System.out.println("Please enter Date of order");//Input Established date
                        String Date = (br.readLine());//May go wrong. Always enter date as yyyymmdd


                        System.out.println("Please enter Process ID linked to account");
                        int Process_ID= Integer.parseInt(br.readLine());

                        System.out.println("Please enter Balance: ");//Input Process ID
                        float Details3 = Float.parseFloat(br.readLine());

                        Insert_Process_Account(P_Account_no, Date, Process_ID, Details3);
                    }
                    else if("End".equals(Account_no))
                    {
                        break;
                    }
                }
            }

            if(option==6)
            {
                System.out.println("Please enter Job_No:");//Input Job No
                int Job_no=Integer.parseInt(br.readLine());

                System.out.println("Please enter Start date: ");//Input Start date
                String Start_date=(br.readLine());

                Insert_Job(Job_no,Start_date);

                System.out.println("Proceed to enter relation: ");

                System.out.println("Enter Process ID: "); //Input linked process ID
                int PID=Integer.parseInt(br.readLine());

                System.out.println("Enter Assembly ID: ");//Input linked Assembly ID
                int AID=Integer.parseInt(br.readLine());

                System.out.println("Enter Job No: ");//Input Job No
                int Job_no_R=Integer.parseInt(br.readLine());

                Insert_Manufactures(PID, AID, Job_no_R);

            }

            if(option==7)
            {
                System.out.println("Please enter Job Type: ");//Input Process ID
                    String ptype = (br.readLine());

                    if("Fit".equals(ptype))
                    {
                        System.out.println("Please enter Job No: ");//Input Job No
                        int FJob = Integer.parseInt(br.readLine());

                        System.out.println("Please enter End Date");//Input End date
                        String End_Date= (br.readLine());

                        System.out.println("Please enter Labor time: ");//Input Process ID
                        int labor_time = Integer.parseInt(br.readLine());

                        Insert_Fit_Job(FJob, End_Date, labor_time);
                    }

                    else if("Paint".equals(ptype))
                    {
                        System.out.println("Please enter Job No: ");//Input Job no
                        int PJob = Integer.parseInt(br.readLine());

                        System.out.println("Please enter End Date");//Input End date
                        String End_Date= (br.readLine());

                        System.out.println("Enter Paint color: ");// Enter paint color
                        String color=(br.readLine());

                        System.out.println("Please enter volume of paint used: ");//Input volume used
                        float volume = Float.parseFloat(br.readLine());

                        System.out.println("Please enter Labor time: ");//Input Department in charge
                        int labor_time = Integer.parseInt(br.readLine());

                        Insert_Paint_Job(PJob, End_Date, color, volume, labor_time);
                    }

                    else if("Cut".equals(ptype))
                    {
                        System.out.println("Please enter Job No: ");//Input Job no
                        int CJob = Integer.parseInt(br.readLine());

                        System.out.println("Please enter End Date");//Input End date
                        String End_Date= (br.readLine());

                        System.out.println("Enter Machine type: ");//Enter machine type
                        String Machine_type=(br.readLine());

                        System.out.println("Please enter machine usage time");
                        int Machine_used_time= Integer.parseInt(br.readLine());

                        System.out.println("Enter material used: ");//Enter material used
                        String Material_used=(br.readLine());

                        System.out.println("Please enter Labor time: ");//Input Department in charge
                        int labor_time = Integer.parseInt(br.readLine());


                        Insert_Cut_Job(CJob, End_Date, Machine_type, Machine_used_time, Material_used, labor_time);
                    
                    }
                    else if("End".equals(ptype))
                    {
                        break;
                    }
            }

            if(option==8)
            {
                System.out.println("Please enter Transaction ID:");//Enter transaction ID
                int Transaction_ID=Integer.parseInt(br.readLine());

                System.out.println("Please enter Cost incurred: ");//Cost incurred on assembly
                float Sup_cost=Float.parseFloat(br.readLine());

                System.out.println("Enter related job: ");//Job related to the cost
                int Job_no=Integer.parseInt(br.readLine());

                System.out.println("Enter Assembly account number: ");//Assembly accout No for relation
                String Assembly_Account_no=(br.readLine());

                System.out.println("Enter Department account number: ");//Department account no for relation
                String Department_Account_no=(br.readLine());

                System.out.println("Enter Process account number: ");//Process account No for relation
                String Process_Account_no=(br.readLine());

                Insert_Transaction(Transaction_ID, Sup_cost, Job_no, Assembly_Account_no, Department_Account_no, Process_Account_no);

            }

            if(option==9)
            {
                System.out.println("Enter Assembly ID: ");//Enter assembly ID for retrieveing cost per assembly
                int AID=Integer.parseInt(br.readLine());

                Retrieve_cost(AID);
            }

            if(option==10)
            {
                System.out.println("Enter date: ");//Enter date
                String date=(br.readLine());

                System.out.println("Enter Department number: ");//Enter department number
                int DNo=Integer.parseInt(br.readLine());

                Total_labor_Time(date, DNo);
            }

            if(option==11)
            {
                System.out.println("Enter Assembly ID: ");// Enter assembly ID
                int AID=Integer.parseInt(br.readLine());

                Processes_Per_assembly(AID);
            }

            if(option==12)
            {
                System.out.println("Enter Department number: ");//Enter department number
                int Dno=Integer.parseInt(br.readLine());

                System.out.println("Enter End date: ");//Enter date
                String date=(br.readLine());

                All_Job_info_Fit(date, Dno);
                All_Job_info_Paint(date, Dno);
                All_Job_info_Cut(date, Dno);
            }

            if(option==13)
            {
                System.out.println("Enter Category 1: ");//Enter beginning Category 
                int cat1=Integer.parseInt(br.readLine());

                System.out.println("Enter Category 2: ");//Enter final Category 
                int cat2=Integer.parseInt(br.readLine());

                Categorized_customer(cat1, cat2);
            }

            if(option==14)
            {
                System.out.println("Enter Job 1: ");//Enter beginning Job no 
                int job1=Integer.parseInt(br.readLine());

                System.out.println("Enter Job 2: ");//Enter final Job no 
                int job2=Integer.parseInt(br.readLine());

                Search_Jobs(job1, job2);
            }

            if(option==15)
            {
                System.out.println("Enter color: ");//Enter color
                String color=(br.readLine());

                System.out.println("Enter Job No: ");//Enter Job no 
                int job=Integer.parseInt(br.readLine());

                
                Update_paint(color, job);
            }

            if(option == 16)
            {
            	import_file();//Import file to SQL server
            }

            if(option==17)
            {
            	select_customer(); //export txt document from SQL server
            }

            if(option==18)
            {
            	System.out.println("I'm done..... Just make this semester end!!!");
                System.exit(0);//Breaking while loop
                
            }
        }
    }
    
}