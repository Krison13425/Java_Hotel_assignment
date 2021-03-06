/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment;

import java.awt.event.KeyEvent;
import java.util.regex.*;
import java.io.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
public class F2Edit extends javax.swing.JFrame {
String Delimeter = "@#;";


    public F2Edit() {
        initComponents();
        TxtECN.setEditable(false);
        TxtECIC.setEditable(false);
        TxtERoom.setEditable(false);
        EDPID.setEnabled(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnDelete = new javax.swing.JButton();
        BtnEdit = new javax.swing.JButton();
        TxtECCN = new javax.swing.JTextField();
        EDPID = new com.toedter.calendar.JDateChooser();
        LblCCN1 = new javax.swing.JLabel();
        EDPOD = new com.toedter.calendar.JDateChooser();
        LblCCN2 = new javax.swing.JLabel();
        LblCN = new javax.swing.JLabel();
        LblIC = new javax.swing.JLabel();
        LblEM = new javax.swing.JLabel();
        BtnBack = new javax.swing.JButton();
        LblCCN = new javax.swing.JLabel();
        LblValidEM = new javax.swing.JLabel();
        LblRoom = new javax.swing.JLabel();
        TxtEEM = new javax.swing.JTextField();
        TxtERoom = new javax.swing.JTextField();
        BtnDelete1 = new javax.swing.JButton();
        TxtECIC = new javax.swing.JTextField();
        LblPT = new javax.swing.JLabel();
        TxtECN = new javax.swing.JTextField();

        BtnDelete.setText("Delete");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnEdit.setText("Edit");
        BtnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditActionPerformed(evt);
            }
        });

        TxtECCN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtECCNKeyPressed(evt);
            }
        });

        EDPID.setDateFormatString("dd-MM-yyyy");

        LblCCN1.setText("In Day:");

        EDPOD.setDateFormatString("dd-MM-yyyy");

        LblCCN2.setText("Out Day:");

        LblCN.setText("Customer Name :");

        LblIC.setText("Customer IC / Passport :");

        LblEM.setText("Customer E-mail:");

        BtnBack.setText("Back");
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });

        LblCCN.setText("Customer Contact Number:");

        LblValidEM.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        LblValidEM.setForeground(java.awt.Color.red);

        LblRoom.setText("Room:");

        TxtEEM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtEEMKeyReleased(evt);
            }
        });

        BtnDelete1.setText("Delete");
        BtnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDelete1ActionPerformed(evt);
            }
        });

        LblPT.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        LblPT.setText("F2 Edit");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(BtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TxtERoom, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(81, 81, 81)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(LblRoom))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(LblCCN1)
                                                .addComponent(LblCCN2))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(EDPID, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(155, 155, 155)
                                    .addComponent(EDPOD, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addComponent(BtnDelete1)
                        .addGap(55, 55, 55))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LblCCN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TxtECCN, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LblEM, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BtnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtEEM, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LblIC)
                                    .addComponent(LblCN, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TxtECN)
                                    .addComponent(TxtECIC, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LblValidEM, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(18, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LblPT)
                .addGap(266, 266, 266))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(LblPT, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblCN)
                    .addComponent(TxtECN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblIC)
                            .addComponent(TxtECIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblCCN)
                            .addComponent(TxtECCN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblEM)
                            .addComponent(TxtEEM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(LblValidEM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LblCCN1)
                    .addComponent(EDPID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(LblCCN2))
                    .addComponent(EDPOD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblRoom)
                    .addComponent(TxtERoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnEdit)
                    .addComponent(BtnBack)
                    .addComponent(BtnDelete1))
                .addGap(52, 52, 52))
        );

        getAccessibleContext().setAccessibleName("Floor 2 Edit Booking");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditActionPerformed

        if(EDPOD.getDate().before(EDPID.getDate())){
            JOptionPane.showMessageDialog(null, "Please insert the right date!!","Warning!!",JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (!LblValidEM.getText().trim().isEmpty())
        {
        JOptionPane.showMessageDialog(null, "Please insert correct Email format!!","Warning!!",JOptionPane.WARNING_MESSAGE);
            return;
        }

        String tempFile = "Temp.txt";
        
                String currentLine;
                String data[];
                SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy"); 
                
                String CN = TxtECN.getText();
                String CIC = TxtECIC.getText();
                String CC = TxtECCN.getText();
                String CEM = TxtEEM.getText();
                String InDay = date.format(EDPID.getDate());
                String OutDay = date.format(EDPOD.getDate());
                String Room = TxtERoom.getText();
                
                try
                {
                    FileWriter fw = new FileWriter(tempFile,true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    PrintWriter pw = new PrintWriter(bw);
                    
                    FileReader fr = new FileReader("F2Booking.Txt");
                    BufferedReader br =new BufferedReader(fr);
                    
                     while ((currentLine = br.readLine()) != null) {
                        data = currentLine.split(Delimeter);
                        if (!(data[1].equals(CIC))) {
                            pw.println(currentLine);
                        } else {
                            pw.println(CN + Delimeter + CIC +Delimeter+ CC + Delimeter+ CEM
                    + Delimeter + InDay +Delimeter + OutDay+ Delimeter+ Room +Delimeter);
                        }
                    }
                    pw.flush();
                    fr.close();
                    br.close();
                    fw.close();
                    pw.close();
                    bw.close();
   
                }
                catch (FileNotFoundException ex) {
           JOptionPane.showMessageDialog(null, "Error Occurred");
                
            }   catch (IOException ex) {
                    java.util.logging.Logger.getLogger(Floor1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                File oldFile = new File ("F2Booking.txt");
                File newFile = new File (tempFile);
            System.out.println(oldFile.exists());
                    if (oldFile.delete()) { 
                System.out.println("Deleted the file: " + oldFile.getName());
                } else {
                System.out.println("Failed to delete the file.");
                    }
                    
                   newFile.renameTo(new File("F2Booking.txt"));
                   
                JOptionPane.showMessageDialog(null, "Record Edited Sucessfully"); 
                
                   this.setVisible(false);
                   new Floor2().setVisible(true);
        

    }//GEN-LAST:event_BtnEditActionPerformed

    private void TxtECCNKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtECCNKeyPressed
        try {
        String Contact = TxtECCN.getText();
        int length = Contact.length(); 
        char c = evt.getKeyChar();

        
        if (c >= '0' && c <= '9') {
            
            if (length < 10) {
                
                TxtECCN.setEditable(true);
                
            } else {
                TxtECCN.setEditable(false);
            }
        } else {
           
            if (c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) {
               
                TxtECCN.setEditable(true);
            } else {
                TxtECCN.setEditable(false);
            }
        }
        }catch(NumberFormatException ex){
        }
    }//GEN-LAST:event_TxtECCNKeyPressed

    private void TxtEEMKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtEEMKeyReleased
        String PATTERN ="^[a-zA-Z0-9]{0,30}[@][a-zA-Z0-9]{0,10}[.][a-zA-Z]{0,3}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(TxtEEM.getText());
        if(!match.matches())
        {
            LblValidEM.setText("E-mail Structure Incorrect !!");
        }
        else{
            LblValidEM.setText("");
        }
    }//GEN-LAST:event_TxtEEMKeyReleased

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
        TxtECN.setText("");
        TxtECIC.setText("");
        TxtECCN.setText("");
        TxtEEM.setText("");
        EDPID.cleanup();
        EDPOD.cleanup();
        TxtERoom.setText("");

        this.setVisible(false);
        new Floor2().setVisible(true);
    }//GEN-LAST:event_BtnBackActionPerformed

    private void BtnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDelete1ActionPerformed
int n = JOptionPane.showConfirmDialog(null,"Are You sure that You will want to Delete this record ?","Delete Record",JOptionPane.YES_NO_OPTION);
    if(n==JOptionPane.YES_OPTION){
        String tempFile = "Temp.txt";
        
                String currentLine;
                String data[];
                SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy"); 
                
                String CN = TxtECN.getText();
                try
                {
                    FileWriter fw = new FileWriter(tempFile,true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    PrintWriter pw = new PrintWriter(bw);
                    
                    FileReader fr = new FileReader("F2Booking.Txt");
                    BufferedReader br =new BufferedReader(fr);
                    
                     while ((currentLine = br.readLine()) != null) {
                        data = currentLine.split(Delimeter);
                        if (!(data[0].equals(CN))) {
                            pw.println(currentLine);
                        } 
                    }
                    pw.flush();
                    fr.close();
                    br.close();
                    fw.close();
                    pw.close();
                    bw.close();
   
                }
                catch (FileNotFoundException ex) {
           JOptionPane.showMessageDialog(null, "Error Occurred");
                
            }   catch (IOException ex) {
                    java.util.logging.Logger.getLogger(Floor1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                File oldFile = new File ("F2Booking.txt");
                File newFile = new File (tempFile);
            System.out.println(oldFile.exists());
                    if (oldFile.delete()) { 
                System.out.println("Deleted the file: " + oldFile.getName());
                } else {
                System.out.println("Failed to delete the file.");
                    }
                    
                   newFile.renameTo(new File("F2Booking.txt"));
                   
                JOptionPane.showMessageDialog(null, "Record Deleted Sucessfully"); 
                
                   this.setVisible(false);
                   new Floor2().setVisible(true);
    }
    }//GEN-LAST:event_BtnDelete1ActionPerformed

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
            java.util.logging.Logger.getLogger(F2Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F2Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F2Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F2Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new F2Edit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBack;
    private javax.swing.JButton BtnDelete;
    private javax.swing.JButton BtnDelete1;
    private javax.swing.JButton BtnEdit;
    public com.toedter.calendar.JDateChooser EDPID;
    public com.toedter.calendar.JDateChooser EDPOD;
    private javax.swing.JLabel LblCCN;
    private javax.swing.JLabel LblCCN1;
    private javax.swing.JLabel LblCCN2;
    private javax.swing.JLabel LblCN;
    private javax.swing.JLabel LblEM;
    private javax.swing.JLabel LblIC;
    private javax.swing.JLabel LblPT;
    private javax.swing.JLabel LblRoom;
    private javax.swing.JLabel LblValidEM;
    public javax.swing.JTextField TxtECCN;
    public javax.swing.JTextField TxtECIC;
    public javax.swing.JTextField TxtECN;
    public javax.swing.JTextField TxtEEM;
    public javax.swing.JTextField TxtERoom;
    // End of variables declaration//GEN-END:variables
}
