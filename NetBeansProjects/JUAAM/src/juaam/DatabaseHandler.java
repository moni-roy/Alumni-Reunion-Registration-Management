/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juaam;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Krishna
 */
public class DatabaseHandler {

    private static Connection conn = null;
    private static final String TABLE_NAME = "juaam_record";
    private ResultSet rs = null;
    Properties p=null;
    public DatabaseHandler() throws IOException {

//        Properties prop = new Properties();
//        prop.load(new FileInputStream("user.properties"));
       
         p=new Properties();
        String userName = p.user;
        String password = p.password;
        
        
//System.out.println(url);
        try {
          
               String url = "jdbc:mysql://"+p.getIP()+":3306/juaam";
               
            conn = DriverManager.getConnection(url, userName, password);
//            System.out.println("Connection established");
            

        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Please make user database server is open", "Error", 0);
            // System.exit(0);

           

//            ex.printStackTrace();
        }
    }
    
    public DatabaseHandler(Properties p) throws IOException {

//        Properties prop = new Properties();
//        prop.load(new FileInputStream("user.properties"));
//        System.out.println("OKKK");
        this.p =p;
        String userName = p.user;
        String password = p.password;
        
        
//System.out.println(url);
        try {
            //System.out.println(p.getIP()+" D");
               String url = "jdbc:mysql://"+p.getIP()+":3306/juaam";
             //  System.out.println(url);
            conn = DriverManager.getConnection(url, userName, password);
//            System.out.println("Connection established");
            

        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Please make user database server is open", "Error", 0);
            // System.exit(0);

           
//            ex.printStackTrace();
        }
    }

//    public String getAdminPass(){
//        return adminPass;
//    }
//     public String getNormalPass(){
//        return normalPass;
//    }
    public Connection getConnection() {
        return conn;
    }

    public int getParticipantNumber() {
        try {
            Statement statement = null;

            String sql = "SELECT SUM(`No of participants`) FROM " + TABLE_NAME;
            statement = conn.createStatement();
            rs = statement.executeQuery(sql);

            while (rs.next()) {
                int result = Integer.parseInt(rs.getString(1));
                return result;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error:Please make user database server is open and try again", "Error", 0);
//            ex.printStackTrace();
        }
        return -1;
    }

    public int insert(String reg_no, String name, int batch, String contact_num, String reg_mode, String receipt_num, int amount, int participant, Date date) {

        PreparedStatement statement = null;

        String sql = "INSERT  INTO " + TABLE_NAME + " (`Registration No`, `Name`, `Batch`, `Contact No.`, `Registration Mode`, `Receipt No.`, `Amount`, `No of participants`, `Date`) VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            statement = conn.prepareStatement(sql);
            statement.setString(1, reg_no);
            statement.setString(2, name);
            statement.setInt(3, batch);
            statement.setString(4, contact_num);
            statement.setString(5, reg_mode);
            statement.setString(6, receipt_num);
            statement.setInt(7, amount);
            statement.setInt(8, participant);
            statement.setDate(9, date);

            int result = statement.executeUpdate();
            return result;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Please make user database server is open and try again", "Error", 0);
//            ex.printStackTrace();
            return 0;
        }

    }

    public int update(String reg_no, String name, int batch, String contact_num, String reg_mode, String receipt_num, int amount, int participant, Date date) {

        // PreparedStatement statement=null;
        Statement statement = null;
        //UPDATE `juaam_record` SET `Registration No`=3,`Name`=4,`Batch`=5,`Contact No.`=6,`Registration Mode`=34,`Receipt No.`=43,`Amount`=44,`No of participants`=33,`Date`=2015-12-12 WHERE `Registration No` = 3
        // String sql="UPDATE juaam_record SET 'Registration No'=?,'Name'=?,'Batch'=?,'Contact No.'=?,'Registration Mode'=?,'Receipt No.'=?,'Amount'=?,'No of participants'=?,'Date'=? WHERE 'Registration No' = ?";
        String sql = "UPDATE `juaam_record` SET `Registration No`=" + reg_no + ",`Name`='" + name + "',`Batch`=" + batch + ",`Contact No.`='" + contact_num + "',`Registration Mode`='" + reg_mode + "',`Receipt No.`='" + receipt_num + "',`Amount`=" + amount + ",`No of participants`=" + participant + ",`Date`='" + date + "' WHERE `Registration No` =" + reg_no;
//       System.out.println(sql);
        try {
//             statement=conn.prepareStatement(sql);
//            statement.setInt(1, reg_no);
//            statement.setString(2, name);
//            statement.setInt(3, batch);
//            statement.setString(4, contact_num);
//            statement.setString(5, reg_mode);
//            statement.setString(6, receipt_num);
//            statement.setInt(7, amount);
//            statement.setInt(8, participant);
//            statement.setDate(9, date);
//            statement.setInt(10, reg_no);

//            int result=statement.executeUpdate();
//            return result;
            statement = conn.createStatement();
            int result = statement.executeUpdate(sql);
            return result;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Please make user database server is open and try again", "Error", 0);
//            ex.printStackTrace();
            return 0;
        }

    }

