/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pkgCS.IA;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.*;  
import java.util.*; 
import javax.swing.JOptionPane;

public class Updatecustomerdetails extends javax.swing.JFrame {
	static final String DB_URL = "jdbc:mysql://localhost/csia";
	static final String USER = "root";
	static final String PASS = "root@123";
	/**
	 */
	public Updatecustomerdetails() {
		initComponents();
	}

	public Updatecustomerdetails(String username) {
		initComponents();
		jLabel15.setBackground(Color.white);
		jLabel15.setOpaque(true);
		jLabel14.setText(username);
		Update.setVisible(false);	
	}
	
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jTextField11 = new javax.swing.JTextField();
                Update = new javax.swing.JButton();
                jTextField1 = new javax.swing.JTextField();
                jTextField2 = new javax.swing.JTextField();
                jTextField3 = new javax.swing.JTextField();
                jTextField6 = new javax.swing.JTextField();
                jComboBox1 = new javax.swing.JComboBox<>();
                jTextField7 = new javax.swing.JTextField();
                jTextField8 = new javax.swing.JTextField();
                jTextField9 = new javax.swing.JTextField();
                jTextField10 = new javax.swing.JTextField();
                jButton3 = new javax.swing.JButton();
                jButton5 = new javax.swing.JButton();
                jButton4 = new javax.swing.JButton();
                jLabel15 = new javax.swing.JLabel();
                jDateChooser1 = new com.toedter.calendar.JDateChooser();
                jLabel14 = new javax.swing.JLabel();
                jLabel16 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                jLabel11 = new javax.swing.JLabel();
                jLabel12 = new javax.swing.JLabel();
                jLabel13 = new javax.swing.JLabel();
                Update1 = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setLocation(new java.awt.Point(0, 25));
                setUndecorated(true);

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

