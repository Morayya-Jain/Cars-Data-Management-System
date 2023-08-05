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

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
 
import javax.swing.JFileChooser;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class Agegroupcustom extends javax.swing.JFrame {
        static final String DB_URL = "jdbc:mysql://localhost/csia";
	static final String USER = "root";
	static final String PASS = "root@123";

	public Agegroupcustom() {
		initComponents();
	}

        public Agegroupcustom(String username) {
		initComponents();
		jLabel14.setText(username);
		jButton10.setVisible(false);
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
                jScrollPane2 = new javax.swing.JScrollPane();
                jTable1 = new javax.swing.JTable();
                jButton8 = new javax.swing.JButton();
                jButton9 = new javax.swing.JButton();
                jLabel3 = new javax.swing.JLabel();
                jTextField3 = new javax.swing.JTextField();
                jButton10 = new javax.swing.JButton();
                jButton11 = new javax.swing.JButton();
                jLabel14 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setUndecorated(true);

                jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 45)); // NOI18N
                jLabel4.setText("Enter Custom Age");

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

                jTable1.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null, null, null, null, null, null}
                        },
                        new String [] {
                                "Age", "Car Model", "Car Mileage", "Car Age", "Date of Sale", "Last Serviced", "Type of Service", "Insurance Number", "Insurance Date"
                        }
                ));
                jScrollPane2.setViewportView(jTable1);

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

                jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                jLabel3.setText("Name");

                jTextField3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

                jButton10.setBackground(new java.awt.Color(153, 255, 153));
                jButton10.setFont(new java.awt.Font("Kavivanar", 1, 13)); // NOI18N
                jButton10.setText("Generate PDF");
                jButton10.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton10ActionPerformed(evt);
                        }
                });

                jButton11.setFont(new java.awt.Font("Kavivanar", 1, 13)); // NOI18N
                jButton11.setText("EXIT");
                jButton11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
                jButton11.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton11ActionPerformed(evt);
                        }
                });

                jLabel14.setFont(new java.awt.Font("Silom", 0, 13)); // NOI18N
                jLabel14.setText("Name");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 116, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(26, 26, 26)
                                                .addComponent(jButton10)
                                                .addGap(474, 474, 474))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1092, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(114, 114, 114))))
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
                                                .addGap(42, 42, 42)
                                                .addComponent(jButton7))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addComponent(jLabel14))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(471, 471, 471)
                                                .addComponent(jLabel4))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(588, 588, 588)
                                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(604, 604, 604)
                                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(602, 602, 602)
                                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(jLabel4)
                                                .addGap(62, 62, 62)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel1))
                                                .addGap(28, 28, 28))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton7)
                                                .addGap(4, 4, 4)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(jButton8)
                                .addGap(18, 18, 18)
                                .addComponent(jButton9)
                                .addGap(18, 18, 18)
                                .addComponent(jButton11)
                                .addGap(33, 33, 33))
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
		else {
			int age1=Integer.parseInt(first);
			int age2=Integer.parseInt(last);
			if (age1>=18 && age1<age2 && age2<=130){
			
				jButton10.setVisible(true);
				jLabel3.setVisible(true);
				jTextField3.setVisible(true);
				
				try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				
					Statement stmt = conn.createStatement();
					) {
					jTable1.setModel(new DefaultTableModel(null,new String []{"Age","Car Model","Car Mileage","Car Age","Date of Sale","Last Serviced","Type of Service","Insurance Number","Insurance Date"}));
					String sql = "select age,carmodel, carmileage, carage, dateofsale, lastservice, typeofservice, insurancenumber, insurancedate from customer"+username+", cars"+username+" where customer"+username+".customerID=cars"+username+".customerID and age<="+last+" and age>="+first+"";
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
				} 
				catch (SQLException e) {
					e.printStackTrace();
				}
			}
			else{
				JOptionPane.showMessageDialog(null,"Please enter a valid age");
			}
		}  
        }//GEN-LAST:event_jButton7ActionPerformed

        private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
                String username=jLabel14.getText();
                setVisible(false);
                new AgeGroup(username).setVisible(true);
        }//GEN-LAST:event_jButton8ActionPerformed

        private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
		String username=jLabel14.getText();
		setVisible(false);
		new homepage(username).setVisible(true);
        }//GEN-LAST:event_jButton9ActionPerformed

        private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
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

                        Paragraph paragraph1 = new Paragraph("Table: Custom customer age between "+start+" and "+finish+"");

                        PdfPTable tbbl=new PdfPTable(9);

                        tbbl.setWidthPercentage(105);
			tbbl.setSpacingBefore(11f);
			tbbl.setSpacingAfter(13f);
			
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
 
                        doc.add(paragraph1);
                        doc.add(tbbl);
                        JOptionPane.showMessageDialog(null,"Successfully generated");
                }
                catch(Exception e){
                        JOptionPane.showMessageDialog(null,"Error");
                }
                doc.close();
		}
        }//GEN-LAST:event_jButton10ActionPerformed

        private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

                int a=JOptionPane.showConfirmDialog(null,"Are you sure you want to close?","Select",JOptionPane.YES_NO_OPTION);
                if(a==0){
                        System.exit(0);
                }
        }//GEN-LAST:event_jButton11ActionPerformed

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
			java.util.logging.Logger.getLogger(Agegroupcustom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Agegroupcustom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Agegroupcustom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Agegroupcustom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Agegroupcustom().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton jButton10;
        private javax.swing.JButton jButton11;
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
