package dao;

import Connector.KetNoiSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TaiKhoanDAO {

    public void XoaTaiKhoan(String email) {
        Connection con = KetNoiSQL.getConnection();
        String sql = "update SinhVien set trangThai = 0 where email = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, email);
            ps.executeUpdate();
            ps.close();
            con.close();
        } catch (SQLException e) {
        }
    }
    
    public void CapNhatEmail(String email,String text){
        Connection con = KetNoiSQL.getConnection();
        String sql = "update TaiKhoan set email=? where email='" + email + "'";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, text);
            ps.executeUpdate();
            ps.close();
            con.close();
        } catch (SQLException ex) {
        }
    }

}
