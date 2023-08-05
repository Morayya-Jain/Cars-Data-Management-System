/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this 
 */
package pkgCS.IA;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane; 
import java.time.*;  
import java.util.*; 
import java.text.SimpleDateFormat;
import static pkgCS.IA.Cardetail.DB_URL;
import static pkgCS.IA.Cardetail.PASS;
import static pkgCS.IA.Cardetail.USER;


public class Customerdetails extends javax.swing.JFrame {

	static final String DB_URL = "jdbc:mysql://localhost/csia";
	static final String USER = "root";
	static final String PASS = "root@123";

	public Customerdetails() {
		initComponents();
	}
	public Customerdetails(String username) {
		initComponents();
		jLabel14.setText(username);
		jLabel15.setBackground(Color.white);
		jLabel15.setOpaque(true);
	}

	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jTextField1 = new javax.swing.JTextField();
                jTextField2 = new javax.swing.JTextField();
                jTextField3 = new javax.swing.JTextField();
                jTextField6 = new javax.swing.JTextField();
                jComboBox1 = new javax.swing.JComboBox<>();
                jTextField7 = new javax.swing.JTextField();
                jTextField8 = new javax.swing.JTextField();
                jTextField9 = new javax.swing.JTextField();
                jTextField10 = new javax.swing.JTextField();
                jTextField11 = new javax.swing.JTextField();
                jButton1 = new javax.swing.JButton();
                jButton2 = new javax.swing.JButton();
                jLabel14 = new javax.swing.JLabel();
                jButton10 = new javax.swing.JButton();
                jLabel15 = new javax.swing.JLabel();
                jDateChooser1 = new com.toedter.calendar.JDateChooser();
                jButton3 = new javax.swing.JButton();
                jLabel16 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                jLabel8 = new javax.swing.JLabel();
                jLabel9 = new javax.swing.JLabel();
                jLabel10 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setLocation(new java.awt.Point(0, 25));
                setUndecorated(true);