    public int getSLNO() {
        try {
            Statement statement = null;

            String sql = "SELECT COUNT(`Name`) FROM " + TABLE_NAME;
            statement = conn.createStatement();
            rs = statement.executeQuery(sql);

            while (rs.next()) {
                int result = Integer.parseInt(rs.getString(1));
                return result;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Please make user database server is open and try again", "Error", 0);
//            ex.printStackTrace();
        }

        return -1;

    }

    public ResultSet sortBy(String sortType) {

        Statement st = null;
        try {
            st = conn.createStatement();
            //SELECT * FROM juaam_record ORDER BY `Registration No` ASC
            // SELECT * FROM juaam_record ORDER BY `Registration No` ASC
            String sql = "SELECT * FROM juaam_record ORDER BY `" + sortType + "` ASC";
//             System.out.println(sql);

            rs = st.executeQuery(sql);
            return rs;

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    public ResultSet forBook() {

        Statement st = null;
        try {
            st = conn.createStatement();
            //SELECT `Registration No`, `Name`, `Batch`, `Contact No.` FROM juaam_record ORDER BY `Batch` ASC
            String sql = "SELECT `Registration No`, `Name`, `Batch`, `Contact No.` FROM juaam_record ORDER BY `Batch` ASC";
            // System.out.println(sql);

            rs = st.executeQuery(sql);
            return rs;

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    public ResultSet selectAll() {

        Statement st = null;
        try {
            st = conn.createStatement();
            String sql = "SELECT * FROM " + TABLE_NAME;
            rs = st.executeQuery(sql);
            return rs;

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public ResultSet getRegTabel(int sl1) {

        Statement st = null;
        try {
            st = conn.createStatement();
            String sql = "SELECT * FROM " + TABLE_NAME + "  WHERE Serial >= " + sl1 + " ORDER BY Serial DESC";
            rs = st.executeQuery(sql);
            return rs;

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public void getForBookInfo() {
        //this wwill print soecially in the book
        Statement st = null;
        try {
            st = conn.createStatement();
            String sql = "SELECT Registration No,Name,Batch,Contact No. FROM " + TABLE_NAME + " ORDER BY Batch";
            rs = st.executeQuery(sql);

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public String getLastReg() {

        Statement st = null;
        String result = null;
        try {
            st = conn.createStatement();
            //String sql="SELECT LAST(`Registration No`) FROM `juaam_record`";

            String sql = "SELECT `Registration No` FROM `juaam_record` ORDER BY `Serial` DESC LIMIT 1";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                result = rs.getString(1);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    public Registration getInfoReg(String reg) {

        Statement st = null;
        ResultSet result;
        Registration regi = null;
        try {
            st = conn.createStatement();
            //SELECT * FROM `juaam_record` WHERE `Registration No`=9999
            String sql = "SELECT * FROM `juaam_record` WHERE `Registration No`= " + reg;
            result = st.executeQuery(sql);

            if (result != null) {

                //`Registration No`, `Name`, `Batch`, `Contact No.`, `Registration Mode`, `Receipt No.`, `Amount`, `No of participants`, `Date`
                while (result.next()) {
                    String rg = result.getString("Registration No");
                    String name = result.getString("Name");
                    int batch = result.getInt("Batch");
                    int amount = result.getInt("Amount");
                    int participant = result.getInt("No of participants");
                    Date date = result.getDate("Date");
                    String regMode = result.getString("Registration Mode");
                    String receipt = result.getString("Receipt No.");
                    String contact = result.getString("Contact No.");

                    regi = new Registration(rg, name, batch, contact, regMode, receipt, date, participant, amount);
                }
            } else {
                //System.out.println("NULL");
            }
            return regi;

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

}
