/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pkgCS.IA;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import static pkgCS.IA.Updatecustomerdetails.DB_URL;
import static pkgCS.IA.Updatecustomerdetails.PASS;
import static pkgCS.IA.Updatecustomerdetails.USER;

public class Updatecardetails extends javax.swing.JFrame {
	static final String DB_URL = "jdbc:mysql://localhost/csia";
	static final String USER = "root";
	static final String PASS = "root@123";

	public Updatecardetails() {
		initComponents();
	}

	public Updatecardetails(String username) {
		initComponents();
		jLabel14.setText(username);
		Update.setVisible(false);
	}
	
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jTextField4 = new javax.swing.JTextField();
                jTextField7 = new javax.swing.JTextField();
                Update = new javax.swing.JButton();
                jTextField1 = new javax.swing.JTextField();
                jComboBox1 = new javax.swing.JComboBox<>();
                jTextField3 = new javax.swing.JTextField();
                jButton2 = new javax.swing.JButton();
                jButton3 = new javax.swing.JButton();
                jButton10 = new javax.swing.JButton();
                jDateChooser1 = new com.toedter.calendar.JDateChooser();
                jDateChooser2 = new com.toedter.calendar.JDateChooser();
                jDateChooser3 = new com.toedter.calendar.JDateChooser();
                jComboBox2 = new javax.swing.JComboBox<>();
                jLabel14 = new javax.swing.JLabel();
                jLabel16 = new javax.swing.JLabel();
                jLabel17 = new javax.swing.JLabel();
                jLabel18 = new javax.swing.JLabel();
                jLabel13 = new javax.swing.JLabel();
                jLabel15 = new javax.swing.JLabel();
                jLabel19 = new javax.swing.JLabel();
                jLabel20 = new javax.swing.JLabel();
                jLabel21 = new javax.swing.JLabel();
                jLabel22 = new javax.swing.JLabel();
                jLabel23 = new javax.swing.JLabel();
                jLabel24 = new javax.swing.JLabel();
                jLabel25 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setLocation(new java.awt.Point(0, 25));
                setUndecorated(true);
                addFocusListener(new java.awt.event.FocusAdapter() {
                        public void focusGained(java.awt.event.FocusEvent evt) {
                                formFocusGained(evt);
                        }
                });

