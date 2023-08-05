/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pkgCS.IA;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
 
import com.itextpdf.text.BaseColor;
import javax.swing.JFileChooser;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.pdf.PdfWriter;

public class DashboardCustom extends javax.swing.JFrame {
        static final String DB_URL = "jdbc:mysql://localhost/csia";
	static final String USER = "root";
	static final String PASS = "root@123";

	public DashboardCustom() {
		initComponents();
	}

	public DashboardCustom(String username) {
		initComponents();
		jLabel14.setText(username);
		jButton1.setVisible(false);
		jLabel1.setVisible(false);
		jTextField2.setVisible(false);
	}

	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jLabel9 = new javax.swing.JLabel();
                jTextField1 = new javax.swing.JTextField();
                jButton3 = new javax.swing.JButton();
                jButton4 = new javax.swing.JButton();
                jLabel4 = new javax.swing.JLabel();
                jButton6 = new javax.swing.JButton();
                jLabel1 = new javax.swing.JLabel();
                jTextField2 = new javax.swing.JTextField();
                jButton1 = new javax.swing.JButton();
                jScrollPane1 = new javax.swing.JScrollPane();
                jTable1 = new javax.swing.JTable();
                jScrollPane2 = new javax.swing.JScrollPane();
                jTable2 = new javax.swing.JTable();
                jButton10 = new javax.swing.JButton();
                jLabel14 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setUndecorated(true);

                jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                jLabel9.setText("Customer ID");

                jTextField1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
                jTextField1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextField1ActionPerformed(evt);
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

