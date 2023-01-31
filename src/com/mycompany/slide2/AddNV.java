/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.slide2;

import com.mycompany.slide2.demo.NewClassListQLNV;
import java.awt.Frame;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author leanh
 */
public class AddNV extends javax.swing.JFrame {
private ArrayList<NewClassListQLNV> list = new ArrayList<>();
    /**
     * Creates new form AddNV
     */
    private ListNhanVien home;
    
    public AddNV(Frame parent, boolean modal) {
        
        initComponents();
        home = (ListNhanVien) parent;
        this.setLocationRelativeTo(null);
    }

    private AddNV() {
        throw new UnsupportedOperationException("Not supported yet."); 
// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        lbDateTime = new javax.swing.JLabel();
        lbnumberphone = new javax.swing.JLabel();
        lbHeso = new javax.swing.JLabel();
        lbLuong = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        TFName = new javax.swing.JTextField();
        TFDateTime = new javax.swing.JTextField();
        TFNumberPhone = new javax.swing.JTextField();
        TFHeSo = new javax.swing.JTextField();
        TFLuong = new javax.swing.JTextField();
        btSave = new javax.swing.JButton();
        btExit = new javax.swing.JButton();
        lbRoom = new javax.swing.JLabel();
        TFRoom = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setText("Thêm Nhân Viên");

        lbName.setText("HỌ TÊN");

        lbDateTime.setText("NGÀY SINH");

        lbnumberphone.setText("SỐ ĐT");

        lbHeso.setText("HỆ SỐ");

        lbLuong.setText("LƯƠNG");

        btSave.setText("Lưu");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        btExit.setText("Thoát");
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });

        lbRoom.setText("PHÒNG");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbLuong)
                            .addComponent(lbHeso)
                            .addComponent(lbnumberphone)
                            .addComponent(lbDateTime)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbRoom)
                                .addComponent(lbName)))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btSave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                                .addComponent(btExit))
                            .addComponent(TFName)
                            .addComponent(TFDateTime)
                            .addComponent(TFNumberPhone)
                            .addComponent(TFHeSo)
                            .addComponent(TFLuong)
                            .addComponent(TFRoom))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRoom)
                    .addComponent(TFRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFDateTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbDateTime))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TFNumberPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TFHeSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbHeso))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TFLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbLuong))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btSave)
                                    .addComponent(btExit)))
                            .addComponent(lbnumberphone)))
                    .addComponent(lbName))
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        if(TFRoom.getText().equals("")){
            sb.append("Nhập phòng!\n");
        }
        
        if(TFName.getText().equals("")){
            sb.append("Nhập họ tên!\n");
        }
        
        if(TFDateTime.getText().equals("")){
            sb.append("Nhập ngày tháng!\n");
        }
        
        if(TFNumberPhone.getText().equals("")){
            sb.append("Nhập SĐT!\n");
        }
        
        if(TFHeSo.getText().equals("")){
            sb.append("Nhập hệ số!\n");
        }
        
        if(TFLuong.getText().equals("")){
            sb.append("Nhập lương!\n");
        }
        
        if(sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb.toString(),
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        NewClassListQLNV nv = new NewClassListQLNV();
        nv.setNVID(TFRoom.getText());
        nv.setName(TFName.getText());
        nv.setDatetime(TFDateTime.getText());
        nv.setNumberPhone(TFNumberPhone.getBaseline(WIDTH, HEIGHT));
        nv.setCoefficient(TFHeSo.getAlignmentX());
        nv.setSalary(TFLuong.getAlignmentX());
        list.add(nv);
        
        String Room ="", Name ="", DateTime ="";
        int NumberPhone = 0;
        float HeSo = 0, Luong = 0;
        boolean test = true;
        
        Room = TFRoom.getText();
        Name = TFName.getText();
        DateTime = TFDateTime.getText();
        
        
        try {
            NumberPhone = Integer.parseInt(TFNumberPhone.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, 
                    "Bắt buộc phải nhập SĐT !");
            test = false;
        }
            
        try {
            HeSo = Float.parseFloat(TFHeSo.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, 
                    "Bắt buộc phải nhập Hệ Số !");
            test = false;
        }
            
        try {
            Luong = Float.parseFloat(TFLuong.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, 
                    "Bắt buộc phải nhập Lương!");
            test = false;
        }
        if(test) {
            NewClassListQLNV cl = new NewClassListQLNV(Room,Name,
                    DateTime, NumberPhone,HeSo,Luong );
            home.addNV(cl);
            
        }
        TFRoom.setText("");
        TFName.setText("");
        TFDateTime.setText("");
        TFNumberPhone.setText("");
        TFHeSo.setText("");
        TFLuong.setText("");
       
        
        
        
        
    }//GEN-LAST:event_btSaveActionPerformed

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btExitActionPerformed

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
            java.util.logging.Logger.getLogger(AddNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TFDateTime;
    private javax.swing.JTextField TFHeSo;
    private javax.swing.JTextField TFLuong;
    private javax.swing.JTextField TFName;
    private javax.swing.JTextField TFNumberPhone;
    private javax.swing.JTextField TFRoom;
    private javax.swing.JButton btExit;
    private javax.swing.JButton btSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbDateTime;
    private javax.swing.JLabel lbHeso;
    private javax.swing.JLabel lbLuong;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbRoom;
    private javax.swing.JLabel lbnumberphone;
    // End of variables declaration//GEN-END:variables

   

   
}
