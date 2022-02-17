// The following file contains code for connecting mysql database with java through jdbc driver
// external libraries like jdbc and rs2xml.jar are used

import java.sql.*;

public class DatabaseCreates{
    Connection v;
    Statement x;

    public DatabaseCreates(){
        try{
            v = DriverManager.getConnection("jdbc:mysql://localhost:3306/msystem","root","");
            x = v.createStatement();
        }

        catch(Exception e){
            e.printStackTrace();
        }
    }

}

