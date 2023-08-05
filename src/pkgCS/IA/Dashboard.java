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
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class Dashboard extends javax.swing.JFrame {
        static final String DB_URL = "jdbc:mysql://localhost/csia";
	static final String USER = "root";
	static final String PASS = "root@123";	
	
        public Dashboard() {
		initComponents();
	}
	
	public Dashboard(String username) {
		initComponents();
		jLabel14.setText(username);
		jButton1.setVisible(false);
		jLabel1.setVisible(false);
		jTextField1.setVisible(false);
	}

	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jLabel3 = new javax.swing.JLabel();
                jButton3 = new javax.swing.JButton();
                jScrollPane1 = new javax.swing.JScrollPane();
                jTable1 = new javax.swing.JTable();
                jScrollPane2 = new javax.swing.JScrollPane();
                jTable2 = new javax.swing.JTable();
                jButton4 = new javax.swing.JButton();
                jButton5 = new javax.swing.JButton();
                jLabel4 = new javax.swing.JLabel();
                jButton7 = new javax.swing.JButton();
                jButton6 = new javax.swing.JButton();
                jButton1 = new javax.swing.JButton();
                jLabel1 = new javax.swing.JLabel();
                jTextField1 = new javax.swing.JTextField();
                jButton10 = new javax.swing.JButton();
                jLabel14 = new javax.swing.JLabel();

                jLabel3.setFont(new java.awt.Font("Telugu MN", 3, 48)); // NOI18N
                jLabel3.setText("Welcome ");

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setUndecorated(true);

                jButton3.setBackground(new java.awt.Color(255, 102, 0));
                jButton3.setFont(new java.awt.Font("Kavivanar", 1, 13)); // NOI18N
                jButton3.setText("Display");
                jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton3ActionPerformed(evt);
                        }
                });

                jTable1.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null, null, null, null, null, null, null, null, null}
                        },
                        new String [] {
                                "ID", "First Name", "Last Name", "Date of Birth", "Age", "Gender", "Address", "Phone Number", "Mobile Number", "Driver Number", "Spouse Name", "Hobbies"
                        }
                ));
                jScrollPane1.setViewportView(jTable1);

                jTable2.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null, null, null, null, null, null}
                        },
                        new String [] {
                                "ID", "Car Model", "Car Mileage", "Car Age", "Date of Sale", "Last Serviced", "Type of Service", "Insurance Number", "Insurance Date"
                        }
                ));
                jScrollPane2.setViewportView(jTable2);

                jButton4.setBackground(new java.awt.Color(255, 0, 0));
                jButton4.setFont(new java.awt.Font("Kavivanar", 1, 13)); // NOI18N
                jButton4.setText("Back");
                jButton4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton4ActionPerformed(evt);
                        }
                });

                jButton5.setBackground(new java.awt.Color(51, 255, 0));
                jButton5.setFont(new java.awt.Font("Kavivanar", 1, 13)); // NOI18N
                jButton5.setText("Filter Data");
                jButton5.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton5ActionPerformed(evt);
                        }
                });

                jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
                jLabel4.setText("View Data");

                jButton7.setBackground(new java.awt.Color(0, 255, 255));
                jButton7.setFont(new java.awt.Font("Kavivanar", 1, 13)); // NOI18N
                jButton7.setText("Custom");
                jButton7.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton7ActionPerformed(evt);
                        }
                });

                jButton6.setBackground(new java.awt.Color(0, 0, 0));
                jButton6.setFont(new java.awt.Font("Kavivanar", 1, 13)); // NOI18N
                jButton6.setForeground(new java.awt.Color(255, 255, 255));
                jButton6.setText("Reset");
                jButton6.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton6ActionPerformed(evt);
                        }
                });

                jButton1.setBackground(new java.awt.Color(153, 255, 153));
                jButton1.setFont(new java.awt.Font("Kavivanar", 1, 13)); // NOI18N
                jButton1.setText("Generate PDF");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });

                jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                jLabel1.setText("Name");

                jTextField1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

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

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(23, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(65, 65, 65)
                                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1092, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(22, 22, 22))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jButton4)
                                                .addGap(52, 52, 52)
                                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(52, 52, 52)
                                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(435, 435, 435))))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addComponent(jLabel14)
                                                .addGap(458, 458, 458)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(433, 433, 433)
                                                .addComponent(jButton7)
                                                .addGap(72, 72, 72)
                                                .addComponent(jButton3)
                                                .addGap(75, 75, 75)
                                                .addComponent(jButton6))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(442, 442, 442)
                                                .addComponent(jLabel1)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton1)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(17, 17, 17)
                                                .addComponent(jLabel14))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addComponent(jLabel4)))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton3)
                                        .addComponent(jButton7)
                                        .addComponent(jButton6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(70, 70, 70)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton4)
                                        .addComponent(jButton5)
                                        .addComponent(jButton10))
                                .addGap(46, 46, 46))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
		String username=jLabel14.getText();
		jButton1.setVisible(true);
		jLabel1.setVisible(true);
		jTextField1.setVisible(true);
		try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                        Statement stmt = conn.createStatement();
                )
		{
			jTable1.setModel(new DefaultTableModel(null,new String []{"ID","First Name","Last Name","Date of Birth","Age","Gender","Address","Phone Number","Mobile Number","Driver Number","Spouse Name","Hobbies"}));
                        String sql = "select customerID, first_name, last_name, dateofbirth, age, gender, address, phone_number, mobile_number, driver_number, spouse_name, hobbies from customer"+username+"";
                        ResultSet rs= stmt.executeQuery(sql);
			while(rs.next()){
			 String customerID=rs.getString("customerID");
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
			 String tbData[]={customerID,first_name,last_name,dateofbirth,age,gender,address,phone_number,mobile_number,driver_number,spouse_name,hobbies};
			 DefaultTableModel tblModel= (DefaultTableModel)jTable1.getModel();
			 tblModel.addRow(tbData);
                         
			}

                } catch (SQLException e) {
                        e.printStackTrace();
                }  
		try(Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
                        Statement stm = con.createStatement();
                ) {
			jTable2.setModel(new DefaultTableModel(null,new String []{"ID","Car Model","Car Mileage","Car Age","Date of Sale","Last Serviced","Type of Service","Insurance Number","Insurance Date"}));
                        String sq = "select customerID, carmodel, carmileage, carage, dateofsale, lastservice, typeofservice, insurancenumber, insurancedate from cars"+username+"";
                        ResultSet rss= stm.executeQuery(sq);

			while(rss.next()){
			 String cust=rss.getString("customerID");
			 String carmodel=rss.getString("carmodel");
                         String carmileage=rss.getString("carmileage");
                         String carage=rss.getString("carage");
                         String dateofsale=rss.getString("dateofsale");
                         String typeof=rss.getString("lastservice");
                         String lastservice=rss.getString("typeofservice");
                         String insurancenumber=rss.getString("insurancenumber");
                         String insurancedate=rss.getString("insurancedate");
			 String tbbData[]={cust,carmodel,carmileage,carage,dateofsale,typeof,lastservice,insurancenumber,insurancedate};
			 DefaultTableModel tbblModel= (DefaultTableModel)jTable2.getModel();
			 tbblModel.addRow(tbbData);
                         
			}

                } catch (SQLException e) {
                        e.printStackTrace();
                } 
        }//GEN-LAST:event_jButton3ActionPerformed

        private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
                String username=jLabel14.getText();
                setVisible(false);
		new homepage(username).setVisible(true);
        }//GEN-LAST:event_jButton4ActionPerformed

        private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
		String username=jLabel14.getText();
                setVisible(false);
		new Navigate(username).setVisible(true);
        }//GEN-LAST:event_jButton5ActionPerformed

        private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
		String username=jLabel14.getText();
		setVisible(false);
		new DashboardCustom(username).setVisible(true);
        }//GEN-LAST:event_jButton7ActionPerformed

        private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
		jTable1.setModel(new DefaultTableModel(null,new String []{"ID","First Name","Last Name","Date of Birth","Age","Gender","Address","Phone Number","Mobile Number","Driver Number","Spouse Name","Hobbies"}));
	
		jTable2.setModel(new DefaultTableModel(null,new String []{"ID","Car Model","Car Mileage","Car Age","Date of Sale","Last Serviced","Type of Service","Insurance Number","Insurance Date"}));	
                
        }//GEN-LAST:event_jButton6ActionPerformed

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
		String n=jTextField1.getText();
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

			Paragraph paragraph1 = new Paragraph("Table: All customer details");
                        Paragraph paragraph2 = new Paragraph("Table: All car details");

                        PdfPTable tbbl=new PdfPTable(12);
			tbbl.setWidthPercentage(105);
			tbbl.setSpacingBefore(11f);
			tbbl.setSpacingAfter(13f);
			paragraph2.setSpacingBefore(11f);
			
			tbbl.addCell("ID");
			tbbl.addCell("First Name");
			tbbl.addCell("Last Name");
			tbbl.addCell("Date of Birth");
			tbbl.addCell("Age");
			tbbl.addCell("Gender");
			tbbl.addCell("Address");
			tbbl.addCell("Phone Number");
			tbbl.addCell("Mobile Number");
			tbbl.addCell("Driver Number");
			tbbl.addCell("Spouse Name");
			tbbl.addCell("Hobbies");

			for (int p=0;p<jTable1.getRowCount();p++)
			{

				String FFN=jTable1.getValueAt(p, 0).toString();
				String GGN=jTable1.getValueAt(p, 1).toString();
				String KKN=jTable1.getValueAt(p, 2).toString();
				String LLN=jTable1.getValueAt(p, 3).toString();
				String MMN=jTable1.getValueAt(p, 4).toString();
				String NNN=jTable1.getValueAt(p, 5).toString();
				String OON=jTable1.getValueAt(p, 6).toString();
				String PPN=jTable1.getValueAt(p, 7).toString();
				String QQN=jTable1.getValueAt(p, 8).toString();
				String RRN=jTable1.getValueAt(p, 9).toString();
				String SSN=jTable1.getValueAt(p, 10).toString();
				String TTN=jTable1.getValueAt(p, 11).toString();

				tbbl.addCell(FFN);
				tbbl.addCell(GGN);
				tbbl.addCell(KKN);
				tbbl.addCell(LLN);
				tbbl.addCell(MMN);
				tbbl.addCell(NNN);
				tbbl.addCell(OON);
				tbbl.addCell(PPN);
				tbbl.addCell(QQN);
				tbbl.addCell(RRN);
				tbbl.addCell(SSN);
				tbbl.addCell(TTN);
			}
			
			PdfPTable tbl=new PdfPTable(9);
                        tbl.setWidthPercentage(105);
			tbl.setSpacingBefore(11f);
			tbl.setSpacingAfter(13f);
			
			tbl.addCell("ID");
			tbl.addCell("Car Model");
			tbl.addCell("Car Mileage");
			tbl.addCell("Car Age");
			tbl.addCell("Date of Sale");
			tbl.addCell("Last Serviced");
			tbl.addCell("Type of Service");
			tbl.addCell("Insurance Number");
			tbl.addCell("Insurance Date");

			for (int i=0;i<jTable2.getRowCount();i++)
			{

				String FN=jTable2.getValueAt(i, 0).toString();
				String GN=jTable2.getValueAt(i, 1).toString();
				String KN=jTable2.getValueAt(i, 2).toString();
				String LN=jTable2.getValueAt(i, 3).toString();
				String MN=jTable2.getValueAt(i, 4).toString();
				String NN=jTable2.getValueAt(i, 5).toString();
				String ON=jTable2.getValueAt(i, 6).toString();
				String PN=jTable2.getValueAt(i, 7).toString();
				String QN=jTable2.getValueAt(i, 8).toString();

				tbl.addCell(FN);
				tbl.addCell(GN);
				tbl.addCell(KN);
				tbl.addCell(LN);
				tbl.addCell(MN);
				
				tbl.addCell(NN);
				tbl.addCell(ON);
				tbl.addCell(PN);
				tbl.addCell(QN);
			}
			
			doc.add(paragraph1);
			doc.add(tbbl);
			doc.add(paragraph2);
			doc.add(tbl);
			JOptionPane.showMessageDialog(null,"Successfully generated");
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null,"Error");
		}
		doc.close();
		} 
        }//GEN-LAST:event_jButton1ActionPerformed

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
			java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Dashboard().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton10;
        private javax.swing.JButton jButton3;
        private javax.swing.JButton jButton4;
        private javax.swing.JButton jButton5;
        private javax.swing.JButton jButton6;
        private javax.swing.JButton jButton7;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel14;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JTable jTable1;
        private javax.swing.JTable jTable2;
        private javax.swing.JTextField jTextField1;
        // End of variables declaration//GEN-END:variables
}
