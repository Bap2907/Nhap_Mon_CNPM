package JFrameQuanLyKyTucXa;

import Connector.KetNoiSQL;
import dao.QuanLySinhVienDAO;
import dao.DangKiPhongDAO;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.*;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import dao.PhongDAO;

public class DangKiPhong extends javax.swing.JPanel {
    
    private KetNoiSQL ketNoiSQL;
    private String email;
    private String gioitinh, loaiphong;
    private JButton selectedButton = null;

    public DangKiPhong() {
        setEmail(email);
        initComponents();
        ketNoiSQL = new KetNoiSQL();
        displayData();
        
    }
    
    public DangKiPhong(String email) {
        this.email = email;
        setEmail(email);
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getEmail() {
        return email;
    }

    public void displayData() {
         // Thay thế bằng cách lấy giới tính thực tế của tài khoản đang đăng nhập
        //MainSV main = new MainSV(email);
        //main.setVisible(true);
        //String gioiTinhDangNhap = main.getGenderForEmail(email);
        //String email = getEmail();
        //System.out.println("Giá trị của emaillllllllll: " + email);
        gioitinh = new QuanLySinhVienDAO().layGTSinhVienTuEmail(email);
        String gioiTinhDangNhap = "Nam";
        
        String query = "SELECT * FROM Phong WHERE gioiTinh = ?";
    
        // Sử dụng GridLayout cho JPanel
        int rows = 0;
        int cols = 3; // Số cột bạn muốn hiển thị

        try (PreparedStatement preparedStatement = ketNoiSQL.getConnection().prepareStatement(query)) {
            preparedStatement.setString(1, gioiTinhDangNhap); // Thiết lập giới tính của tài khoản đang đăng nhập

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                // Kích thước của mỗi ô vuông
                int squareSize = 130; // Đặt kích thước lớn hơn để hiển thị các thông tin

            // Thiết lập kích thước cho JPanel
                setPreferredSize(new Dimension(cols * squareSize, rows * squareSize));
        
            // Thiết lập GridLayout cho JPanel
                setLayout(new GridLayout(rows, cols));

            // Duyệt qua kết quả truy vấn và hiển thị dữ liệu trong từng ô
                while (resultSet.next()) {
                    // Lấy dữ liệu từ cột cần hiển thị
                    String maPhong = resultSet.getString("maPhong");
                    String tenPhong = resultSet.getString("tenPhong");
                    int soLuongSVPhong = resultSet.getInt("soLuongSVPhong");
                    String loaiPhong = resultSet.getString("loaiPhong");
                    double tienPhong = resultSet.getDouble("tienPhong");

                // Tạo chuỗi chứa thông tin hiển thị trong mỗi ô
                    String labelText = "Thông tin phòng " +
                        "<br/>Mã Phòng: " + maPhong +
                        "<br/>Tên Phòng: " + tenPhong +
                        "<br/>Số lượng SV: " + soLuongSVPhong +
                        "<br/>Loại Phòng: " + loaiPhong +
                        "<br/>Tiền phòng: " + tienPhong;

                // Tạo JButton để hiển thị dữ liệu
                    JButton button = new JButton("<html>" + labelText + "</html>");
                    button.setPreferredSize(new Dimension(squareSize, squareSize));
                    customizeButton(button, squareSize, maPhong, tenPhong, soLuongSVPhong, loaiPhong, tienPhong);

                // Thêm JButton vào giao diện
                    add(button);

                // Tăng chỉ số dòng
                    rows++;

                // Nếu đã đủ số dòng theo cols, thì reset rows và tăng chỉ số cột
                    if (rows >= cols) {
                        rows = 0;
                        cols++;
                    }
                }
            }
        
        // Cập nhật giao diện
            revalidate();
            repaint();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    private void customizeButton(JButton button, int squareSize, String maPhong, String tenPhong, int soLuongSVPhong, String loaiPhong, double tienPhong) {
        button.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        button.setHorizontalAlignment(SwingConstants.CENTER);
        button.setVerticalAlignment(SwingConstants.CENTER);
        int borderWidth = 20;
        button.setBorder(BorderFactory.createLineBorder(Color.WHITE, borderWidth));
        button.setBorderPainted(true); // Ẩn viền của JButton
        button.setOpaque(true);
        button.setBackground(Color.getHSBColor(204, 204, 204));

        button.addActionListener(e -> handleButtonClick(button, maPhong, tenPhong, soLuongSVPhong, loaiPhong, tienPhong)); // Xử lý sự kiện khi nút được nhấp
    }

    private void handleButtonClick(JButton button, String maPhong, String tenPhong, int soLuongSVPhong, String loaiPhong, double tienPhong) {
        // Lấy dữ liệu từ nút
        String buttonText = button.getText();

        // Hiển thị thông báo hoặc thực hiện các hành động khác dựa trên dữ liệu
        //JOptionPane.showMessageDialog(this, "Bạn đã nhấp vào ô: " + buttonText);
        gioitinh = new QuanLySinhVienDAO().layGTSinhVienTuEmail(email);
        QuanLySinhVienDAO svd = new QuanLySinhVienDAO();
        String masv = new QuanLySinhVienDAO().layMaSinhVienTuEmail(email);
        System.out.println("masv = "+ masv);
        int fl = new PhongDAO().CheckPhong(loaiphong, gioitinh);
        System.out.println("check phong "+fl);
        int choice = JOptionPane.showConfirmDialog(null, "Bạn có muốn đăng ký phòng không?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) { 
            JOptionPane.showMessageDialog(null, maPhong + " " +  tenPhong + " " +  soLuongSVPhong + " " +  loaiPhong + " " +  tienPhong);
        } else {
        }
//        if (fl == 0) {
//            JOptionPane.showMessageDialog(null, maPhong + " " +  tenPhong + " " +  soLuongSVPhong + " " +  loaiPhong + " " +  tienPhong);
//        } else {
//            JOptionPane.showMessageDialog(null, "Có thể đăng kí" + buttonText);
//        }
        
        updateButtonColor(button);
    }
    
    private void updateButtonColor(JButton clickedButton) {
        // Nếu đã có JButton được chọn trước đó, đặt lại màu sắc
        if (selectedButton != null) {
            selectedButton.setBackground(Color.getHSBColor(204, 204, 204));
        }

        // Lưu trữ JButton mới được chọn
        selectedButton = clickedButton;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(237, 50, 55));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("ĐĂNG KÝ PHÒNG Ở KTX CHO SINH VIÊN");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(237, 50, 55));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(237, 50, 55));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(583, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    // End of variables declaration//GEN-END:variables
}
