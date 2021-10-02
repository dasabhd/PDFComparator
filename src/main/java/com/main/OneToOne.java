/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main;

import de.redsix.pdfcompare.CompareResult;
import de.redsix.pdfcompare.PdfComparator;

import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

import com.utilities.GetFileName;

/**
 *
 * @author Abhishek Das
 */
public class OneToOne extends javax.swing.JFrame {

    /**
     * Creates new form OneToOne
     */
    public OneToOne() {
        initComponents();
        ImageIcon image = new ImageIcon("E:\\Project Pics\\PDFMainIcon.png");
        this.setIconImage(image.getImage());
    }
    
    private CompareResult result = null;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        basePDF = new java.awt.TextField();
        Browse1 = new java.awt.Button();
        testPDF = new java.awt.TextField();
        Browse2 = new java.awt.Button();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        MatchedPDF = new java.awt.TextField();
        Browse3 = new java.awt.Button();
        jLabel4 = new javax.swing.JLabel();
        MismatchPDF1 = new java.awt.TextField();
        Browse4 = new java.awt.Button();
        Compare = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("One To One Comparison");
        setBackground(new java.awt.Color(0, 153, 153));
        setFocusable(false);
        setName("OneToOne"); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Enter Path Of Test PDF");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Enter Path Of Base PDF");

        basePDF.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        basePDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basePDFActionPerformed(evt);
            }
        });

        Browse1.setActionCommand("Browse1");
        Browse1.setBackground(new java.awt.Color(204, 204, 255));
        Browse1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Browse1.setLabel("Browse");
        Browse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Browse1ActionPerformed(evt);
            }
        });

        testPDF.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        testPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testPDFActionPerformed(evt);
            }
        });

        Browse2.setActionCommand("Browse1");
        Browse2.setBackground(new java.awt.Color(204, 204, 255));
        Browse2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Browse2.setLabel("Browse");
        Browse2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Browse2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(testPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Browse2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(basePDF, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Browse1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(basePDF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Browse1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(testPDF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Browse2, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Enter Path Of Match PDF");

        MatchedPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MatchedPDFActionPerformed(evt);
            }
        });

        Browse3.setBackground(new java.awt.Color(204, 204, 255));
        Browse3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        Browse3.setLabel("Browse");
        Browse3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Browse3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Enter Path Of Mismatch PDF");

        MismatchPDF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MismatchPDF1ActionPerformed(evt);
            }
        });

        Browse4.setBackground(new java.awt.Color(204, 204, 255));
        Browse4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        Browse4.setLabel("Browse");
        Browse4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Browse4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(452, 452, 452)
                        .addComponent(Browse3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(36, 36, 36)
                        .addComponent(MatchedPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(Browse4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel4)
                    .addContainerGap(304, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(249, Short.MAX_VALUE)
                    .addComponent(MismatchPDF1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(91, 91, 91)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Browse3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MatchedPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Browse4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 38, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(105, 105, 105)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(MismatchPDF1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(105, 105, 105)))
        );

        Compare.setBackground(new java.awt.Color(0, 0, 0));
        Compare.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 14)); // NOI18N
        Compare.setForeground(new java.awt.Color(255, 51, 51));
        Compare.setLabel("Compare");
        Compare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					CompareActionPerformed(evt);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(Compare, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(Compare, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void basePDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basePDFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_basePDFActionPerformed

    private void testPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testPDFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_testPDFActionPerformed

    private void Browse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Browse1ActionPerformed
        // TODO add your handling code here:
    	JFileChooser chooser = new JFileChooser("C:\\");
    	chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
    	int response = chooser.showOpenDialog(null);
    	
    	if(response==JFileChooser.APPROVE_OPTION) {
    		File file = chooser.getSelectedFile();
    		String fileID = file.getAbsolutePath();
    		basePDF.setText(fileID);
    	}
    	
    }//GEN-LAST:event_Browse1ActionPerformed

    private void MatchedPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatchedPDFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MatchedPDFActionPerformed

    private void MismatchPDF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MismatchPDF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MismatchPDF1ActionPerformed

    private void CompareActionPerformed(java.awt.event.ActionEvent evt) throws IOException {//GEN-FIRST:event_CompareActionPerformed
        // TODO add your handling code here:
        String basePdfLocation = basePDF.getText();
        String testPDFLocation = testPDF.getText();
        
        String mismatchPdfLocation = MismatchPDF1.getText();
        String matchedPdfLocation = MatchedPDF.getText();
        
        String fileName1 = GetFileName.getFileName(basePdfLocation);
        
        String fileName2 = GetFileName.getFileName(testPDFLocation);
        
        result = new PdfComparator(basePdfLocation,testPDFLocation).compare();
        
        if(result.isNotEqual())
        {
        	result.writeTo(mismatchPdfLocation+"\\Comapare["+fileName1+"_"+fileName2+"]");
        }
        
        if(result.isEqual()) {
        	result.writeTo(matchedPdfLocation+"\\Comapare["+fileName1+"_"+fileName2+"]");
        }
        
        
    }//GEN-LAST:event_CompareActionPerformed

    private void Browse2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Browse2ActionPerformed
        // TODO add your handling code here:
    	JFileChooser chooser = new JFileChooser("C:\\");
    	chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
    	int response = chooser.showOpenDialog(null);
    	
    	if(response==JFileChooser.APPROVE_OPTION) {
    		File file = chooser.getSelectedFile();
    		String fileID = file.getAbsolutePath();
    		testPDF.setText(fileID);
    	}
    }//GEN-LAST:event_Browse2ActionPerformed

    private void Browse3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Browse3ActionPerformed
        // TODO add your handling code here:
    	JFileChooser chooser = new JFileChooser("C:\\");
    	chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
    	int response = chooser.showOpenDialog(null);
    	
    	if(response==JFileChooser.APPROVE_OPTION) {
    		File file = chooser.getSelectedFile();
    		String fileID = file.getAbsolutePath();
    		MismatchPDF1.setText(fileID);
    	}
    }//GEN-LAST:event_Browse3ActionPerformed

    private void Browse4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Browse4ActionPerformed
        // TODO add your handling code here:
    	JFileChooser chooser = new JFileChooser("C:\\");
    	chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
    	int response = chooser.showOpenDialog(null);
    	
    	if(response==JFileChooser.APPROVE_OPTION) {
    		File file = chooser.getSelectedFile();
    		String fileID = file.getAbsolutePath();
    		MatchedPDF.setText(fileID);
    	}
    }//GEN-LAST:event_Browse4ActionPerformed

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
            java.util.logging.Logger.getLogger(OneToOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OneToOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OneToOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OneToOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OneToOne().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button Browse1;
    private java.awt.Button Browse2;
    private java.awt.Button Browse3;
    private java.awt.Button Browse4;
    private java.awt.Button Compare;
    private java.awt.TextField MatchedPDF;
    private java.awt.TextField MismatchPDF1;
    private java.awt.TextField basePDF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.TextField testPDF;
    // End of variables declaration//GEN-END:variables
}
