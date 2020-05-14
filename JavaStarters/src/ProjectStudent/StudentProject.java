/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectStudent;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 Checklist
 
 Create GUI interface
 
 Insert function = Done
 Delete function = Done
 Search function
 Update function = Done
 
 Demonstrate:
 Inheritance
 Polymorphism
 Abstraction
 Encapsulation
 
 */
public class StudentProject {
    

    public static void main(String[] args) throws Exception {
        
       getConnection();
    }
    
    public static Connection getConnection() throws Exception{
    try{
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/school?useTimezone=true&serverTimezone=UTC";
            String username = "root";
            String password = "chelsea";
            Class.forName(driver);
            
            Connection conn = DriverManager.getConnection(url,username,password);
            System.out.println("works");
            return conn;
            } catch (Exception e){
                    System.out.println(e);
            }
    
    return null;
    }
    
}
