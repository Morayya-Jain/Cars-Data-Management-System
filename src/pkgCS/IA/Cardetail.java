/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pkgCS.IA;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import static pkgCS.IA.Customerdetails.DB_URL;
import static pkgCS.IA.Customerdetails.PASS;
import static pkgCS.IA.Customerdetails.USER;

public class Cardetail extends javax.swing.JFrame {
	static final String DB_URL = "jdbc:mysql://localhost/csia";
	static final String USER = "root";
	static final String PASS = "root@123";

	public Cardetail() {
		initComponents();
	}

	public Cardetail(String username) {
		initComponents();
		jLabel14.setText(username);
	}

	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jButton1 = new javax.swing.JButton();
                jTextField1 = new javax.swing.JTextField();
                jTextField3 = new javax.swing.JTextField();
                jTextField4 = new javax.swing.JTextField();
                jComboBox1 = new javax.swing.JComboBox<>();
                jTextField7 = new javax.swing.JTextField();
                jButton2 = new javax.swing.JButton();
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

                jButton1.setBackground(new java.awt.Color(0, 255, 0));
                jButton1.setFont(new java.awt.Font("Kavivanar", 1, 13)); // NOI18N
                jButton1.setText("Save");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });

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

                jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
                jComboBox1.setForeground(new java.awt.Color(175, 175, 175));
                jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BSI", "BRI", "Other" }));

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

                jButton2.setBackground(new java.awt.Color(255, 0, 0));
                jButton2.setFont(new java.awt.Font("Kavivanar", 1, 13)); // NOI18N
                jButton2.setText("Back");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton2ActionPerformed(evt);
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
                jComboBox2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jComboBox2ActionPerformed(evt);
                        }
                });

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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(17, 17, 17)
                                                .addComponent(jLabel14))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(143, 143, 143)
                                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(143, 143, 143)
                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(143, 143, 143)
                                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(143, 143, 143)
                                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(143, 143, 143)
                                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(165, 165, 165)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(235, 235, 235)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(316, 316, 316)
                                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(143, 143, 143)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel16)
                                                                        .addComponent(jLabel17)))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(143, 143, 143)
                                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(112, 112, 112))
                                                        .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(173, 173, 173))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel14)
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel13))
                                                                .addGap(15, 15, 15)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel15))
                                                                .addGap(14, 14, 14)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel19))
                                                                .addGap(15, 15, 15)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel20))
                                                                .addGap(17, 17, 17)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel21)))
                                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(17, 17, 17)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel22)))
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel23))
                                                .addGap(15, 15, 15)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel24))
                                                .addGap(20, 20, 20)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel25)))
                                        .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton1)
                                        .addComponent(jButton2))
                                .addGap(18, 18, 18)
                                .addComponent(jButton10)
                                .addContainerGap(44, Short.MAX_VALUE))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
		if(jDateChooser1.getDate()==null || jDateChooser2.getDate()==null || jDateChooser3.getDate()==null){
			JOptionPane.showMessageDialog(null,"Please fill in all the details");
		}
		else{
		
                String username=jLabel14.getText();
                String customerid=jTextField1.getText();
                String carmodel=(String)jComboBox2.getSelectedItem();
                String carmileage=jTextField3.getText();
                String carage=jTextField4.getText();
		int c_age=Integer.parseInt(carage); 
                String typeof=(String)jComboBox1.getSelectedItem();
                String insurancenumber=jTextField7.getText();
                try{
			
			String dateofsale=(new java.text.SimpleDateFormat("dd-MM-yyyy")).format(jDateChooser1.getDate());
			String lastservice=(new java.text.SimpleDateFormat("dd-MM-yyyy")).format(jDateChooser2.getDate());
			String insurancedate=(new java.text.SimpleDateFormat("dd-MM-yyyy")).format(jDateChooser3.getDate());
			Date date1=jDateChooser1.getDate();
			Date date2=jDateChooser2.getDate();
			Date date3=jDateChooser3.getDate();
		
		if (customerid.equals("Customer ID") || customerid.length() <=0 || carmileage.length() <=0 || carmileage.equals("Car Mileage") || carage.length() <=0 || carage.equals("Car Age") || insurancenumber.length() <=0 || insurancenumber.equals("Insurance Number") || date1==null || date2==null || date3==null){
		
			JOptionPane.showMessageDialog(null,"Please fill in all the details");
		}
		else
		{
			if (carmileage.matches("[0-9]+") && carage.matches("[0-9]+") && carage.length() < 3 && c_age < 16 && c_age > 0){
                
                                try{
		
					SimpleDateFormat sdformat = new SimpleDateFormat("dd-MM-yyyy");
					Date d1 = sdformat.parse(dateofsale);
					Date d2 = sdformat.parse(lastservice);
					Date d3 = sdformat.parse(insurancedate);
					
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
					else {   
						
						try(Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
					Statement stm = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);	
					) { 
					String sq = "select * from cars"+username+" where customerID='"+customerid+"'";
                                        ResultSet rs= stm.executeQuery(sq);
					if (!rs.first()){
						
						try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			
							Statement stmt = conn.createStatement();
							) {
							String sql = "Insert INTO cars"+username+" VALUES('"+customerid+"','"+carmodel+"','"+carmileage+"','"+carage+"','"+dateofsale+"','"+lastservice+"','"+typeof+"','"+insurancenumber+"','"+insurancedate+"')";
							stmt.executeUpdate(sql);
							JOptionPane.showMessageDialog(null,"Successfully Added!");
							
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
			else{
				JOptionPane.showMessageDialog(null,"Invalid Data");
			}
		}	
		}	
		catch(Exception e){
			JOptionPane.showMessageDialog(null,"Please fill in all the details");
		}
        }//GEN-LAST:event_jButton1ActionPerformed
	}

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
		String username=jLabel14.getText();
		new homepage(username).setVisible(true);
                setVisible(false);
        }//GEN-LAST:event_jButton2ActionPerformed

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

        private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
		int a=JOptionPane.showConfirmDialog(null,"Are you sure you want to close?","Select",JOptionPane.YES_NO_OPTION);
                if(a==0){
                        System.exit(0);
                }
        }//GEN-LAST:event_jButton10ActionPerformed

        private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_jComboBox2ActionPerformed

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
			java.util.logging.Logger.getLogger(Cardetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Cardetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Cardetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Cardetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Cardetail().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton10;
        private javax.swing.JButton jButton2;
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
