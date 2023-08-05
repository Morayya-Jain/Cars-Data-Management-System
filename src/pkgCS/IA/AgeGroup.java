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

public class AgeGroup extends javax.swing.JFrame {
        static final String DB_URL = "jdbc:mysql://localhost/csia";
	static final String USER = "root";
	static final String PASS = "root@123";

	public AgeGroup() {
		initComponents();
	}

	public AgeGroup(String username) {
		initComponents();
		jLabel14.setText(username);
	}

	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jLabel4 = new javax.swing.JLabel();
                jButton3 = new javax.swing.JButton();
                jScrollPane2 = new javax.swing.JScrollPane();
                jTable1 = new javax.swing.JTable();
                jButton4 = new javax.swing.JButton();
                jButton1 = new javax.swing.JButton();
                jScrollPane3 = new javax.swing.JScrollPane();
                jTable2 = new javax.swing.JTable();
                jButton2 = new javax.swing.JButton();
                jScrollPane4 = new javax.swing.JScrollPane();
                jTable4 = new javax.swing.JTable();
                jScrollPane5 = new javax.swing.JScrollPane();
                jTable3 = new javax.swing.JTable();
                jButton5 = new javax.swing.JButton();
                jButton6 = new javax.swing.JButton();
                jButton7 = new javax.swing.JButton();
                jButton8 = new javax.swing.JButton();
                jLabel1 = new javax.swing.JLabel();
                jTextField1 = new javax.swing.JTextField();
                jButton9 = new javax.swing.JButton();
                jLabel14 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setUndecorated(true);

                jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 45)); // NOI18N
                jLabel4.setText("Age Groups");

                jButton3.setBackground(new java.awt.Color(0, 255, 255));
                jButton3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
                jButton3.setText("Custom");
                jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton3ActionPerformed(evt);
                        }
                });

                jTable1.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null, null, null, null, null, null}
                        },
                        new String [] {
                                "Age", "Car Model", "Car Mileage", "Car Age", "Date of Sale", "Last Serviced", "Type of Service", "Insurance Number", "Insurance Date"
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
                jButton1.setText("Age Group 18-30");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });

                jTable2.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null, null, null, null, null, null}
                        },
                        new String [] {
                                "Age", "Car Model", "Car Mileage", "Car Age", "Date of Sale", "Last Serviced", "Type of Service", "Insurance Number", "Insurance Date"
                        }
                ));
                jScrollPane3.setViewportView(jTable2);

                jButton2.setBackground(new java.awt.Color(255, 153, 51));
                jButton2.setFont(new java.awt.Font("Mukta", 0, 14)); // NOI18N
                jButton2.setText("Age Group 31-50");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton2ActionPerformed(evt);
                        }
                });

                jTable4.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null, null, null, null, null, null}
                        },
                        new String [] {
                                "Age", "Car Model", "Car Mileage", "Car Age", "Date of Sale", "Last Serviced", "Type of Service", "Insurance Number", "Insurance Date"
                        }
                ));
                jScrollPane4.setViewportView(jTable4);

                jTable3.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null, null, null, null, null, null}
                        },
                        new String [] {
                                "Age", "Car Model", "Car Mileage", "Car Age", "Date of Sale", "Last Serviced", "Type of Service", "Insurance Number", "Insurance Date"
                        }
                ));
                jScrollPane5.setViewportView(jTable3);

                jButton5.setBackground(new java.awt.Color(255, 153, 51));
                jButton5.setFont(new java.awt.Font("Mukta", 0, 14)); // NOI18N
                jButton5.setText("Age Group 51-65");
                jButton5.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton5ActionPerformed(evt);
                        }
                });

                jButton6.setBackground(new java.awt.Color(255, 153, 51));
                jButton6.setFont(new java.awt.Font("Mukta", 0, 14)); // NOI18N
                jButton6.setText("Age Group 65<");
                jButton6.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton6ActionPerformed(evt);
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

                jButton8.setBackground(new java.awt.Color(153, 255, 153));
                jButton8.setFont(new java.awt.Font("Kavivanar", 1, 13)); // NOI18N
                jButton8.setText("Generate PDF");
                jButton8.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton8ActionPerformed(evt);
                        }
                });

                jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                jLabel1.setText("Name");

                jTextField1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

                jButton9.setFont(new java.awt.Font("Kavivanar", 1, 13)); // NOI18N
                jButton9.setText("EXIT");
                jButton9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
                jButton9.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton9ActionPerformed(evt);
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
                                                .addGap(14, 14, 14)
                                                .addComponent(jLabel14)
                                                .addGap(480, 480, 480)
                                                .addComponent(jLabel4))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(43, 43, 43)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1092, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jButton5))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1092, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1092, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(12, 12, 12)
                                                                .addComponent(jButton1))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1092, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jButton2))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(565, 565, 565)
                                                                .addComponent(jButton3))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addGap(446, 446, 446)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                .addComponent(jLabel1)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jButton8)
                                                                                .addGap(437, 437, 437))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                .addComponent(jButton4)
                                                                                .addGap(65, 65, 65)
                                                                                .addComponent(jButton7)
                                                                                .addGap(48, 48, 48)
                                                                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(428, 428, 428)))))))
                                .addContainerGap(46, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addComponent(jLabel14))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addComponent(jLabel4)))
                                .addGap(36, 36, 36)
                                .addComponent(jButton3)
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(jButton1)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(41, 41, 41)
                                                .addComponent(jButton2))
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jButton5)
                                                .addGap(39, 39, 39)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(41, 41, 41)
                                                .addComponent(jButton6))
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton4)
                                        .addComponent(jButton7)
                                        .addComponent(jButton9))
                                .addGap(32, 32, 32))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
		String username=jLabel14.getText();
                setVisible(false);
		new Agegroupcustom(username).setVisible(true);
        }//GEN-LAST:event_jButton3ActionPerformed

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
			jTable1.setModel(new DefaultTableModel(null,new String []{"Age","Car Model","Car Mileage","Car Age","Date of Sale","Last Serviced","Type of Service","Insurance Number","Insurance Date"}));
                        String sql = "select age,carmodel, carmileage, carage, dateofsale, lastservice, typeofservice, insurancenumber, insurancedate from customer"+user+", cars"+user+" where customer"+user+".customerID=cars"+user+".customerID and age<=30 and age>=18";
                        ResultSet rs= stmt.executeQuery(sql);
			while(rs.next()){
		         String age=rs.getString("age");
			 String carmodel=rs.getString("carmodel");
                         String carmileage=rs.getString("carmileage");
                         String carage=rs.getString("carage");
                         String dateofsale=rs.getString("dateofsale");
                         String lastservice=rs.getString("lastservice");
                         String typeofservice=rs.getString("typeofservice");
                         String insurancenumber=rs.getString("insurancenumber");
                         String insurancedate=rs.getString("insurancedate");
			 String tbData[]={age,carmodel,carmileage,carage,dateofsale,lastservice,typeofservice,insurancenumber,insurancedate};
			 DefaultTableModel tblModel= (DefaultTableModel)jTable1.getModel();
			 tblModel.addRow(tbData); 
			}

                } catch (SQLException e) {
                        e.printStackTrace();
                }
                
        }//GEN-LAST:event_jButton1ActionPerformed

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
		String username=jLabel14.getText();
		String user=username;
		try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                        Statement stmt = conn.createStatement();
                ) {
			jTable2.setModel(new DefaultTableModel(null,new String []{"Age","Car Model","Car Mileage","Car Age","Date of Sale","Last Serviced","Type of Service","Insurance Number","Insurance Date"}));
                        String sql = "select age,carmodel, carmileage, carage, dateofsale, lastservice, typeofservice, insurancenumber, insurancedate from customer"+user+", cars"+user+" where customer"+user+".customerID=cars"+user+".customerID and age<=50 and age>30";
                        ResultSet rs= stmt.executeQuery(sql);
			while(rs.next()){
			 String age=rs.getString("age");	
			 String carmodel=rs.getString("carmodel");
                         String carmileage=rs.getString("carmileage");
                         String carage=rs.getString("carage");
                         String dateofsale=rs.getString("dateofsale");
                         String lastservice=rs.getString("lastservice");
                         String typeofservice=rs.getString("typeofservice");
                         String insurancenumber=rs.getString("insurancenumber");
                         String insurancedate=rs.getString("insurancedate");
			 String tbData[]={age,carmodel,carmileage,carage,dateofsale,lastservice,typeofservice,insurancenumber,insurancedate};
			 DefaultTableModel tblModel= (DefaultTableModel)jTable2.getModel();
			 tblModel.addRow(tbData);
                         
			}

                } catch (SQLException e) {
                        e.printStackTrace();
                }
        }//GEN-LAST:event_jButton2ActionPerformed

        private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
		String username=jLabel14.getText();
		String user=username;
		try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                        Statement stmt = conn.createStatement();
                ) {
			jTable3.setModel(new DefaultTableModel(null,new String []{"Age","Car Model","Car Mileage","Car Age","Date of Sale","Last Serviced","Type of Service","Insurance Number","Insurance Date"}));
                        String sql = "select age, carmodel, carmileage, carage, dateofsale, lastservice, typeofservice, insurancenumber, insurancedate from customer"+user+", cars"+user+" where customer"+user+".customerID=cars"+user+".customerID and age<=65 and age>50";
                        ResultSet rs= stmt.executeQuery(sql);
			while(rs.next()){
			 String age=rs.getString("age");	
			 String carmodel=rs.getString("carmodel");
                         String carmileage=rs.getString("carmileage");
                         String carage=rs.getString("carage");
                         String dateofsale=rs.getString("dateofsale");
                         String lastservice=rs.getString("lastservice");
                         String typeofservice=rs.getString("typeofservice");
                         String insurancenumber=rs.getString("insurancenumber");
                         String insurancedate=rs.getString("insurancedate");
			 String tbData[]={age,carmodel,carmileage,carage,dateofsale,lastservice,typeofservice,insurancenumber,insurancedate};
			 DefaultTableModel tblModel= (DefaultTableModel)jTable3.getModel();
			 tblModel.addRow(tbData);
                         
			}

                } catch (SQLException e) {
                        e.printStackTrace();
                }
        }//GEN-LAST:event_jButton5ActionPerformed

        private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
		String username=jLabel14.getText();
		String user=username;
		try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                        Statement stmt = conn.createStatement();
                ) {
                        jTable4.setModel(new DefaultTableModel(null,new String []{"Age","Car Model","Car Mileage","Car Age","Date of Sale","Last Serviced","Type of Service","Insurance Number","Insurance Date"}));
			String sql = "select age, carmodel, carmileage, carage, dateofsale, lastservice, typeofservice, insurancenumber, insurancedate from customer"+user+", cars"+user+" where customer"+user+".customerID=cars"+user+".customerID and age>65";
                        ResultSet rs= stmt.executeQuery(sql);
			while(rs.next()){
			 String age=rs.getString("age");	
			 String carmodel=rs.getString("carmodel");
                         String carmileage=rs.getString("carmileage");
                         String carage=rs.getString("carage");
                         String dateofsale=rs.getString("dateofsale");
                         String lastservice=rs.getString("lastservice");
                         String typeofservice=rs.getString("typeofservice");
                         String insurancenumber=rs.getString("insurancenumber");
                         String insurancedate=rs.getString("insurancedate");
			 String tbData[]={age,carmodel,carmileage,carage,dateofsale,lastservice,typeofservice,insurancenumber,insurancedate};
			 DefaultTableModel tblModel= (DefaultTableModel)jTable4.getModel();
			 tblModel.addRow(tbData);
                         
			}

                } catch (SQLException e) {
                        e.printStackTrace();
                }
        }//GEN-LAST:event_jButton6ActionPerformed

        private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
		String username=jLabel14.getText();
		setVisible(false);
		new homepage(username).setVisible(true);
        }//GEN-LAST:event_jButton7ActionPerformed

        private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
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

                        Paragraph paragraph1 = new Paragraph("Table: Customer age between 18 and 30");
                        Paragraph paragraph2 = new Paragraph("Table: Customer age between 31 and 50");
			Paragraph paragraph3 = new Paragraph("Table: Customer age between 51 and 65");
			Paragraph paragraph4 = new Paragraph("Table: Customer age above 65");

                        PdfPTable tbbl=new PdfPTable(9);

                        tbbl.setWidthPercentage(105);
			tbbl.setSpacingBefore(11f);
			tbbl.setSpacingAfter(13f);
			paragraph2.setSpacingBefore(11f);
			
                        tbbl.addCell("Age");
                        tbbl.addCell("Car Model");
                        tbbl.addCell("Car Mileage");
                        tbbl.addCell("Car Age");
                        tbbl.addCell("Date of Sale");
                        tbbl.addCell("Last Serviced");
                        tbbl.addCell("Type of Service");
                        tbbl.addCell("Insurance Number");
                        tbbl.addCell("Insurance Date");

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

                                tbbl.addCell(FFN);
                                tbbl.addCell(GGN);
                                tbbl.addCell(KKN);
                                tbbl.addCell(LLN);
                                tbbl.addCell(MMN);
                                tbbl.addCell(NNN);
                                tbbl.addCell(OON);
                                tbbl.addCell(PPN);
                                tbbl.addCell(QQN);
                        }

                        PdfPTable tbl=new PdfPTable(9);

		        tbl.setWidthPercentage(105);
			tbl.setSpacingBefore(11f);
			tbl.setSpacingAfter(13f);
			paragraph3.setSpacingBefore(11f);	
			
                        tbl.addCell("Age");
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

                        PdfPTable bbl=new PdfPTable(9);

                        bbl.setWidthPercentage(105);
			bbl.setSpacingBefore(11f);
			bbl.setSpacingAfter(13f);
			paragraph4.setSpacingBefore(11f);
			
                        bbl.addCell("Age");
                        bbl.addCell("Car Model");
                        bbl.addCell("Car Mileage");
                        bbl.addCell("Car Age");
                        bbl.addCell("Date of Sale");
                        bbl.addCell("Last Serviced");
                        bbl.addCell("Type of Service");
                        bbl.addCell("Insurance Number");
                        bbl.addCell("Insurance Date");

                        for (int s=0;s<jTable3.getRowCount();s++)
                        {

                                String fN=jTable3.getValueAt(s, 0).toString();
                                String gN=jTable3.getValueAt(s, 1).toString();
                                String kN=jTable3.getValueAt(s, 2).toString();
                                String lN=jTable3.getValueAt(s, 3).toString();
                                String mN=jTable3.getValueAt(s, 4).toString();
                                String nN=jTable3.getValueAt(s, 5).toString();
                                String oN=jTable3.getValueAt(s, 6).toString();
                                String pN=jTable3.getValueAt(s, 7).toString();
                                String qN=jTable3.getValueAt(s, 8).toString();

                                bbl.addCell(fN);
                                bbl.addCell(gN);
                                bbl.addCell(kN);
                                bbl.addCell(lN);
                                bbl.addCell(mN);
                                bbl.addCell(nN);
                                bbl.addCell(oN);
                                bbl.addCell(pN);
                                bbl.addCell(qN);
                        }
			
                        PdfPTable bl=new PdfPTable(9);

                        bl.setWidthPercentage(105);
			bl.setSpacingBefore(11f);
			bl.setSpacingAfter(13f);
			
                        bl.addCell("Age");
                        bl.addCell("Car Model");
                        bl.addCell("Car Mileage");
                        bl.addCell("Car Age");
                        bl.addCell("Date of Sale");
                        bl.addCell("Last Serviced");
                        bl.addCell("Type of Service");
                        bl.addCell("Insurance Number");
                        bl.addCell("Insurance Date");

                        for (int t=0;t<jTable4.getRowCount();t++)
                        {

                                String ffN=jTable4.getValueAt(t, 0).toString();
                                String ggN=jTable4.getValueAt(t, 1).toString();
                                String kkN=jTable4.getValueAt(t, 2).toString();
                                String llN=jTable4.getValueAt(t, 3).toString();
                                String mmN=jTable4.getValueAt(t, 4).toString();
                                String nnN=jTable4.getValueAt(t, 5).toString();
                                String ooN=jTable4.getValueAt(t, 6).toString();
                                String ppN=jTable4.getValueAt(t, 7).toString();
                                String qqN=jTable4.getValueAt(t, 8).toString();

                                bl.addCell(ffN);
                                bl.addCell(ggN);
                                bl.addCell(kkN);
                                bl.addCell(llN);
                                bl.addCell(mmN);
                                bl.addCell(nnN);
                                bl.addCell(ooN);
                                bl.addCell(ppN);
                                bl.addCell(qqN);
                        }
			
                        doc.add(paragraph1);
                        doc.add(tbbl);
                        doc.add(paragraph2);
                        doc.add(tbl);
			doc.add(paragraph3);
			doc.add(bbl);
			doc.add(paragraph4);
			doc.add(bl);
                        JOptionPane.showMessageDialog(null,"Successfully generated");
                }
                catch(Exception e){
                        JOptionPane.showMessageDialog(null,"Error");
                }
                doc.close();
		}

        }//GEN-LAST:event_jButton8ActionPerformed

        private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

                int a=JOptionPane.showConfirmDialog(null,"Are you sure you want to close?","Select",JOptionPane.YES_NO_OPTION);
                if(a==0){
                        System.exit(0);
                }
        }//GEN-LAST:event_jButton9ActionPerformed

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
			java.util.logging.Logger.getLogger(AgeGroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(AgeGroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(AgeGroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(AgeGroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new AgeGroup().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JButton jButton3;
        private javax.swing.JButton jButton4;
        private javax.swing.JButton jButton5;
        private javax.swing.JButton jButton6;
        private javax.swing.JButton jButton7;
        private javax.swing.JButton jButton8;
        private javax.swing.JButton jButton9;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel14;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JScrollPane jScrollPane3;
        private javax.swing.JScrollPane jScrollPane4;
        private javax.swing.JScrollPane jScrollPane5;
        private javax.swing.JTable jTable1;
        private javax.swing.JTable jTable2;
        private javax.swing.JTable jTable3;
        private javax.swing.JTable jTable4;
        private javax.swing.JTextField jTextField1;
        // End of variables declaration//GEN-END:variables
}
