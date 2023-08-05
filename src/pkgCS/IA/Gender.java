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

public class Gender extends javax.swing.JFrame {
        static final String DB_URL = "jdbc:mysql://localhost/csia";
	static final String USER = "root";
	static final String PASS = "root@123";
	
	public Gender() {
		initComponents();
	}

	public Gender(String username) {
		initComponents();
		jLabel14.setText(username);
	}

	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jButton2 = new javax.swing.JButton();
                jButton7 = new javax.swing.JButton();
                jLabel4 = new javax.swing.JLabel();
                jScrollPane2 = new javax.swing.JScrollPane();
                jTable1 = new javax.swing.JTable();
                jButton4 = new javax.swing.JButton();
                jButton1 = new javax.swing.JButton();
                jScrollPane3 = new javax.swing.JScrollPane();
                jTable2 = new javax.swing.JTable();
                jLabel1 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jTextField3 = new javax.swing.JTextField();
                jButton6 = new javax.swing.JButton();
                jButton14 = new javax.swing.JButton();
                jLabel14 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setUndecorated(true);

                jButton2.setBackground(new java.awt.Color(255, 153, 51));
                jButton2.setFont(new java.awt.Font("Mukta", 0, 14)); // NOI18N
                jButton2.setText("Females");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton2ActionPerformed(evt);
                        }
                });

                jButton7.setBackground(new java.awt.Color(0, 0, 0));
                jButton7.setFont(new java.awt.Font("Kavivanar", 1, 13)); // NOI18N
                jButton7.setForeground(new java.awt.Color(255, 255, 255));
                jButton7.setText("Homepage");
                jButton7.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton7ActionPerformed(evt);
                        }
                });

                jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 45)); // NOI18N
                jLabel4.setText("Gender");

                jTable1.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null, null, null}
                        },
                        new String [] {
                                "First Name", "Last Name", "Age", "Car Model", "Spouse Name", "Hobbies"
                        }
                ));
                jScrollPane2.setViewportView(jTable1);

                jButton4.setBackground(new java.awt.Color(255, 0, 0));
                jButton4.setFont(new java.awt.Font("Kavivanar", 1, 13)); // NOI18N
                jButton4.setText("Back");
                jButton4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton4ActionPerformed(evt);
                        }
                });

                jButton1.setBackground(new java.awt.Color(255, 153, 51));
                jButton1.setFont(new java.awt.Font("Mukta", 0, 14)); // NOI18N
                jButton1.setText("Males");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });

                jTable2.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null, null, null}
                        },
                        new String [] {
                                "First Name", "Last Name", "Age", "Car Model", "Spouse Name", "Hobbies"
                        }
                ));
                jScrollPane3.setViewportView(jTable2);

                jLabel1.setBackground(new java.awt.Color(255, 255, 255));
                jLabel1.setFont(new java.awt.Font("Telugu MN", 1, 23)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(0, 0, 153));
                jLabel1.setText("=");

                jLabel5.setBackground(new java.awt.Color(255, 255, 255));
                jLabel5.setFont(new java.awt.Font("Telugu MN", 1, 21)); // NOI18N
                jLabel5.setForeground(new java.awt.Color(0, 0, 153));
                jLabel5.setText("Customers");

                jLabel3.setBackground(new java.awt.Color(255, 255, 255));
                jLabel3.setFont(new java.awt.Font("Telugu MN", 1, 21)); // NOI18N
                jLabel3.setForeground(new java.awt.Color(0, 0, 153));
                jLabel3.setText("Customers");

                jLabel2.setBackground(new java.awt.Color(255, 255, 255));
                jLabel2.setFont(new java.awt.Font("Telugu MN", 1, 23)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(0, 0, 153));
                jLabel2.setText("=");

                jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                jLabel6.setText("Name");

                jTextField3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

                jButton6.setBackground(new java.awt.Color(153, 255, 153));
                jButton6.setFont(new java.awt.Font("Kavivanar", 1, 13)); // NOI18N
                jButton6.setText("Generate PDF");
                jButton6.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton6ActionPerformed(evt);
                        }
                });

                jButton14.setFont(new java.awt.Font("Kavivanar", 1, 13)); // NOI18N
                jButton14.setText("EXIT");
                jButton14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
                jButton14.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton14ActionPerformed(evt);
                        }
                });

                jLabel14.setFont(new java.awt.Font("Silom", 0, 13)); // NOI18N
                jLabel14.setText("Name");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 893, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 893, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton1)
                                        .addComponent(jButton2))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(17, 17, 17))
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(67, 67, 67))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jButton4)
                                                .addGap(140, 140, 140)
                                                .addComponent(jButton7)
                                                .addGap(487, 487, 487))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton6)
                                                .addGap(470, 470, 470))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(598, 598, 598))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(571, 571, 571))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addComponent(jLabel4))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addComponent(jLabel14)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jButton1))
                                                .addGap(125, 125, 125)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButton2)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3))
                                                .addGap(152, 152, 152))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(62, 62, 62)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel6)
                                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(36, 36, 36)
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(46, 46, 46)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButton7)
                                                        .addComponent(jButton4))
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton14)))
                                .addGap(48, 48, 48))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
		String username=jLabel14.getText();
		String user=username;
                try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                        Statement stmt = conn.createStatement();
                ) {
			jTable2.setModel(new DefaultTableModel(null,new String []{"First Name","Last Name","Age","Car Model","Spouse Name","Hobbies"}));
                        String sql = "select first_name, last_name, age, carmodel, spouse_name, hobbies from customer"+user+", cars"+user+" where customer"+user+".customerID=cars"+user+".customerID and gender='Female'";
                        ResultSet rs= stmt.executeQuery(sql);
                        while(rs.next()){
                                String first_name=rs.getString("first_name");
                                String last_name=rs.getString("last_name");
                                String age=rs.getString("age");
                                String carmodel=rs.getString("carmodel");
				String spouse_name=rs.getString("spouse_name");
				String hobbies=rs.getString("hobbies");
                                String tbData[]={first_name,last_name,age,carmodel,spouse_name,hobbies};
                                DefaultTableModel tblModel= (DefaultTableModel)jTable2.getModel();
                                tblModel.addRow(tbData);

                        }

                } catch (SQLException e) {
                        e.printStackTrace();
                }

		jLabel3.setVisible(true);
		try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                        Statement sttmt = conn.createStatement();
                ) {
                        String sqql = "select count(*) from customer"+user+", cars"+user+" where customer"+user+".customerID=cars"+user+".customerID and gender='Female'";
                        ResultSet rss= sttmt.executeQuery(sqql);
                        while(rss.next()){
                                String countt=rss.getString("count(*)");
                                jLabel2.setText(countt);
				int gcount=Integer.parseInt(countt);
				if (gcount==1){
					jLabel3.setText("Customer");
				}
                        }

                } catch (SQLException e) {
                        e.printStackTrace();
		}
        }//GEN-LAST:event_jButton2ActionPerformed

        private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
		String username=jLabel14.getText();
                setVisible(false);
                new homepage(username).setVisible(true);
        }//GEN-LAST:event_jButton7ActionPerformed

        private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
                String username=jLabel14.getText();
                setVisible(false);
                new Navigate(username).setVisible(true);
        }//GEN-LAST:event_jButton4ActionPerformed

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

		String username=jLabel14.getText();
		String user=username;
                try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                        Statement stmt = conn.createStatement();
                ) {
			jTable1.setModel(new DefaultTableModel(null,new String []{"First Name","Last Name","Age","Car Model","Spouse Name","Hobbies"}));
                        String sql = "select first_name, last_name, age, carmodel,spouse_name,hobbies from customer"+user+", cars"+user+" where customer"+user+".customerID=cars"+user+".customerID and gender='Male'";
                        ResultSet rs= stmt.executeQuery(sql);
                        while(rs.next()){
                                String first_name=rs.getString("first_name");
                                String last_name=rs.getString("last_name");
                                String age=rs.getString("age");
                                String carmodel=rs.getString("carmodel");
				String spouse_name=rs.getString("spouse_name");
				String hobbies=rs.getString("hobbies");
                                String tbData[]={first_name,last_name,age,carmodel,spouse_name,hobbies};
                                DefaultTableModel tblModel= (DefaultTableModel)jTable1.getModel();
                                tblModel.addRow(tbData);

                        }

                } catch (SQLException e) {
                        e.printStackTrace();
                }

		jLabel5.setVisible(true);
                try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                        Statement sttmt = conn.createStatement();
                ) {
                        String sqql = "select count(*) from customer"+user+", cars"+user+" where customer"+user+".customerID=cars"+user+".customerID and gender='Male'";
                        ResultSet rss= sttmt.executeQuery(sqql);
                        while(rss.next()){
                                String countt=rss.getString("count(*)");
                                jLabel1.setText(countt);
				int gcount=Integer.parseInt(countt);
				if (gcount==1){
					jLabel5.setText("Customer");
				}
                        }

                } catch (SQLException e) {
                        e.printStackTrace();
                }
        }//GEN-LAST:event_jButton1ActionPerformed

        private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
		String male=jLabel1.getText();
		String female=jLabel2.getText();
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

                        Paragraph paragraph1 = new Paragraph("Table: Male Customers (total="+male+")");
			Paragraph paragraph2 = new Paragraph("Table: Female Customers (total="+female+")");

                        PdfPTable table1=new PdfPTable(6);

			table1.setWidthPercentage(105);
			table1.setSpacingBefore(11f);
			table1.setSpacingAfter(13f);
			paragraph2.setSpacingBefore(11f);
			
                        table1.addCell("First Name");
                        table1.addCell("Last Name");
                        table1.addCell("Age");
                        table1.addCell("Car Model");
                        table1.addCell("Spouse Name");
			table1.addCell("Hobbies");

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

			PdfPTable table2=new PdfPTable(6);
			
                        table2.setWidthPercentage(105);
			table2.setSpacingBefore(11f);
			table2.setSpacingAfter(13f);
			
                        table2.addCell("First Name");
                        table2.addCell("Last Name");
                        table2.addCell("Age");
                        table2.addCell("Car Model");
                        table2.addCell("Spouse Name");
			table2.addCell("Hobbies");

                        for (int i=0;i<jTable2.getRowCount();i++)
                        {

                                String FN=jTable2.getValueAt(i, 0).toString();
                                String GN=jTable2.getValueAt(i, 1).toString();
                                String KN=jTable2.getValueAt(i, 2).toString();
                                String LN=jTable2.getValueAt(i, 3).toString();
                                String MN=jTable2.getValueAt(i, 4).toString();
                                String NN=jTable2.getValueAt(i, 5).toString();

                                table2.addCell(FN);
                                table2.addCell(GN);
                                table2.addCell(KN);
                                table2.addCell(LN);
                                table2.addCell(MN);
                                table2.addCell(NN);
                        }

                        doc.add(paragraph1);
                        doc.add(table1);
			doc.add(paragraph2);
			doc.add(table2);
                        JOptionPane.showMessageDialog(null,"Successfully generated");
                }
                catch(Exception e){
                        JOptionPane.showMessageDialog(null,"Error");
                }
                doc.close();
		}
        }//GEN-LAST:event_jButton6ActionPerformed

        private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed

                int a=JOptionPane.showConfirmDialog(null,"Are you sure you want to close?","Select",JOptionPane.YES_NO_OPTION);
                if(a==0){
                        System.exit(0);
                }
        }//GEN-LAST:event_jButton14ActionPerformed
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
			java.util.logging.Logger.getLogger(Gender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Gender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Gender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Gender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Gender().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton14;
        private javax.swing.JButton jButton2;
        private javax.swing.JButton jButton4;
        private javax.swing.JButton jButton6;
        private javax.swing.JButton jButton7;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel14;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JScrollPane jScrollPane3;
        private javax.swing.JTable jTable1;
        private javax.swing.JTable jTable2;
        private javax.swing.JTextField jTextField3;
        // End of variables declaration//GEN-END:variables
}
