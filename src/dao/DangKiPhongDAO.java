package dao;

import Connector.KetNoiSQL;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ThongTinSinhVien;
import model.ThongTinSinhVienDangKy;

public class DangKiPhongDAO {
    
    private Connection conn;

    public DangKiPhongDAO() {
        
    }
    
    public List<ThongTinSinhVienDangKy> getAllThongTinSinhVienDangKynew() {
        List<ThongTinSinhVienDangKy> listSinhVien = new ArrayList<ThongTinSinhVienDangKy>();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from SinhVien where trangThai=0";
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                ThongTinSinhVienDangKy sv = new ThongTinSinhVienDangKy();
                sv.setMaSV(rs.getString("maSV"));
                sv.setTenSV(rs.getString("tenSV"));
                sv.setCCCD(rs.getString("CCCD"));
                sv.setGioiTinh(rs.getString("gioiTinh"));
                sv.setNgaySinh(rs.getDate("ngaySinh"));
                sv.setEmail(rs.getString("email"));

                sv.setSoDienThoai(rs.getString("soDienThoai"));
                sv.setQueQuan(rs.getString("queQuan"));
                sv.setMaLop(rs.getString("maLop"));
                listSinhVien.add(sv);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listSinhVien;
    }
}
