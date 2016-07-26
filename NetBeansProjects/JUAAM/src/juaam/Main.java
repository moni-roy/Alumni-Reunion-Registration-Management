/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juaam;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Krishna
 */
public class Main extends javax.swing.JFrame implements Runnable {

    /**
     * Creates new form Main
     */
    DatabaseHandler dh;
    int id;

    public Main() {
        try {
            dh = new DatabaseHandler();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//            this.dispose();
        }
        // this.setLocationRelativeTo(null);
        this.setResizable(false);
//        this.setLocation(100, 0);
        initComponents();
        
//                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//        int xsize = (int) screenSize.width;
//        int ysize = (int) screenSize.height;
//        xsize=xsize/2;
//        ysize=ysize/2;
//        this.setSize(screenSize.width, screenSize.height);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        buttonOther();

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            // Logger.getLogger(BankInterface.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Proble Occur.Try Again ");
        } catch (InstantiationException ex) {
            //Logger.getLogger(BankInterface.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Proble Occur.Try Again ");
        } catch (IllegalAccessException ex) {
            // Logger.getLogger(BankInterface.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Proble Occur.Try Again ");
        } catch (UnsupportedLookAndFeelException ex) {
            //Logger.getLogger(BankInterface.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Proble Occur.Try Again ");
        }

        updateTabel();
        showInformation();

