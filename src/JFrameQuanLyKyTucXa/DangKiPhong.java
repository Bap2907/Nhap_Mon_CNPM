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

public class DangKiPhong extends javax.swing.JPanel {
    
    private KetNoiSQL ketNoiSQL;

    public DangKiPhong() {
        initComponents();
        ketNoiSQL = new KetNoiSQL();
//        displayData();
    }

    private void displayData() {
        String query = "SELECT * FROM Phong";
    
        // Sử dụng GridLayout cho JPanel
        int rows = 0;
        int cols = 3; // Số cột bạn muốn hiển thị

        try (PreparedStatement preparedStatement = ketNoiSQL.getConnection().prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery()) {

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
                customizeButton(button, squareSize);

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
        // Cập nhật giao diện
            revalidate();
            repaint();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void customizeButton(JButton button, int squareSize) {
        button.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        button.setHorizontalAlignment(SwingConstants.CENTER);
        button.setVerticalAlignment(SwingConstants.CENTER);
        int borderWidth = 20;
        button.setBorder(BorderFactory.createLineBorder(Color.WHITE, borderWidth));
        button.setBorderPainted(true); // Ẩn viền của JButton
        button.setOpaque(true);
        button.setBackground(Color.getHSBColor(204, 204, 204));
        button.addActionListener(e -> handleButtonClick(button)); // Xử lý sự kiện khi nút được nhấp
    }

    private void handleButtonClick(JButton button) {
        // Lấy dữ liệu từ nút
        String buttonText = button.getText();

        // Hiển thị thông báo hoặc thực hiện các hành động khác dựa trên dữ liệu
        JOptionPane.showMessageDialog(this, "Bạn đã nhấp vào ô: " + buttonText);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setBackground(new java.awt.Color(19, 90, 112));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(19, 90, 118));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("  ");

        jLabel2.setBackground(new java.awt.Color(19, 90, 112));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(19, 90, 118));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("   ");
        jLabel2.setToolTipText("");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(237, 50, 55));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("ĐĂNG KÝ PHÒNG Ở KTX CHO SINH VIÊN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(612, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
