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

public class Caragecustom extends javax.swing.JFrame {
        static final String DB_URL = "jdbc:mysql://localhost/csia";
	static final String USER = "root";
	static final String PASS = "root@123";

	public Caragecustom() {
		initComponents();
	}

	public Caragecustom(String username) {
		initComponents();
		jLabel14.setText(username);
		jButton6.setVisible(false);
		jLabel3.setVisible(false);
		jTextField3.setVisible(false);
	}

	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jLabel4 = new javax.swing.JLabel();
                jLabel1 = new javax.swing.JLabel();
                jTextField1 = new javax.swing.JTextField();
                jTextField2 = new javax.swing.JTextField();
                jLabel2 = new javax.swing.JLabel();
                jButton7 = new javax.swing.JButton();
                jButton8 = new javax.swing.JButton();
                jButton9 = new javax.swing.JButton();
                jScrollPane2 = new javax.swing.JScrollPane();
                jTable1 = new javax.swing.JTable();
                jLabel3 = new javax.swing.JLabel();
                jTextField3 = new javax.swing.JTextField();
                jButton6 = new javax.swing.JButton();
                jButton10 = new javax.swing.JButton();
                jLabel14 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setUndecorated(true);

                jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 45)); // NOI18N
                jLabel4.setText("Enter Custom Car Age");

                jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                jLabel1.setText("Starting Age");

                jTextField1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

                jTextField2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

                jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                jLabel2.setText("Ending Age");

                jButton7.setBackground(new java.awt.Color(0, 255, 255));
                jButton7.setFont(new java.awt.Font("Telugu MN", 1, 15)); // NOI18N
                jButton7.setText("Filter");
                jButton7.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton7ActionPerformed(evt);
                        }
                });

                jButton8.setBackground(new java.awt.Color(255, 0, 0));
                jButton8.setFont(new java.awt.Font("Kavivanar", 1, 13)); // NOI18N
                jButton8.setText("Back");
                jButton8.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton8ActionPerformed(evt);
                        }
                });

                jButton9.setBackground(new java.awt.Color(0, 0, 0));
                jButton9.setFont(new java.awt.Font("Kavivanar", 1, 13)); // NOI18N
                jButton9.setForeground(new java.awt.Color(255, 255, 255));
                jButton9.setText("Homepage");
                jButton9.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton9ActionPerformed(evt);
                        }
                });

                jTable1.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null, null, null, null, null}
                        },
                        new String [] {
                                "Car Age", "First Name", "Last Name", "Car Model", "Car Mileage", "Last Serviced", "Type of Service", "Insurance Number"
                        }
                ));
                jScrollPane2.setViewportView(jTable1);

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

                jLabel14.setFont(new java.awt.Font("Silom", 0, 13)); // NOI18N
                jLabel14.setText("Name");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(117, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGap(494, 494, 494)
                                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGap(479, 479, 479)
                                                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1092, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGap(372, 372, 372)
                                                        .addComponent(jLabel3)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jButton6)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(494, 494, 494)
                                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(113, 113, 113))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(448, 448, 448)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel1))
                                                .addGap(62, 62, 62)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                                        .addComponent(jTextField2))
                                                .addGap(49, 49, 49)
                                                .addComponent(jButton7))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(438, 438, 438)
                                                .addComponent(jLabel4))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addComponent(jLabel14)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel14)
                                .addGap(3, 3, 3)
                                .addComponent(jLabel4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(61, 61, 61)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel1))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel2)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(78, 78, 78)
                                                .addComponent(jButton7)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jButton8)
                                .addGap(18, 18, 18)
                                .addComponent(jButton9)
                                .addGap(18, 18, 18)
                                .addComponent(jButton10)
                                .addGap(42, 42, 42))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
		String username=jLabel14.getText();
                String first=jTextField1.getText();
                String last=jTextField2.getText();
		
		if(first.length()<=0 || last.length()<=0){
			JOptionPane.showMessageDialog(null,"Please complete both the fields");
		}
		
		else{
			int age1=Integer.parseInt(first);
			int age2=Integer.parseInt(last);	
		
			if (age1>=0 && age1<age2 && age2<=15){
				
		jButton6.setVisible(true);
		jLabel3.setVisible(true);
		jTextField3.setVisible(true);
                
		try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                        Statement stmt = conn.createStatement();
                ) {
			jTable1.setModel(new DefaultTableModel(null,new String []{"Car Age","First Name","Last Name","Car Model","Car Mileage","Last Serviced","Type of Service","Insurance Number"}));
                        String sql = "select carage, first_name, last_name, carmodel, carmileage, lastservice, typeofservice, insurancenumber from cars"+username+", customer"+username+" where cars"+username+".customerID=customer"+username+".customerID and carage<="+last+" and carage>="+first+"";
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
                                String tbbData[]={carage,first_name,last_name,carmodel,carmileage,lastservice,typeofservice,insurancenumber};
                                DefaultTableModel tbblModel= (DefaultTableModel)jTable1.getModel();
                                tbblModel.addRow(tbbData);

                        }

                } catch (SQLException e) {
                        e.printStackTrace();
                }
		}
			else{
				JOptionPane.showMessageDialog(null,"Car age must be between 0 to 15");
			}
		}
        }//GEN-LAST:event_jButton7ActionPerformed

        private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

		String username=jLabel14.getText();
                setVisible(false);
                new CarAge(username).setVisible(true);
        }//GEN-LAST:event_jButton8ActionPerformed

        private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
		String username=jLabel14.getText();
                setVisible(false);
                new homepage(username).setVisible(true);
        }//GEN-LAST:event_jButton9ActionPerformed

        private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
		String start=jTextField1.getText();
		String finish=jTextField2.getText();
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

                        Paragraph paragraph1 = new Paragraph("Table: Custom car age between "+start+" and "+finish+"");

                        PdfPTable table1=new PdfPTable(8);

                        table1.setWidthPercentage(105);
			table1.setSpacingBefore(11f);
			table1.setSpacingAfter(13f);
			
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
			java.util.logging.Logger.getLogger(Caragecustom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Caragecustom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Caragecustom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Caragecustom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Caragecustom().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton jButton10;
        private javax.swing.JButton jButton6;
        private javax.swing.JButton jButton7;
        private javax.swing.JButton jButton8;
        private javax.swing.JButton jButton9;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel14;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JTable jTable1;
        private javax.swing.JTextField jTextField1;
        private javax.swing.JTextField jTextField2;
        private javax.swing.JTextField jTextField3;
        // End of variables declaration//GEN-END:variables
}