                jButton4.setBackground(new java.awt.Color(255, 0, 0));
                jButton4.setFont(new java.awt.Font("Kavivanar", 1, 13)); // NOI18N
                jButton4.setText("Back");
                jButton4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton4ActionPerformed(evt);
                        }
                });

                jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
                jLabel4.setText("Custom");

                jButton6.setBackground(new java.awt.Color(0, 0, 0));
                jButton6.setFont(new java.awt.Font("Kavivanar", 1, 13)); // NOI18N
                jButton6.setForeground(new java.awt.Color(255, 255, 255));
                jButton6.setText("Homepage");
                jButton6.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton6ActionPerformed(evt);
                        }
                });

                jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                jLabel1.setText("Name");

                jTextField2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

                jButton1.setBackground(new java.awt.Color(153, 255, 153));
                jButton1.setFont(new java.awt.Font("Kavivanar", 1, 13)); // NOI18N
                jButton1.setText("Generate PDF");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });

                jTable1.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null, null, null, null, null, null, null, null}
                        },
                        new String [] {
                                "First Name", "Last Name", "Date of Birth", "Age", "Gender", "Address", "Phone Number", "Mobile Number", "Driver Number", "Spouse Name", "Hobbies"
                        }
                ));
                jScrollPane1.setViewportView(jTable1);

                jTable2.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null, null, null, null, null}
                        },
                        new String [] {
                                "Car Model", "Car Mileage", "Car Age", "Date of Sale", "Last Serviced", "Type of Service", "Insurance Number", "Insurance Date"
                        }
                ));
                jScrollPane2.setViewportView(jTable2);

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
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(88, 88, 88)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(411, 411, 411)
                                                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(88, 88, 88)
                                                                .addComponent(jButton6))
                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1092, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addComponent(jLabel14))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(531, 531, 531)
                                                .addComponent(jLabel4))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(587, 587, 587)
                                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(380, 380, 380)
                                                .addComponent(jLabel9)
                                                .addGap(33, 33, 33)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(34, 34, 34)
                                                .addComponent(jButton3))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(452, 452, 452)
                                                .addComponent(jLabel1)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton1)))
                                .addContainerGap(27, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel14)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(jLabel9))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jButton3))
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(jLabel1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jButton1))
                                .addGap(59, 59, 59)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton4)
                                        .addComponent(jButton6))
                                .addGap(20, 20, 20)
                                .addComponent(jButton10)
                                .addGap(33, 33, 33))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

        }//GEN-LAST:event_jTextField1ActionPerformed

        private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
		String username=jLabel14.getText();
                String customerID=jTextField1.getText();
		if (customerID.length()<=0){
			JOptionPane.showMessageDialog(null,"Please enter a Customer ID");
		}	
		else         {
			
			try(Connection connn = DriverManager.getConnection(DB_URL, USER, PASS);
					Statement srtm = connn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);	
					) { 
					String sqq = "select * from cars"+username+" where customerID='"+customerID+"'";
                                        ResultSet rs1= srtm.executeQuery(sqq);
					if (!rs1.first()){
						JOptionPane.showMessageDialog(null,"Customer ID does not exist");
					}
					else{
		
		jButton1.setVisible(true);
		jLabel1.setVisible(true);
		jTextField2.setVisible(true);
			
                try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                        Statement stmt = conn.createStatement();
                ) {
			jTable1.setModel(new DefaultTableModel(null,new String []{"First Name","Last Name","Date of Birth","Age","Gender","Address","Phone Number","Mobile Number","Driver Number","Spouse Name","Hobbies"}));
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
                                String tbData[]={first_name,last_name,dateofbirth,age,gender,address,phone_number,mobile_number,driver_number,spouse_name,hobbies};
                                DefaultTableModel tblModel= (DefaultTableModel)jTable1.getModel();
                                tblModel.addRow(tbData);	
                        }

                } catch (SQLException e) {
                        e.printStackTrace();
                }
                try(Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
                        Statement stm = con.createStatement();
                ) {
			jTable2.setModel(new DefaultTableModel(null,new String []{"Car Model","Car Mileage","Car Age","Date of Sale","Last Serviced","Type of Service","Insurance Number","Insurance Date"}));
                        String sq = "select carmodel, carmileage, carage, dateofsale, lastservice, typeofservice, insurancenumber, insurancedate from cars"+username+" where customerID='"+customerID+"'";
                        ResultSet rss= stm.executeQuery(sq);

                        while(rss.next()){
                                String carmodel=rss.getString("carmodel");
                                String carmileage=rss.getString("carmileage");
                                String carage=rss.getString("carage");
                                String dateofsale=rss.getString("dateofsale");
                                String typeof=rss.getString("lastservice");
                                String lastservice=rss.getString("typeofservice");
                                String insurancenumber=rss.getString("insurancenumber");
                                String insurancedate=rss.getString("insurancedate");
                                String tbbData[]={carmodel,carmileage,carage,dateofsale,typeof,lastservice,insurancenumber,insurancedate};
                                DefaultTableModel tbblModel= (DefaultTableModel)jTable2.getModel();
                                tbblModel.addRow(tbbData);
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

        private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
		String username=jLabel14.getText();
                setVisible(false);
                new Dashboard(username).setVisible(true); 
        }//GEN-LAST:event_jButton4ActionPerformed

        private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
		String username=jLabel14.getText();
                setVisible(false);
                new homepage(username).setVisible(true);
        }//GEN-LAST:event_jButton6ActionPerformed

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
		String ID=jTextField1.getText();
                String n=jTextField2.getText();
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

			Paragraph paragraph1 = new Paragraph("Table: Custom customer details (ID="+ID+")");
                        Paragraph paragraph2 = new Paragraph("Table: Custom car details (ID="+ID+")");

                        PdfPTable tbbl=new PdfPTable(11);
                         
			tbbl.setWidthPercentage(105);
			tbbl.setSpacingBefore(11f);
			tbbl.setSpacingAfter(13f);
			paragraph2.setSpacingBefore(11f);
			
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

				String ffn=jTable1.getValueAt(p, 0).toString();
				String ggn=jTable1.getValueAt(p, 1).toString();
				String kkn=jTable1.getValueAt(p, 2).toString();
				String lln=jTable1.getValueAt(p, 3).toString();
				String mmn=jTable1.getValueAt(p, 4).toString();
				String nnn=jTable1.getValueAt(p, 5).toString();
				String oon=jTable1.getValueAt(p, 6).toString();
				String ppn=jTable1.getValueAt(p, 7).toString();
				String qqn=jTable1.getValueAt(p, 8).toString();
				String rrn=jTable1.getValueAt(p, 9).toString();
				String ssn=jTable1.getValueAt(p, 10).toString();

				tbbl.addCell(ffn);
				tbbl.addCell(ggn);
				tbbl.addCell(kkn);
				tbbl.addCell(lln);
				tbbl.addCell(mmn);
				tbbl.addCell(nnn);
				tbbl.addCell(oon);
				tbbl.addCell(ppn);
				tbbl.addCell(qqn);
				tbbl.addCell(rrn);
				tbbl.addCell(ssn);
			}
			
			PdfPTable tbl=new PdfPTable(8);
			
			tbl.setWidthPercentage(105);
			tbl.setSpacingBefore(11f);
			tbl.setSpacingAfter(13f);
			
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

				String fn=jTable2.getValueAt(i, 0).toString();
				String gn=jTable2.getValueAt(i, 1).toString();
				String kn=jTable2.getValueAt(i, 2).toString();
				String ln=jTable2.getValueAt(i, 3).toString();
				String mn=jTable2.getValueAt(i, 4).toString();
				String nn=jTable2.getValueAt(i, 5).toString();
				String on=jTable2.getValueAt(i, 6).toString();
				String pn=jTable2.getValueAt(i, 7).toString();

				tbl.addCell(fn);
				tbl.addCell(gn);
				tbl.addCell(kn);
				tbl.addCell(ln);
				tbl.addCell(mn);
				tbl.addCell(nn);
				tbl.addCell(on);
				tbl.addCell(pn);
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
			java.util.logging.Logger.getLogger(DashboardCustom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(DashboardCustom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(DashboardCustom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(DashboardCustom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new DashboardCustom().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton10;
        private javax.swing.JButton jButton3;
        private javax.swing.JButton jButton4;
        private javax.swing.JButton jButton6;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel14;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JTable jTable1;
        private javax.swing.JTable jTable2;
        private javax.swing.JTextField jTextField1;
        private javax.swing.JTextField jTextField2;
        // End of variables declaration//GEN-END:variables
}
