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
import javax.swing.JOptionPane;
import java.time.*;  
import java.util.*; 
import static pkgCS.IA.Updatecustomerdetails.DB_URL;
import static pkgCS.IA.Updatecustomerdetails.PASS;
import static pkgCS.IA.Updatecustomerdetails.USER;

public class Deletecustomerdetails extends javax.swing.JFrame {
        static final String DB_URL = "jdbc:mysql://localhost/csia";
	static final String USER = "root";
	static final String PASS = "root@123";

	public Deletecustomerdetails() {
		initComponents();
	}
	public Deletecustomerdetails(String username) {
		initComponents();
		jLabel15.setBackground(Color.white);
		jLabel15.setOpaque(true);
		jLabel14.setText(username);
		Delete.setVisible(false);
		jLabel17.setBackground(Color.white);
		jLabel17.setOpaque(true);
		jLabel18.setBackground(Color.white);
		jLabel18.setOpaque(true);
		jLabel19.setBackground(Color.white);
		jLabel19.setOpaque(true);
		jLabel20.setBackground(Color.white);
		jLabel20.setOpaque(true);
		jLabel21.setBackground(Color.white);
		jLabel21.setOpaque(true);
		jLabel22.setBackground(Color.white);
		jLabel22.setOpaque(true);
		jLabel23.setBackground(Color.white);
		jLabel23.setOpaque(true);
		jLabel24.setBackground(Color.white);
		jLabel24.setOpaque(true);
		jLabel25.setBackground(Color.white);
		jLabel25.setOpaque(true);
		jLabel26.setBackground(Color.white);
		jLabel26.setOpaque(true);
	}

	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jButton2 = new javax.swing.JButton();
                Delete = new javax.swing.JButton();
                jButton3 = new javax.swing.JButton();
                jButton10 = new javax.swing.JButton();
                jLabel15 = new javax.swing.JLabel();
                jLabel14 = new javax.swing.JLabel();
                jLabel17 = new javax.swing.JLabel();
                jLabel18 = new javax.swing.JLabel();
                jLabel19 = new javax.swing.JLabel();
                jLabel20 = new javax.swing.JLabel();
                jLabel21 = new javax.swing.JLabel();
                jLabel22 = new javax.swing.JLabel();
                jLabel23 = new javax.swing.JLabel();
                jLabel24 = new javax.swing.JLabel();
                jLabel25 = new javax.swing.JLabel();
                jLabel26 = new javax.swing.JLabel();
                jTextField1 = new javax.swing.JTextField();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setUndecorated(true);

