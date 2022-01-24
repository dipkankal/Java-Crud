package CRUD;
import java.sql.*;
import java.lang.*;

public class Insert
{
    public static void main(String[] args) {
        try
        {   //load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // create a connection

            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/db","root","root");
             // create query
            String s="create table student(STUDENT_NO INT (3) primary key auto_increment, STUDENT_NAME TEXT (30) not null,STUDENT_DOB VARCHAR(80),STUDENT_DOJ VARCHAR(80))";
            Statement st=con.createStatement();
            st.executeUpdate(s);
            System.out.println("table is created");
            con.close();


            /*
   Table Name - STUDENT
STUDENT_NO INT (3)
STUDENT_NAME TEXT (30)
STUDENT_DOB DATE
STUDENT_DOJ DATE
    */




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