                jTextField4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
                jTextField4.setForeground(new java.awt.Color(175, 175, 175));
                jTextField4.setText("Car Age");
                jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
                        public void focusGained(java.awt.event.FocusEvent evt) {
                                jTextField4FocusGained(evt);
                        }
                        public void focusLost(java.awt.event.FocusEvent evt) {
                                jTextField4FocusLost(evt);
                        }
                });

                jTextField7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
                jTextField7.setForeground(new java.awt.Color(175, 175, 175));
                jTextField7.setText("Insurance Number");
                jTextField7.addFocusListener(new java.awt.event.FocusAdapter() {
                        public void focusGained(java.awt.event.FocusEvent evt) {
                                jTextField7FocusGained(evt);
                        }
                        public void focusLost(java.awt.event.FocusEvent evt) {
                                jTextField7FocusLost(evt);
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

                jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
                jComboBox1.setForeground(new java.awt.Color(175, 175, 175));
                jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BSI", "BRI", "Other" }));

                jTextField3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
                jTextField3.setForeground(new java.awt.Color(175, 175, 175));
                jTextField3.setText("Car Mileage");
                jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
                        public void focusGained(java.awt.event.FocusEvent evt) {
                                jTextField3FocusGained(evt);
                        }
                        public void focusLost(java.awt.event.FocusEvent evt) {
                                jTextField3FocusLost(evt);
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

                jButton3.setBackground(new java.awt.Color(0, 255, 255));
                jButton3.setFont(new java.awt.Font("Kavivanar", 1, 13)); // NOI18N
                jButton3.setText("Search");
                jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton3ActionPerformed(evt);
                        }
                });

                jButton10.setFont(new java.awt.Font("Kavivanar", 1, 13)); // NOI18N
                jButton10.setText("EXIT");
                jButton10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
                jButton10.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton10ActionPerformed(evt);
                        }
                });

                jDateChooser1.setDateFormatString("dd-MMM-yyyy");

                jDateChooser2.setDateFormatString("dd-MMM-yyyy");

                jDateChooser3.setDateFormatString("dd-MMM-yyyy");

                jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
                jComboBox2.setForeground(new java.awt.Color(175, 175, 175));
                jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 Series", "5 Series", "6 Series", "7 Series", "Z4 M40i/S20i", "M Series", "X1", "X3", "X5", "X7" }));

                jLabel14.setFont(new java.awt.Font("Silom", 0, 13)); // NOI18N
                jLabel14.setText("Name");

                jLabel16.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
                jLabel16.setForeground(new java.awt.Color(175, 175, 175));
                jLabel16.setText("Date of Sale");

                jLabel17.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
                jLabel17.setForeground(new java.awt.Color(175, 175, 175));
                jLabel17.setText("Last Service");

                jLabel18.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
                jLabel18.setForeground(new java.awt.Color(175, 175, 175));
                jLabel18.setText("Insurance Date");

                jLabel13.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
                jLabel13.setForeground(new java.awt.Color(255, 0, 0));
                jLabel13.setText(" *");

                jLabel15.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
                jLabel15.setForeground(new java.awt.Color(255, 0, 0));
                jLabel15.setText(" *");

                jLabel19.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
                jLabel19.setForeground(new java.awt.Color(255, 0, 0));
                jLabel19.setText(" *");

                jLabel20.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
                jLabel20.setForeground(new java.awt.Color(255, 0, 0));
                jLabel20.setText(" *");

                jLabel21.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
                jLabel21.setForeground(new java.awt.Color(255, 0, 0));
                jLabel21.setText(" *");

                jLabel22.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
                jLabel22.setForeground(new java.awt.Color(255, 0, 0));
                jLabel22.setText(" *");

                jLabel23.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
                jLabel23.setForeground(new java.awt.Color(255, 0, 0));
                jLabel23.setText(" *");

                jLabel24.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
                jLabel24.setForeground(new java.awt.Color(255, 0, 0));
                jLabel24.setText(" *");

                jLabel25.setFont(new java.awt.Font("Helvetica Neue", 0, 20)); // NOI18N
                jLabel25.setForeground(new java.awt.Color(255, 0, 0));
                jLabel25.setText(" *");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel14)
                                .addGap(0, 726, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jDateChooser3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel18))
                                                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(jLabel16))
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(35, 35, 35)
                                                .addComponent(jButton3))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(144, 144, 144)
                                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(113, 113, 113))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jButton3)
                                                                        .addComponent(jLabel13))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel15))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel19))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel20))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(jLabel21))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel22)))
                                        .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel23))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel24))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jButton2)
                                                                .addComponent(Update))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel25)
                                                .addGap(51, 51, 51)))
                                .addComponent(jButton10)
                                .addGap(41, 41, 41))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
		if(jDateChooser1.getDate()==null || jDateChooser2.getDate()==null || jDateChooser3.getDate()==null){
			JOptionPane.showMessageDialog(null,"Please fill in all the details");
		}
		else{
		
                String username=jLabel14.getText();
                String cust=jTextField1.getText();
                String a=(String)jComboBox2.getSelectedItem();
                String b=jTextField3.getText();
                String c=jTextField4.getText();
		int c_age=Integer.parseInt(c);  
                String f=(String)jComboBox1.getSelectedItem();
                String g=jTextField7.getText();

		try{
			
			String d=(new java.text.SimpleDateFormat("dd-MM-yyyy")).format(jDateChooser1.getDate());
                        String E=(new java.text.SimpleDateFormat("dd-MM-yyyy")).format(jDateChooser2.getDate());
			String h=(new java.text.SimpleDateFormat("dd-MM-yyyy")).format(jDateChooser3.getDate());
			Date date1=jDateChooser1.getDate();
			Date date2=jDateChooser2.getDate();
			Date date3=jDateChooser3.getDate();
			
			if (cust.length() <=0 || cust.equals("Customer ID") || b.length() <=0 || b.equals("Car Mileage") || c.length() <=0 || c.equals("Car Age") || g.length() <=0 || g.equals("Insurance Number") || date1==null || date2==null || date3==null){
		
				JOptionPane.showMessageDialog(null,"Please fill in all the details");
			}
		
			else{
			
				if (b.matches("[0-9]+") && c.matches("[0-9]+") && c.length() < 3 && c_age < 15 && c_age > 0){
                
					try {	
					
						SimpleDateFormat sdformat = new SimpleDateFormat("dd-MM-yyyy");
				         	Date d1 = sdformat.parse(d);
						Date d2 = sdformat.parse(E);
						Date d3 = sdformat.parse(h);
			
				        String dd1=(new java.text.SimpleDateFormat("dd")).format(jDateChooser1.getDate());
					String mm1=(new java.text.SimpleDateFormat("MM")).format(jDateChooser1.getDate());
					String yyyy1=(new java.text.SimpleDateFormat("yyyy")).format(jDateChooser1.getDate());
					int ddd1=Integer.parseInt(dd1);
					int mmm1=Integer.parseInt(mm1);
					int yyyyy1=Integer.parseInt(yyyy1);	
					LocalDate dob1 = LocalDate.of(yyyyy1,mmm1,ddd1);  
					LocalDate curDate1 = LocalDate.now();  
					Period period1 = Period.between(dob1, curDate1);  
					String age1=Integer.toString(period1.getYears()); 	
					int c_age1=Integer.parseInt(age1);
		
					String dd2=(new java.text.SimpleDateFormat("dd")).format(jDateChooser2.getDate());
					String mm2=(new java.text.SimpleDateFormat("MM")).format(jDateChooser2.getDate());
					String yyyy2=(new java.text.SimpleDateFormat("yyyy")).format(jDateChooser2.getDate());
					int ddd2=Integer.parseInt(dd2);
					int mmm2=Integer.parseInt(mm2);
					int yyyyy2=Integer.parseInt(yyyy2);	
					LocalDate dob2 = LocalDate.of(yyyyy2,mmm2,ddd2);  
					LocalDate curDate2 = LocalDate.now();  
					Period period2 = Period.between(dob2, curDate2);  
					String age2=Integer.toString(period2.getYears()); 	
					int c_age2=Integer.parseInt(age2);
					
					String dd3=(new java.text.SimpleDateFormat("dd")).format(jDateChooser3.getDate());
					String mm3=(new java.text.SimpleDateFormat("MM")).format(jDateChooser3.getDate());
					String yyyy3=(new java.text.SimpleDateFormat("yyyy")).format(jDateChooser3.getDate());
					int ddd3=Integer.parseInt(dd3);
					int mmm3=Integer.parseInt(mm3);
					int yyyyy3=Integer.parseInt(yyyy3);	
					LocalDate dob3 = LocalDate.of(yyyyy3,mmm3,ddd3);  
					LocalDate curDate3 = LocalDate.now();  
					Period period3 = Period.between(dob3, curDate3);  
					String age3=Integer.toString(period3.getYears()); 	
					int c_age3=Integer.parseInt(age3);
						
						if(d1.compareTo(d2) > 0 || d1.compareTo(d3) > 0 || c_age1<0 || c_age1>15 || c_age2<0 || c_age2>14 || c_age3<0 || c_age3>14) {	
							JOptionPane.showMessageDialog(null,"Invalid Dates");
						}	
						else     {
							
							try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
   				
								Statement stmt = conn.createStatement();
								) {
								String sql = "update cars"+username+" set carmodel='"+a+"', carmileage='"+b+"', carage='"+c+"', dateofsale='"+d+"', lastservice='"+E+"', typeofservice='"+f+"', insurancenumber='"+g+"', insurancedate='"+h+"' where customerID='"+cust+"'";
								stmt.executeUpdate(sql);
								JOptionPane.showMessageDialog(null,"Successfully Updated!");
								
								jTextField1.setText("Customer ID");
								jTextField1.setForeground(new Color(175,175,175));
							
								jComboBox2.setSelectedItem("3 Series");
							
								jTextField3.setText("Car Mileage");
								jTextField3.setForeground(new Color(175,175,175));
							
								jTextField4.setText("Car Age");
								jTextField4.setForeground(new Color(175,175,175));
							
								jDateChooser1.setDate(null);
								jDateChooser2.setDate(null);
							
								jComboBox1.setSelectedItem("BSI");
							
								jTextField7.setText("Insurance Number");
								jTextField7.setForeground(new Color(175,175,175));
							
								jDateChooser3.setDate(null);
									
							} catch (SQLException e) {
								e.printStackTrace();
							}
						}				
					}
					catch (Exception e){	
					}
				}
				else{
					JOptionPane.showMessageDialog(null,"Incorrect Format");
				}
			}
		}
		catch(Exception e){
		}	
        }//GEN-LAST:event_UpdateActionPerformed
	}

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
		String username=jLabel14.getText();
		new homepage(username).setVisible(true);
                setVisible(false);
        }//GEN-LAST:event_jButton2ActionPerformed

        private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                String username=jLabel14.getText();
                String customerid=jTextField1.getText();
		if (customerid.length() <=0 || customerid.equals("Customer ID")){
			JOptionPane.showMessageDialog(null,"Please enter a customer ID");	
		}
		else{
				
			try(Connection connnn = DriverManager.getConnection(DB_URL, USER, PASS);
					Statement stm = connnn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);	
					) { 
					String sq = "select * from cars"+username+" where customerID='"+customerid+"'";
                                        ResultSet rs1= stm.executeQuery(sq);
					if (!rs1.first()){
						JOptionPane.showMessageDialog(null,"Customer ID does not exist");
					}
					else{
			
		Update.setVisible(true);
                try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                        Statement stmt= conn.createStatement();
                ){
                        String sql = "select carmodel, carmileage, carage, dateofsale, lastservice, typeofservice, insurancenumber, insurancedate from cars"+username+" where customerID='"+customerid+"'";
                        ResultSet rs= stmt.executeQuery(sql);
                        while(rs.next()){
                                String carmodel=rs.getString("carmodel");
                                String carmileage=rs.getString("carmileage");
                                String carage=rs.getString("carage");
                                String dateofsale=rs.getString("dateofsale");
                                String typeof=rs.getString("typeofservice");
                                String lastservice=rs.getString("lastservice");
                                String insurancenumber=rs.getString("insurancenumber");
                                String insurancedate=rs.getString("insurancedate");
                                jTextField1.setText(customerid);
				jTextField1.setForeground(new Color(0,0,0));
				
                                jComboBox2.setSelectedItem(carmodel);
				
                                jTextField3.setText(carmileage);
				jTextField3.setForeground(new Color(0,0,0));
				
                                jTextField4.setText(carage);
				jTextField4.setForeground(new Color(0,0,0));
				
                                try{
				Date date = new SimpleDateFormat("dd-MM-yyyy").parse(dateofsale);
				jDateChooser1.setDate(date);
			         } 
				catch(Exception e){
				}
                                jComboBox1.setSelectedItem(typeof);
                                try{
				Date date = new SimpleDateFormat("dd-MM-yyyy").parse(lastservice);
				jDateChooser2.setDate(date);
			         } 
				catch(Exception e){
				}
				
                                jTextField7.setText(insurancenumber);
				jTextField7.setForeground(new Color(0,0,0));
				
                                try{
				Date date = new SimpleDateFormat("dd-MM-yyyy").parse(insurancedate);
				jDateChooser3.setDate(date);
			         } 
				catch(Exception e){
				}
                        }
                } catch (SQLException e) {
                        e.printStackTrace();
			JOptionPane.showMessageDialog(null,"Customer ID does not exist"); 
		}
					}
			}
			catch (SQLException e) {
					e.printStackTrace();
				}
		}
        }//GEN-LAST:event_jButton3ActionPerformed

        private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

                int a=JOptionPane.showConfirmDialog(null,"Are you sure you want to close?","Select",JOptionPane.YES_NO_OPTION);
                if(a==0){
                        System.exit(0);
                }
        }//GEN-LAST:event_jButton10ActionPerformed

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

        private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusGained
		if(jTextField3.getText().equals("Car Mileage")){
			jTextField3.setText("");
			jTextField3.setForeground(new Color(0,0,0));
		}
        }//GEN-LAST:event_jTextField3FocusGained

        private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost
		if(jTextField3.getText().equals("")){
			jTextField3.setText("Car Mileage");
			jTextField3.setForeground(new Color(175,175,175));
		}
        }//GEN-LAST:event_jTextField3FocusLost

        private void jTextField4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusGained
		if(jTextField4.getText().equals("Car Age")){
			jTextField4.setText("");
			jTextField4.setForeground(new Color(0,0,0));
		}
        }//GEN-LAST:event_jTextField4FocusGained

        private void jTextField4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusLost
		if(jTextField4.getText().equals("")){
			jTextField4.setText("Car Age");
			jTextField4.setForeground(new Color(175,175,175));
		}
        }//GEN-LAST:event_jTextField4FocusLost

        private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
                // TODO add your handling code here:
        }//GEN-LAST:event_formFocusGained

        private void jTextField7FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField7FocusGained
		if(jTextField7.getText().equals("Insurance Number")){
			jTextField7.setText("");
			jTextField7.setForeground(new Color(0,0,0));
		}
        }//GEN-LAST:event_jTextField7FocusGained

        private void jTextField7FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField7FocusLost
		if(jTextField7.getText().equals("")){
			jTextField7.setText("Insurance Number");
			jTextField7.setForeground(new Color(175,175,175));
		}
        }//GEN-LAST:event_jTextField7FocusLost

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
			java.util.logging.Logger.getLogger(Updatecardetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Updatecardetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Updatecardetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Updatecardetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Updatecardetails().setVisible(true);
			}
		});
	}
        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton Update;
        private javax.swing.JButton jButton10;
        private javax.swing.JButton jButton2;
        private javax.swing.JButton jButton3;
        private javax.swing.JComboBox<String> jComboBox1;
        private javax.swing.JComboBox<String> jComboBox2;
        private com.toedter.calendar.JDateChooser jDateChooser1;
        private com.toedter.calendar.JDateChooser jDateChooser2;
        private com.toedter.calendar.JDateChooser jDateChooser3;
        private javax.swing.JLabel jLabel13;
        private javax.swing.JLabel jLabel14;
        private javax.swing.JLabel jLabel15;
        private javax.swing.JLabel jLabel16;
        private javax.swing.JLabel jLabel17;
        private javax.swing.JLabel jLabel18;
        private javax.swing.JLabel jLabel19;
        private javax.swing.JLabel jLabel20;
        private javax.swing.JLabel jLabel21;
        private javax.swing.JLabel jLabel22;
        private javax.swing.JLabel jLabel23;
        private javax.swing.JLabel jLabel24;
        private javax.swing.JLabel jLabel25;
        private javax.swing.JTextField jTextField1;
        private javax.swing.JTextField jTextField3;
        private javax.swing.JTextField jTextField4;
        private javax.swing.JTextField jTextField7;
        // End of variables declaration//GEN-END:variables
}