                jTextField1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
                jTextField1.setForeground(new java.awt.Color(175, 175, 175));
                jTextField1.setText("Customer ID");
                jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
                        public void focusGained(java.awt.event.FocusEvent evt) {
                                jTextField1FocusGained(evt);
                        }
                        public void focusLost(java.awt.event.FocusEvent evt) {
                                jTextField1FocusLost(evt);
                        }
                });
                jTextField1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextField1ActionPerformed(evt);
                        }
                });

                jTextField2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
                jTextField2.setForeground(new java.awt.Color(175, 175, 175));
                jTextField2.setText("First Name");
                jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
                        public void focusGained(java.awt.event.FocusEvent evt) {
                                jTextField2FocusGained(evt);
                        }
                        public void focusLost(java.awt.event.FocusEvent evt) {
                                jTextField2FocusLost(evt);
                        }
                });
                jTextField2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextField2ActionPerformed(evt);
                        }
                });

                jTextField3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
                jTextField3.setForeground(new java.awt.Color(175, 175, 175));
                jTextField3.setText("Last Name");
                jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
                        public void focusGained(java.awt.event.FocusEvent evt) {
                                jTextField3FocusGained(evt);
                        }
                        public void focusLost(java.awt.event.FocusEvent evt) {
                                jTextField3FocusLost(evt);
                        }
                });
                jTextField3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextField3ActionPerformed(evt);
                        }
                });

                jTextField6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
                jTextField6.setForeground(new java.awt.Color(175, 175, 175));
                jTextField6.setText("Address");
                jTextField6.addFocusListener(new java.awt.event.FocusAdapter() {
                        public void focusGained(java.awt.event.FocusEvent evt) {
                                jTextField6FocusGained(evt);
                        }
                        public void focusLost(java.awt.event.FocusEvent evt) {
                                jTextField6FocusLost(evt);
                        }
                });

                jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
                jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Female", "Male" }));

                jTextField7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
                jTextField7.setForeground(new java.awt.Color(175, 175, 175));
                jTextField7.setText("Phone Number");
                jTextField7.addFocusListener(new java.awt.event.FocusAdapter() {
                        public void focusGained(java.awt.event.FocusEvent evt) {
                                jTextField7FocusGained(evt);
                        }
                        public void focusLost(java.awt.event.FocusEvent evt) {
                                jTextField7FocusLost(evt);
                        }
                });
                jTextField7.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextField7ActionPerformed(evt);
                        }
                });

                jTextField8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
                jTextField8.setForeground(new java.awt.Color(175, 175, 175));
                jTextField8.setText("Mobile Number");
                jTextField8.addFocusListener(new java.awt.event.FocusAdapter() {
                        public void focusGained(java.awt.event.FocusEvent evt) {
                                jTextField8FocusGained(evt);
                        }
                        public void focusLost(java.awt.event.FocusEvent evt) {
                                jTextField8FocusLost(evt);
                        }
                });
                jTextField8.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextField8ActionPerformed(evt);
                        }
                });

                jTextField9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
                jTextField9.setForeground(new java.awt.Color(175, 175, 175));
                jTextField9.setText("Driver Number");
                jTextField9.addFocusListener(new java.awt.event.FocusAdapter() {
                        public void focusGained(java.awt.event.FocusEvent evt) {
                                jTextField9FocusGained(evt);
                        }
                        public void focusLost(java.awt.event.FocusEvent evt) {
                                jTextField9FocusLost(evt);
                        }
                });

                jTextField10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
                jTextField10.setForeground(new java.awt.Color(175, 175, 175));
                jTextField10.setText("Spouse Name");
                jTextField10.addFocusListener(new java.awt.event.FocusAdapter() {
                        public void focusGained(java.awt.event.FocusEvent evt) {
                                jTextField10FocusGained(evt);
                        }
                        public void focusLost(java.awt.event.FocusEvent evt) {
                                jTextField10FocusLost(evt);
                        }
                });

                jTextField11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
                jTextField11.setForeground(new java.awt.Color(175, 175, 175));
                jTextField11.setText("Hobbies");
                jTextField11.addFocusListener(new java.awt.event.FocusAdapter() {
                        public void focusGained(java.awt.event.FocusEvent evt) {
                                jTextField11FocusGained(evt);
                        }
                        public void focusLost(java.awt.event.FocusEvent evt) {
                                jTextField11FocusLost(evt);
                        }
                });

                jButton1.setBackground(new java.awt.Color(0, 255, 0));
                jButton1.setFont(new java.awt.Font("Kavivanar", 1, 13)); // NOI18N
                jButton1.setText("Save");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });

                jButton2.setBackground(new java.awt.Color(255, 0, 0));
                jButton2.setFont(new java.awt.Font("Kavivanar", 1, 13)); // NOI18N
                jButton2.setText("Back");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton2ActionPerformed(evt);
                        }
                });

                jLabel14.setFont(new java.awt.Font("Silom", 0, 13)); // NOI18N
                jLabel14.setText("Name");

                jButton10.setFont(new java.awt.Font("Kavivanar", 1, 13)); // NOI18N
                jButton10.setText("EXIT");
                jButton10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
                jButton10.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton10ActionPerformed(evt);
                        }
                });

                jLabel15.setBackground(new java.awt.Color(255, 255, 255));
                jLabel15.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
                jLabel15.setForeground(new java.awt.Color(175, 175, 175));
                jLabel15.setText(" Choose Date of Birth");
                jLabel15.setPreferredSize(new java.awt.Dimension(107, 23));

                jDateChooser1.setDateFormatString("dd-MM-yyyy");

                jButton3.setFont(new java.awt.Font("Kavivanar", 1, 13)); // NOI18N
                jButton3.setText("Enter");
                jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton3ActionPerformed(evt);
                        }
                });

                jLabel16.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
                jLabel16.setForeground(new java.awt.Color(175, 175, 175));
                jLabel16.setText("Date of Birth");

                jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(255, 0, 0));
                jLabel2.setText(" *");

                jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
                jLabel3.setForeground(new java.awt.Color(255, 0, 0));
                jLabel3.setText(" *");

                jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
                jLabel4.setForeground(new java.awt.Color(255, 0, 0));
                jLabel4.setText(" *");

                jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
                jLabel5.setForeground(new java.awt.Color(255, 0, 0));
                jLabel5.setText(" *");

                jLabel6.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
                jLabel6.setForeground(new java.awt.Color(255, 0, 0));
                jLabel6.setText(" *");

                jLabel7.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
                jLabel7.setForeground(new java.awt.Color(255, 0, 0));
                jLabel7.setText(" *");

                jLabel8.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
                jLabel8.setForeground(new java.awt.Color(255, 0, 0));
                jLabel8.setText(" *");

                jLabel9.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
                jLabel9.setForeground(new java.awt.Color(255, 0, 0));
                jLabel9.setText(" *");

                jLabel10.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
                jLabel10.setForeground(new java.awt.Color(255, 0, 0));
                jLabel10.setText(" *");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addComponent(jLabel14))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(183, 183, 183)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(183, 183, 183)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6)
                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(183, 183, 183)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6)
                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(183, 183, 183)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6)
                                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(jLabel16)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton3))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(183, 183, 183)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(183, 183, 183)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6)
                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(205, 205, 205)
                                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(205, 205, 205)
                                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(186, 186, 186)
                                                .addComponent(jLabel10)
                                                .addGap(6, 6, 6)
                                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(205, 205, 205)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(196, 196, 196)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(351, 351, 351)
                                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(183, 183, 183)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(6, 6, 6)
                                                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(162, 162, 162))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel14)
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(jButton3)))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9))
                                .addGap(17, 17, 17)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton1)
                                        .addComponent(jButton2))
                                .addGap(18, 18, 18)
                                .addComponent(jButton10)
                                .addContainerGap(34, Short.MAX_VALUE))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
		if(jDateChooser1.getDate()==null) {
			JOptionPane.showMessageDialog(null,"Please fill in all the details");
		}
		else         {
			
                String username=jLabel14.getText();
		String customerID=jTextField1.getText();
		String first_name=jTextField2.getText();
		String last_name=jTextField3.getText();	
		String dateofbirth=(new java.text.SimpleDateFormat("dd-MM-yyyy")).format(jDateChooser1.getDate());
		String age=jLabel15.getText();
		String gender=(String)jComboBox1.getSelectedItem();
		String address=jTextField6.getText();
		String phone_number=jTextField7.getText();
		String mobile_number=jTextField8.getText();
		String driver_number=jTextField9.getText();
		String spouse_name=jTextField10.getText();
		String hobbies=jTextField11.getText();
		boolean result1 = first_name.matches("[a-zA-Z]+");
		boolean result2 = last_name.matches("[a-zA-Z]+");
		boolean result3 = spouse_name.matches("[a-zA-Z]+");
		try{
		
		if (customerID.equals("Customer ID") || customerID.length() <=0 || first_name.length() <=0 || first_name.equals("First Name") || last_name.length() <=0 || last_name.equals("Last Name") || address.length() <=0 || address.equals("Address") || phone_number.length() <=0 || phone_number.equals("Phone Number") || mobile_number.length() <=0 || mobile_number.equals("Mobile Number") || driver_number.length() <=0 || driver_number.equals("Driver Number") || spouse_name.length() <=0 || spouse_name.equals("Spouse Name") || hobbies.length() <=0 || hobbies.equals("Hobbies") || age.equals("Choose Date of Birth") || age.equals(" Choose Date of Birth")) {
		
			JOptionPane.showMessageDialog(null,"Please fill in all the details");
		}	
		else{
			try(Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
					Statement stm = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);	
					)    { 
					String sq = "select * from customer"+username+" where customerID='"+customerID+"'";
                                        ResultSet rs= stm.executeQuery(sq);
					if (!rs.first()){
		
			if (result1 && result2 && result3) {
				
				if (phone_number.matches("[0-9]+") &&  mobile_number.matches("[0-9]+") && driver_number.matches("[0-9]+") || spouse_name.equals("NA") || phone_number.equals("NA") || driver_number.equals("NA")) {
					
				try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
					Statement stmt = conn.createStatement();	
					) { 		
					String sql = "Insert INTO customer"+username+" VALUES('"+customerID+"','"+first_name+"','"+last_name+"','"+dateofbirth+"','"+age+"','"+gender+"','"+address+"','"+phone_number+"','"+mobile_number+"','"+driver_number+"','"+spouse_name+"','"+hobbies+"')";
					stmt.executeUpdate(sql);
					JOptionPane.showMessageDialog(null,"Successfully Added!");
			
					jTextField1.setText("Customer ID");	
					jTextField1.setForeground(new Color(175,175,175));
					
					jTextField2.setText("First Name");
					jTextField2.setForeground(new Color(175,175,175));
					
					jTextField3.setText("Last Name");
					jTextField3.setForeground(new Color(175,175,175));
					
					jDateChooser1.setDate(null);
					
					jLabel15.setText(" Choose Date of Birth");
					jLabel15.setForeground(new Color(175,175,175));
					
					jComboBox1.setSelectedItem("Female");
					
					jTextField6.setText("Address");
					jTextField6.setForeground(new Color(175,175,175));
					
					jTextField7.setText("Phone Number");
			                jTextField7.setForeground(new Color(175,175,175));
					
					jTextField8.setText("Mobile Number");
					jTextField8.setForeground(new Color(175,175,175));
					
					jTextField9.setText("Driver Number");
					jTextField9.setForeground(new Color(175,175,175));
					
					jTextField10.setText("Spouse Name");
					jTextField10.setForeground(new Color(175,175,175));
					
					jTextField11.setText("Hobbies");
			                jTextField11.setForeground(new Color(175,175,175));
					
				}	
				 catch (SQLException e) { 
					e.printStackTrace();
				 }
					}
					else{
						JOptionPane.showMessageDialog(null,"Incorrect format");
					}
			}
			else{
						JOptionPane.showMessageDialog(null,"Incorrect format");
					}
				}
					else{
						JOptionPane.showMessageDialog(null,"Customer ID already exists");
			}	
		
					 }
			catch (SQLException e) { 
					e.printStackTrace();
				 }	
        } 
		}
		catch (Exception e){	
				}
        }
        }//GEN-LAST:event_jButton1ActionPerformed
	
        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
		String username=jLabel14.getText();
		new homepage(username).setVisible(true);
	        setVisible(false); 
        }//GEN-LAST:event_jButton2ActionPerformed

        private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
                int a=JOptionPane.showConfirmDialog(null,"Are you sure you want to close?","Select",JOptionPane.YES_NO_OPTION);
                if(a==0){
                        System.exit(0);
                }
        }//GEN-LAST:event_jButton10ActionPerformed

        private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

		String dd1=(new java.text.SimpleDateFormat("dd")).format(jDateChooser1.getDate());
		String mm1=(new java.text.SimpleDateFormat("MM")).format(jDateChooser1.getDate());
		String yyyy1=(new java.text.SimpleDateFormat("yyyy")).format(jDateChooser1.getDate());
		int dd=Integer.parseInt(dd1);
		int mm=Integer.parseInt(mm1);
		int yyyy=Integer.parseInt(yyyy1);
		LocalDate dob = LocalDate.of(yyyy,mm,dd);  
                LocalDate curDate = LocalDate.now();  
                Period period = Period.between(dob, curDate);  
                String age=Integer.toString(period.getYears()); 
		int cust_age=Integer.parseInt(age);
		if (cust_age<18){
			JOptionPane.showMessageDialog(null,"Age must be greater than 18");
		}
		else{
			if (cust_age>130){
				JOptionPane.showMessageDialog(null,"Invalid Age");
			}
			else{
				jLabel15.setText(age);
				jLabel15.setForeground(new Color(0,0,0));
			}
		}
        }//GEN-LAST:event_jButton3ActionPerformed

        private void jTextField7FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField7FocusGained
		if(jTextField7.getText().equals("Phone Number")){
			jTextField7.setText("");
			jTextField7.setForeground(new Color(0,0,0));
		}
        }//GEN-LAST:event_jTextField7FocusGained

        private void jTextField7FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField7FocusLost
		if(jTextField7.getText().equals("")){
			jTextField7.setText("Phone Number");
			jTextField7.setForeground(new Color(175,175,175));
		}
        }//GEN-LAST:event_jTextField7FocusLost

        private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_jTextField7ActionPerformed

        private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
		if(jTextField1.getText().equals("Customer ID")){
			jTextField1.setText("");
			jTextField1.setForeground(new Color(0,0,0));
		}
        }//GEN-LAST:event_jTextField1FocusGained

        private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
		if(jTextField1.getText().equals("")){
			jTextField1.setText("Customer ID");
			jTextField1.setForeground(new Color(175,175,175));
		}
        }//GEN-LAST:event_jTextField1FocusLost

        private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
		if(jTextField2.getText().equals("First Name")){
			jTextField2.setText("");
			jTextField2.setForeground(new Color(0,0,0));
		} 
        }//GEN-LAST:event_jTextField2FocusGained

        private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
		if(jTextField2.getText().equals("")){
			jTextField2.setText("First Name");
			jTextField2.setForeground(new Color(175,175,175));
		}
        }//GEN-LAST:event_jTextField2FocusLost

        private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusGained
		if(jTextField3.getText().equals("Last Name")){
			jTextField3.setText("");
			jTextField3.setForeground(new Color(0,0,0));
		}
        }//GEN-LAST:event_jTextField3FocusGained

        private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost
		if(jTextField3.getText().equals("")){
			jTextField3.setText("Last Name");
			jTextField3.setForeground(new Color(175,175,175));
		}
        }//GEN-LAST:event_jTextField3FocusLost

        private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_jTextField1ActionPerformed

        private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_jTextField2ActionPerformed

        private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_jTextField3ActionPerformed

        private void jTextField6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusGained
		if(jTextField6.getText().equals("Address")){
			jTextField6.setText("");
			jTextField6.setForeground(new Color(0,0,0));
		}
                // TODO add your handling code here:
        }//GEN-LAST:event_jTextField6FocusGained

        private void jTextField6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusLost
		if(jTextField6.getText().equals("")){
			jTextField6.setText("Address");
			jTextField6.setForeground(new Color(175,175,175));
		}
                // TODO add your handling code here:
        }//GEN-LAST:event_jTextField6FocusLost

        private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_jTextField8ActionPerformed

        private void jTextField8FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField8FocusGained
		if(jTextField8.getText().equals("Mobile Number")){
			jTextField8.setText("");
			jTextField8.setForeground(new Color(0,0,0));
		}
        }//GEN-LAST:event_jTextField8FocusGained

        private void jTextField8FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField8FocusLost
		if(jTextField8.getText().equals("")){
			jTextField8.setText("Mobile Number");
			jTextField8.setForeground(new Color(175,175,175));
		}
        }//GEN-LAST:event_jTextField8FocusLost

        private void jTextField9FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField9FocusGained
		if(jTextField9.getText().equals("Driver Number")){
			jTextField9.setText("");
			jTextField9.setForeground(new Color(0,0,0));
		}
        }//GEN-LAST:event_jTextField9FocusGained

        private void jTextField9FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField9FocusLost
		if(jTextField9.getText().equals("")){
			jTextField9.setText("Driver Number");
			jTextField9.setForeground(new Color(175,175,175));
		}
        }//GEN-LAST:event_jTextField9FocusLost

        private void jTextField10FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField10FocusGained
		if(jTextField10.getText().equals("Spouse Name")){
			jTextField10.setText("");
			jTextField10.setForeground(new Color(0,0,0));
		}
        }//GEN-LAST:event_jTextField10FocusGained

        private void jTextField10FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField10FocusLost
		if(jTextField10.getText().equals("")){
			jTextField10.setText("Spouse Name");
			jTextField10.setForeground(new Color(175,175,175));
		}
        }//GEN-LAST:event_jTextField10FocusLost

        private void jTextField11FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField11FocusGained
		if(jTextField11.getText().equals("Hobbies")){
			jTextField11.setText("");
			jTextField11.setForeground(new Color(0,0,0));
		}
        }//GEN-LAST:event_jTextField11FocusGained

        private void jTextField11FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField11FocusLost
		if(jTextField11.getText().equals("")){
			jTextField11.setText("Hobbies");
			jTextField11.setForeground(new Color(175,175,175));
		}
        }//GEN-LAST:event_jTextField11FocusLost
         /**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Customerdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Customerdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Customerdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Customerdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Customerdetails().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton10;
        private javax.swing.JButton jButton2;
        private javax.swing.JButton jButton3;
        private javax.swing.JComboBox<String> jComboBox1;
        private com.toedter.calendar.JDateChooser jDateChooser1;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel14;
        private javax.swing.JLabel jLabel15;
        private javax.swing.JLabel jLabel16;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JTextField jTextField1;
        private javax.swing.JTextField jTextField10;
        private javax.swing.JTextField jTextField11;
        private javax.swing.JTextField jTextField2;
        private javax.swing.JTextField jTextField3;
        private javax.swing.JTextField jTextField6;
        private javax.swing.JTextField jTextField7;
        private javax.swing.JTextField jTextField8;
        private javax.swing.JTextField jTextField9;
        // End of variables declaration//GEN-END:variables
}
