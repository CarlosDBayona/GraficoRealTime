package DAo;


import Daros.pos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos
 */
public class Dao {

    public Dao() {
    }
    
    public ArrayList<pos> busqueda() {
    ArrayList<pos> ans=new ArrayList();
        try
    {
        String JDBC_DRIVER = "com.mysql.jdbc.Driver"; 
        Class.forName("com.mysql.jdbc.Driver");
      String myUrl = "jdbc:mysql://localhost:3306/Edison?useLegacyDatetimeCode=false&serverTimezone=UTC";
      Connection conn = DriverManager.getConnection(myUrl, "root", "");
      String query = "SELECT hora,temp FROM Datos order by id desc limit 10";
      Statement st = conn.createStatement();
      ResultSet rs = st.executeQuery(query);
      while (rs.next())
      {
        Date d=rs.getTimestamp("hora");
        float f=rs.getFloat("temp");
        pos p=new pos(f, d);
        ans.add(p);
      }
        rs.close();
         st.close();
         conn.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getCause());
    }
    
        return ans;
    }
}
