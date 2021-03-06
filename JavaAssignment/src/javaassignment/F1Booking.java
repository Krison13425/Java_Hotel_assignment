/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment;


import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.regex.*;
import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Kriso
 */
public class F1Booking extends javax.swing.JFrame {
String Delimeter = "@#;";

private String[] room = {"F1R1","F1R2","F1R3","F1R4","F1R5","F1R6","F1R7","F1R8","F1F9","F1F10"};

 private void addComboboxData(Date date, Date outdate) throws ParseException{
     
CbRoom.removeAllItems();
     
    if(date == null || outdate == null ){
       return;
       }
            
     for(int count = 0; count<room.length; count++ ){
     
         
     List<Booking> bookingList = new ArrayList<Booking>();
     
     boolean available=true;

     try{
            File Flist = new File("F1Booking.txt");         
            Scanner sc1 = new Scanner(Flist);
            
            while(sc1.hasNextLine()){
               
               String Line = sc1.nextLine();
               String[] wordsinLine = Line.split(Delimeter);
               
               bookingList.add(new Booking(wordsinLine[0],wordsinLine[1],wordsinLine[2],wordsinLine[3],wordsinLine[4],wordsinLine[5],wordsinLine[6]));
                
               for (int i = 0; i  < bookingList.size(); i++) {
                  

           Date starting = new SimpleDateFormat("dd-MM-yyyy").parse(bookingList.get(i).GetInday());
           Date ending = new SimpleDateFormat("dd-MM-yyyy").parse(bookingList.get(i).GetOutday());
           
           
           
            if(bookingList.get(i).GetRoom().equals(room[count])){
                
                if(!date.before(starting)&&!outdate.after(ending)) available = false;
                if(!date.after(starting)&&!outdate.before(starting)&&!date.equals(outdate)) available = false;
                if(!date.after(starting)&&!outdate.before(ending)&&!date.equals(outdate)) available = false;
                if(!date.after(ending)&&!outdate.before(ending)&&!date.equals(outdate)) available = false;

            }
            }
            }
            if(available){
            CbRoom.addItem(room[count]);
            }
            sc1.close();
        
     }catch (FileNotFoundException ex) {
           JOptionPane.showMessageDialog(null, "Error Occurred");  
                }
 }
     }
 
