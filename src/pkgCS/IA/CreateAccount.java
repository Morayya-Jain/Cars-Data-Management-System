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
import static pkgCS.IA.Customerdetails.DB_URL;
import static pkgCS.IA.Customerdetails.PASS;
import static pkgCS.IA.Customerdetails.USER;

public class CreateAccount extends javax.swing.JFrame {
        static final String DB_URL = "jdbc:mysql://localhost/csia";
	static final String USER = "root";
	static final String PASS = "root@123";
	
	public CreateAccount() {
		initComponents();
		jPasswordField1.setEchoChar((char)0);
	}
	
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jLabel2 = new javax.swing.JLabel();
                jPasswordField1 = new javax.swing.JPasswordField();
                jTextField3 = new javax.swing.JTextField();
                jButton1 = new javax.swing.JButton();
                jButton2 = new javax.swing.JButton();
                jTextField1 = new javax.swing.JTextField();
                jTextField4 = new javax.swing.JTextField();
                jTextField2 = new javax.swing.JTextField();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setUndecorated(true);

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));
                jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

                jLabel2.setFont(new java.awt.Font("Telugu MN", 0, 50)); // NOI18N
                jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel2.setText("Registration");

                jPasswordField1.setFont(new java.awt.Font("Telugu MN", 1, 14)); // NOI18N
                jPasswordField1.setForeground(new java.awt.Color(153, 153, 153));
                jPasswordField1.setText("Password");
                jPasswordField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
                jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
                        public void focusGained(java.awt.event.FocusEvent evt) {
                                jPasswordField1FocusGained(evt);
                        }
                        public void focusLost(java.awt.event.FocusEvent evt) {
                                jPasswordField1FocusLost(evt);
                        }
                });
                jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jPasswordField1ActionPerformed(evt);
                        }
                });

                jTextField3.setFont(new java.awt.Font("Telugu MN", 1, 14)); // NOI18N
                jTextField3.setForeground(new java.awt.Color(153, 153, 153));
                jTextField3.setText("Username");
                jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
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

                jButton1.setBackground(new java.awt.Color(7, 106, 251));
                jButton1.setFont(new java.awt.Font("Kavivanar", 1, 13)); // NOI18N
                jButton1.setForeground(new java.awt.Color(255, 255, 255));
                jButton1.setText("CREATE ");
                jButton1.setBorder(null);
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });

                jButton2.setBackground(new java.awt.Color(255, 0, 0));
                jButton2.setFont(new java.awt.Font("Kavivanar", 1, 13)); // NOI18N
                jButton2.setForeground(new java.awt.Color(255, 255, 255));
                jButton2.setText("BACK");
                jButton2.setBorder(null);
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton2ActionPerformed(evt);
                        }
                });

                jTextField1.setFont(new java.awt.Font("Telugu MN", 1, 14)); // NOI18N
                jTextField1.setForeground(new java.awt.Color(153, 153, 153));
                jTextField1.setText("First Name");
                jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
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

                jTextField4.setFont(new java.awt.Font("Telugu MN", 1, 14)); // NOI18N
                jTextField4.setForeground(new java.awt.Color(153, 153, 153));
                jTextField4.setText("Contact Number");
                jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
                jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
                        public void focusGained(java.awt.event.FocusEvent evt) {
                                jTextField4FocusGained(evt);
                        }
                        public void focusLost(java.awt.event.FocusEvent evt) {
                                jTextField4FocusLost(evt);
                        }
                });
                jTextField4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextField4ActionPerformed(evt);
                        }
                });

                jTextField2.setFont(new java.awt.Font("Telugu MN", 1, 14)); // NOI18N
                jTextField2.setForeground(new java.awt.Color(153, 153, 153));
                jTextField2.setText("Last Name");
                jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
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

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jPasswordField1, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jTextField2)
                                                        .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(98, 98, 98)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(151, 151, 151)
                                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)))
                                .addGap(97, 97, 97))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel2)
                                .addGap(40, 40, 40)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(34, Short.MAX_VALUE))
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(78, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(36, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
                // TODO add your handling code heret
        }//GEN-LAST:event_jPasswordField1ActionPerformed

        private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_jTextField3ActionPerformed

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
		String first_name=jTextField1.getText();
                String last_name=jTextField2.getText();
		String username=jTextField3.getText();
		String password=jPasswordField1.getText();
		String contactnum=jTextField4.getText();	
		boolean result1 = first_name.matches("[a-zA-Z]+");
		boolean result2 = last_name.matches("[a-zA-Z]+");
                	
		if (first_name.length() <=0 || last_name.length() <=0 || username.length() <=0 || password.length() <=0 || contactnum.length() <=0 || first_name.equals("First Name") || last_name.equals("Last Name") || username.equals("Username")  || password.equals("Password")  || contactnum.equals("Contact Number") ){
		
			JOptionPane.showMessageDialog(null,"Please fill in all the details");
		}	
		else{
			
			if(result1 && result2 && contactnum.matches("[0-9]+") && contactnum.length() <= 15 && contactnum.length() >= 10){
				
				if(password.matches("[a-zA-Z]+")){
					JOptionPane.showMessageDialog(null,"Password must have atleast one number");
				}
				else       {
					try(Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
					Statement stm = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);	
					) { 
					String sq = "select * from login where username='"+username+"'";
                                        ResultSet rs= stm.executeQuery(sq);
					if (!rs.first()){
					
		try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                        Statement stmt = conn.createStatement();
                )
		{
                        String sqql="insert into login values('"+first_name+"','"+last_name+"','"+username+"','"+password+"','"+contactnum+"')";
                        stmt.executeUpdate(sqql);
                        JOptionPane.showMessageDialog(null,"Successfully Created!");
			setVisible(false);
			new loginpage().setVisible(true);
			
                } catch (SQLException e) {
                        e.printStackTrace();
		}
		
		try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                        Statement sttmt = conn.createStatement();
                )
		{
                        String sql="create table customer"+username+"(customerID int(10) primary key, first_name varchar(100), last_name varchar(100), dateofbirth varchar(10), age varchar(3), gender varchar(10), address varchar(100), phone_number varchar(50), mobile_number varchar(50), driver_number varchar(50), spouse_name varchar(100), hobbies varchar(100))";
                        sttmt.executeUpdate(sql);
			
                } catch (SQLException e) {
                        e.printStackTrace();
		}

		try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                        Statement stttmt = conn.createStatement();
                )
		{
                        String sql2="create table cars"+username+"(customerID int(10) primary key, carmodel varchar(20), carmileage varchar(20), carage varchar(10), dateofsale varchar(20), lastservice varchar(10), typeofservice varchar(10), insurancenumber varchar(100), insurancedate varchar(10))";
                        stttmt.executeUpdate(sql2);
			
                } catch (SQLException e) {
                        e.printStackTrace();
		}
		}
					else{
						JOptionPane.showMessageDialog(null,"Username already exists");
					}
					}
					catch (SQLException e) {
					e.printStackTrace();
					}	
				}	
			}
			else {
				JOptionPane.showMessageDialog(null,"Incorrect data format");
				
			}	
			
		}
        }//GEN-LAST:event_jButton1ActionPerformed

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

                int a=JOptionPane.showConfirmDialog(null,"Are you sure you want to close?","Select",JOptionPane.YES_NO_OPTION);
                if(a==0){
                        setVisible(false);
			new loginpage().setVisible(true);
                }
        }//GEN-LAST:event_jButton2ActionPerformed

        private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_jTextField1ActionPerformed

        private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_jTextField4ActionPerformed

        private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_jTextField2ActionPerformed

        private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
		if(jTextField1.getText().equals("First Name")){
			jTextField1.setText("");
			jTextField1.setForeground(new Color(0,0,0));
		}
        }//GEN-LAST:event_jTextField1FocusGained

        private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
                if(jTextField1.getText().equals("")){
			jTextField1.setText("First Name");
			jTextField1.setForeground(new Color(153,153,153));
		}
        }//GEN-LAST:event_jTextField1FocusLost

        private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
		if(jTextField2.getText().equals("Last Name")){
			jTextField2.setText("");
			jTextField2.setForeground(new Color(0,0,0));
		}
        }//GEN-LAST:event_jTextField2FocusGained

        private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
		if(jTextField2.getText().equals("")){
			jTextField2.setText("Last Name");
			jTextField2.setForeground(new Color(153,153,153));
		}
        }//GEN-LAST:event_jTextField2FocusLost

        private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusGained
		if(jTextField3.getText().equals("Username")){
			jTextField3.setText("");
			jTextField3.setForeground(new Color(0,0,0));
		}
        }//GEN-LAST:event_jTextField3FocusGained

        private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost
		if(jTextField3.getText().equals("")){
			jTextField3.setText("Username");
			jTextField3.setForeground(new Color(153,153,153));
		}
                // TODO add your handling code here:
        }//GEN-LAST:event_jTextField3FocusLost

        private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusGained
		if(jPasswordField1.getText().equals("Password")){
                        jPasswordField1.setText("");
                        jPasswordField1.setForeground(new Color(0,0,0));
                        jPasswordField1.setEchoChar('*');
                }
        }//GEN-LAST:event_jPasswordField1FocusGained

        private void jPasswordField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusLost
		if(jPasswordField1.getText().equals("")){
                        jPasswordField1.setText("Password");
                        jPasswordField1.setForeground(new Color(153,153,153));
                        jPasswordField1.setEchoChar((char)0);
                }
        }//GEN-LAST:event_jPasswordField1FocusLost

        private void jTextField4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusGained
		if(jTextField4.getText().equals("Contact Number")){
			jTextField4.setText("");
			jTextField4.setForeground(new Color(0,0,0));
		}
        }//GEN-LAST:event_jTextField4FocusGained

        private void jTextField4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusLost
		if(jTextField4.getText().equals("")){
			jTextField4.setText("Contact Number");
			jTextField4.setForeground(new Color(153,153,153));
		}
        }//GEN-LAST:event_jTextField4FocusLost

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
			java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new CreateAccount().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPasswordField jPasswordField1;
        private javax.swing.JTextField jTextField1;
        private javax.swing.JTextField jTextField2;
        private javax.swing.JTextField jTextField3;
        private javax.swing.JTextField jTextField4;
        // End of variables declaration//GEN-END:variables
}
