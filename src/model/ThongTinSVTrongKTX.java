package model;

import java.util.Date;

public class ThongTinSVTrongKTX {
    private String maSV;
    private String tenSV;
    private String maPhong;
    private String gioiTinh;
    private Date ngayLapHD;
    private Date ngayHDBD;
    private Date ngayHDKT;

    public ThongTinSVTrongKTX() {
    }

    public ThongTinSVTrongKTX(String maSV, String tenSV, String maPhong, String gioiTinh, Date ngayLapHD, Date ngayHDBD, Date ngayHDKT) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.gioiTinh = gioiTinh;
        this.maPhong = maPhong;
        this.ngayLapHD = ngayLapHD;
        this.ngayHDBD = ngayHDBD;
        this.ngayHDKT = ngayHDKT;
    }
    
    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    public String getMaPhong() {
        return maPhong;
    }
    
    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }
    
    public Date getNgayLapHD() {
        return ngayLapHD;
    }

    public void setNgayLapHD(Date ngayLapHD) {
        this.ngayLapHD = ngayLapHD;
    }

    public Date getNgayBDHD() {
        return ngayHDBD;
    }

    public void setNgayBDHD(Date ngayHDBD) {
        this.ngayHDBD = ngayHDBD;
    }

    public Date getNgayKTHD() {
        return ngayHDKT;
    }

    public void setNgayKTHD(Date ngayHDKT) {
        this.ngayHDKT = ngayHDKT;
    }
}
