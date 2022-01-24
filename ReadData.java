import java.sql.*;
import java.lang.*;
import java.sql.Connection;
public class ReadData
{
    public static void main(String[] args) {

        try
        {  // load and register
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish connection
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3307/db","root","root");
            String s="SELECT * FROM STUDENT";
            Statement st=con.createStatement();

            ResultSet set=st.executeQuery(s);
            while(set.next())
            {
                int student_no=set.getInt(1);
                String student_name=set.getString(2);
                String student_dob=set.getString(3);
                String student_doj=set.getString(4);
                System.out.println(student_no+" \n"+student_name+"\n"+student_dob+"\n"+student_doj);
            }






            System.out.println("query display");
            con.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();

        }

    }
}