    public F1Booking() {
        initComponents();
        
        
      
       DPID.getDateEditor().addPropertyChangeListener(new PropertyChangeListener() {
       
           @Override
           public void propertyChange(PropertyChangeEvent e) {
            if ("date".equals(e.getPropertyName())) {
            
            try {
                addComboboxData((Date) e.getNewValue(), DPOD.getDate());
            } catch (ParseException ex) {
                Logger.getLogger(F1Booking.class.getName()).log(Level.SEVERE, null, ex);
            }}
        }
    });
       DPOD.getDateEditor().addPropertyChangeListener(new PropertyChangeListener() {
       
           @Override
           public void propertyChange(PropertyChangeEvent e) {
          if ("date".equals(e.getPropertyName())) {
            try {
                addComboboxData(DPID.getDate(), (Date)e.getNewValue());
            }
            catch (ParseException ex) {
                Logger.getLogger(F1Booking.class.getName()).log(Level.SEVERE, null, ex);
            }
          }
            
            
        }
    });
       

        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LblCN = new javax.swing.JLabel();
        LblIC = new javax.swing.JLabel();
        LblEM = new javax.swing.JLabel();
        LblCCN = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        LblRoom = new javax.swing.JLabel();
        CbRoom = new javax.swing.JComboBox<>();
        BtnCreate = new javax.swing.JButton();
        TxtCCN = new javax.swing.JTextField();
        LblCCN1 = new javax.swing.JLabel();
        LblCCN2 = new javax.swing.JLabel();
        LblPT = new javax.swing.JLabel();
        LblValidCN = new javax.swing.JLabel();
        TxtCN = new javax.swing.JTextField();
        TxtEM = new javax.swing.JTextField();
        DPID = new com.toedter.calendar.JDateChooser();
        DPOD = new com.toedter.calendar.JDateChooser();
        BtnBack = new javax.swing.JButton();
        LblValidEM = new javax.swing.JLabel();
        TxtCIC = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LblCN.setText("Customer Name :");

        LblIC.setText("Customer IC / Passport :");

        LblEM.setText("Customer E-mail:");

        LblCCN.setText("Customer Contact Number:");

        LblRoom.setText("Room:");

        CbRoom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Room-" }));

        BtnCreate.setText("Create");
        BtnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCreateActionPerformed(evt);
            }
        });

        TxtCCN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtCCNKeyPressed(evt);
            }
        });

        LblCCN1.setText("In Day:");

        LblCCN2.setText("Out Day:");

        LblPT.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        LblPT.setText("F1 Booking");

        LblValidCN.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        LblValidCN.setForeground(java.awt.Color.red);

        TxtCN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtCNKeyReleased(evt);
            }
        });

        TxtEM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtEMKeyReleased(evt);
            }
        });

        DPID.setDateFormatString("dd-MM-yyyy");

        DPOD.setDateFormatString("dd-MM-yyyy");

        BtnBack.setText("Back");
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });

        LblValidEM.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        LblValidEM.setForeground(java.awt.Color.red);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel5)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
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
                                        .addComponent(DPID, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CbRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DPOD, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 156, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LblCCN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TxtCCN, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LblIC)
                                .addGap(10, 10, 10)
                                .addComponent(TxtCIC, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LblEM, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TxtEM, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LblCN, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblPT)
                                    .addComponent(TxtCN, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblValidCN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LblValidEM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(BtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(BtnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(LblPT, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblCN)
                            .addComponent(TxtCN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblValidCN, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblIC)
                            .addComponent(TxtCIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblCCN)
                            .addComponent(TxtCCN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblEM)
                            .addComponent(TxtEM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(LblValidEM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LblCCN1)
                    .addComponent(DPID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(LblCCN2))
                    .addComponent(DPOD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblRoom)
                    .addComponent(CbRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCreate)
                    .addComponent(BtnBack))
                .addGap(46, 46, 46))
        );

        TxtCIC.getAccessibleContext().setAccessibleName("Floor 1 Create Booking");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCreateActionPerformed
       if (TxtCN.getText().trim().isEmpty()&&TxtCIC.getText().trim().isEmpty()&&
           TxtCCN.getText().trim().isEmpty()&&TxtEM.getText().trim().isEmpty()&&
           DPID.getDate()== null && DPOD.getDate()== null&&CbRoom.getSelectedItem()=="-Room-")
        {
            JOptionPane.showMessageDialog(null, "Booking Detials incomplete Please input Booking Detials","Warning!!",JOptionPane.WARNING_MESSAGE);
        return;
        }
        
        
        if (TxtCN.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Booking Detials incomplete Please insert Customer Name","Warning!!",JOptionPane.WARNING_MESSAGE);
        return;
        }
        
         if (TxtCIC.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Booking Detials incomplete Please insert Customer IC or Passport","Warning!!",JOptionPane.WARNING_MESSAGE);
        return;
        }
         
          if (TxtCCN.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Booking Detials incomplete Please insert Customer Contact Number","Warning!!",JOptionPane.WARNING_MESSAGE);
        return;
        }
           if (TxtEM.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Booking Detials incomplete Please insert Customer Email","Warning!!",JOptionPane.WARNING_MESSAGE);
        return;
        }
           if (DPID.getDate()== null)
        {
            JOptionPane.showMessageDialog(null, "Booking Detials incomplete Please select a CheckIn Date","Warning!!",JOptionPane.WARNING_MESSAGE);
        return;
        }
           
           if (DPOD.getDate()== null)
        {
            JOptionPane.showMessageDialog(null, "Booking Detials incomplete Please select a CheckOut Date","Warning!!",JOptionPane.WARNING_MESSAGE);
        return;
        }
           
           if (CbRoom.getSelectedItem()=="-Room-")
        {
            JOptionPane.showMessageDialog(null, "Booking Detials incomplete Please select a room","Warning!!",JOptionPane.WARNING_MESSAGE);
        return;
        }
        
        DateFormat d = new SimpleDateFormat("dd-MM-yyyy");
        String output = d.format(new Date());
    try {
        if(DPID.getDate().before(d.parse(output))||DPOD.getDate().before(DPID.getDate())){
            JOptionPane.showMessageDialog(null, "Please insert the right date!!","Warning!!",JOptionPane.WARNING_MESSAGE);
            return;
        }      
    } catch (ParseException ex) {
        Logger.getLogger(F1Booking.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    
        if (!LblValidCN.getText().trim().isEmpty())
        {
        JOptionPane.showMessageDialog(null, "Please insert correct Naming format!!","Warning!!",JOptionPane.WARNING_MESSAGE);
            return;
        }

        
        if (!LblValidEM.getText().trim().isEmpty())
        {
        JOptionPane.showMessageDialog(null, "Please insert correct Email format!!","Warning!!",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
        String CN = TxtCN.getText();
        String CIC = TxtCIC.getText();
        String CC = TxtCCN.getText();
        String CEM = TxtEM.getText();
        String InDay = date.format(DPID.getDate());
        String OutDay = date.format(DPOD.getDate());
        String Room = String.valueOf(CbRoom.getSelectedItem());
        
        
        
        Booking Createbooking = new Booking(CN,CIC,CC,CEM,InDay,OutDay,Room);
        
        if(Createbooking.save())
            {
            JOptionPane.showMessageDialog(null, "Booking Created Successfully");
            this.setVisible(false);
            new Floor1().setVisible(true);
            }
        
    }//GEN-LAST:event_BtnCreateActionPerformed

    private void TxtCCNKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCCNKeyPressed
 try {
        String CustomerContact = TxtCCN.getText();
        
        int length = CustomerContact.length(); 
        char c = evt.getKeyChar();

        
        if (c >= '0' && c <= '9') {
            
            if (length < 10) {
                
                TxtCCN.setEditable(true);
                
            } else {
                TxtCCN.setEditable(false);
            }
        } else {
           
            if (c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) {
               
                TxtCCN.setEditable(true);
            } else {
                TxtCCN.setEditable(false);
            }
        }
        
        }catch(NumberFormatException ex){
        }
    
    }//GEN-LAST:event_TxtCCNKeyPressed

    private void TxtCNKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCNKeyReleased
      String PATTERN ="^[a-zA-Z- ]{0,30}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(TxtCN.getText());
        if(!match.matches())
        {
        LblValidCN.setText("Naming Structure Incorrect !!");
        }
        else{
        LblValidCN.setText("");
        }
    }//GEN-LAST:event_TxtCNKeyReleased

    private void TxtEMKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtEMKeyReleased
        String PATTERN ="^[a-zA-Z0-9]{0,30}[@][a-zA-Z]{0,10}[.][com]{0,3}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(TxtEM.getText());
        if(!match.matches())
        {
       LblValidEM.setText("E-mail Structure Incorrect !!");
        }
        else{
            LblValidEM.setText("");
        }
    }//GEN-LAST:event_TxtEMKeyReleased

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
        TxtCN.setText("");
        TxtCIC.setText("");
        TxtCCN.setText("");
        TxtEM.setText("");
        DPID.cleanup();
        DPOD.cleanup();
        CbRoom.removeAllItems();
        
     this.setVisible(false);
     new Floor1().setVisible(true);
    }//GEN-LAST:event_BtnBackActionPerformed

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
            java.util.logging.Logger.getLogger(F1Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F1Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F1Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F1Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new F1Booking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBack;
    private javax.swing.JButton BtnCreate;
    private javax.swing.JComboBox<String> CbRoom;
    private com.toedter.calendar.JDateChooser DPID;
    private com.toedter.calendar.JDateChooser DPOD;
    private javax.swing.JLabel LblCCN;
    private javax.swing.JLabel LblCCN1;
    private javax.swing.JLabel LblCCN2;
    private javax.swing.JLabel LblCN;
    private javax.swing.JLabel LblEM;
    private javax.swing.JLabel LblIC;
    private javax.swing.JLabel LblPT;
    private javax.swing.JLabel LblRoom;
    private javax.swing.JLabel LblValidCN;
    private javax.swing.JLabel LblValidEM;
    private javax.swing.JTextField TxtCCN;
    private javax.swing.JTextField TxtCIC;
    private javax.swing.JTextField TxtCN;
    private javax.swing.JTextField TxtEM;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