                Update.setBackground(new java.awt.Color(0, 255, 0));
                Update.setFont(new java.awt.Font("Kavivanar", 1, 13)); // NOI18N
                Update.setText("Update");
                Update.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                UpdateActionPerformed(evt);
                        }
                });

                jTextField1.setBackground(new java.awt.Color(255, 255, 51));
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

                jButton3.setBackground(new java.awt.Color(0, 255, 255));
                jButton3.setFont(new java.awt.Font("Kavivanar", 1, 13)); // NOI18N
                jButton3.setText("Search");
                jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton3ActionPerformed(evt);
                        }
                });

                jButton5.setFont(new java.awt.Font("Kavivanar", 1, 13)); // NOI18N
                jButton5.setText("EXIT");
                jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
                jButton5.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton5ActionPerformed(evt);
                        }
                });

                jButton4.setFont(new java.awt.Font("Kavivanar", 1, 13)); // NOI18N
                jButton4.setText("Enter");
                jButton4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton4ActionPerformed(evt);
                        }
                });

                jLabel15.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
                jLabel15.setForeground(new java.awt.Color(175, 175, 175));
                jLabel15.setText(" Choose Date of Birth");
                jLabel15.setPreferredSize(new java.awt.Dimension(49, 23));

                jLabel14.setFont(new java.awt.Font("Silom", 0, 13)); // NOI18N
                jLabel14.setText("Name");

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

                jLabel11.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
                jLabel11.setForeground(new java.awt.Color(255, 0, 0));
                jLabel11.setText(" *");

                jLabel12.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
                jLabel12.setForeground(new java.awt.Color(255, 0, 0));
                jLabel12.setText(" *");

                jLabel13.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
                jLabel13.setForeground(new java.awt.Color(255, 0, 0));
                jLabel13.setText(" *");

                Update1.setBackground(new java.awt.Color(255, 0, 0));
                Update1.setFont(new java.awt.Font("Kavivanar", 1, 13)); // NOI18N
                Update1.setText("Back");
                Update1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                Update1ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(17, 17, 17)
                                                .addComponent(jLabel14))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(209, 209, 209)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(39, 39, 39)
                                                .addComponent(jButton3))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(209, 209, 209)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6)
                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(209, 209, 209)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6)
                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(209, 209, 209)
                                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6)
                                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(jLabel16)
                                                .addGap(41, 41, 41)
                                                .addComponent(jButton4))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(209, 209, 209)
                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(209, 209, 209)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6)
                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(209, 209, 209)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6)
                                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(209, 209, 209)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6)
                                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(231, 231, 231)
                                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(231, 231, 231)
                                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(231, 231, 231)
                                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(390, 390, 390)
                                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGap(231, 231, 231)
                                                        .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(Update1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGap(209, 209, 209)
                                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(6, 6, 6)
                                                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(197, 197, 197))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel14)
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(jLabel2))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jButton3))
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
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(jLabel13))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jButton4))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(17, 17, 17)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Update)
                                        .addComponent(Update1))
                                .addGap(18, 18, 18)
                                .addComponent(jButton5)
                                .addContainerGap(59, Short.MAX_VALUE))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
		if(jDateChooser1.getDate()==null){
			JOptionPane.showMessageDialog(null,"Please fill in all the details");
		}
		else{
		
                String username=jLabel14.getText();
                String cust=jTextField1.getText();
                String a=jTextField2.getText();
                String b=jTextField3.getText();
		String c=(new java.text.SimpleDateFormat("dd-MM-yyyy")).format(jDateChooser1.getDate());
                String d=jLabel15.getText();
		int c_age=Integer.parseInt(d); 
                String E=(String)jComboBox1.getSelectedItem();
                String f=jTextField6.getText();
                String g=jTextField7.getText();
                String h=jTextField8.getText();
                String i=jTextField9.getText();
                String j=jTextField10.getText();
                String k=jTextField11.getText();
		boolean result1 = a.matches("[a-zA-Z]+");
		boolean result2 = b.matches("[a-zA-Z]+");
		boolean result3 = j.matches("[a-zA-Z]+");
		
                if (cust.length() <=0 || cust.equals("Customer ID") || a.length() <=0 || a.equals("First Name") || b.length() <=0 || b.equals("Last Name") || f.length() <=0 || f.equals("Address") || g.length() <=0 || g.equals("Phone Number") || h.length() <=0 || h.equals("Mobile Number") || i.length() <=0 || i.equals("Driver Number") || j.equals("Spouse Name") || j.length() <=0 || k.length() <=0 || k.equals("Hobbies") || d.equals("Choose Date of Birth") ){
		
			JOptionPane.showMessageDialog(null,"Please fill in all the details");
		}	
		else{	
			
			if (result1 && result2 && result3){
				
				if (g.matches("[0-9]+") && h.matches("[0-9]+") &&  i.matches("[0-9]+")  && c_age > 0 && c_age < 150 || j.equals("NA") || g.equals("NA") || i.equals("NA")){
				
				try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
					Statement stmt = conn.createStatement();
					) {
					String sql = "update customer"+username+" set first_name='"+a+"', last_name='"+b+"', dateofbirth='"+c+"', age='"+d+"', gender='"+E+"', address='"+f+"', phone_number='"+g+"', mobile_number='"+h+"', driver_number='"+i+"', spouse_name='"+j+"', hobbies='"+k+"' where customerID='"+cust+"'";
					stmt.executeUpdate(sql);
					JOptionPane.showMessageDialog(null,"Successfully updated!");
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

				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			else{
			JOptionPane.showMessageDialog(null,"Incorrect Format");
			}
			}
			else{
			JOptionPane.showMessageDialog(null,"Incorrect Format");
			}
		} 
        }//GEN-LAST:event_UpdateActionPerformed
	}

        private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                String username=jLabel14.getText();
                String customerID=jTextField1.getText();
	        if (customerID.length() <=0 || customerID.equals("Customer ID")){
			JOptionPane.showMessageDialog(null,"Please enter a customer ID");	
		}
		else{
			
			try(Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
					Statement stm = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);	
					) { 
					String sq = "select * from cars"+username+" where customerID='"+customerID+"'";
                                        ResultSet rs1= stm.executeQuery(sq);
					if (!rs1.first()){
						JOptionPane.showMessageDialog(null,"Customer ID does not exist");
					}
					else{
							
		Update.setVisible(true);
		try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                        Statement stmt = conn.createStatement();
                ) {
                        String sql = "select first_name, last_name, dateofbirth, age, gender, address, phone_number, mobile_number, driver_number, spouse_name, hobbies from customer"+username+" where customerID='"+customerID+"'";
                        ResultSet rs= stmt.executeQuery(sql);
			while(rs.next()){
			 String first_name=rs.getString("first_name");
                         String last_name=rs.getString("last_name");
                         String dateofbirth=rs.getString("dateofbirth");
                         String age=rs.getString("age");
                         String gender=rs.getString("gender");
                         String address=rs.getString("address");
                         String phone_number=rs.getString("phone_number");
                         String mobile_number=rs.getString("mobile_number");
                         String driver_number=rs.getString("driver_number");
                         String spouse_name=rs.getString("spouse_name");
                         String hobbies=rs.getString("hobbies");
			 jTextField1.setText(customerID);
			 jTextField1.setForeground(new Color(0,0,0));
			 
			 jTextField2.setText(first_name);
			 jTextField2.setForeground(new Color(0,0,0));
			 
			 jTextField3.setText(last_name);
			 jTextField3.setForeground(new Color(0,0,0));
			 
			 try{
				Date date = new SimpleDateFormat("dd-MM-yyyy").parse(dateofbirth);
				jDateChooser1.setDate(date);
			 }
			 catch(Exception e){
			 }
			 jLabel15.setText(age);
			 jLabel15.setForeground(new Color(0,0,0));
			 
			 jComboBox1.setSelectedItem(gender);
			 
			 jTextField6.setText(address);
			 jTextField6.setForeground(new Color(0,0,0));
			 
			 jTextField7.setText(phone_number);
			 jTextField7.setForeground(new Color(0,0,0));
			 
			 jTextField8.setText(mobile_number);
			 jTextField8.setForeground(new Color(0,0,0));
			 
			 jTextField9.setText(driver_number);
			 jTextField9.setForeground(new Color(0,0,0));
			 
			 jTextField10.setText(spouse_name);
			 jTextField10.setForeground(new Color(0,0,0));
			 
			 jTextField11.setText(hobbies);
			 jTextField11.setForeground(new Color(0,0,0));
			}

                } catch (SQLException e) {
                        e.printStackTrace();
			
                }
					}
			}
					catch (SQLException e) { 
					e.printStackTrace();
				 }
		}
        }//GEN-LAST:event_jButton3ActionPerformed

        private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

                int a=JOptionPane.showConfirmDialog(null,"Are you sure you want to close?","Select",JOptionPane.YES_NO_OPTION);
                if(a==0){
                        System.exit(0);
                }
        }//GEN-LAST:event_jButton5ActionPerformed

        private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
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
        }//GEN-LAST:event_jButton4ActionPerformed

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

        private void jTextField6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusGained
		if(jTextField6.getText().equals("Address")){
			jTextField6.setText("");
			jTextField6.setForeground(new Color(0,0,0));
		}
        }//GEN-LAST:event_jTextField6FocusGained

        private void jTextField6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusLost
		if(jTextField6.getText().equals("")){
			jTextField6.setText("Address");
			jTextField6.setForeground(new Color(175,175,175));
		}
        }//GEN-LAST:event_jTextField6FocusLost

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

        private void Update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update1ActionPerformed
                String username=jLabel14.getText(); 
		new homepage(username).setVisible(true); 
		setVisible(false);
        }//GEN-LAST:event_Update1ActionPerformed

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
			java.util.logging.Logger.getLogger(Updatecustomerdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Updatecustomerdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Updatecustomerdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Updatecustomerdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {	
				new Updatecustomerdetails().setVisible(true);
			}
		});
	}
        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton Update;
        private javax.swing.JButton Update1;
        private javax.swing.JButton jButton3;
        private javax.swing.JButton jButton4;
        private javax.swing.JButton jButton5;
        private javax.swing.JComboBox<String> jComboBox1;
        private com.toedter.calendar.JDateChooser jDateChooser1;
        private javax.swing.JLabel jLabel11;
        private javax.swing.JLabel jLabel12;
        private javax.swing.JLabel jLabel13;
        private javax.swing.JLabel jLabel14;
        private javax.swing.JLabel jLabel15;
        private javax.swing.JLabel jLabel16;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
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
