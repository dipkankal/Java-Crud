package CRUD;
import java.sql.*;
import java.lang.*;
public class Test
{
    public static void main(String[] args) {
        try
        {   //load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/db","root","root");
            if(con.isClosed())
            {
                System.out.println("connection closed");
            }
            else
            {
                System.out.println("connection succesfull");
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

}
