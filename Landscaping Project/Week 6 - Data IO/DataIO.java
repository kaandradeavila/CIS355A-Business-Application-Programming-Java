import java.sql.*;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/****************************************************************************
 Program Name: Customer.java
 Programmer's Name: Kyrenia Ailen Andrade Avila
 Program Description: DataIO border class used in LandscapeGUI.java.
 ****************************************************************************/
public class DataIO {
    //constants
    private final String DATABASE_NAME = "cis355a";
    private final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/" + DATABASE_NAME;
    private final String USER_NAME = "root";
    private final String PASSWORD = "Nekochan1996+";
    
    // behaviors
    public void add(Customer cust) throws ClassNotFoundException, SQLException
    {
        // check for the database driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        // connect to the database
        Connection conn = DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);
        
        // add the customer record to the landscape table
        String StrSQL = "INSERT INTO landscape (CustomerName, CustomerAddress, "
                + "LandscapeType, YardLength, YardWidth, LandscapeCost) "
                + "VALUES (?, ?, ?, ?, ?, ?)";
        // adding a PreparedStatement
        PreparedStatement pstmt = conn.prepareStatement(StrSQL);
        pstmt.setString(1, cust.getName());
        pstmt.setString(2, cust.getAddress());
        pstmt.setString(3, cust.getYardType());
        pstmt.setDouble(4, cust.getLength());
        pstmt.setDouble(5, cust.getWidth());
        pstmt.setDouble(6, cust.getTotalCost());
        
        //execute the prepared statement
        pstmt.execute();
        
        // close the database connection
        conn.close();
    }
    
    public void delete(int customerID) throws SQLException
    {
        // connect to the database
        Connection conn = DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);
        
        // delete the record
        String StrSQL = "DELETE FROM landscape WHERE CustomerID = ?";
        PreparedStatement pstmt = conn.prepareStatement(StrSQL);
        pstmt.setInt(1, customerID);
        pstmt.execute();
        
        // close the database connection
        conn.close();
    }
    
    public ArrayList<Customer> getList() throws SQLException 
    {
        // create the ArrayList so we have something to return
        ArrayList<Customer> list = new ArrayList<Customer>();
        
        //connect to database
        Connection conn = DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);
        
        // write statement to read the database records
        Statement stmt = conn.createStatement();
        String StrSQL = "SELECT * FROM landscape";
        ResultSet rs = stmt.executeQuery(StrSQL);
        
        while(rs.next())
        {
            // create Customer object and load the attributes
            Customer cust = new Customer();
            cust.setCustID(rs.getInt(1));
            cust.setName(rs.getString(2));
            cust.setAddress(rs.getString(3));
            cust.setYardType(rs.getString(4));
            cust.setLength(rs.getInt(5));
            cust.setWidth(rs.getInt(6));
            cust.setTotalCost(rs.getInt(7));
            
            // add the Customer object to our list
            list.add(cust);
        }
        
        // close the database connection
        conn.close();
            
        // return the ArrayList
        return list;        
    }
    
    
    
    
}
