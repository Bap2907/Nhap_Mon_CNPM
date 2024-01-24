package dao;

import Connector.KetNoiSQL;
//import JFrameQuanLyKyTucXa.DangKyPhong;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.ThongTinSinhVien;

public class QuanLySinhVienDAO {
    
    public QuanLySinhVienDAO() {
    }
    
    public List<ThongTinSinhVien> getAllThongTinSV() {
        List<ThongTinSinhVien> listSinhVien = new ArrayList<ThongTinSinhVien>();
        Connection conn = KetNoiSQL.getConnection();
        //String sql = "select * from (select *,Null as maPhong from (select * from SinhVien except SELECT sv.* FROM SinhVien sv JOIN HopDongKTX hd ON sv.maSV = hd.maSV) as k union all SELECT sv.*, hd.maPhong FROM SinhVien sv JOIN HopDongKTX hd ON sv.maSV = hd.maSV) as k2";
        String sql = "select * from SinhVien";
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                ThongTinSinhVien sv = new ThongTinSinhVien();
                sv.setMaSV(rs.getString("maSV"));
                sv.setTenSV(rs.getString("tenSV"));
                sv.setCCCD(rs.getString("CCCD"));
                sv.setGioiTinh(rs.getString("gioiTinh"));
                sv.setNgaySinh(rs.getDate("ngaySinh"));
                sv.setEmail(rs.getString("email"));
                sv.setSoDienThoai(rs.getString("soDienThoai"));
                sv.setQueQuan(rs.getString("queQuan"));
                sv.setMaLop(rs.getString("maLop"));
                sv.setTrangThai(rs.getInt("trangThai"));
                listSinhVien.add(sv);
            }
            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSinhVien;
    }
    
    public boolean KiemTraMaSoSV(String masv) {
        ThongTinSinhVien sv = new ThongTinSinhVien();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from SinhVien where maSV ='" + masv + "'";
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                return true;
            }
            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean KiemTraCCCDSV(String cccd) {
        ThongTinSinhVien sv = new ThongTinSinhVien();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from SinhVien where CCCD ='" + cccd + "'";
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                return true;
            }
            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean KiemTraEmailSV(String email) {
        ThongTinSinhVien sv = new ThongTinSinhVien();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from SinhVien where email ='" + email + "'";
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                return true;
            }
            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean KiemTraSDTSV(String sodienthoai) {
        ThongTinSinhVien sv = new ThongTinSinhVien();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from SinhVien where soDienThoai ='" + sodienthoai + "'";
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                return true;
            }
            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean UpKiemTraMaSoSV(String masv, String test) {
        ThongTinSinhVien sv = new ThongTinSinhVien();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from SinhVien where maSV ='" + masv + "'";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                if (!test.equals(masv)) {
                    return true;
                }
            }
            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean UpKiemTraCCCDSV(String cccd, String test) {
        ThongTinSinhVien sv = new ThongTinSinhVien();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from SinhVien where CCCD ='" + cccd + "'";
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                if (!test.equals(cccd)) {
                    return true;
                }
            }
            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean UpKiemTraEmailSV(String email, String test) {
        ThongTinSinhVien sv = new ThongTinSinhVien();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from SinhVien where email ='" + email + "'";
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                if (!test.equals(email)) {
                    return true;
                }
            }
            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean UpKiemTraSDTSV(String sodienthoai, String test) {
        ThongTinSinhVien sv = new ThongTinSinhVien();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from SinhVien where soDienThoai ='" + sodienthoai + "'";
        try {

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                if (!test.equals(sodienthoai)) {
                    return true;
                }
            }
            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public List<ThongTinSinhVien> getAllThongTinSVSearch(String where, String text) {
        List<ThongTinSinhVien> listSinhVien = new ArrayList<ThongTinSinhVien>();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from SinhVien where " + where + " like N'%" + text + "%' ";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                ThongTinSinhVien sv = new ThongTinSinhVien();
                sv.setMaSV(rs.getString("maSV"));
                sv.setTenSV(rs.getString("tenSV"));
                sv.setCCCD(rs.getString("CCCD"));
                sv.setGioiTinh(rs.getString("gioiTinh"));
                sv.setNgaySinh(rs.getDate("ngaySinh"));
                sv.setEmail(rs.getString("email"));
                sv.setSoDienThoai(rs.getString("soDienThoai"));
                sv.setQueQuan(rs.getString("queQuan"));
                sv.setMaLop(rs.getString("maLop"));
                sv.setTrangThai(rs.getInt("trangThai"));
                listSinhVien.add(sv);
            }
            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSinhVien;
    }
    
    public List<ThongTinSinhVien> getAllThongTinSVSearchTT(String where, String text, int trangthai) {
        List<ThongTinSinhVien> listSinhVien = new ArrayList<ThongTinSinhVien>();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from SinhVien where " + where + " like N'%" + text + "%' and trangThai='" + trangthai + "'";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                ThongTinSinhVien sv = new ThongTinSinhVien();
                sv.setMaSV(rs.getString("maSV"));
                sv.setTenSV(rs.getString("tenSV"));
                sv.setCCCD(rs.getString("CCCD"));
                sv.setGioiTinh(rs.getString("gioiTinh"));
                sv.setNgaySinh(rs.getDate("ngaySinh"));
                sv.setEmail(rs.getString("email"));
                sv.setSoDienThoai(rs.getString("soDienThoai"));
                sv.setQueQuan(rs.getString("queQuan"));
                sv.setMaLop(rs.getString("maLop"));
                sv.setTrangThai(rs.getInt("trangThai"));
                listSinhVien.add(sv);
            }
            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSinhVien;
    }
}