        this.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowClosing(WindowEvent e) {

                closed();

            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowActivated(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        reg_no_textField = new javax.swing.JTextField();
        name_textField = new javax.swing.JTextField();
        batch_textField = new javax.swing.JTextField();
        reg_type_comboox = new javax.swing.JComboBox<>();
        amount_textField = new javax.swing.JTextField();
        contact_textField = new javax.swing.JTextField();
        participant_textField = new javax.swing.JTextField();
        receipt_textField = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        last_reg_label = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        sort_comboBox = new javax.swing.JComboBox<>();
        viewButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        sort_tabel = new javax.swing.JTable();
        save_as_ComboBox = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        save_Button = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        edit_reg_textField = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        edit_regNo_textField = new javax.swing.JTextField();
        edit_name_textField = new javax.swing.JTextField();
        edit_batch_textField = new javax.swing.JTextField();
        edit_receipt_textField = new javax.swing.JTextField();
        edit_amount_textField = new javax.swing.JTextField();
        edit_contact_textField = new javax.swing.JTextField();
        edit_participant_textField = new javax.swing.JTextField();
        edit_regMode_comboBox = new javax.swing.JComboBox<>();
        resubmitButton = new javax.swing.JButton();
        edit_DateChooser = new com.toedter.calendar.JDateChooser();
        searchButton = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        total_reg_label = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        total_participant_label = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(166, 212, 244));

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

        jLabel1.setFont(new java.awt.Font("Kalpurush", 1, 24)); // NOI18N
        jLabel1.setText("3rd Reunion of JUAAM");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setBackground(new java.awt.Color(0, 51, 51));
        jLabel2.setFont(new java.awt.Font("Kalpurush", 3, 48)); // NOI18N
        jLabel2.setText("Registration");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juaam/math_department_logo1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addGap(43, 43, 43)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1552, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Registration no.     :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Name                  :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Registration Mode :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Amount              :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("No of Particpants :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Date   :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Batch                  :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Contact Number :");

        reg_no_textField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        reg_no_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reg_no_textFieldActionPerformed(evt);
            }
        });

        name_textField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        batch_textField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        batch_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batch_textFieldActionPerformed(evt);
            }
        });

        reg_type_comboox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        reg_type_comboox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bank", "Bkash", "Direct" }));

        amount_textField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        contact_textField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        contact_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contact_textFieldActionPerformed(evt);
            }
        });

        participant_textField.setEditable(false);
        participant_textField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        participant_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                participant_textFieldActionPerformed(evt);
            }
        });

        receipt_textField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel11.setFont(new java.awt.Font("Kalpurush", 1, 14)); // NOI18N
        jLabel11.setText("Last Registration No:");

        last_reg_label.setFont(new java.awt.Font("Kalpurush", 3, 18)); // NOI18N
        last_reg_label.setForeground(new java.awt.Color(0, 51, 51));
        last_reg_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        last_reg_label.setText("last REG");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addGap(0, 8, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(last_reg_label, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(last_reg_label, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jDateChooser1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        tabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tabel);

        jScrollPane2.setViewportView(jScrollPane3);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(reg_no_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(name_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reg_type_comboox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amount_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(batch_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(participant_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(contact_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(215, 215, 215))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(receipt_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(314, 314, 314)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37))))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(453, 453, 453)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(batch_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(reg_no_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(88, 88, 88)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contact_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(reg_type_comboox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(receipt_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(amount_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(participant_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("New Rgistration", jPanel3);

        jLabel15.setFont(new java.awt.Font("Kalpurush", 1, 18)); // NOI18N
        jLabel15.setText("Select View By :");

        sort_comboBox.setFont(new java.awt.Font("Kalpurush", 1, 18)); // NOI18N
        sort_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Registration No", "Batch", "Date", "For Book" }));

        viewButton.setFont(new java.awt.Font("Kalpurush", 1, 18)); // NOI18N
        viewButton.setText("View");

        sort_tabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sort_tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(sort_tabel);

        save_as_ComboBox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        save_as_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Excel", "PDF" }));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setText("Save as :");

        save_Button.setFont(new java.awt.Font("Kalpurush", 1, 18)); // NOI18N
        save_Button.setText("Save");
        save_Button.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(sort_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(save_as_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(save_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(sort_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(save_as_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(save_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        jTabbedPane1.addTab("View", jPanel5);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Enter Registration Number :");

        edit_reg_textField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        edit_reg_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_reg_textFieldActionPerformed(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(204, 204, 255));
        jPanel9.setEnabled(false);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Registration No.    :");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Name                  :");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Batch                   :");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("Registration Mode   :");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setText("Amount                :");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setText("No of Participants :");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setText("Date :");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setText("Contact Number :");

        edit_regNo_textField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        edit_regNo_textField.setEnabled(false);

        edit_name_textField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        edit_name_textField.setEnabled(false);

        edit_batch_textField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        edit_batch_textField.setEnabled(false);

        edit_receipt_textField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        edit_receipt_textField.setEnabled(false);

        edit_amount_textField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        edit_amount_textField.setEnabled(false);

        edit_contact_textField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        edit_contact_textField.setEnabled(false);
        edit_contact_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_contact_textFieldActionPerformed(evt);
            }
        });

        edit_participant_textField.setEditable(false);
        edit_participant_textField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        edit_participant_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_participant_textFieldActionPerformed(evt);
            }
        });

        edit_regMode_comboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        edit_regMode_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bank", "Bkash", "Direct" }));
        edit_regMode_comboBox.setEnabled(false);

        resubmitButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        resubmitButton.setText("Resubmit");
        resubmitButton.setEnabled(false);

        edit_DateChooser.setEnabled(false);
        edit_DateChooser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edit_batch_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edit_amount_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edit_regNo_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(edit_DateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(333, 333, 333)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addGap(18, 18, 18)
                                        .addComponent(edit_participant_textField))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(edit_contact_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(54, 54, 54))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(edit_regMode_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(edit_receipt_textField))
                            .addComponent(edit_name_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(488, 488, 488))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(edit_regNo_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(edit_DateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(edit_name_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel23)
                    .addComponent(edit_batch_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit_contact_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(edit_receipt_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit_regMode_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(edit_amount_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit_participant_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(resubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );

        searchButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        searchButton.setText("Search");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(edit_reg_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(searchButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(edit_reg_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Edit", jPanel7);

        jLabel16.setFont(new java.awt.Font("Kalpurush", 1, 18)); // NOI18N
        jLabel16.setText("Total Number of Registration :");

        total_reg_label.setFont(new java.awt.Font("Kalpurush", 3, 18)); // NOI18N
        total_reg_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        total_reg_label.setText("Reg num");
        total_reg_label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel18.setFont(new java.awt.Font("Kalpurush", 1, 18)); // NOI18N
        jLabel18.setText("Total Number of participants :");

        total_participant_label.setFont(new java.awt.Font("Kalpurush", 3, 18)); // NOI18N
        total_participant_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        total_participant_label.setText("Participant");
        total_participant_label.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(total_participant_label, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(total_reg_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(650, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total_reg_label, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total_participant_label, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(362, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Information", jPanel6);

        jPanel4.setToolTipText("");

        jLabel25.setFont(new java.awt.Font("Kalpurush", 3, 24)); // NOI18N
        jLabel25.setText("This a demo project for 'JUAAM 3rd Reunion' FOR 'Department of Mathematics\"");

        jLabel27.setText("ju@cse");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Saddam Hossain Saad\nOmar Faruk Munna\nUllash Hasan\nMahbubur Rahman mahbub\nAhsin Abid\n&\nCSE 42 Batch.");
        jTextArea1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane4.setViewportView(jTextArea1);

        jLabel28.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel28.setText("Special Thanks To:");
        jLabel28.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel29.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel29.setText("Supervised By :");
        jLabel29.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("Md Tauhedul Azam\nAssistant Professor\nDept. Of Mathematics\nJahangirnagar University\n");
        jTextArea2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane5.setViewportView(jTextArea2);

        jLabel30.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel30.setText("Developed By :");
        jLabel30.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setText("Touhidur Rahaman Khan\n     &\nMonikrishna Roy");
        jTextArea3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane6.setViewportView(jTextArea3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 1082, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(113, 113, 113)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
                        .addComponent(jLabel28)
                        .addGap(11, 11, 11)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                            .addComponent(jScrollPane5))
                        .addGap(41, 41, 41)))
                .addComponent(jLabel27)
                .addGap(20, 20, 20))
        );

        jTabbedPane1.addTab("About", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void closed() {
        int i = JOptionPane.showConfirmDialog(Main.this, "Are you sure want to close?", "Select one", JOptionPane.YES_NO_OPTION);

        if (i == JOptionPane.YES_OPTION) {
//            backUp();
            System.exit(0);
        } else {
            return;
        }
    }

    public void backUp() {

        Process p = null;
        try {
            Runtime runtime = Runtime.getRuntime();
            p = runtime.exec("E:\\wamp\\bin\\mysql\\mysql5.6.17\\bin mysqldump -u root -p   juaam name.sql");
//change the dbpass and dbname with your dbpass and dbname
            int processComplete = p.waitFor();

            if (processComplete == 0) {

//                    System.out.println("Backup created successfully!");
            } else {
                // lblMessage.setText("Could not create the backup");
            }

        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("OK1");
            JOptionPane.showMessageDialog(null, "Error!! Try again", "Error", 0);
        }

//        try {
//
//            int processComplete; // to verify that either process completed or not
//
//            Process runtimeProcess = Runtime.getRuntime().exec("E:\\wamp\\bin\\mysql\\mysql5.6.17\\bin\\mysqldump -u root -p JUAAM -r E:/backup.sql");
//
//// call the mysqldump in terminal and execute it
//            processComplete = runtimeProcess.waitFor();//store the state in variable
//
//            if (processComplete == 1) {//if values equal 1 process failed
//
//                JOptionPane.showMessageDialog(null, "Backup Failed");//display message
//            } else if (processComplete == 0) {//if values equal 0 process failed
//
//                JOptionPane.showMessageDialog(null, "\n Backup created Successfully..\n Check the Backup File in the D: Directory named as backup.sql");
////display message}
//            }
//
//            } catch (IOException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
    private void batch_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batch_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_batch_textFieldActionPerformed

    private void reg_no_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reg_no_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reg_no_textFieldActionPerformed

    private void participant_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_participant_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_participant_textFieldActionPerformed

    private void contact_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contact_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contact_textFieldActionPerformed

    private void edit_reg_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_reg_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edit_reg_textFieldActionPerformed

    private void edit_contact_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_contact_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edit_contact_textFieldActionPerformed

    private void edit_participant_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_participant_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edit_participant_textFieldActionPerformed

    public void updateTabel() {

        try {
            int sl = dh.getSLNO();
            // System.out.println(sl);
            ResultSet rs = dh.getRegTabel(sl - 4);

            if (rs != null) {

                tabel.setModel(DbUtils.resultSetToTableModel(rs));

            }
        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("OK2");
            JOptionPane.showMessageDialog(null, "Error!! Try again", "Error", 0);
        }

    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {

            int flag = 0;
//       String reg_no_string = reg_no_textField.getText();
            String reg_no = reg_no_textField.getText();

            String name = name_textField.getText();

            String batch_string = batch_textField.getText();
            int batch = 0;

            String contact = contact_textField.getText();
            String regType = (String) reg_type_comboox.getSelectedItem();
            String receipt = receipt_textField.getText();

            String amount_string = amount_textField.getText();
            int amount = 0;

            String participant_string = participant_textField.getText();
            int participant = 0;

            java.util.Date d = jDateChooser1.getDate();
            java.sql.Date sqldate = null;

            if (reg_no != null && !reg_no.equals("") && batch_string != null && !batch_string.equals("") && amount_string != null && !amount_string.equals("") && participant_string != null && !participant_string.equals("") && name != null
                    && !name.equals("") && contact != null && !contact.equals("") && regType != null && !regType.equals("") && receipt != null && !receipt.equals("")) {

                try {
//                reg_no = Integer.parseInt(reg_no_string);

                    amount = Integer.parseInt(amount_string);
                    batch = Integer.parseInt(batch_string);
                    participant = Integer.parseInt(participant_string);

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Registration number, Batch, Amount and Participant number's digit must be 0-9!!", "Error", 0);
                    flag = 1;
//                    e.printStackTrace();
//                    System.out.println("OK3");
                    JOptionPane.showMessageDialog(null, "Error!! Try again", "Error", 0);
                }
            } else {
                flag = 1;
                JOptionPane.showMessageDialog(null, "Pleasse Fill up all field correctly!!", "Error", 0);
            }

            if (flag == 0) {
                if (reg_no.length() > 4) {
                    JOptionPane.showMessageDialog(null, "Registration Number must be 4 digit!", "Error", 0);
                    flag = 1;
                } else if (d == null) {
                    JOptionPane.showMessageDialog(null, "No date specified!", "Error", 0);
                    flag = 1;
                } else {
                    sqldate = new java.sql.Date(d.getTime());
                    // Do something with sqldate
                }
                if (participant < 1) {
                    flag = 1;
                    JOptionPane.showMessageDialog(null, "Amount is not Correct!!", "Error", 0);
                }
            }

            int len = reg_no.length();
            if (len < 4) {
                if (len == 3) {
                    reg_no = "0" + reg_no;
                }
                if (len == 2) {
                    reg_no = "00" + reg_no;
                }
                if (len == 1) {
                    reg_no = "000" + reg_no;
                }
            }
//            try {
//                    String reg = new String();
//                    try {
//                        reg = edit_reg_textField.getText();
//
//                    } catch (NumberFormatException e1) {
//                        JOptionPane.showMessageDialog(null, "Please a correct Registration number!!", "Error", 0);
//                    }
//                    Registration rg = dh.getInfoReg(reg);
            if (flag == 0) {
                Registration rg = dh.getInfoReg(reg_no);
                if (rg != null) {
                    flag = 1;
                    JOptionPane.showMessageDialog(null, "Registration Number is Duplicated!!", "Error", 0);
                }
            }
            int returnValue = 0;
            if (flag == 0) {
                returnValue = dh.insert(reg_no, name, batch, contact, regType, receipt, amount, participant, sqldate);
                if (returnValue == 1) {
                    JOptionPane.showMessageDialog(null, "Successfully Added.", "SUCCESS", 1);
                    reg_no_textField.setText("");
                    name_textField.setText("");
                    batch_textField.setText("");
                    contact_textField.setText("");
                    receipt_textField.setText("");
                    amount_textField.setText("");
                    participant_textField.setText("");
                    jDateChooser1.setDate(null);
                    updateTabel();

                } else {
                    JOptionPane.showMessageDialog(null, "Error:Please make user database server is open and try again", "Error", 0);
                }
    }//GEN-LAST:event_jButton1ActionPerformed
        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("OK4");
            JOptionPane.showMessageDialog(null, "Error!! Try again", "Error", 0);
        }
    }

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Main().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount_textField;
    private javax.swing.JTextField batch_textField;
    private javax.swing.JTextField contact_textField;
    private com.toedter.calendar.JDateChooser edit_DateChooser;
    private javax.swing.JTextField edit_amount_textField;
    private javax.swing.JTextField edit_batch_textField;
    private javax.swing.JTextField edit_contact_textField;
    private javax.swing.JTextField edit_name_textField;
    private javax.swing.JTextField edit_participant_textField;
    private javax.swing.JTextField edit_receipt_textField;
    private javax.swing.JComboBox<String> edit_regMode_comboBox;
    private javax.swing.JTextField edit_regNo_textField;
    private javax.swing.JTextField edit_reg_textField;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JLabel last_reg_label;
    private javax.swing.JTextField name_textField;
    private javax.swing.JTextField participant_textField;
    private javax.swing.JTextField receipt_textField;
    private javax.swing.JTextField reg_no_textField;
    private javax.swing.JComboBox<String> reg_type_comboox;
    private javax.swing.JButton resubmitButton;
    private javax.swing.JButton save_Button;
    private javax.swing.JComboBox<String> save_as_ComboBox;
    private javax.swing.JButton searchButton;
    private javax.swing.JComboBox<String> sort_comboBox;
    private javax.swing.JTable sort_tabel;
    private javax.swing.JTable tabel;
    private javax.swing.JLabel total_participant_label;
    private javax.swing.JLabel total_reg_label;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables

    private void buttonOther() {

        amount_textField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

            }

            @Override
            public void keyPressed(KeyEvent e) {
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

            }

            @Override
            public void keyReleased(KeyEvent e) {
                try {
                    String amount_given = amount_textField.getText();
                    int taka = Integer.parseInt(amount_given);
                    int participantNos = ((taka - 700) / 300) + 1;
                    participant_textField.setText(String.valueOf(participantNos));
                } catch (NumberFormatException e4) {

                }

//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        //edit_participant_textField

        edit_amount_textField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

            }

            @Override
            public void keyPressed(KeyEvent e) {
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

            }

            @Override
            public void keyReleased(KeyEvent e) {
                try {
                    String amount_given = edit_amount_textField.getText();
                    int taka = Integer.parseInt(amount_given);
                    int participantNos = ((taka - 700) / 300) + 1;
                    edit_participant_textField.setText(String.valueOf(participantNos));
                } catch (NumberFormatException e4) {

                }

//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    String reg = new String();
                    try {
                        reg = edit_reg_textField.getText();

                    } catch (NumberFormatException e1) {
                        JOptionPane.showMessageDialog(null, "Please a correct Registration number!!", "Error", 0);
                        blankEdit();
                    }
                    Registration rg = dh.getInfoReg(reg);
//                int id=lg.getId();

                    if (rg != null) {

                        if (id == 1) {
                            edit_regNo_textField.setEnabled(true);
                        }
                        edit_name_textField.setEnabled(true);
                        edit_batch_textField.setEnabled(true);
                        edit_contact_textField.setEnabled(true);
                        edit_receipt_textField.setEnabled(true);
                        edit_amount_textField.setEnabled(true);
                        //edit_participant_textField.setEnabled(true);
                        edit_DateChooser.setEnabled(true);
                        edit_regMode_comboBox.setEnabled(true);
                        resubmitButton.setEnabled(true);

                        edit_regNo_textField.setText(String.valueOf(rg.getRegNumber()));
                        edit_name_textField.setText(rg.getName());
                        edit_batch_textField.setText(String.valueOf(rg.getBatch()));
                        edit_contact_textField.setText(rg.getContact());
                        edit_receipt_textField.setText(rg.getReceipt());
                        edit_amount_textField.setText(String.valueOf(rg.getAmount()));
                        edit_participant_textField.setText(String.valueOf(rg.getParicipant()));
                        edit_DateChooser.setDate(rg.getDate());
                        edit_regMode_comboBox.setSelectedItem(rg.getRegMode());

                    } else {
                        JOptionPane.showMessageDialog(null, "Registration number not found!!", "Error", 0);
                        blankEdit();
                        edit_regNo_textField.setEnabled(false);
                        edit_name_textField.setEnabled(false);
                        edit_batch_textField.setEnabled(false);
                        edit_contact_textField.setEnabled(false);
                        edit_receipt_textField.setEnabled(false);
                        edit_amount_textField.setEnabled(false);
                        // edit_participant_textField.setEnabled(false);
                        edit_DateChooser.setEnabled(false);
                        edit_regMode_comboBox.setEnabled(false);
                        resubmitButton.setEnabled(false);

                    }

                } catch (Exception e2) {

//                    e2.printStackTrace();
                    //System.out.println("OK7");
                    JOptionPane.showMessageDialog(null, "Error!! Try again", "Error", 0);

                }
            }
        });

        resubmitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    int flag = 0;
                    String reg_no = edit_regNo_textField.getText();

                    String name = edit_name_textField.getText();

                    String batch_string = edit_batch_textField.getText();
                    int batch = 0;

                    String contact = edit_contact_textField.getText();
                    String regType = (String) edit_regMode_comboBox.getSelectedItem();
                    String receipt = edit_receipt_textField.getText();

                    String amount_string = edit_amount_textField.getText();
                    int amount = 0;

                    String participant_string = edit_participant_textField.getText();
                    int participant = 0;

                    java.util.Date d = edit_DateChooser.getDate();
                    java.sql.Date sqldate = null;

                    if (reg_no != null && !reg_no.equals("") && batch_string != null && !batch_string.equals("") && amount_string != null && !amount_string.equals("") && participant_string != null && !participant_string.equals("") && name != null
                            && !name.equals("") && contact != null && !contact.equals("") && regType != null && !regType.equals("") && receipt != null && !receipt.equals("")) {

                        try {
                            amount = Integer.parseInt(amount_string);
                            batch = Integer.parseInt(batch_string);
                            participant = Integer.parseInt(participant_string);

                        } catch (NumberFormatException e3) {
                            JOptionPane.showMessageDialog(null, "Registration number and Batch and Amount and Participant number's digit must be 0-9!!", "Error", 0);
                            flag = 1;
                        }
                    } else {
                        flag = 1;
                        JOptionPane.showMessageDialog(null, "Pleasse Fill up all field correctly!!", "Error", 0);
                    }
                    if (flag == 0) {
                        if (reg_no.length() > 4) {
                            JOptionPane.showMessageDialog(null, "Registration Number must be 4 digit!", "Error", 0);
                            
                            flag = 1;
                        } else if (d == null) {
                            JOptionPane.showMessageDialog(null, "No date specified!", "Error", 0);
                            flag = 1;
//                            blankEdit();
                        } else {
                            sqldate = new java.sql.Date(d.getTime());
                            // Do something with sqldate
                        }
                        if (participant < 1) {
                            flag = 1;
                            JOptionPane.showMessageDialog(null, "Amount is not Correct!!", "Error", 0);
//                            blankEdit();
                        }
                    }
                    int len = reg_no.length();
                    if (len < 4) {
                        if (len == 3) {
                            reg_no = "0" + reg_no;
                        }
                        if (len == 2) {
                            reg_no = "00" + reg_no;
                        }
                        if (len == 1) {
                            reg_no = "000" + reg_no;
                        }
                    }
//                    if (flag == 0) {
//                        Registration rg = dh.getInfoReg(reg_no);
//                        if (rg != null) {
//                            flag = 1;
//                            JOptionPane.showMessageDialog(null, "Registration Number is Duplicated!!", "Error", 0);
//                        }
//                    }

                    int returnValue = 0;
                    if (flag == 0) {
                        returnValue = dh.update(reg_no, name, batch, contact, regType, receipt, amount, participant, sqldate);
                        if (returnValue == 1) {
                            JOptionPane.showMessageDialog(null, "Successfully Updated.", "SUCCESS", 1);
                            blankEdit();
                            updateTabel();
                            edit_regNo_textField.setEnabled(false);
                            edit_name_textField.setEnabled(false);
                            edit_batch_textField.setEnabled(false);
                            edit_contact_textField.setEnabled(false);
                            edit_receipt_textField.setEnabled(false);
                            edit_amount_textField.setEnabled(false);
                            //edit_participant_textField.setEnabled(false);
                            edit_DateChooser.setEnabled(false);
                            edit_regMode_comboBox.setEnabled(false);
                            resubmitButton.setEnabled(false);

                        } else {
                            JOptionPane.showMessageDialog(null, "Error:Please make user database server is open and try again!!", "Error", 0);

                            blankEdit();

                            edit_regNo_textField.setEnabled(false);
                            edit_name_textField.setEnabled(false);
                            edit_batch_textField.setEnabled(false);
                            edit_contact_textField.setEnabled(false);
                            edit_receipt_textField.setEnabled(false);
                            edit_amount_textField.setEnabled(false);
                            //edit_participant_textField.setEnabled(false);
                            edit_DateChooser.setEnabled(false);
                            edit_regMode_comboBox.setEnabled(false);
                            resubmitButton.setEnabled(false);
                        }
                    }
                } catch (Exception e2) {
//                    e2.printStackTrace();
//                    System.out.println("OK5");
                    JOptionPane.showMessageDialog(null, "Error!! Try again", "Error", 0);

                }
            }
        });

        //sort_comboBox
        viewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String sortType = (String) sort_comboBox.getSelectedItem();

                    // print_Button.setEnabled(true);
                    save_Button.setEnabled(true);

                    ResultSet resultSet = null;
                    if (sortType.equals("All")) {
                        resultSet = dh.selectAll();
                        if (resultSet != null) {

                            sort_tabel.setModel(DbUtils.resultSetToTableModel(resultSet));

                        }
                    } else if (sortType.equals("For Book")) {
                        resultSet = dh.forBook();
                        if (resultSet != null) {

                            sort_tabel.setModel(DbUtils.resultSetToTableModel(resultSet));

                        }

                    } else {
                        resultSet = dh.sortBy(sortType);
                        if (resultSet != null) {

                            sort_tabel.setModel(DbUtils.resultSetToTableModel(resultSet));

                        }
                    }

                } catch (Exception e2) {

//                    e2.printStackTrace();
//                    System.out.println("OK6");
                    JOptionPane.showMessageDialog(null, "Error!! Try again", "Error", 0);

                }
            }
        });
//save_Button
        save_Button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

//                JFileChooser chooser=new JFileChooser();
//                chooser.showOpenDialog(null);
//          File f=chooser.getSelectedFile();
//         String path=f.getAbsolutePath();
                try {
                    String sortType = (String) sort_comboBox.getSelectedItem();
                    String saveAs = (String) save_as_ComboBox.getSelectedItem();
                    String fileString = null;
                    if (sortType.equals("All")) {
                        fileString = "C:\\juaam\\JUAAM_All";
                    } else if (sortType.equals("For Book")) {
                        fileString = "C:\\juaam\\JUAAM_Book";
                    } else if (sortType.equals("Registration No")) {
                        fileString = "C:\\juaam\\JUAAM_Reg";
                    } else if (sortType.equals("Batch")) {
                        fileString = "C:\\juaam\\JUAAM_Batch";
                    } else if (sortType.equals("Date")) {
                        fileString = "C:\\juaam\\JUAAM_Date";
                    }
//                    File file = new File(fileString);

                    if (saveAs.equals("Excel")) {
//                        JFileChooser f = new JFileChooser();
//                        f.setFileSelectionMode(JFileChooser.FILES_ONLY);
//                        f.showSaveDialog(null);

                        //System.out.println(f.getCurrentDirectory());
                        // System.out.println(f.getSelectedFile());
                        File file = new File(fileString + ".xls");
                        // File file = f.getSelectedFile();
                        // JOptionPane.sh

//                        if (!file.exists()) {
                        try {
                            file.createNewFile();
                            toExcel(sort_tabel, file);

                        } catch (IOException ex) {
                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        }
//                        }
                        if (file.exists()) {
                            JOptionPane.showMessageDialog(null, "File Saved!!", "SUCCESS", 1);
                        }

                    } else {
//                        JFileChooser f = new JFileChooser();
//                        f.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
//                        f.showSaveDialog(null);

                        //System.out.println(f.getCurrentDirectory());
                        // System.out.println(f.getSelectedFile());
                        File file = new File(fileString + ".pdf");
                        // File file = f.getSelectedFile();
                        // JOptionPane.sh
                        print(file);
                        if (file.exists()) {
                            JOptionPane.showMessageDialog(null, "File Saved!!", "SUCCESS", 1);
                        }

                    }

                } catch (Exception e2) {
//                    e2.printStackTrace();
//                    System.out.println("OK8");
                    JOptionPane.showMessageDialog(null, "Error!! Try again", "Error", 0);

                }
            }
        });
        //print_Button
//        print_Button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
////                print();
////                try {
////                    MessageFormat headerFormat = new MessageFormat("Page {0}");
////                    MessageFormat footerFormat = new MessageFormat("- {0} -");
////                    sort_tabel.print(JTable.PrintMode.NORMAL, headerFormat, footerFormat);
////                } catch (PrinterException pe) {
////                    System.err.println("Error printing: " + pe.getMessage());
////                }
////                try {
//                //               // System.out.println("OK");
//                try {
//                    MessageFormat header = new MessageFormat("Report Print");
//                    MessageFormat footer = new MessageFormat("Page(0,number,integer)");
//
//                    try {
//                        sort_tabel.print(JTable.PrintMode.FIT_WIDTH, header, footer);
//                    } catch (PrinterException ex) {
//                        // Logger.getLogger(sort_tabel.class.getName()).log(Level.SEVERE, null, ex);
//                        ex.printStackTrace();;
//                    }
////sort_tabel.print();
////                } catch (PrinterException ex) {
////                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
////                }
//                } catch (Exception e2) {
//                    e2.printStackTrace();
//                    System.out.println("OK9");
//
//                }
//            }
//        });
//
    }

    public void blankEdit() {
        edit_regNo_textField.setText("");
        edit_name_textField.setText("");
        edit_batch_textField.setText("");
        edit_contact_textField.setText("");
        edit_receipt_textField.setText("");
        edit_amount_textField.setText("");
        edit_participant_textField.setText("");
        edit_DateChooser.setDate(null);
    }

    public void toExcel(JTable table, File file) {
        try {
            TableModel model = table.getModel();
            FileWriter excel = new FileWriter(file);

            for (int i = 0; i < model.getColumnCount(); i++) {
                excel.write(model.getColumnName(i) + "\t");
            }

            excel.write("\n");

            for (int i = 0; i < model.getRowCount(); i++) {
                for (int j = 0; j < model.getColumnCount(); j++) {
                    excel.write(model.getValueAt(i, j).toString() + "\t");
                }
                excel.write("\n");
            }

            excel.close();

        } catch (IOException e) {

//            e.printStackTrace();
//            System.out.println("OK10");
            JOptionPane.showMessageDialog(null, "Error!! Try again", "Error", 0);

        }
    }

    private void print(File file) {
        try {

            PDFHandle pdf = new PDFHandle(sort_tabel, file);
        } catch (Exception e2) {
//            e2.printStackTrace();
//            System.out.println("OK11");
            JOptionPane.showMessageDialog(null, "Error!! Try again", "Error", 0);

        }

//        Document document = new Document();
//        PdfWriter writer = null;
//
//        try {
//            writer = PdfWriter.getInstance(document, new FileOutputStream(file));
//        } catch (DocumentException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        // writer = PdfWriter.getInstance(document, new
//        // FileOutputStream("my_jtable_fonts.pdf"));
//        document.open();
//        PdfContentByte cb = writer.getDirectContent();
//
//        PdfTemplate tp = cb.createTemplate(500, 500);
//        Graphics2D g2;
//
//        g2 = tp.createGraphicsShapes(500, 500);
        // g2 = tp.createGraphics(500, 500);
//        sort_tabel.print(g2);
//        g2.dispose();
//        cb.addTemplate(tp, 30, 300);
//
//        // step 5: we close the document
//        document.close();
//        Document document = new Document();
//        try {
////            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\Krishna\\Desktop\\jTable.pdf"));
//            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(file));
//            System.out.println("Print OK");
//            document.open();
//            PdfContentByte cb = writer.getDirectContent();
//
//            // Create the graphics as shapes
//            cb.saveState();
//            Graphics2D g2 = cb.createGraphicsShapes(500, 500);
//            // Print the table to the graphics
//            Shape oldClip = g2.getClip();
//            g2.clipRect(0, 0, 500, 500);
//            sort_tabel.print(g2);
//            g2.setClip(oldClip);
//
//            g2.dispose();
//            cb.restoreState();
//
////            document.newPage();
////
////            // Create the graphics with pdf fonts
////            cb.saveState();
////            g2 = cb.createGraphics(500, 500);
////
////            // Print the table to the graphics
////            oldClip = g2.getClip();
////           // g2.clipRect(0, 0, 500, 500);
////            sort_tabel.print(g2);
////            g2.setClip(oldClip);
//            g2.dispose();
//            cb.restoreState();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.err.println(e.getMessage());
//        }
//
//        document.close();
    }

    public void showInformation() {

        try {
            int totalRegNo = dh.getSLNO();
            int totalParti = dh.getParticipantNumber();
            total_reg_label.setText(String.valueOf(totalRegNo));
            total_participant_label.setText(String.valueOf(totalParti));
            String lastReg = dh.getLastReg();
            last_reg_label.setText(String.valueOf(lastReg));
        } catch (Exception e2) {
//            e2.printStackTrace();
//            System.out.println("OK12");
            JOptionPane.showMessageDialog(null, "Error!! Try again", "Error", 0);

        }
    }

    @Override
    public void run() {

        while (true) {
            showInformation();
            updateTabel();
            //System.out.println("OKKKK");

            try {
                Thread.sleep(10000);
            } catch (Exception e2) {
//                e2.printStackTrace();
//                System.out.println("OK13");
                JOptionPane.showMessageDialog(null, "Error!! Try again", "Error", 0);

            }
        }
    }

}
