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

public class CarAge extends javax.swing.JFrame {
        static final String DB_URL = "jdbc:mysql://localhost/csia";
	static final String USER = "root";
	static final String PASS = "root@123";
	
	public CarAge() {
		initComponents();
	}

	public CarAge(String username) {
		initComponents();
		jLabel14.setText(username);
	}

	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jScrollPane2 = new javax.swing.JScrollPane();
                jTable1 = new javax.swing.JTable();
                jButton5 = new javax.swing.JButton();
                jButton4 = new javax.swing.JButton();
                jButton7 = new javax.swing.JButton();
                jButton1 = new javax.swing.JButton();
                jButton2 = new javax.swing.JButton();
                jLabel4 = new javax.swing.JLabel();
                jButton3 = new javax.swing.JButton();
                jScrollPane5 = new javax.swing.JScrollPane();
                jTable2 = new javax.swing.JTable();
                jScrollPane6 = new javax.swing.JScrollPane();
                jTable3 = new javax.swing.JTable();
                jLabel1 = new javax.swing.JLabel();
                jTextField1 = new javax.swing.JTextField();
                jButton6 = new javax.swing.JButton();
                jButton9 = new javax.swing.JButton();
                jLabel14 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setUndecorated(true);

                jTable1.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null, null, null, null, null}
                        },
                        new String [] {
                                "Car Age", "First Name", "Last Name", "Car Model", "Car Mileage", "Last Serviced", "Type of Service", "Insurance Number"
                        }
                ));
                jScrollPane2.setViewportView(jTable1);

                jButton5.setBackground(new java.awt.Color(255, 153, 51));
                jButton5.setFont(new java.awt.Font("Mukta", 0, 14)); // NOI18N
                jButton5.setText("Age Group 11-15");
                jButton5.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton5ActionPerformed(evt);
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

                jButton7.setBackground(new java.awt.Color(0, 0, 0));
                jButton7.setFont(new java.awt.Font("Kavivanar", 1, 13)); // NOI18N
                jButton7.setForeground(new java.awt.Color(255, 255, 255));
                jButton7.setText("Homepage");
                jButton7.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton7ActionPerformed(evt);
                        }
                });

                jButton1.setBackground(new java.awt.Color(255, 153, 51));
                jButton1.setFont(new java.awt.Font("Mukta", 0, 14)); // NOI18N
                jButton1.setText("Age Group <5");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });

                jButton2.setBackground(new java.awt.Color(255, 153, 51));
                jButton2.setFont(new java.awt.Font("Mukta", 0, 14)); // NOI18N
                jButton2.setText("Age Group 5-10");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton2ActionPerformed(evt);
                        }
                });

                jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 45)); // NOI18N
                jLabel4.setText("Car Age Groups");

                jButton3.setBackground(new java.awt.Color(0, 255, 255));
                jButton3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
                jButton3.setText("Custom");
                jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton3ActionPerformed(evt);
                        }
                });

                jTable2.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null, null, null, null, null}
                        },
                        new String [] {
                                "Car Age", "First Name", "Last Name", "Car Model", "Car Mileage", "Last Serviced", "Type of Service", "Insurance Number"
                        }
                ));
                jScrollPane5.setViewportView(jTable2);

                jTable3.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null, null, null, null, null}
                        },
                        new String [] {
                                "Car Age", "First Name", "Last Name", "Car Model", "Car Mileage", "Last Serviced", "Type of Service", "Insurance Number"
                        }
                ));
                jScrollPane6.setViewportView(jTable3);

                jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                jLabel1.setText("Name");

                jTextField1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

                jButton6.setBackground(new java.awt.Color(153, 255, 153));
                jButton6.setFont(new java.awt.Font("Kavivanar", 1, 13)); // NOI18N
                jButton6.setText("Generate PDF");
                jButton6.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton6ActionPerformed(evt);
                        }
                });

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
                                .addGap(15, 15, 15)
                                .addComponent(jLabel14)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(51, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1092, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButton1))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1092, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 1092, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jButton5)
                                                                        .addComponent(jButton2))))
                                                .addGap(39, 39, 39))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(69, 69, 69)
                                                                .addComponent(jButton7))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(92, 92, 92)))
                                                .addGap(528, 528, 528))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                        .addComponent(jButton3)
                                                                        .addGap(148, 148, 148))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                        .addComponent(jLabel1)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(jButton6))))
                                                .addGap(460, 460, 460))))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addComponent(jLabel14))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(31, 31, 31)
                                                .addComponent(jLabel4)))
                                .addGap(42, 42, 42)
                                .addComponent(jButton3)
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jButton1)
                                                .addGap(37, 37, 37)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(86, 86, 86)
                                                .addComponent(jButton2)
                                                .addGap(121, 121, 121)
                                                .addComponent(jButton5))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(45, 45, 45)
                                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(41, 41, 41)
                                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton4)
                                        .addComponent(jButton7))
                                .addGap(27, 27, 27)
                                .addComponent(jButton9)
                                .addGap(25, 25, 25))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
		String username=jLabel14.getText();
		String user=username;
                try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                        Statement stmt = conn.createStatement();
                ) {
                        jTable3.setModel(new DefaultTableModel(null,new String []{"Car Age","First Name","Last Name","Car Model","Car Mileage","Last Serviced","Type of Service","Insurance Number"}));
			String sql = "select carage,first_name,last_name,carmodel,carmileage,lastservice,typeofservice,insurancenumber from customer"+user+", cars"+user+" where customer"+user+".customerID=cars"+user+".customerID and carage<=15 and carage>10";
                        ResultSet rs= stmt.executeQuery(sql);
                        while(rs.next()){
			        String carage=rs.getString("carage");
                                String first_name=rs.getString("first_name");
                                String last_name=rs.getString("last_name");
                                String carmodel=rs.getString("carmodel");
                                String carmileage=rs.getString("carmileage");
                                String lastservice=rs.getString("lastservice");
                                String typeofservice=rs.getString("typeofservice");
                                String insurancenumber=rs.getString("insurancenumber");
                                String tbData[]={carage,first_name,last_name,carmodel,carmileage,lastservice,typeofservice,insurancenumber};
                                DefaultTableModel tblModel= (DefaultTableModel)jTable3.getModel();
                                tblModel.addRow(tbData);

                        }

                } catch (SQLException e) {
                        e.printStackTrace();
                }
        }//GEN-LAST:event_jButton5ActionPerformed

        private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

		String username=jLabel14.getText();
                setVisible(false);
                new Navigate(username).setVisible(true);
        }//GEN-LAST:event_jButton4ActionPerformed

        private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
		String username=jLabel14.getText();
                setVisible(false);
                new homepage(username).setVisible(true);
        }//GEN-LAST:event_jButton7ActionPerformed

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
		
                String username=jLabel14.getText();
		String user=username;
                try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                        Statement stmt = conn.createStatement();
                ) {
			jTable1.setModel(new DefaultTableModel(null,new String []{"Car Age","First Name","Last Name","Car Model","Car Mileage","Last Serviced","Type of Service","Insurance Number"}));
                        String sql = "select carage,first_name,last_name,carmodel,carmileage,lastservice,typeofservice,insurancenumber from customer"+user+", cars"+user+" where customer"+user+".customerID=cars"+user+".customerID and carage<5";
                        ResultSet rs= stmt.executeQuery(sql);
                        while(rs.next()){
				String carage=rs.getString("carage");
                                String first_name=rs.getString("first_name");
                                String last_name=rs.getString("last_name");
                                String carmodel=rs.getString("carmodel");
                                String carmileage=rs.getString("carmileage");
                                String lastservice=rs.getString("lastservice");
                                String typeofservice=rs.getString("typeofservice");
                                String insurancenumber=rs.getString("insurancenumber");
                                String tbData[]={carage,first_name,last_name,carmodel,carmileage,lastservice,typeofservice,insurancenumber};
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
			jTable2.setModel(new DefaultTableModel(null,new String []{"Car Age","First Name","Last Name","Car Model","Car Mileage","Last Serviced","Type of Service","Insurance Number"}));
                        String sql = "select carage,first_name,last_name,carmodel,carmileage,lastservice,typeofservice,insurancenumber from customer"+user+", cars"+user+" where customer"+user+".customerID=cars"+user+".customerID and carage<=10 and carage>=5";
                        ResultSet rs= stmt.executeQuery(sql);
                        while(rs.next()){
				String carage=rs.getString("carage");
                                String first_name=rs.getString("first_name");
                                String last_name=rs.getString("last_name");
                                String carmodel=rs.getString("carmodel");
                                String carmileage=rs.getString("carmileage");
                                String lastservice=rs.getString("lastservice");
                                String typeofservice=rs.getString("typeofservice");
                                String insurancenumber=rs.getString("insurancenumber");
                                String tbData[]={carage,first_name,last_name,carmodel,carmileage,lastservice,typeofservice,insurancenumber};
                                DefaultTableModel tblModel= (DefaultTableModel)jTable2.getModel();
                                tblModel.addRow(tbData);

                        }

                } catch (SQLException e) {
                        e.printStackTrace();
                }
        }//GEN-LAST:event_jButton2ActionPerformed

        private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
		String username=jLabel14.getText();
                setVisible(false);
                new Caragecustom(username).setVisible(true);
        }//GEN-LAST:event_jButton3ActionPerformed

        private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
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

                        Paragraph paragraph1 = new Paragraph("Table: Car age under 5");
                        Paragraph paragraph2 = new Paragraph("Table: Car age between 5 and 10");
			Paragraph paragraph3 = new Paragraph("Table: Car age between 11 and 15");

                        PdfPTable table1=new PdfPTable(8);

                        table1.setWidthPercentage(105);
			table1.setSpacingBefore(11f);
			table1.setSpacingAfter(13f);
			paragraph2.setSpacingBefore(11f);
			
                        table1.addCell("Car Age");
                        table1.addCell("First Name");
                        table1.addCell("Last Name");
                        table1.addCell("Car Model");
                        table1.addCell("Car Mileage");
                        table1.addCell("Last Serviced");
                        table1.addCell("Type of Service");
                        table1.addCell("Insurance Number");


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

                                table1.addCell(FFN);
                                table1.addCell(GGN);
                                table1.addCell(KKN);
                                table1.addCell(LLN);
                                table1.addCell(MMN);
                                table1.addCell(NNN);
                                table1.addCell(OON);
                                table1.addCell(PPN);

                        }

                        PdfPTable table2=new PdfPTable(8);
			
			table2.setWidthPercentage(105);
			table2.setSpacingBefore(11f);
			table2.setSpacingAfter(13f);
			paragraph3.setSpacingBefore(11f);
			
                        table2.addCell("Car Age");
                        table2.addCell("First Name");
                        table2.addCell("Last Name");
                        table2.addCell("Car Model");
                        table2.addCell("Car Mileage");
                        table2.addCell("Last Serviced");
                        table2.addCell("Type of Service");
                        table2.addCell("Insurance Number");

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

                                table2.addCell(FN);
                                table2.addCell(GN);
                                table2.addCell(KN);
                                table2.addCell(LN);
                                table2.addCell(MN);
                                table2.addCell(NN);
                                table2.addCell(ON);
                                table2.addCell(PN);
                        }

			PdfPTable table3=new PdfPTable(8);
			
			table3.setWidthPercentage(105);
			table3.setSpacingBefore(11f);
			table3.setSpacingAfter(13f);
			
                        table3.addCell("Car Age");
                        table3.addCell("First Name");
                        table3.addCell("Last Name");
                        table3.addCell("Car Model");
                        table3.addCell("Car Mileage");
                        table3.addCell("Last Serviced");
                        table3.addCell("Type of Service");
                        table3.addCell("Insurance Number");

                        for (int r=0;r<jTable3.getRowCount();r++)
                        {

                                String fN=jTable3.getValueAt(r, 0).toString();
                                String gN=jTable3.getValueAt(r, 1).toString();
                                String kN=jTable3.getValueAt(r, 2).toString();
                                String lN=jTable3.getValueAt(r, 3).toString();
                                String mN=jTable3.getValueAt(r, 4).toString();
                                String nN=jTable3.getValueAt(r, 5).toString();
                                String oN=jTable3.getValueAt(r, 6).toString();
                                String pN=jTable3.getValueAt(r, 7).toString();

                                table3.addCell(fN);
                                table3.addCell(gN);
                                table3.addCell(kN);
                                table3.addCell(lN);
                                table3.addCell(mN);
                                table3.addCell(nN);
                                table3.addCell(oN);
                                table3.addCell(pN);
                        }

                        doc.add(paragraph1);
                        doc.add(table1);
                        doc.add(paragraph2);
                        doc.add(table2);
			doc.add(paragraph3);
			doc.add(table3);
                        JOptionPane.showMessageDialog(null,"Successfully generated");
                }
                catch(Exception e){
                        JOptionPane.showMessageDialog(null,"Error");
                }
                doc.close();
		}
        }//GEN-LAST:event_jButton6ActionPerformed

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
			java.util.logging.Logger.getLogger(CarAge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(CarAge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(CarAge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(CarAge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new CarAge().setVisible(true);
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
        private javax.swing.JButton jButton9;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel14;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JScrollPane jScrollPane5;
        private javax.swing.JScrollPane jScrollPane6;
        private javax.swing.JTable jTable1;
        private javax.swing.JTable jTable2;
        private javax.swing.JTable jTable3;
        private javax.swing.JTextField jTextField1;
        // End of variables declaration//GEN-END:variables
}
