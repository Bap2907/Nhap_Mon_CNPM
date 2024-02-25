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
import model.ThongTinSVDangKyKTX;
import java.sql.Timestamp;


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
    
    public String layGTSinhVienTuEmail(String email) {
        String k = "";
        String sql = "select gioiTinh from SinhVien where email= '" + email + "'";
        Connection con = KetNoiSQL.getConnection();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                k = rs.getString("gioiTinh");
            }
            ps.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLySinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return k;
    }
    
    public String layMaSinhVienTuEmail(String email) {
        String k = "";
        String sql = "select maSV from SinhVien where email= '" + email + "'";
        Connection con = KetNoiSQL.getConnection();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                k = rs.getString("maSV");
            }
            ps.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLySinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return k;
    }
    
    public int LayTrangThaiTheoEmail(String email) {
        int trangthai =0;
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from SinhVien where email ='" + email + "'";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                trangthai = rs.getInt("trangThai");

            }
            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return trangthai;
    }
    
    public void updateTrangThaiKhiSVDangKy(String masv) {
        Connection con = KetNoiSQL.getConnection();
        String sql = "update SinhVien set trangThai=? where maSV='" + masv + "'";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "3");
            ps.executeUpdate();
            ps.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<ThongTinSinhVien> getAllThongTinSVTrangThai(int trangthai) {
        List<ThongTinSinhVien> listSinhVien = new ArrayList<ThongTinSinhVien>();
        Connection conn = KetNoiSQL.getConnection();
        String sql = "select * from SinhVien where trangThai='"+trangthai+"'";
        //String sql = "select * from (select *,Null as maPhong from (select * from SinhVien except SELECT sv.* FROM SinhVien sv JOIN HopDongKTX hd ON sv.maSV = hd.maSV) as k union all SELECT sv.*, hd.maPhong FROM SinhVien sv JOIN HopDongKTX hd ON sv.maSV = hd.maSV) as k2 where trangThai='" + trangthai + "' ";

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
    
    public List<ThongTinSVDangKyKTX> getAllThongTinSVDangKyKTX() {
        List<ThongTinSVDangKyKTX> listSinhVien = new ArrayList<ThongTinSVDangKyKTX>();
        Connection conn = KetNoiSQL.getConnection();
        String query = "SELECT DangKyPhong.maSV, SinhVien.tenSV, DangKyPhong.maPhong, SinhVien.gioiTinh, DangKyPhong.ngayHDBD, DangKyPhong.ngayHDKT " +
                       "FROM DangKyPhong " +
                       "INNER JOIN SinhVien ON SinhVien.maSV = DangKyPhong.maSV ";
        try {
            if (conn != null) {
                PreparedStatement preparedStatement = conn.prepareStatement(query);
                ResultSet rs = preparedStatement.executeQuery();
                while (rs.next()) {
                    ThongTinSVDangKyKTX sv = new ThongTinSVDangKyKTX();
                    sv.setMaSV(rs.getString("maSV"));
                    sv.setTenSV(rs.getString("tenSV"));
                    sv.setMaPhong(rs.getString("maPhong"));
                    sv.setGioiTinh(rs.getString("gioiTinh"));
                    sv.setNgayBDHD(rs.getDate("ngayHDBD"));
                    sv.setNgayKTHD(rs.getDate("ngayHDKT"));
                    listSinhVien.add(sv);
                }
                preparedStatement.close();
                conn.close();
            }else{
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listSinhVien;
    }
    
    public void XoaSVKhoiDangChoDuyet(String maSV) {
        Connection con = KetNoiSQL.getConnection();
        String UpdateTrangThaiSV = "update SinhVien set trangThai = 1 where maSV = ?";
        String DeleteSVDangKyPhong = "delete from DangKyPhong where maSV = ?";
        try {
            PreparedStatement ps = con.prepareStatement(UpdateTrangThaiSV);
            ps.setString(1, maSV);
            ps.executeUpdate();
            PreparedStatement rs = con.prepareStatement(DeleteSVDangKyPhong);
            rs.setString(1, maSV);
            rs.executeUpdate();
            ps.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
        }
    }
    
    public List<ThongTinSVDangKyKTX> getAllThongTinSVDangKyKTXSearch(String where, String text) {
        List<ThongTinSVDangKyKTX> listSinhVien = new ArrayList<ThongTinSVDangKyKTX>();
        Connection conn = KetNoiSQL.getConnection();
        String query = "SELECT DangKyPhong.maSV, SinhVien.tenSV, DangKyPhong.maPhong, SinhVien.gioiTinh, DangKyPhong.ngayHDBD, DangKyPhong.ngayHDKT " +
                       "FROM DangKyPhong " +
                       "INNER JOIN SinhVien ON SinhVien.maSV = DangKyPhong.maSV ";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                ThongTinSVDangKyKTX sv = new ThongTinSVDangKyKTX();
                sv.setMaSV(rs.getString("maSV"));
                sv.setTenSV(rs.getString("tenSV"));
                sv.setMaPhong(rs.getString("maPhong"));
                sv.setGioiTinh(rs.getString("gioiTinh"));
                sv.setNgayBDHD(rs.getDate("ngayHDBD"));
                sv.setNgayKTHD(rs.getDate("ngayHDKT"));
                listSinhVien.add(sv);
            }
            preparedStatement.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listSinhVien;
    }
    
    public void ConfirmSVVaoKTX(String maSV) {
        Connection con = KetNoiSQL.getConnection();
        Date date = new Date();
        Timestamp ngayLapHD = new Timestamp(date.getTime());
        String query = "SELECT maPhong, ngayHDBD, ngayHDKT FROM DangKyPhong WHERE maSV = ?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1, maSV);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String maPhong = resultSet.getString("maPhong");
                Timestamp ngayHDBD = resultSet.getTimestamp("ngayHDBD");
                Timestamp ngayHDKT = resultSet.getTimestamp("ngayHDKT");
                insertIntoHopDongKTX(maSV, maPhong, ngayHDBD, ngayHDKT, ngayLapHD);
            }
            updateSinhVienTrangThai(maSV);
            deleteFromDangKyPhong(maSV);
            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void insertIntoHopDongKTX(String maSV, String maPhong, Timestamp ngayHDBD, Timestamp ngayHDKT, Timestamp ngayLapHD) throws SQLException {
        Connection con = KetNoiSQL.getConnection();
        String query = "INSERT INTO HopDongKTX (maSV, maPhong, ngayLapHD, ngayHDBD, ngayHDKT) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = con.prepareStatement(query);
        preparedStatement.setString(1, maSV);
        preparedStatement.setString(2, maPhong);
        preparedStatement.setTimestamp(3, ngayLapHD);
        preparedStatement.setTimestamp(4, ngayHDBD);
        preparedStatement.setTimestamp(5, ngayHDKT);
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }
    
    private void updateSinhVienTrangThai(String maSV) throws SQLException {
        Connection con = KetNoiSQL.getConnection();
        String updateQuery = "UPDATE SinhVien SET trangThai = 2 WHERE maSV = ?";
        PreparedStatement updateStatement = con.prepareStatement(updateQuery);
        updateStatement.setString(1, maSV);
        updateStatement.executeUpdate();
        updateStatement.close();
    }
    
    private void deleteFromDangKyPhong(String maSV) throws SQLException {
        Connection con = KetNoiSQL.getConnection();
        String query = "DELETE FROM DangKyPhong WHERE maSV = ?";
        PreparedStatement preparedStatement = con.prepareStatement(query);
        preparedStatement.setString(1, maSV);
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }
}
