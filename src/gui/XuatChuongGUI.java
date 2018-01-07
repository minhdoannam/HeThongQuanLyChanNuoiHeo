/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Business.CTHoaDonBUS;
import Business.HoaDonBUS;
import Business.KhachHangBUS;
import Element.HeoELE;
import Element.KhachHangELE;
import Element.NhanVienELE;

import java.awt.HeadlessException;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JTextField;
/**
 *
 * @author namminhlp
 */
public class XuatChuongGUI extends javax.swing.JFrame {

    private int DonGia;
    private static XuatChuongGUI obj=null;
    DefaultTableModel model;
     NhanVienELE objNV;
    /**
     * Creates new form XuatChuongGUI
     */
    public XuatChuongGUI() {
        initComponents();
        
    }
    public static XuatChuongGUI getObj(ArrayList<HeoELE> lsHeoXuat,NhanVienELE nv)
    {
        if(obj==null)
        {
            obj=new XuatChuongGUI(lsHeoXuat,nv);
        }
        return obj;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelContain = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbHeoXuat = new javax.swing.JTable();
        txtSDT = new javax.swing.JTextField();
        txtTenKhachHang = new javax.swing.JTextField();
        cbMaKhachHang = new javax.swing.JComboBox<>();
        txtDonGia = new javax.swing.JTextField();
        txtNguoiLap = new javax.swing.JTextField();
        dateNgayLap = new com.toedter.calendar.JDateChooser();
        lbTongTien = new javax.swing.JLabel();
        lbSoLuong = new javax.swing.JLabel();
        lbCapNhatCanNang = new javax.swing.JLabel();
        lbTongKyXuat = new javax.swing.JLabel();
        lbThemKhachHang = new javax.swing.JLabel();
        lbDataSoLuong = new javax.swing.JLabel();
        lbDataTongKyXuat = new javax.swing.JLabel();
        lbDataTongTien = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbHuy = new javax.swing.JLabel();
        lbXacNhan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelContain.setBackground(new java.awt.Color(255, 255, 255));

        tbHeoXuat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbHeoXuat.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbHeoXuat.getTableHeader().setReorderingAllowed(false);
        tbHeoXuat.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                tbHeoXuatInputMethodTextChanged(evt);
            }
        });
        tbHeoXuat.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tbHeoXuatPropertyChange(evt);
            }
        });
        tbHeoXuat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbHeoXuatKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbHeoXuatKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(tbHeoXuat);

        txtSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDTActionPerformed(evt);
            }
        });

        cbMaKhachHang.setToolTipText("");
        cbMaKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbMaKhachHangMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbMaKhachHangMousePressed(evt);
            }
        });
        cbMaKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMaKhachHangActionPerformed(evt);
            }
        });

        txtDonGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDonGiaActionPerformed(evt);
            }
        });

        txtNguoiLap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNguoiLapActionPerformed(evt);
            }
        });

        dateNgayLap.setDateFormatString("yyyy-MM-dd");

        lbTongTien.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbTongTien.setForeground(new java.awt.Color(0, 153, 120));
        lbTongTien.setText("TỔNG TIỀN (VND)");

        lbSoLuong.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbSoLuong.setForeground(new java.awt.Color(0, 153, 120));
        lbSoLuong.setText("SỐ LƯỢNG (Con)");

        lbCapNhatCanNang.setBackground(new java.awt.Color(0, 153, 120));
        lbCapNhatCanNang.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        lbCapNhatCanNang.setForeground(new java.awt.Color(0, 153, 120));
        lbCapNhatCanNang.setText("(Cập nhật Cân)");
        lbCapNhatCanNang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCapNhatCanNangMouseClicked(evt);
            }
        });

        lbTongKyXuat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbTongKyXuat.setForeground(new java.awt.Color(0, 153, 120));
        lbTongKyXuat.setText("TỔNG KÝ XUẤT (KG)");

        lbThemKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/plus (1).png"))); // NOI18N
        lbThemKhachHang.setOpaque(true);
        lbThemKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbThemKhachHangMouseClicked(evt);
            }
        });

        lbDataSoLuong.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbDataSoLuong.setText("jLabel1");

        lbDataTongKyXuat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbDataTongKyXuat.setText("jLabel2");

        lbDataTongTien.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbDataTongTien.setText("jLabel3");

        jLabel2.setBackground(new java.awt.Color(0, 153, 102));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LẬP HÓA ĐƠN XUẤT CHUỒNG");
        jLabel2.setOpaque(true);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 102));
        jLabel3.setText("Mã khách hàng:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 102));
        jLabel5.setText("Tên khách hàng:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 102));
        jLabel6.setText("Số điện thoại:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 102));
        jLabel7.setText("Ngày lập:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 102));
        jLabel8.setText("Người lập:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 102));
        jLabel9.setText("Đơn gái (VND)");

        lbHuy.setBackground(new java.awt.Color(0, 153, 102));
        lbHuy.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbHuy.setForeground(new java.awt.Color(255, 255, 255));
        lbHuy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/Delete_23px.png"))); // NOI18N
        lbHuy.setText("HỦY");
        lbHuy.setOpaque(true);
        lbHuy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbHuyMouseClicked(evt);
            }
        });

        lbXacNhan.setBackground(new java.awt.Color(0, 153, 102));
        lbXacNhan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbXacNhan.setForeground(new java.awt.Color(255, 255, 255));
        lbXacNhan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbXacNhan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Item/Checkmark_25px.png"))); // NOI18N
        lbXacNhan.setText("XÁC NHẬN");
        lbXacNhan.setOpaque(true);
        lbXacNhan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbXacNhanMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelContainLayout = new javax.swing.GroupLayout(panelContain);
        panelContain.setLayout(panelContainLayout);
        panelContainLayout.setHorizontalGroup(
            panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContainLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelContainLayout.createSequentialGroup()
                            .addComponent(lbXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lbHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelContainLayout.createSequentialGroup()
                                    .addGroup(panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(panelContainLayout.createSequentialGroup()
                                            .addGroup(panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lbTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lbSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(10, 10, 10))
                                        .addGroup(panelContainLayout.createSequentialGroup()
                                            .addComponent(lbTongKyXuat)
                                            .addGap(18, 18, 18)))
                                    .addGroup(panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lbDataTongKyXuat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbDataTongTien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbDataSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(8, 8, 8))
                                .addComponent(lbCapNhatCanNang, javax.swing.GroupLayout.Alignment.TRAILING))))
                    .addGroup(panelContainLayout.createSequentialGroup()
                        .addGroup(panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelContainLayout.createSequentialGroup()
                                .addGroup(panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(panelContainLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelContainLayout.createSequentialGroup()
                                        .addGroup(panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(panelContainLayout.createSequentialGroup()
                                                .addComponent(cbMaKhachHang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbThemKhachHang))
                                            .addComponent(txtTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(60, 60, 60)
                                .addGroup(panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateNgayLap, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNguoiLap, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        panelContainLayout.setVerticalGroup(
            panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContainLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelContainLayout.createSequentialGroup()
                        .addGroup(panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(lbThemKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(cbMaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(11, 11, 11)
                        .addGroup(panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtNguoiLap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dateNgayLap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbCapNhatCanNang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDataSoLuong)
                    .addGroup(panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTongKyXuat)
                    .addComponent(lbDataTongKyXuat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelContainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTongTien)
                    .addComponent(lbDataTongTien))
                .addGap(22, 22, 22))
        );

        lbCapNhatCanNang.getAccessibleContext().setAccessibleName("lbCapNhatKg");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSDTActionPerformed

    private void cbMaKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMaKhachHangActionPerformed
            
        if (cbMaKhachHang.getSelectedIndex() == 0) {
            txtTenKhachHang.setText(null);
            txtSDT.setText(null);
        }
        else {
            KhachHangBUS bus = new KhachHangBUS();
             ResultSet rs = bus.getByID(cbMaKhachHang.getSelectedItem().toString());
       
            try {
                while(rs.next()) {
                   txtTenKhachHang.setText(rs.getString("HoTen"));
                   txtSDT.setText(rs.getString("Sdt"));
                }

            } catch (SQLException ex) {
                Logger.getLogger(XuatChuongGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        

    }//GEN-LAST:event_cbMaKhachHangActionPerformed

    private void cbMaKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbMaKhachHangMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_cbMaKhachHangMouseClicked

    private void cbMaKhachHangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbMaKhachHangMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cbMaKhachHangMousePressed
    private void tinhTongTien() {
        int TongKg = 0;
        int SoLuong = 0;
        for (int i = 0; i < tbHeoXuat.getRowCount(); i++) {
            TongKg += Integer.parseInt(tbHeoXuat.getValueAt(i,4).toString());
            SoLuong++;
        }
        lbDataTongKyXuat.setText(String.valueOf(TongKg));
        int TongTien = TongKg*DonGia;
        lbDataTongTien.setText(String.valueOf(TongTien));    
        lbDataSoLuong.setText(String.valueOf(SoLuong));
    }
    private void txtDonGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDonGiaActionPerformed
        // TODO add your handling code here:
        try {
            DonGia = Integer.parseInt(txtDonGia.getText());
            tinhTongTien();
            
        } catch (NumberFormatException nfe) {
            txtDonGia.setText("0");
            DonGia = 0;
            JOptionPane.showMessageDialog(this, "Đơn gia phải là số!","Cảnh báo",
            JOptionPane.WARNING_MESSAGE);
         }
   
        
    }//GEN-LAST:event_txtDonGiaActionPerformed

    private void lbCapNhatCanNangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCapNhatCanNangMouseClicked
        // TODO add your handling code here:
        tinhTongTien();
        
    }//GEN-LAST:event_lbCapNhatCanNangMouseClicked

    private void tbHeoXuatInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tbHeoXuatInputMethodTextChanged
        // TODO add your handling code here
        
    }//GEN-LAST:event_tbHeoXuatInputMethodTextChanged

    private void tbHeoXuatPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tbHeoXuatPropertyChange
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tbHeoXuatPropertyChange

    private void lbThemKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbThemKhachHangMouseClicked
        // TODO add your handling code here:
        ThemKhachHangGUI themKH = new ThemKhachHangGUI();
        themKH.setVisible(true);
    }//GEN-LAST:event_lbThemKhachHangMouseClicked

    private void tbHeoXuatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbHeoXuatKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tbHeoXuatKeyTyped

    private void tbHeoXuatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbHeoXuatKeyReleased
        // TODO add your handling code here:
        tinhTongTien();
    }//GEN-LAST:event_tbHeoXuatKeyReleased

    private void txtNguoiLapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNguoiLapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNguoiLapActionPerformed

    private void lbXacNhanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbXacNhanMouseClicked
         tinhTongTien();
        String dNgayLap;
        dNgayLap = ((JTextField)dateNgayLap.getDateEditor().getUiComponent()).getText();
        HoaDonBUS busHD = new HoaDonBUS();
        CTHoaDonBUS busCTHD = new CTHoaDonBUS();
        if ((cbMaKhachHang.getSelectedItem().equals("") == false) || 
                    (txtNguoiLap.getText().equals("") == false))
        {
            List<String> listMaHeo = new LinkedList();
            for (int i = 0; i < tbHeoXuat.getRowCount(); i++) 
            {
                 listMaHeo.add((String) tbHeoXuat.getModel().getValueAt(i,0));
            }
            try {
                if ((busHD.insertHoaDon(objNV.getMaNhanVien(), Integer.parseInt(lbDataSoLuong.getText()),
                        cbMaKhachHang.getSelectedItem().toString(), dNgayLap) == true) &&
                    (busCTHD.insertCTHD(busHD.getIDhasInserted(), listMaHeo, Double.parseDouble(txtDonGia.getText()))) == true    
                    )
                {
                      JOptionPane.showMessageDialog(this, "Nhập hóa đơn thành công","Thông báo",JOptionPane.DEFAULT_OPTION);
                      this.dispose();  
                }
                         
            }
            catch (HeadlessException | NumberFormatException | SQLException e) 
            {
                JOptionPane.showMessageDialog(this, "Không thể nhập hóa đơn","Cảnh báo",
                JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_lbXacNhanMouseClicked

    private void lbHuyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHuyMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_lbHuyMouseClicked
    private void bindingComboKhachHang() {
        
        KhachHangBUS bus = new KhachHangBUS();
        ResultSet rs = bus.getAll();
        cbMaKhachHang.insertItemAt("", 0);
        try
        {
            while(rs.next())
            {
                cbMaKhachHang.addItem(rs.getString("MaKhachHang"));

            }
        }
        catch(SQLException exc)
        {
            System.out.println("Loi khi showCommboBox KhachHang "+ exc);
        }
        
    }
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
            java.util.logging.Logger.getLogger(XuatChuongGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XuatChuongGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XuatChuongGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XuatChuongGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new XuatChuongGUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbMaKhachHang;
    private com.toedter.calendar.JDateChooser dateNgayLap;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCapNhatCanNang;
    private javax.swing.JLabel lbDataSoLuong;
    private javax.swing.JLabel lbDataTongKyXuat;
    private javax.swing.JLabel lbDataTongTien;
    private javax.swing.JLabel lbHuy;
    private javax.swing.JLabel lbSoLuong;
    private javax.swing.JLabel lbThemKhachHang;
    private javax.swing.JLabel lbTongKyXuat;
    private javax.swing.JLabel lbTongTien;
    private javax.swing.JLabel lbXacNhan;
    private javax.swing.JPanel panelContain;
    public javax.swing.JTable tbHeoXuat;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtNguoiLap;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenKhachHang;
    // End of variables declaration//GEN-END:variables
    
    static class setVisible {

        public setVisible(boolean b) {
        }
    }

    @SuppressWarnings("empty-statement")
    public XuatChuongGUI(ArrayList<HeoELE> lsHeoXuat,NhanVienELE objNV) {
        
        initComponents();
        this.objNV=objNV;
        txtNguoiLap.setText(objNV.getTenNhanVien());
        txtDonGia.setText("0");
        Calendar cal = new GregorianCalendar();
        dateNgayLap.setDate(cal.getTime());
        DonGia = Integer.parseInt(txtDonGia.getText());
        model = (DefaultTableModel) this.tbHeoXuat.getModel();
        model.addColumn("Mã heo");
        model.addColumn("Tình trạng");
        model.addColumn("Xuất xứ");
        model.addColumn("Giới tính");
        model.addColumn("Cân nặng xuất (Kg)");
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        for(int i=0;i<lsHeoXuat.size();i++)
        {
            Vector vector=new Vector();
            //Mỗi dòng sẽ lấy các giá trị tương ứng với model.addColumn("");
            vector.add(lsHeoXuat.get(i).getMaHeo());
            vector.add(lsHeoXuat.get(i).getTinhTrang());
            vector.add(lsHeoXuat.get(i).getXuatXu());
            vector.add(lsHeoXuat.get(i).getsGioiTinh());
            vector.add(0);
            model.addRow(vector);
        }
        bindingComboKhachHang();
        tinhTongTien();
     }
}
