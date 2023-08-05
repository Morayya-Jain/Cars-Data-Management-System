/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pkgCS.IA;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
 
import javax.swing.JFileChooser;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class CarModels extends javax.swing.JFrame {
        static final String DB_URL = "jdbc:mysql://localhost/csia";
	static final String USER = "root";
	static final String PASS = "root@123";

	public CarModels() {
		initComponents();
	}

	public CarModels(String username) {
		initComponents();
		jLabel14.setText(username);
		jButton6.setVisible(false);
		jLabel3.setVisible(false);
		jTextField3.setVisible(false);
	}

	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jButton7 = new javax.swing.JButton();
                jScrollPane2 = new javax.swing.JScrollPane();
                jTable1 = new javax.swing.JTable();
                jLabel4 = new javax.swing.JLabel();
                jButton8 = new javax.swing.JButton();
                jLabel1 = new javax.swing.JLabel();
                jButton9 = new javax.swing.JButton();
                jLabel3 = new javax.swing.JLabel();
                jTextField3 = new javax.swing.JTextField();
                jButton6 = new javax.swing.JButton();
                jButton10 = new javax.swing.JButton();
                jComboBox1 = new javax.swing.JComboBox<>();
                jLabel14 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setUndecorated(true);

                jButton7.setBackground(new java.awt.Color(0, 255, 255));
                jButton7.setFont(new java.awt.Font("Telugu MN", 1, 15)); // NOI18N
                jButton7.setText("Enter");
                jButton7.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton7ActionPerformed(evt);
                        }
                });

                jTable1.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null, null, null}
                        },
                        new String [] {
                                "First Name", "Last Name", "Age", "Gender", "Hobbies", "Car Mileage"
                        }
                ));
                jScrollPane2.setViewportView(jTable1);

                jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
                jLabel4.setText("Car Models");

                jButton8.setBackground(new java.awt.Color(255, 0, 0));
                jButton8.setFont(new java.awt.Font("Kavivanar", 1, 13)); // NOI18N
                jButton8.setText("Back");
                jButton8.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton8ActionPerformed(evt);
                        }
                });

                jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                jLabel1.setText("Type of Car");

                jButton9.setBackground(new java.awt.Color(0, 0, 0));
                jButton9.setFont(new java.awt.Font("Kavivanar", 1, 13)); // NOI18N
                jButton9.setForeground(new java.awt.Color(255, 255, 255));
                jButton9.setText("Homepage");
                jButton9.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton9ActionPerformed(evt);
                        }
                });

                jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                jLabel3.setText("Name");

                jTextField3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

                jButton6.setBackground(new java.awt.Color(153, 255, 153));
                jButton6.setFont(new java.awt.Font("Kavivanar", 1, 13)); // NOI18N
                jButton6.setText("Generate PDF");
                jButton6.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton6ActionPerformed(evt);
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

                jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 Series", "5 Series", "6 Series", "7 Series", "Z4 M40i/S20i", "M Series", "X1", "X3", "X5", "X7" }));

                jLabel14.setFont(new java.awt.Font("Silom", 0, 13)); // NOI18N
                jLabel14.setText("Name");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addComponent(jLabel4))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(23, 23, 23)
                                                .addComponent(jButton7))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton6)))
                                .addGap(429, 429, 429))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addComponent(jLabel14))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(92, 92, 92)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1003, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 119, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(542, 542, 542)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(15, 15, 15)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel14)
                                .addGap(14, 14, 14)
                                .addComponent(jLabel4)
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton7)
                                        .addComponent(jLabel1)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(jButton8)
                                .addGap(18, 18, 18)
                                .addComponent(jButton9)
                                .addGap(18, 18, 18)
                                .addComponent(jButton10)
                                .addGap(39, 39, 39))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
		String username=jLabel14.getText();
		String user=username;
		jButton6.setVisible(true);
		jLabel3.setVisible(true);
		jTextField3.setVisible(true);
                String model=(String)jComboBox1.getSelectedItem();
                try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                        Statement stmt = conn.createStatement();
                ) {
			jTable1.setModel(new DefaultTableModel(null,new String []{"First Name","Last Name","Age","Gender","Hobbies","Car Mileage"}));
                        String sql = "select first_name, last_name, age, gender, hobbies, carmileage from customer"+user+", cars"+user+" where customer"+user+".customerID=cars"+user+".customerID and carmodel='"+model+"'";
                        ResultSet rs= stmt.executeQuery(sql);
                        while(rs.next()){
                                String first_name=rs.getString("first_name");
                                String last_name=rs.getString("last_name");
                                String age=rs.getString("age");
                                String gender=rs.getString("gender");
                                String hobbies=rs.getString("hobbies");
				String carmileage=rs.getString("carmileage");
                                String tbData[]={first_name,last_name,age,gender,hobbies,carmileage};
                                DefaultTableModel tblModel= (DefaultTableModel)jTable1.getModel();
                                tblModel.addRow(tbData);

                        }

                } catch (SQLException e) {
                        e.printStackTrace();
                }
        }//GEN-LAST:event_jButton7ActionPerformed

        private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
                String username=jLabel14.getText();
                setVisible(false);
                new Navigate(username).setVisible(true);
        }//GEN-LAST:event_jButton8ActionPerformed

        private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
		String username=jLabel14.getText();
                setVisible(false);
		new homepage(username).setVisible(true);
        }//GEN-LAST:event_jButton9ActionPerformed

        private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
                String type=(String)jComboBox1.getSelectedItem();
                String n=jTextField3.getText();
		if(n.length()<=0){
			JOptionPane.showMessageDialog(null,"Please enter a name");
		}
		else {
                String name="/"+n+"";
                String path="";
                JFileChooser j=new JFileChooser();
                j.setFileSelectionMode (JFileChooser.DIRECTORIES_ONLY);
                int x=j.showSaveDialog(this);
                if(x==JFileChooser.APPROVE_OPTION);
                {
                        path=j.getSelectedFile().getPath();
                }
                Document doc=new Document();
                try
                {
                        PdfWriter.getInstance(doc, new FileOutputStream(path+name+".pdf"));
                        doc.open();

                        Paragraph paragraph1 = new Paragraph("Table: Custom car models ("+type+")");

                        PdfPTable table1=new PdfPTable(6);

			table1.setWidthPercentage(105);
			table1.setSpacingBefore(11f);
			table1.setSpacingAfter(13f);
			
                        table1.addCell("First Name");
                        table1.addCell("Last Name");
                        table1.addCell("Age");
                        table1.addCell("Gender");
                        table1.addCell("Hobbies");
                        table1.addCell("Car Mileage");

                        for (int p=0;p<jTable1.getRowCount();p++)
                        {

                                String FFN=jTable1.getValueAt(p, 0).toString();
                                String GGN=jTable1.getValueAt(p, 1).toString();
                                String KKN=jTable1.getValueAt(p, 2).toString();
                                String LLN=jTable1.getValueAt(p, 3).toString();
                                String MMN=jTable1.getValueAt(p, 4).toString();
                                String NNN=jTable1.getValueAt(p, 5).toString();

                                table1.addCell(FFN);
                                table1.addCell(GGN);
                                table1.addCell(KKN);
                                table1.addCell(LLN);
                                table1.addCell(MMN);
                                table1.addCell(NNN);

                        }

                        doc.add(paragraph1);
                        doc.add(table1);
                        JOptionPane.showMessageDialog(null,"Successfully generated");
                }
                catch(Exception e){
                        JOptionPane.showMessageDialog(null,"Error");
                }
                doc.close();
		}
        }//GEN-LAST:event_jButton6ActionPerformed

        private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

                int a=JOptionPane.showConfirmDialog(null,"Are you sure you want to close?","Select",JOptionPane.YES_NO_OPTION);
                if(a==0){
                        System.exit(0);
                }
        }//GEN-LAST:event_jButton10ActionPerformed

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
			java.util.logging.Logger.getLogger(CarModels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(CarModels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(CarModels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(CarModels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new CarModels().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton jButton10;
        private javax.swing.JButton jButton6;
        private javax.swing.JButton jButton7;
        private javax.swing.JButton jButton8;
        private javax.swing.JButton jButton9;
        private javax.swing.JComboBox<String> jComboBox1;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel14;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JTable jTable1;
        private javax.swing.JTextField jTextField3;
        // End of variables declaration//GEN-END:variables
}
