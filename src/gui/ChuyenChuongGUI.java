/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Element.HeoELE;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import Business.ChuyenChuongBUS;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author cuhoa_000
 */
public class ChuyenChuongGUI extends javax.swing.JFrame {

    /**
     * Creates new form ChuyenChuongGUI
     */
    ArrayList <String> lstMaLoaiChuong=new ArrayList();
    private static ChuyenChuongGUI obj=null;
    public static ChuyenChuongGUI getObj(String sLoaiChuong, String sIdChuong, ArrayList<HeoELE> lstHeo)
    {
        if(obj==null)
        {
            obj=new ChuyenChuongGUI(sLoaiChuong,sIdChuong,lstHeo);
        }
        return obj;
    }
    public ChuyenChuongGUI() {
        initComponents();
    }
    public ChuyenChuongGUI(String sLoaiChuong, String sIdMaChuong, ArrayList<HeoELE> lstHeo)
    {
        initComponents();
        
        lbLoaiChuong.setText(sLoaiChuong);
        lbChuongHienTai.setText(sIdMaChuong);
        //add info in tableThongTinHeo
        DefaultTableModel model=(DefaultTableModel)tbThongTinHeo.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        for(int i=0;i<lstHeo.size();i++)
        {
            Vector vector=new Vector();
            vector.add(i+1);
            vector.add(lstHeo.get(i).getMaHeo());
            vector.add(lstHeo.get(i).getTinhTrang());
            vector.add(lstHeo.get(i).getGiaNhap());
            vector.add(lstHeo.get(i).getHeoMe());
            vector.add(lstHeo.get(i).getHeoCha());
            vector.add(lstHeo.get(i).getXuatXu());
           model.addRow(vector);;
        }
        
        showComboLoaiChuong();
    }
    private void showComboLoaiChuong()
    {
        lstMaLoaiChuong.clear();
        cbLoaiChuong.removeAllItems();
        ChuyenChuongBUS objLoaiChuong=new ChuyenChuongBUS();
        ResultSet rs=objLoaiChuong.getLoaiMaChuong();
        try
        {
            while(rs.next())
            {
                cbLoaiChuong.addItem(rs.getString("TenLoaiChuong"));
                lstMaLoaiChuong.add(rs.getString("MaLoaiChuong"));
            }
        }
        catch(SQLException exc)
        {
            System.out.println("Loi o showComboLoaiChuong "+exc);
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbThongTinHeo = new javax.swing.JTable();
        lbChuongHienTaiLa = new javax.swing.JLabel();
        lbLoaiChuong = new javax.swing.JLabel();
        dateC = new com.toedter.calendar.JDateChooser();
        cbChuong = new javax.swing.JComboBox<>();
        lbChuongMoi = new javax.swing.JLabel();
        lbChuongHienTai = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbLoaiChuong = new javax.swing.JComboBox<>();
        lbLoaiChuongMoi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Thông tin heo");

        tbThongTinHeo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Stt", "Mã Heo", "Tình Trạng", "Giá Nhập", "Heo Mẹ", "Heo Cha", "Xuất Xứ"
            }
        ));
        jScrollPane1.setViewportView(tbThongTinHeo);

        lbChuongHienTaiLa.setText("Chuồng hiện tại:");

        lbLoaiChuong.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbLoaiChuong.setForeground(new java.awt.Color(0, 182, 121));
        lbLoaiChuong.setText("Ten Loai Chuong");

        dateC.setDateFormatString("yyyy-MM-dd\n");

        cbChuong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lbChuongMoi.setText("Chuồng mới:");

        lbChuongHienTai.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbChuongHienTai.setText("jLabel5");

        jLabel6.setBackground(new java.awt.Color(204, 204, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 102));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/Checked_48px.png"))); // NOI18N
        jLabel6.setText("Xác nhận");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        cbLoaiChuong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbLoaiChuong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cbLoaiChuongMouseReleased(evt);
            }
        });

        lbLoaiChuongMoi.setText("Loại chuồng mới");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbLoaiChuong, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dateC, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbChuongHienTaiLa)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbChuongHienTai)
                                    .addGap(23, 23, 23)
                                    .addComponent(lbLoaiChuongMoi)
                                    .addGap(2, 2, 2)
                                    .addComponent(cbLoaiChuong, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lbChuongMoi)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbChuong, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(8, 8, 8)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jLabel6)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(dateC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbLoaiChuong, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbChuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbChuongHienTaiLa)
                    .addComponent(lbChuongMoi)
                    .addComponent(lbChuongHienTai)
                    .addComponent(cbLoaiChuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbLoaiChuongMoi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showComboChuong()
    {
        ChuyenChuongBUS objChuong=new ChuyenChuongBUS();
        cbChuong.removeAllItems();
        String sId=lstMaLoaiChuong.get(cbLoaiChuong.getSelectedIndex());
        ResultSet rs=objChuong.getMaChuong(sId);
        try
        {
            while(rs.next())
            {
                cbChuong.addItem(rs.getString("MaChuong"));
                
            }
        }
        catch(SQLException exc)
        {
            System.out.println(" Loi o showcomboChuong ChuyenChuongGUI "+exc);
        }
        
    }
    
    private void cbLoaiChuongMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbLoaiChuongMouseReleased
        // TODO add your handling code here:
        showComboChuong();
    }//GEN-LAST:event_cbLoaiChuongMouseReleased

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        ChuyenChuongBUS objCHeo=new ChuyenChuongBUS();
        int iCheck=0;
        for(int i=0;i<tbThongTinHeo.getRowCount();i++)
        {
            String sMaHeo=(String) tbThongTinHeo.getValueAt(i, 1);
            String MaChuong=(String) cbChuong.getSelectedItem();
            String sDate=((JTextField)dateC.getDateEditor().getUiComponent()).getText();
            try {
                if(objCHeo.InsertChuyenChuong(sMaHeo, MaChuong, sDate))
                    iCheck++;
            } catch (SQLException ex) {
                Logger.getLogger(ChuyenChuongGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(iCheck==tbThongTinHeo.getRowCount())
        {
             JOptionPane.showMessageDialog(null, "Chuyên chuồng thành công",
                  "THÔNG BÁO", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
             JOptionPane.showMessageDialog(null, "Chuyển chuồng thất bại",
                  "THÔNG BÁO", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jLabel6MouseClicked

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
            java.util.logging.Logger.getLogger(ChuyenChuongGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChuyenChuongGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChuyenChuongGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChuyenChuongGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChuyenChuongGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbChuong;
    private javax.swing.JComboBox<String> cbLoaiChuong;
    private com.toedter.calendar.JDateChooser dateC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbChuongHienTai;
    private javax.swing.JLabel lbChuongHienTaiLa;
    private javax.swing.JLabel lbChuongMoi;
    private javax.swing.JLabel lbLoaiChuong;
    private javax.swing.JLabel lbLoaiChuongMoi;
    private javax.swing.JTable tbThongTinHeo;
    // End of variables declaration//GEN-END:variables
}
