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
import java.util.Date;
import static pkgCS.IA.Updatecardetails.DB_URL;
import static pkgCS.IA.Updatecardetails.PASS;
import static pkgCS.IA.Updatecardetails.USER;

public class Deletecardetails extends javax.swing.JFrame {
        static final String DB_URL = "jdbc:mysql://localhost/csia";
	static final String USER = "root";
	static final String PASS = "root@123";

	public Deletecardetails() {
		initComponents();
	}
	public Deletecardetails(String username) {
		initComponents();
		jLabel14.setText(username);
		jLabel15.setBackground(Color.white);
		jLabel15.setOpaque(true);
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
		
	}

	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jButton2 = new javax.swing.JButton();
                jButton3 = new javax.swing.JButton();
                Delete = new javax.swing.JButton();
                jButton10 = new javax.swing.JButton();
                jLabel14 = new javax.swing.JLabel();
                jLabel23 = new javax.swing.JLabel();
                jLabel15 = new javax.swing.JLabel();
                jTextField1 = new javax.swing.JTextField();
                jLabel17 = new javax.swing.JLabel();
                jLabel18 = new javax.swing.JLabel();
                jLabel19 = new javax.swing.JLabel();
                jLabel20 = new javax.swing.JLabel();
                jLabel21 = new javax.swing.JLabel();
                jLabel22 = new javax.swing.JLabel();

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

                jButton3.setBackground(new java.awt.Color(0, 255, 255));
                jButton3.setFont(new java.awt.Font("Kavivanar", 1, 13)); // NOI18N
                jButton3.setText("Search");
                jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton3ActionPerformed(evt);
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

