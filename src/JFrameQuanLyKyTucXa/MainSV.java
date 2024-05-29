package JFrameQuanLyKyTucXa;

import Connector.KetNoiSQL;
import dao.QuanLySinhVienDAO;
import dao.DangKiPhongDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import JFrameQuanLyKyTucXa.DangKiPhong;
import dao.SinhVienDAO;

public class MainSV extends javax.swing.JFrame {
    Connector.KetNoiSQL connect = new Connector.KetNoiSQL();
    private String emailsv;
    private String username;
    private DangKiPhong dangKiPhong;
    String masv;
    
    public MainSV(String email,String username) {
        this.emailsv = email;
        this.username= username;
        dangKiPhong = new DangKiPhong(email);
        dangKiPhong.setEmail(email); // Truyền giá trị của biến email
        
        initComponents();
        //System.out.println("Giá trị của email Main: " + email);
        //dangKiPhong.displayData(email);

        //setSize(1450,720); 
        //Cho giao diện nằm giữa màn hình
        setLocationRelativeTo(null);
    }

    public void setnameuser(String email) {
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from SinhVien where email='" + email + "'";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                txtnameuser.setText(rs.getString("tenSV"));
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    void setEmail(String email) {
        this.emailsv = email;
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from SinhVien where email='" + email + "'";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                txtnameuser.setText(rs.getString("tenSV"));
                masv = rs.getString("maSV");
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public String getGenderForEmail(String email) {
        String gioiTinh = ""; // Giới tính mặc định hoặc giá trị cần thiết

        Connection conn = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;

        try {
            conn = KetNoiSQL.getConnection();
            String sql = "SELECT gioiTinh FROM SinhVien WHERE email=?";
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, email);
            rs = preparedStatement.executeQuery();

            if (rs.next()) {
                gioiTinh = rs.getString("gioiTinh");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Đảm bảo đóng tất cả các tài nguyên
            try {
                if (rs != null) rs.close();
                if (preparedStatement != null) preparedStatement.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return gioiTinh;
    }
    void hidepanel(){
        trangChu1.setVisible(false);
        dangKiPhong1.setVisible(false);
        tBDangKiPhongThanhCong1.setVisible(false);
        thongTinTaiKhoan1.setVisible(false);
        khoanPhi_USER1.setVisible(false);
        caiDatTaiKhoan_SV1.setVisible(false);
        jPanelKhoanPhiKQ.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Trangchu = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        quanlysv = new javax.swing.JLabel();
        trangchu = new javax.swing.JLabel();
        quanlyKhoanphi = new javax.swing.JLabel();
        thongtintaikhoan = new javax.swing.JLabel();
        cailaimatkhau = new javax.swing.JLabel();
        dangxuat = new javax.swing.JLabel();
        dangxuat1 = new javax.swing.JLabel();
        txtnameuser = new javax.swing.JLabel();
        NameKTX = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Contents = new javax.swing.JPanel();
        trangChu1 = new JFrameQuanLyKyTucXa.TrangChu();
        tBDangKiPhongThanhCong1 = new JFrameQuanLyKyTucXa.TBDangKiPhongThanhCong();
        thongTinTaiKhoan1 = new JFrameQuanLyKyTucXa.ThongTinTaiKhoan();
        khoanPhi_USER1 = new JFrameQuanLyKyTucXa.KhoanPhi_USER();
        jPanelKhoanPhiKQ = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        caiDatTaiKhoan_SV1 = new JFrameQuanLyKyTucXa.CaiDatTaiKhoan_SV();
        dangKiPhong1 = new JFrameQuanLyKyTucXa.DangKiPhong();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        Trangchu.setBackground(new java.awt.Color(255, 255, 255));

        Menu.setBackground(new java.awt.Color(0, 102, 102));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("UserName:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Menu:");

        quanlysv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        quanlysv.setForeground(new java.awt.Color(255, 255, 255));
        quanlysv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quanlysv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/quanlysinhvien.png"))); // NOI18N
        quanlysv.setText("Đăng kí phòng");
        quanlysv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quanlysv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quanlysvMouseClicked(evt);
            }
        });

        trangchu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        trangchu.setForeground(new java.awt.Color(255, 255, 255));
        trangchu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        trangchu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trangchu.png"))); // NOI18N
        trangchu.setText("Trang chủ");
        trangchu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        trangchu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                trangchuMouseClicked(evt);
            }
        });

        quanlyKhoanphi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        quanlyKhoanphi.setForeground(new java.awt.Color(255, 255, 255));
        quanlyKhoanphi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quanlyKhoanphi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/quanlynhanvien.png"))); // NOI18N
        quanlyKhoanphi.setText("Các khoản phí");
        quanlyKhoanphi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quanlyKhoanphi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quanlyKhoanphiMouseClicked(evt);
            }
        });

        thongtintaikhoan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        thongtintaikhoan.setForeground(new java.awt.Color(255, 255, 255));
        thongtintaikhoan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        thongtintaikhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/thongtintaikhoan.png"))); // NOI18N
        thongtintaikhoan.setText("Thông tin tài khoản");
        thongtintaikhoan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        thongtintaikhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thongtintaikhoanMouseClicked(evt);
            }
        });

        cailaimatkhau.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cailaimatkhau.setForeground(new java.awt.Color(255, 255, 255));
        cailaimatkhau.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cailaimatkhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cailaimatkhau.png"))); // NOI18N
        cailaimatkhau.setText("Cài lại mật khẩu");
        cailaimatkhau.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cailaimatkhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cailaimatkhauMouseClicked(evt);
            }
        });

        dangxuat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dangxuat.setForeground(new java.awt.Color(255, 255, 255));
        dangxuat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dangxuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dangxuat.png"))); // NOI18N
        dangxuat.setText("Đăng xuất");
        dangxuat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dangxuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dangxuatMouseClicked(evt);
            }
        });

        dangxuat1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dangxuat1.setForeground(new java.awt.Color(255, 255, 255));
        dangxuat1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dangxuat1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo Học Viện Công Nghệ Bưu Chính Viễn Thông - PTIT(Simple).png"))); // NOI18N
        dangxuat1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dangxuat1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dangxuat1MouseClicked(evt);
            }
        });

        txtnameuser.setText("jLabel5");

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(trangchu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(quanlyKhoanphi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(quanlysv, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(32, 32, 32)
                        .addComponent(txtnameuser, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
            .addComponent(dangxuat1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(thongtintaikhoan, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addComponent(cailaimatkhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dangxuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(dangxuat1)
                .addGap(18, 18, 18)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnameuser))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(trangchu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(quanlysv)
                .addGap(27, 27, 27)
                .addComponent(quanlyKhoanphi)
                .addGap(28, 28, 28)
                .addComponent(thongtintaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cailaimatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dangxuat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        NameKTX.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setText("QUẢN LÝ KÝ TÚC XÁ HỌC VIỆN CÔNG NGHỆ BƯU CHÍNH VIỄN THÔNG");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("Posts and Telecommunications Institute of Technology");

        javax.swing.GroupLayout NameKTXLayout = new javax.swing.GroupLayout(NameKTX);
        NameKTX.setLayout(NameKTXLayout);
        NameKTXLayout.setHorizontalGroup(
            NameKTXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NameKTXLayout.createSequentialGroup()
                .addContainerGap(300, Short.MAX_VALUE)
                .addGroup(NameKTXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NameKTXLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(179, 179, 179))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NameKTXLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(235, 235, 235))))
        );
        NameKTXLayout.setVerticalGroup(
            NameKTXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NameKTXLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4))
        );

        Contents.setBackground(new java.awt.Color(255, 255, 255));
        Contents.setLayout(new java.awt.CardLayout());

        trangChu1.setBackground(new java.awt.Color(255, 255, 255));
        Contents.add(trangChu1, "card2");
        Contents.add(tBDangKiPhongThanhCong1, "card4");
        Contents.add(thongTinTaiKhoan1, "card6");
        Contents.add(khoanPhi_USER1, "card7");

        jPanelKhoanPhiKQ.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(237, 50, 55));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/thongbao.png"))); // NOI18N
        jLabel5.setText("Thông báo ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(19, 90, 118));
        jLabel6.setText("Bạn không có bất kỳ chi phí nào cần chi trả");

        javax.swing.GroupLayout jPanelKhoanPhiKQLayout = new javax.swing.GroupLayout(jPanelKhoanPhiKQ);
        jPanelKhoanPhiKQ.setLayout(jPanelKhoanPhiKQLayout);
        jPanelKhoanPhiKQLayout.setHorizontalGroup(
            jPanelKhoanPhiKQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKhoanPhiKQLayout.createSequentialGroup()
                .addGroup(jPanelKhoanPhiKQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelKhoanPhiKQLayout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelKhoanPhiKQLayout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(587, Short.MAX_VALUE))
        );
        jPanelKhoanPhiKQLayout.setVerticalGroup(
            jPanelKhoanPhiKQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKhoanPhiKQLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(571, Short.MAX_VALUE))
        );

        Contents.add(jPanelKhoanPhiKQ, "card9");
        Contents.add(caiDatTaiKhoan_SV1, "card8");
        Contents.add(dangKiPhong1, "card8");

        javax.swing.GroupLayout TrangchuLayout = new javax.swing.GroupLayout(Trangchu);
        Trangchu.setLayout(TrangchuLayout);
        TrangchuLayout.setHorizontalGroup(
            TrangchuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TrangchuLayout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TrangchuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NameKTX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Contents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        TrangchuLayout.setVerticalGroup(
            TrangchuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(TrangchuLayout.createSequentialGroup()
                .addComponent(NameKTX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Contents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Trangchu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Trangchu, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void trangchuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trangchuMouseClicked
        hidepanel();
        trangChu1.setVisible(true);
    }//GEN-LAST:event_trangchuMouseClicked

    private void quanlysvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quanlysvMouseClicked
        hidepanel();
        int trangthai = new QuanLySinhVienDAO().LayTrangThaiTheoEmail(emailsv);
        if (trangthai == 1 || trangthai == 5) {
            dangKiPhong1.setVisible(true);
            System.out.println("email>>>1: "+ emailsv);
            dangKiPhong1.LayEmail(emailsv);
        } else {
            tBDangKiPhongThanhCong1.setVisible(true);
        }
    }//GEN-LAST:event_quanlysvMouseClicked

    private void thongtintaikhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thongtintaikhoanMouseClicked
        hidepanel();
        thongTinTaiKhoan1.setVisible(true);
        setnameuser(emailsv);
        this.thongTinTaiKhoan1.showViewTaiKhoanEmail(emailsv);
    }//GEN-LAST:event_thongtintaikhoanMouseClicked

    private void cailaimatkhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cailaimatkhauMouseClicked
        hidepanel();
        caiDatTaiKhoan_SV1.setVisible(true);
        caiDatTaiKhoan_SV1.set(emailsv,username);
        setnameuser(emailsv);
    }//GEN-LAST:event_cailaimatkhauMouseClicked

    private void dangxuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dangxuatMouseClicked
        int test = JOptionPane.showConfirmDialog(null, "Bạn chắc có muốn đăng xuất hay không !", "Thông báo đăng nhập", JOptionPane.YES_NO_OPTION);
        if (test == JOptionPane.YES_OPTION) {
            dispose();
            Login login = new Login();
            login.show();
        }
    }//GEN-LAST:event_dangxuatMouseClicked

    private void dangxuat1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dangxuat1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_dangxuat1MouseClicked

    private void quanlyKhoanphiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quanlyKhoanphiMouseClicked
        hidepanel();
        int trangthai = new SinhVienDAO().LayTrangThaiTheoEmail(emailsv);
        if (trangthai == 2 || trangthai == 3) {
            khoanPhi_USER1.setVisible(true);
            khoanPhi_USER1.setEmail(emailsv);
        } else {
            jPanelKhoanPhiKQ.setVisible(true);
        }
    }//GEN-LAST:event_quanlyKhoanphiMouseClicked

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
            java.util.logging.Logger.getLogger(MainSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainSV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new MainSV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contents;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel NameKTX;
    private javax.swing.JPanel Trangchu;
    private JFrameQuanLyKyTucXa.CaiDatTaiKhoan_SV caiDatTaiKhoan_SV1;
    private javax.swing.JLabel cailaimatkhau;
    private JFrameQuanLyKyTucXa.DangKiPhong dangKiPhong1;
    private javax.swing.JLabel dangxuat;
    private javax.swing.JLabel dangxuat1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanelKhoanPhiKQ;
    private JFrameQuanLyKyTucXa.KhoanPhi_USER khoanPhi_USER1;
    private javax.swing.JLabel quanlyKhoanphi;
    private javax.swing.JLabel quanlysv;
    private JFrameQuanLyKyTucXa.TBDangKiPhongThanhCong tBDangKiPhongThanhCong1;
    private JFrameQuanLyKyTucXa.ThongTinTaiKhoan thongTinTaiKhoan1;
    private javax.swing.JLabel thongtintaikhoan;
    private JFrameQuanLyKyTucXa.TrangChu trangChu1;
    private javax.swing.JLabel trangchu;
    private javax.swing.JLabel txtnameuser;
    // End of variables declaration//GEN-END:variables
}
