/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juaam;

import java.io.IOException;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Krishna
 */
public class MainClass {
    
    
      public static void main(String args[]) {
        
        
      DatabaseHandler handler;
       IPaddressFixed ipaddress=null;
        try {
            handler = new DatabaseHandler();
            Connection conn=handler.getConnection();
            
            if(conn!=null){
                Login l=new Login();
                l.setVisible(true);
                
            }
            else{
              ipaddress=new IPaddressFixed();
              ipaddress.setVisible(true);
            }
        } catch (IOException ex) {
            Logger.getLogger(IPaddressFixed.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
            
            
}
