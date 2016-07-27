/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juaam;

/**
 *
 * @author Krishna
 */
public class Properties {

//    user=root
//password=
//url=jdbc:mysql://localhost:3306/juaam
    public String getPassword() {
        return password;
    }

    
    
    public static final String admin = "admin1";
    public static final String normal = "normal";
    
    private  String ip4="localhost";

    public  final String user = "root";
    public  final String password = "";
   
    
    void setIP(String ip){
       
           this.ip4=ip;
        
        
    }

    public String getIP() {
         
        return ip4;
    }

    
    
    
}