                jButton10.setFont(new java.awt.Font("Kavivanar", 1, 13)); // NOI18N
                jButton10.setText("EXIT");
                jButton10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
                jButton10.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton10ActionPerformed(evt);
                        }
                });

                jLabel14.setFont(new java.awt.Font("Silom", 0, 13)); // NOI18N
                jLabel14.setText("Name");

                jLabel23.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
                jLabel23.setForeground(new java.awt.Color(175, 175, 175));
                jLabel23.setText(" Insurance Date");
                jLabel23.setPreferredSize(new java.awt.Dimension(111, 23));

                jLabel15.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
                jLabel15.setForeground(new java.awt.Color(175, 175, 175));
                jLabel15.setText(" Date of Sale");
                jLabel15.setPreferredSize(new java.awt.Dimension(111, 23));

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

                jLabel17.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
                jLabel17.setForeground(new java.awt.Color(175, 175, 175));
                jLabel17.setText(" Car Model");
                jLabel17.setPreferredSize(new java.awt.Dimension(111, 23));

                jLabel18.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
                jLabel18.setForeground(new java.awt.Color(175, 175, 175));
                jLabel18.setText(" Car Mileage");
                jLabel18.setPreferredSize(new java.awt.Dimension(111, 23));

                jLabel19.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
                jLabel19.setForeground(new java.awt.Color(175, 175, 175));
                jLabel19.setText(" Car Age");
                jLabel19.setPreferredSize(new java.awt.Dimension(111, 23));

                jLabel20.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
                jLabel20.setForeground(new java.awt.Color(175, 175, 175));
                jLabel20.setText(" Last Service");
                jLabel20.setPreferredSize(new java.awt.Dimension(111, 23));

                jLabel21.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
                jLabel21.setForeground(new java.awt.Color(175, 175, 175));
                jLabel21.setText(" Insurance Type");
                jLabel21.setPreferredSize(new java.awt.Dimension(111, 23));

                jLabel22.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
                jLabel22.setForeground(new java.awt.Color(175, 175, 175));
                jLabel22.setText(" Insurance Number");
                jLabel22.setPreferredSize(new java.awt.Dimension(111, 23));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(39, 39, 39)
                                .addComponent(jButton3)
                                .addGap(111, 111, 111))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addComponent(jLabel14))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(315, 315, 315)
                                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton3))
                                .addGap(14, 14, 14)
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
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Delete)
                                        .addComponent(jButton2))
                                .addGap(18, 18, 18)
                                .addComponent(jButton10)
                                .addGap(51, 51, 51))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

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
				
                Delete.setVisible(true);
                try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                        Statement stmt= conn.createStatement();
                ) {
                        String sql = "select carmodel, carmileage, carage, dateofsale, lastservice, typeofservice, insurancenumber, insurancedate from cars"+username+" where customerID='"+customerid+"'";
                        ResultSet rs= stmt.executeQuery(sql);
                        while(rs.next()){
                                String carmodel=rs.getString("carmodel");
                                String carmileage=rs.getString("carmileage");
                                String carage=rs.getString("carage");
                                String dateofsale=rs.getString("dateofsale");
				String lastservice=rs.getString("lastservice");
                                String typeof=rs.getString("typeofservice");
                                String insurancenumber=rs.getString("insurancenumber");
                                String insurancedate=rs.getString("insurancedate");
                                jTextField1.setText(customerid);
				jTextField1.setForeground(new Color(0,0,0));
				
                                jLabel17.setText(" "+carmodel);
				jLabel17.setForeground(new Color(0,0,0));
				
                                jLabel18.setText(" "+carmileage);
                                jLabel18.setForeground(new Color(0,0,0));
                                
				jLabel19.setText(" "+carage);
				jLabel19.setForeground(new Color(0,0,0));	
			  
                                jLabel15.setText(" "+dateofsale);
				jLabel15.setForeground(new Color(0,0,0));
				
                                jLabel20.setText(" "+lastservice);
				jLabel20.setForeground(new Color(0,0,0));
				
                                jLabel21.setText(" "+typeof);
				jLabel21.setForeground(new Color(0,0,0));
				
				jLabel22.setText(" "+insurancenumber);
				jLabel22.setForeground(new Color(0,0,0));
                                
				jLabel23.setText(" "+insurancedate);
				jLabel23.setForeground(new Color(0,0,0));		
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

        private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
                String username=jLabel14.getText();
                String cust=jTextField1.getText();
                try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                        Statement stmt = conn.createStatement();
                ) {
                        String sql = "delete from cars"+username+" where customerID='"+cust+"'";
                        int x=JOptionPane.showConfirmDialog(null,"Are you sure you want to delete","Select",JOptionPane.YES_NO_OPTION);
                        if(x==0){
                                stmt.executeUpdate(sql);
                                JOptionPane.showMessageDialog(null,"Successfully deleted!");
				jTextField1.setText("Customer ID");
				jTextField1.setForeground(new Color(175,175,175));
				
				jLabel17.setText(" Car Model");
				jLabel17.setForeground(new Color(175,175,175));
				
                                jLabel18.setText(" Car Mileage");
                                jLabel18.setForeground(new Color(175,175,175));
                                
				jLabel19.setText(" Car Age");
				jLabel19.setForeground(new Color(175,175,175));	
			  
                                jLabel15.setText(" Date of Sale");
				jLabel15.setForeground(new Color(175,175,175));
				
                                jLabel20.setText(" Last Service");
				jLabel20.setForeground(new Color(175,175,175));
				
                                jLabel21.setText(" Insurance Type");
				jLabel21.setForeground(new Color(175,175,175));
				
				jLabel22.setText(" Insurance Number");
				jLabel22.setForeground(new Color(175,175,175));
                                
				jLabel23.setText(" Insurance Date");
				jLabel23.setForeground(new Color(175,175,175));
                        }

                } catch (SQLException e) {
                        e.printStackTrace();
			JOptionPane.showMessageDialog(null,"Customer ID does not exist");
                }

        }//GEN-LAST:event_DeleteActionPerformed

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
			java.util.logging.Logger.getLogger(Deletecardetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Deletecardetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Deletecardetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Deletecardetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Deletecardetails().setVisible(true);
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
        private javax.swing.JTextField jTextField1;
        // End of variables declaration//GEN-END:variables
}