                jButton2.setBackground(new java.awt.Color(255, 0, 0));
                jButton2.setFont(new java.awt.Font("Kavivanar", 1, 13)); // NOI18N
                jButton2.setText("Back");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton2ActionPerformed(evt);
                        }
                });

                Delete.setBackground(new java.awt.Color(255, 102, 0));
                Delete.setFont(new java.awt.Font("Kavivanar", 1, 13)); // NOI18N
                Delete.setText("Delete");
                Delete.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                DeleteActionPerformed(evt);
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

                jLabel15.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
                jLabel15.setForeground(new java.awt.Color(175, 175, 175));
                jLabel15.setText(" Age");
                jLabel15.setPreferredSize(new java.awt.Dimension(111, 23));

                jLabel14.setFont(new java.awt.Font("Silom", 0, 13)); // NOI18N
                jLabel14.setText("Name");

                jLabel17.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
                jLabel17.setForeground(new java.awt.Color(175, 175, 175));
                jLabel17.setText(" First Name");
                jLabel17.setPreferredSize(new java.awt.Dimension(111, 23));

                jLabel18.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
                jLabel18.setForeground(new java.awt.Color(175, 175, 175));
                jLabel18.setText(" Last Name");
                jLabel18.setPreferredSize(new java.awt.Dimension(111, 23));

                jLabel19.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
                jLabel19.setForeground(new java.awt.Color(175, 175, 175));
                jLabel19.setText(" Date of Birth");
                jLabel19.setPreferredSize(new java.awt.Dimension(111, 23));

                jLabel20.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
                jLabel20.setForeground(new java.awt.Color(175, 175, 175));
                jLabel20.setText(" Gender");
                jLabel20.setPreferredSize(new java.awt.Dimension(111, 23));

                jLabel21.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
                jLabel21.setForeground(new java.awt.Color(175, 175, 175));
                jLabel21.setText(" Address");
                jLabel21.setPreferredSize(new java.awt.Dimension(111, 23));

                jLabel22.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
                jLabel22.setForeground(new java.awt.Color(175, 175, 175));
                jLabel22.setText(" Phone Number");
                jLabel22.setPreferredSize(new java.awt.Dimension(111, 23));

                jLabel23.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
                jLabel23.setForeground(new java.awt.Color(175, 175, 175));
                jLabel23.setText(" Mobile Number");
                jLabel23.setPreferredSize(new java.awt.Dimension(111, 23));

                jLabel24.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
                jLabel24.setForeground(new java.awt.Color(175, 175, 175));
                jLabel24.setText(" Driver Number");
                jLabel24.setPreferredSize(new java.awt.Dimension(111, 23));

                jLabel25.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
                jLabel25.setForeground(new java.awt.Color(175, 175, 175));
                jLabel25.setText(" Spouse Number");
                jLabel25.setPreferredSize(new java.awt.Dimension(111, 23));

                jLabel26.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
                jLabel26.setForeground(new java.awt.Color(175, 175, 175));
                jLabel26.setText(" Hobbies");
                jLabel26.setPreferredSize(new java.awt.Dimension(111, 23));

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

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel14)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(193, 193, 193)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 227, Short.MAX_VALUE)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField1))
                                .addGap(31, 31, 31)
                                .addComponent(jButton3)
                                .addGap(145, 145, 145))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(351, 351, 351)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel14)
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton3)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Delete)
                                        .addComponent(jButton2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton10)
                                .addContainerGap(41, Short.MAX_VALUE))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
		String username=jLabel14.getText();
                new homepage(username).setVisible(true);
                setVisible(false);
        }//GEN-LAST:event_jButton2ActionPerformed

        private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
                String username=jLabel14.getText();
                String cust=jTextField1.getText();
                try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                        Statement stmt = conn.createStatement();
                ) {
                        String sql = "delete from customer"+username+" where customerID='"+cust+"'";
			int x=JOptionPane.showConfirmDialog(null,"Are you sure you want to delete","Select",JOptionPane.YES_NO_OPTION);
                        if(x==0){
                        stmt.executeUpdate(sql);
                        JOptionPane.showMessageDialog(null,"Successfully deleted!");
			jTextField1.setText("Customer ID");	
			jTextField1.setForeground(new Color(175,175,175));
					
			jLabel17.setText(" First Name");
			jLabel17.setForeground(new Color(175,175,175));
					
			jLabel18.setText(" Last Name");
			jLabel18.setForeground(new Color(175,175,175));
					
			jLabel19.setText(" Date of Birth");
			jLabel19.setForeground(new Color(175,175,175));
					
			jLabel15.setText(" Age Date of Birth");
			jLabel15.setForeground(new Color(175,175,175));
					
			jLabel20.setText(" Female");
			jLabel20.setForeground(new Color(175,175,175));	
			
			jLabel21.setText(" Address");
			jLabel21.setForeground(new Color(175,175,175));
					
			jLabel22.setText(" Phone Number");
			jLabel22.setForeground(new Color(175,175,175));
					
			jLabel23.setText(" Mobile Number");
			jLabel23.setForeground(new Color(175,175,175));
					
			jLabel24.setText(" Driver Number");
			jLabel24.setForeground(new Color(175,175,175));
					
	        	jLabel25.setText(" Spouse Name");
			jLabel25.setForeground(new Color(175,175,175));
					
			jLabel26.setText(" Hobbies");
			jLabel26.setForeground(new Color(175,175,175));
                }
                    

                } catch (SQLException e) {
                        e.printStackTrace();
			JOptionPane.showMessageDialog(null,"Customer ID does not exist");
                }
        }//GEN-LAST:event_DeleteActionPerformed

        private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
               String username=jLabel14.getText();
	       String customerID=jTextField1.getText();
	       int c_ID=Integer.parseInt(customerID);  
	       if (customerID.length() <=0 || customerID.equals("Customer ID")){
			JOptionPane.showMessageDialog(null,"Please enter a customer ID");	
		}
	       
		else{
	
		       try(Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
					Statement stm = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);	
					) { 
					String sq = "select * from customer"+username+" where customerID='"+c_ID+"'";
                                        ResultSet rs1= stm.executeQuery(sq);
					if (!rs1.first()){
						JOptionPane.showMessageDialog(null,"Customer ID does not exist");
					}
					else{
		       
		Delete.setVisible(true);
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
			 
				jLabel17.setText(" "+first_name);
				jLabel17.setForeground(new Color(0,0,0));
			 
				jLabel18.setText(" "+last_name);
				jLabel18.setForeground(new Color(0,0,0));
			 
				jLabel15.setText(" "+age);
				jLabel15.setForeground(new Color(0,0,0));
			 
				jLabel19.setText(" "+dateofbirth);
				jLabel19.setForeground(new Color(0,0,0));
				
				jLabel20.setText(" "+gender);
				jLabel20.setForeground(new Color(0,0,0));
			 
				jLabel21.setText(" "+address);
				jLabel21.setForeground(new Color(0,0,0));
			 
				jLabel22.setText(" "+phone_number);
				jLabel22.setForeground(new Color(0,0,0));
			 
				jLabel23.setText(" "+mobile_number);
				jLabel23.setForeground(new Color(0,0,0));
			 
				jLabel24.setText(" "+driver_number);
				jLabel24.setForeground(new Color(0,0,0));
			 
				jLabel25.setText(" "+spouse_name);
				jLabel25.setForeground(new Color(0,0,0));
			 
				jLabel26.setText(" "+hobbies);
				jLabel26.setForeground(new Color(0,0,0));
                        }

                } catch (SQLException e) {
                        e.printStackTrace();
                }               
					}
		       }
		      catch (SQLException e) {
                        e.printStackTrace();
                }  
        }//GEN-LAST:event_jButton3ActionPerformed
	}

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
			java.util.logging.Logger.getLogger(Deletecustomerdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Deletecustomerdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Deletecustomerdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Deletecustomerdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Deletecustomerdetails().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton Delete;
        private javax.swing.JButton jButton10;
        private javax.swing.JButton jButton2;
        private javax.swing.JButton jButton3;
        private javax.swing.JLabel jLabel14;
        private javax.swing.JLabel jLabel15;
        private javax.swing.JLabel jLabel17;
        private javax.swing.JLabel jLabel18;
        private javax.swing.JLabel jLabel19;
        private javax.swing.JLabel jLabel20;
        private javax.swing.JLabel jLabel21;
        private javax.swing.JLabel jLabel22;
        private javax.swing.JLabel jLabel23;
        private javax.swing.JLabel jLabel24;
        private javax.swing.JLabel jLabel25;
        private javax.swing.JLabel jLabel26;
        private javax.swing.JTextField jTextField1;
        // End of variables declaration//GEN-END:variables
}
