/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package JFrameQuanLyKyTucXa;

import Connector.KetNoiSQL;
import dao.QuanLyNhanVienDAO;
import dao.SinhVienDAO;
import dao.SinhVienDangKyDAO;
import dao.TaiKhoanDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;
import static services.HashingPass.PasswordHash;

public class CaiDatTaiKhoan_SV extends javax.swing.JPanel {

    private boolean test = false;
    private String email;
    private String username;
    public CaiDatTaiKhoan_SV(){
        initComponents();
        this.hide_eye.setVisible(false);
        this.hide_eye2.setVisible(false);
        this.hide_eye3.setVisible(false);
    }
    public void set(String email,String username){
        this.email = email;
        this.username = username;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtUpNhapLaiMatKhau = new javax.swing.JPasswordField();
        txtUpMatKhau = new javax.swing.JPasswordField();
        show_eye2 = new javax.swing.JLabel();
        hide_eye2 = new javax.swing.JLabel();
        show_eye3 = new javax.swing.JLabel();
        hide_eye3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JPasswordField();
        show_eye = new javax.swing.JLabel();
        hide_eye = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1068, 550));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(19, 90, 118));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("Hệ thống quản lý ký túc xá sinh viên");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(237, 50, 55));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Cài Đặt Lại Tài Khoản");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(237, 50, 55)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(19, 90, 118));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Thông tin tài khoản đặt lại");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(19, 90, 118));
        jLabel6.setText("Mật khẩu mới :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(19, 90, 118));
        jLabel7.setText("Nhập lại mật khẩu mới :");

        txtUpNhapLaiMatKhau.setForeground(new java.awt.Color(19, 90, 118));
        txtUpNhapLaiMatKhau.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(19, 90, 118)));

        txtUpMatKhau.setForeground(new java.awt.Color(19, 90, 118));
        txtUpMatKhau.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(19, 90, 118)));

        show_eye2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show_eye2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/show_eye_color.png"))); // NOI18N
        show_eye2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                show_eye2MousePressed(evt);
            }
        });

        hide_eye2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hide_eye2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hide_eye_color.png"))); // NOI18N
        hide_eye2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hide_eye2MousePressed(evt);
            }
        });

        show_eye3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show_eye3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/show_eye_color.png"))); // NOI18N
        show_eye3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                show_eye3MousePressed(evt);
            }
        });

        hide_eye3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hide_eye3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hide_eye_color.png"))); // NOI18N
        hide_eye3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hide_eye3MousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(19, 90, 118));
        jLabel5.setText("Mật khẩu cũ : ");

        txtMatKhau.setForeground(new java.awt.Color(19, 90, 118));
        txtMatKhau.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(19, 90, 118)));
        txtMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatKhauActionPerformed(evt);
            }
        });

        show_eye.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show_eye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/show_eye_color.png"))); // NOI18N
        show_eye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                show_eyeMousePressed(evt);
            }
        });

        hide_eye.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hide_eye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hide_eye_color.png"))); // NOI18N
        hide_eye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hide_eyeMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUpNhapLaiMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(txtUpMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(txtMatKhau))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hide_eye3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(show_eye3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hide_eye2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(show_eye2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hide_eye, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(show_eye, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(hide_eye, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(show_eye, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hide_eye2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(show_eye2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUpMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUpNhapLaiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hide_eye3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(show_eye3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(19, 90, 118));
        jButton1.setText("Đặt lại tài khoản");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(19, 90, 118)));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, 1068, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(53, 53, 53))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 88, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void show_eye2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show_eye2MousePressed
        // TODO add your handling code here:
        show_eye2.setVisible(false);
        hide_eye2.setVisible(true);
        txtUpMatKhau.setEchoChar((char) 0);
    }//GEN-LAST:event_show_eye2MousePressed

    private void hide_eye2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hide_eye2MousePressed
        // TODO add your handling code here:
        hide_eye2.setVisible(false);
        show_eye2.setVisible(true);
        txtUpMatKhau.setEchoChar('*');
    }//GEN-LAST:event_hide_eye2MousePressed

    private void show_eye3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show_eye3MousePressed
        // TODO add your handling code here:
        show_eye3.setVisible(false);
        hide_eye3.setVisible(true);
        txtUpNhapLaiMatKhau.setEchoChar((char) 0);
    }//GEN-LAST:event_show_eye3MousePressed

    private void hide_eye3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hide_eye3MousePressed
        // TODO add your handling code here:
        hide_eye3.setVisible(false);
        show_eye3.setVisible(true);
        txtUpNhapLaiMatKhau.setEchoChar('*');
    }//GEN-LAST:event_hide_eye3MousePressed

    private void hide_eyeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hide_eyeMousePressed
        // TODO add your handling code here:
        hide_eye.setVisible(false);
        show_eye.setVisible(true);
        txtMatKhau.setEchoChar('*');
    }//GEN-LAST:event_hide_eyeMousePressed

    private void show_eyeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show_eyeMousePressed
        // TODO add your handling code here:
        show_eye.setVisible(false);
        hide_eye.setVisible(true);
        txtMatKhau.setEchoChar((char) 0);
    }//GEN-LAST:event_show_eyeMousePressed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String matkhau = PasswordHash(txtMatKhau.getText().trim());
        String upmatkhau = txtUpMatKhau.getText().trim();
        String upnhaplaimatkhau = txtUpNhapLaiMatKhau.getText().trim();

        boolean kiemtratendn = new TaiKhoanDAO().KiemTraTenDNTK(username);

         if (txtMatKhau.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để mật khẩu cũ . Vui lòng điền thông tin đầy đủ!");
        } else if (upmatkhau.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống mật khẩu mới. Vui lòng điền thông tin đầy đủ!");
        } else if (upnhaplaimatkhau.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống trống nhập mật khẩu mới. Vui lòng điền thông tin đầy đủ!");
        } else if (!upmatkhau.equals(upnhaplaimatkhau)) {
            JOptionPane.showMessageDialog(null, "Mật khẩu nhập lại không trùng với mật khẩu. Vui lòng nhập lại!");
        } else {
            int test1 = JOptionPane.showConfirmDialog(null, "Bạn chắc có muốn thay đổi mật khẩu hay không !", "Thông báo", JOptionPane.YES_NO_OPTION);
            if (test1 == JOptionPane.YES_OPTION) {
                XacNhanTaiKhoan();
                DoiLaiMatKhau();

            } else if (test1 == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Bạn đã hủy thay đổi thành công");
                resetForm();
            }
        }


    }//GEN-LAST:event_jButton1MouseClicked

    private void txtMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatKhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatKhauActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hide_eye;
    private javax.swing.JLabel hide_eye2;
    private javax.swing.JLabel hide_eye3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel show_eye;
    private javax.swing.JLabel show_eye2;
    private javax.swing.JLabel show_eye3;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JPasswordField txtUpMatKhau;
    private javax.swing.JPasswordField txtUpNhapLaiMatKhau;
    // End of variables declaration//GEN-END:variables

    void XacNhanTaiKhoan() {

        Connection conn = KetNoiSQL.getConnection();
        String matkhau = PasswordHash(txtMatKhau.getText().trim());

        String sql = "select * from taikhoan where tenDangNhap='" + username + "' and matKhau='" + matkhau + "' and email ='" + email + "'";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                test = true;
            } else {
                JOptionPane.showMessageDialog(null, "mật khẩu cũ không đúng!");
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(CaiDatTaiKhoan_SV.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

//    void DoiLaiMatKhau() {
//        if (test == true) {
//            Connection conn = KetNoiSQL.getConnection();
//            int row = 0;
//            String sql1 = "update taikhoan set tenDangNhap=?, matKhau=? where email=?";
//            try {
//                PreparedStatement ps1 = conn.prepareStatement(sql1);
//
//                String password = PasswordHash(txtMatKhau.getText().trim());
//                ps1.setString(1, txtUpTenDangNhap.getText().trim());
//                ps1.setString(2, PasswordHash(password));
//                ps1.setString(3, email);
//
//                row = ps1.executeUpdate();
//                if (row > 0) {
//                    JOptionPane.showMessageDialog(null, "Cập nhật Tài khoản thành công");
//                    resetForm();
//                } else {
//                    JOptionPane.showMessageDialog(null, "Nhap ma chua dung");
//                }
//                conn.close();
//            } catch (SQLException ex) {
//                ex.printStackTrace();
//            }
//        }
//    }
    void DoiLaiMatKhau() {
    if (test == true) {
        Connection conn = KetNoiSQL.getConnection();
        int row = 0;
        String sql1 = "update taikhoan set matKhau=? where tenDangNhap=?";
        try {
            PreparedStatement ps1 = conn.prepareStatement(sql1);

            String password = PasswordHash(txtUpMatKhau.getText().trim());
            ps1.setString(1, password);
            ps1.setString(2, username);

            row = ps1.executeUpdate();
            if (row > 0) {
                JOptionPane.showMessageDialog(null, "Cập nhật Tài khoản thành công");
                resetForm();
            } else {
                JOptionPane.showMessageDialog(null, "Có lỗi xảy ra khi cập nhật Tài khoản");
            }
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    } else {
        JOptionPane.showMessageDialog(null, "Vui lòng xác nhận thông tin tài khoản trước khi cập nhật");
    }
}

    void resetForm() {
        // Clear text fields
        txtMatKhau.setText("");
        txtUpMatKhau.setText("");
        txtUpNhapLaiMatKhau.setText("");

        // Hide eye icons
        show_eye.setVisible(false);
        hide_eye.setVisible(false);
        show_eye2.setVisible(false);
        hide_eye2.setVisible(false);
        show_eye3.setVisible(false);
        hide_eye3.setVisible(false);
    }
}
