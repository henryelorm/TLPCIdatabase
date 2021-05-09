/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tlpcidatabase.EntityManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author Elorm
 */
public class NewGroup {

    public static final String URL = "jdbc:mysql://localhost:3306/tlpci";
    public static final String User = "root";
    public static final String password = "0261254251";

    private static Connection conn = null;
    private static Statement st = null;

    public static void newgroup(String table_Name) {

        try {
            conn = DriverManager.getConnection(URL, User, password);

            st = conn.createStatement();
            
            String sgl = "CREATE TABLE REGISTRATION " +
                   "(id INTEGER not NULL, " +
                   " first VARCHAR(255), " + 
                   " last VARCHAR(255), " + 
                   " age INTEGER, " + 
                   " PRIMARY KEY ( id ))";
            
            
            st.executeUpdate(sgl);

        } catch (SQLException ex) {

            System.out.println("jdbc driver not connected");
        }finally{
            System.out.println("jdbc driver not connected intersely");
        }
        
        try{
            if(conn != null){
                conn.close();
            }
        }catch(SQLException ex){
             System.out.println("the ");
        }
    }

}
