package JFrameQuanLyKyTucXa;

import Connector.KetNoiSQL;
import dao.HopDongKTXDAO;
import dao.QuanLySinhVienDAO;
import dao.TaiKhoanDAO;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.ThongTinSVTrongKTX;
import model.ThongTinSinhVien;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import textfield.SearchOptionEvent;
import textfield.SearchOption;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Component;
import javax.swing.table.TableCellRenderer;
import javax.swing.*;
import dao.PhongDAO;
import java.awt.Color;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;
import model.ThongTinPhong;
import model.ThongTinSVDangKyKTX;

public class QuanLySVDangTrongKTX extends javax.swing.JPanel {

    private List<ThongTinSVTrongKTX> listsinhvien;
    private DefaultTableModel Model;
    private int count = -1;
    private KetNoiSQL ketNoiSQL;
    private String maSVChuaCoHD;
    private int keyradiothang = 3;
    private String maSV;
    private int choice;

    public QuanLySVDangTrongKTX() {
        initComponents();
        AddSearch();
        Model = (DefaultTableModel) tableSV.getModel();
        showTable();
        tableSV.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tableSV.getTableHeader().setOpaque(false);
        tableSV.getTableHeader().setBackground(new Color(0, 102, 102));
        tableSV.getTableHeader().setForeground(new Color(225, 225, 225));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        TrangChuHopDongKTX = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        loadSV = new javax.swing.JLabel();
        addSV = new javax.swing.JLabel();
        viewSV = new javax.swing.JLabel();
        updateSV = new javax.swing.JLabel();
        deleteSV = new javax.swing.JLabel();
        ScrollPaneSV = new javax.swing.JScrollPane();
        tableSV = new javax.swing.JTable();
        txtSearch = new textfield.TextFieldSearchOption();
        AddSVVaoKTX = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        ComboBoxMaSV = new javax.swing.JComboBox<>();
        ComboBoxMaPhong = new javax.swing.JComboBox<>();
        txtaddngayHDBD = new com.toedter.calendar.JDateChooser();
        txtrd1thang = new javax.swing.JRadioButton();
        txtrd2thang = new javax.swing.JRadioButton();
        txtrd3thang = new javax.swing.JRadioButton();
        jLabel50 = new javax.swing.JLabel();
        txtTenSV = new java.awt.TextField();
        btnAddSV = new javax.swing.JButton();
        ViewSV = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        txtViewHoTenSV = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        txtViewMaSoSV = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtViewCCCDSV = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txtViewMaLopSV = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txtViewGioiTinh = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtViewSoDienThoaiSV = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtViewQueQuan = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtViewEmailSV = new javax.swing.JLabel();
        txtViewNgaySinhSV = new com.toedter.calendar.JDateChooser();
        jLabel37 = new javax.swing.JLabel();
        txtViewMaPhongSV = new javax.swing.JLabel();
        UpdateSV = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        txtMaSV = new java.awt.TextField();
        txtTenSV1 = new java.awt.TextField();
        txtNgayHDBD = new java.awt.TextField();
        txtNgayHDKT = new java.awt.TextField();
        ComboBoxMaPhong1 = new javax.swing.JComboBox<>();
        btnUpdateSV = new javax.swing.JButton();

        TrangChuHopDongKTX.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(19, 90, 118));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Quản lý sinh viên đang ở trong KTX");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(19, 90, 118)));

        loadSV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loadSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/loading.png"))); // NOI18N
        loadSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loadSVMouseClicked(evt);
            }
        });

        addSV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        addSV.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addSVMouseClicked(evt);
            }
        });

        viewSV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/magnifyingglass.png"))); // NOI18N
        viewSV.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        viewSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewSVMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewSVMouseEntered(evt);
            }
        });

        updateSV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/copywriting.png"))); // NOI18N
        updateSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateSVMouseClicked(evt);
            }
        });

        deleteSV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        deleteSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteSVMouseClicked(evt);
            }
        });

        ScrollPaneSV.setBackground(new java.awt.Color(255, 255, 255));
        ScrollPaneSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ScrollPaneSVMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ScrollPaneSVMouseExited(evt);
            }
        });

        tableSV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableSV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sinh viên", "Tên sinh viên", "Mã phòng", "Giới tính", "Ngày lập HD", "Ngày HDBD", "Ngày HDKT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableSV.setFocusable(false);
        tableSV.setGridColor(new java.awt.Color(255, 255, 255));
        tableSV.setRowHeight(25);
        tableSV.setSelectionBackground(new java.awt.Color(0, 102, 102));
        tableSV.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tableSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSVMouseClicked(evt);
            }
        });
        ScrollPaneSV.setViewportView(tableSV);

        txtSearch.setBorder(null);
        txtSearch.setForeground(new java.awt.Color(19, 90, 118));
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout TrangChuHopDongKTXLayout = new javax.swing.GroupLayout(TrangChuHopDongKTX);
        TrangChuHopDongKTX.setLayout(TrangChuHopDongKTXLayout);
        TrangChuHopDongKTXLayout.setHorizontalGroup(
            TrangChuHopDongKTXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TrangChuHopDongKTXLayout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1215, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(TrangChuHopDongKTXLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(TrangChuHopDongKTXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ScrollPaneSV, javax.swing.GroupLayout.PREFERRED_SIZE, 1053, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(TrangChuHopDongKTXLayout.createSequentialGroup()
                        .addComponent(loadSV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addSV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(viewSV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updateSV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(deleteSV, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TrangChuHopDongKTXLayout.setVerticalGroup(
            TrangChuHopDongKTXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TrangChuHopDongKTXLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(TrangChuHopDongKTXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loadSV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addSV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewSV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateSV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteSV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ScrollPaneSV, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 194, Short.MAX_VALUE))
        );

        AddSVVaoKTX.setBackground(new java.awt.Color(0, 102, 102));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Hệ thống quản lý ký túc xá sinh viên");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 255, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Thêm thông tin sinh viên ở ký túc xá");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_white.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Mã số sinh viên :");

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Mã số phòng :");

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Ngày hợp đồng bắt đầu:");

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Thời gian ở:");

        ComboBoxMaSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ComboBoxMaSVMouseClicked(evt);
            }
        });
        ComboBoxMaSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxMaSVActionPerformed(evt);
            }
        });

        ComboBoxMaPhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ComboBoxMaPhongMouseClicked(evt);
            }
        });

        txtaddngayHDBD.setToolTipText("");
        txtaddngayHDBD.setDateFormatString("MM-yyyy");
        txtaddngayHDBD.setPreferredSize(new java.awt.Dimension(90, 22));
        txtaddngayHDBD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtaddngayHDBDMouseClicked(evt);
            }
        });
        txtaddngayHDBD.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtaddngayHDBDPropertyChange(evt);
            }
        });

        txtrd1thang.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(txtrd1thang);
        txtrd1thang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtrd1thang.setForeground(new java.awt.Color(19, 90, 118));
        txtrd1thang.setSelected(true);
        txtrd1thang.setText("3 Tháng");
        txtrd1thang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtrd1thangMouseClicked(evt);
            }
        });

        txtrd2thang.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(txtrd2thang);
        txtrd2thang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtrd2thang.setForeground(new java.awt.Color(19, 90, 118));
        txtrd2thang.setText("6 tháng");
        txtrd2thang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtrd2thangMouseClicked(evt);
            }
        });

        txtrd3thang.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(txtrd3thang);
        txtrd3thang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtrd3thang.setForeground(new java.awt.Color(19, 90, 118));
        txtrd3thang.setText("9 tháng");
        txtrd3thang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtrd3thangMouseClicked(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Tên sinh viên :");

        txtTenSV.setMinimumSize(new java.awt.Dimension(58, 28));

        btnAddSV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAddSV.setForeground(new java.awt.Color(237, 50, 55));
        btnAddSV.setText("Lưu sinh viên");
        btnAddSV.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(237, 50, 55)));
        btnAddSV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddSVMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout AddSVVaoKTXLayout = new javax.swing.GroupLayout(AddSVVaoKTX);
        AddSVVaoKTX.setLayout(AddSVVaoKTXLayout);
        AddSVVaoKTXLayout.setHorizontalGroup(
            AddSVVaoKTXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddSVVaoKTXLayout.createSequentialGroup()
                .addGroup(AddSVVaoKTXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AddSVVaoKTXLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AddSVVaoKTXLayout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addGroup(AddSVVaoKTXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAddSV, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(AddSVVaoKTXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(AddSVVaoKTXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(AddSVVaoKTXLayout.createSequentialGroup()
                                        .addComponent(jLabel48)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                                        .addComponent(txtaddngayHDBD, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(AddSVVaoKTXLayout.createSequentialGroup()
                                        .addComponent(jLabel47)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ComboBoxMaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(AddSVVaoKTXLayout.createSequentialGroup()
                                        .addGroup(AddSVVaoKTXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddSVVaoKTXLayout.createSequentialGroup()
                                                .addComponent(jLabel46)
                                                .addGap(152, 152, 152))
                                            .addGroup(AddSVVaoKTXLayout.createSequentialGroup()
                                                .addComponent(jLabel50)
                                                .addGap(168, 168, 168)))
                                        .addGroup(AddSVVaoKTXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(ComboBoxMaSV, 0, 177, Short.MAX_VALUE)
                                            .addComponent(txtTenSV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGroup(AddSVVaoKTXLayout.createSequentialGroup()
                                    .addComponent(jLabel49)
                                    .addGap(136, 136, 136)
                                    .addComponent(txtrd1thang)
                                    .addGap(33, 33, 33)
                                    .addComponent(txtrd2thang)
                                    .addGap(28, 28, 28)
                                    .addComponent(txtrd3thang))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(AddSVVaoKTXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(AddSVVaoKTXLayout.createSequentialGroup()
                    .addGap(67, 67, 67)
                    .addGroup(AddSVVaoKTXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, 894, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(141, Short.MAX_VALUE)))
        );
        AddSVVaoKTXLayout.setVerticalGroup(
            AddSVVaoKTXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddSVVaoKTXLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addGroup(AddSVVaoKTXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(AddSVVaoKTXLayout.createSequentialGroup()
                        .addGroup(AddSVVaoKTXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtTenSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(AddSVVaoKTXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(AddSVVaoKTXLayout.createSequentialGroup()
                        .addGroup(AddSVVaoKTXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxMaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtaddngayHDBD, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(AddSVVaoKTXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtrd1thang)
                    .addComponent(txtrd2thang)
                    .addComponent(txtrd3thang)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(btnAddSV, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
            .addGroup(AddSVVaoKTXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(AddSVVaoKTXLayout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(513, Short.MAX_VALUE)))
        );

        ViewSV.setBackground(new java.awt.Color(255, 255, 255));

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(19, 90, 118));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("Hệ thống quản lý ký túc xá sinh viên");

        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_main.png"))); // NOI18N
        jLabel55.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel55MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(237, 50, 55));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Thông tin sinh viên");

        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(19, 90, 118));
        jLabel53.setText("Họ và tên sinh viên :");

        txtViewHoTenSV.setBackground(new java.awt.Color(255, 255, 255));
        txtViewHoTenSV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtViewHoTenSV.setForeground(new java.awt.Color(19, 90, 118));
        txtViewHoTenSV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(19, 90, 118));
        jLabel54.setText("Mã số sinh viên :");

        txtViewMaSoSV.setBackground(new java.awt.Color(255, 255, 255));
        txtViewMaSoSV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtViewMaSoSV.setForeground(new java.awt.Color(19, 90, 118));
        txtViewMaSoSV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(19, 90, 118));
        jLabel31.setText("Căn cước công dân :");

        txtViewCCCDSV.setBackground(new java.awt.Color(255, 255, 255));
        txtViewCCCDSV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtViewCCCDSV.setForeground(new java.awt.Color(19, 90, 118));
        txtViewCCCDSV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(19, 90, 118));
        jLabel33.setText("Ngày sinh :");

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(19, 90, 118));
        jLabel36.setText("Mã lớp :");

        txtViewMaLopSV.setBackground(new java.awt.Color(255, 255, 255));
        txtViewMaLopSV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtViewMaLopSV.setForeground(new java.awt.Color(19, 90, 118));
        txtViewMaLopSV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(19, 90, 118));
        jLabel34.setText("Giới tính :");

        txtViewGioiTinh.setBackground(new java.awt.Color(255, 255, 255));
        txtViewGioiTinh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtViewGioiTinh.setForeground(new java.awt.Color(19, 90, 118));
        txtViewGioiTinh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(19, 90, 118));
        jLabel30.setText("Số điện thoại :");

        txtViewSoDienThoaiSV.setBackground(new java.awt.Color(255, 255, 255));
        txtViewSoDienThoaiSV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtViewSoDienThoaiSV.setForeground(new java.awt.Color(19, 90, 118));
        txtViewSoDienThoaiSV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(19, 90, 118));
        jLabel32.setText("Quê quán :");

        txtViewQueQuan.setBackground(new java.awt.Color(255, 255, 255));
        txtViewQueQuan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtViewQueQuan.setForeground(new java.awt.Color(19, 90, 118));
        txtViewQueQuan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(19, 90, 118));
        jLabel35.setText("Email :");

        txtViewEmailSV.setBackground(new java.awt.Color(255, 255, 255));
        txtViewEmailSV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtViewEmailSV.setForeground(new java.awt.Color(19, 90, 118));
        txtViewEmailSV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(19, 90, 118));
        jLabel37.setText("Mã phòng :");

        txtViewMaPhongSV.setBackground(new java.awt.Color(255, 255, 255));
        txtViewMaPhongSV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtViewMaPhongSV.setForeground(new java.awt.Color(19, 90, 118));
        txtViewMaPhongSV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout ViewSVLayout = new javax.swing.GroupLayout(ViewSV);
        ViewSV.setLayout(ViewSVLayout);
        ViewSVLayout.setHorizontalGroup(
            ViewSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewSVLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ViewSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViewSVLayout.createSequentialGroup()
                        .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 963, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewSVLayout.createSequentialGroup()
                        .addGap(0, 52, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 1077, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80))))
            .addGroup(ViewSVLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addGroup(ViewSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViewSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(ViewSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(ViewSVLayout.createSequentialGroup()
                                .addComponent(jLabel54)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtViewMaSoSV, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ViewSVLayout.createSequentialGroup()
                                .addComponent(jLabel53)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addComponent(txtViewHoTenSV, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ViewSVLayout.createSequentialGroup()
                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtViewMaPhongSV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(ViewSVLayout.createSequentialGroup()
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtViewCCCDSV, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ViewSVLayout.createSequentialGroup()
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtViewNgaySinhSV, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(78, 78, 78)
                .addGroup(ViewSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(ViewSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtViewGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtViewSoDienThoaiSV, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtViewEmailSV, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtViewQueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtViewMaLopSV, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ViewSVLayout.setVerticalGroup(
            ViewSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewSVLayout.createSequentialGroup()
                .addGroup(ViewSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(ViewSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViewSVLayout.createSequentialGroup()
                        .addGroup(ViewSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtViewMaLopSV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(ViewSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ViewSVLayout.createSequentialGroup()
                                .addGroup(ViewSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtViewGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(ViewSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtViewMaSoSV, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(ViewSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ViewSVLayout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addGroup(ViewSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtViewSoDienThoaiSV, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewSVLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(txtViewCCCDSV, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ViewSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtViewHoTenSV, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(ViewSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtViewNgaySinhSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtViewQueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 37, Short.MAX_VALUE)
                .addGroup(ViewSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtViewMaPhongSV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtViewEmailSV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(243, Short.MAX_VALUE))
        );

        UpdateSV.setBackground(new java.awt.Color(255, 255, 255));

        jLabel60.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(19, 90, 118));
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("Hệ thống quản lý ký túc xá sinh viên");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_main.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(237, 50, 55));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Thông tin sinh viên");

        jLabel52.setBackground(new java.awt.Color(0, 0, 0));
        jLabel52.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel52.setText("Mã số sinh viên :");

        jLabel56.setBackground(new java.awt.Color(0, 0, 0));
        jLabel56.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel56.setText("Tên sinh viên :");

        jLabel57.setBackground(new java.awt.Color(0, 0, 0));
        jLabel57.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel57.setText("Mã phòng :");

        jLabel58.setBackground(new java.awt.Color(0, 0, 0));
        jLabel58.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel58.setText("Ngày bắt đầu hợp đồng :");

        jLabel59.setBackground(new java.awt.Color(0, 0, 0));
        jLabel59.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel59.setText("Ngày kết thúc hợp đồng:");

        txtMaSV.setEditable(false);
        txtMaSV.setMinimumSize(new java.awt.Dimension(58, 26));

        txtTenSV1.setEditable(false);
        txtTenSV1.setMinimumSize(new java.awt.Dimension(58, 26));

        txtNgayHDBD.setEditable(false);
        txtNgayHDBD.setMinimumSize(new java.awt.Dimension(58, 26));

        txtNgayHDKT.setEditable(false);
        txtNgayHDKT.setMinimumSize(new java.awt.Dimension(58, 26));

        ComboBoxMaPhong1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ComboBoxMaPhong1MouseClicked(evt);
            }
        });

        btnUpdateSV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdateSV.setForeground(new java.awt.Color(237, 50, 55));
        btnUpdateSV.setText("Lưu sinh viên");
        btnUpdateSV.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(237, 50, 55)));
        btnUpdateSV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdateSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateSVMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout UpdateSVLayout = new javax.swing.GroupLayout(UpdateSV);
        UpdateSV.setLayout(UpdateSVLayout);
        UpdateSVLayout.setHorizontalGroup(
            UpdateSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateSVLayout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addGroup(UpdateSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnUpdateSV, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(UpdateSVLayout.createSequentialGroup()
                        .addGroup(UpdateSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel59)
                            .addComponent(jLabel58)
                            .addComponent(jLabel57)
                            .addComponent(jLabel56)
                            .addComponent(jLabel52))
                        .addGap(69, 69, 69)
                        .addGroup(UpdateSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaSV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTenSV1, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(txtNgayHDBD, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(txtNgayHDKT, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(ComboBoxMaPhong1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(374, Short.MAX_VALUE))
            .addGroup(UpdateSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(UpdateSVLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(UpdateSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(UpdateSVLayout.createSequentialGroup()
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel60, javax.swing.GroupLayout.DEFAULT_SIZE, 973, Short.MAX_VALUE)
                            .addGap(63, 63, 63))
                        .addGroup(UpdateSVLayout.createSequentialGroup()
                            .addGap(52, 52, 52)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 1077, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap()))
        );
        UpdateSVLayout.setVerticalGroup(
            UpdateSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateSVLayout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(UpdateSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(UpdateSVLayout.createSequentialGroup()
                        .addGroup(UpdateSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtTenSV1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(UpdateSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxMaPhong1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(UpdateSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNgayHDBD, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39)
                .addGroup(UpdateSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNgayHDKT, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addComponent(btnUpdateSV, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
            .addGroup(UpdateSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(UpdateSVLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(UpdateSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(518, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1227, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(TrangChuHopDongKTX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(AddSVVaoKTX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(6, 6, 6)
                    .addComponent(ViewSV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(6, 6, 6)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(UpdateSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 752, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(TrangChuHopDongKTX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(AddSVVaoKTX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(43, 43, 43)
                    .addComponent(ViewSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(43, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(UpdateSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loadSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadSVMouseClicked
        showTable();
        count = -1;
    }//GEN-LAST:event_loadSVMouseClicked

    private void addSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addSVMouseClicked
        TrangChuHopDongKTX.setVisible(false);
        AddSVVaoKTX.setVisible(true);
        AddComboBoxMasv();
    }//GEN-LAST:event_addSVMouseClicked

    private void viewSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewSVMouseClicked
        count = tableSV.getSelectedRow();
        if (count == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn sinh viên để xem!");
        } else {
            TrangChuHopDongKTX.setVisible(false);
            AddSVVaoKTX.setVisible(false);
            ViewSV.setVisible(true);
            LayThongTinSinhVienView(count);
        }
        showTable();
    }//GEN-LAST:event_viewSVMouseClicked

    private void viewSVMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewSVMouseEntered

    }//GEN-LAST:event_viewSVMouseEntered

    private void updateSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateSVMouseClicked
        count = tableSV.getSelectedRow();
        if (count == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn sinh viên để update!");
        } else {
            UpdateSV.setVisible(true);
            TrangChuHopDongKTX.setVisible(false);
            AddSVVaoKTX.setVisible(false);
            ViewSV.setVisible(false);
            LayThongTinSinhVienUp(count);
            LayMaSinhVien(count);
        }
    }//GEN-LAST:event_updateSVMouseClicked

    private void deleteSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteSVMouseClicked
        count = tableSV.getSelectedRow();
        if (count == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn sinh viên để xóa khỏi danh sách đăng ký!");
        } else {
            int test = JOptionPane.showConfirmDialog(null, "Bạn chắc có muốn xóa sinh viên khỏi danh sách đăng ký hay không !", "Thông báo", JOptionPane.YES_NO_OPTION);
            if (test == JOptionPane.YES_OPTION) {
                LayMaSinhVien(count);
                new QuanLySinhVienDAO().XoaSVKhoiKTX(maSV);
                JOptionPane.showMessageDialog(null, "Xoá thành công!");
            } else if (test == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Bạn đã hủy xóa thành công");
            }
        }
        showTable();
    }//GEN-LAST:event_deleteSVMouseClicked

    private void tableSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSVMouseClicked
        //        count = tableSV.getSelectedRow();
        //        LayMaSinhVien(count);
    }//GEN-LAST:event_tableSVMouseClicked

    private void ScrollPaneSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScrollPaneSVMouseClicked

    }//GEN-LAST:event_ScrollPaneSVMouseClicked

    private void ScrollPaneSVMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScrollPaneSVMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_ScrollPaneSVMouseExited

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        TrangChuHopDongKTX.setVisible(true);
        AddSVVaoKTX.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void txtaddngayHDBDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtaddngayHDBDMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaddngayHDBDMouseClicked

    private void txtaddngayHDBDPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtaddngayHDBDPropertyChange
//        rangbuotxacnhan();
    }//GEN-LAST:event_txtaddngayHDBDPropertyChange

    private void txtrd1thangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtrd1thangMouseClicked
        keyradiothang = 3;
    }//GEN-LAST:event_txtrd1thangMouseClicked

    private void txtrd2thangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtrd2thangMouseClicked
        keyradiothang = 6;
    }//GEN-LAST:event_txtrd2thangMouseClicked

    private void txtrd3thangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtrd3thangMouseClicked
        keyradiothang = 9;
    }//GEN-LAST:event_txtrd3thangMouseClicked

    private void ComboBoxMaSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComboBoxMaSVMouseClicked
//        try {
//            String query = "SELECT gioiTinh FROM SinhVien WHERE maSV = ? AND trangThai = 1";
//            PreparedStatement preparedStatement = ketNoiSQL.getConnection().prepareStatement(query);
//            String selectedMaSV = (String) ComboBoxMaSV.getSelectedItem();
//            preparedStatement.setString(1, selectedMaSV);
//            System.out.println("Selected maSV: " + selectedMaSV);
//            ResultSet resultSet = preparedStatement.executeQuery();
//
//            // Kiểm tra nếu kết quả có dữ liệu
//            if (resultSet.next()) {
//                String gioiTinh = resultSet.getString("gioiTinh");
//                System.out.println("Gioi tinh: " + gioiTinh);
//                // Gọi hàm để cập nhật danh sách phòng dựa trên giới tính đã chọn
//                //updatePhongComboBox(gioiTinh);
//            }
//
//            resultSet.close();
//            preparedStatement.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }//GEN-LAST:event_ComboBoxMaSVMouseClicked

    private void ComboBoxMaPhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComboBoxMaPhongMouseClicked

    }//GEN-LAST:event_ComboBoxMaPhongMouseClicked

    private void ComboBoxMaSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxMaSVActionPerformed
        maSVChuaCoHD = (String) ComboBoxMaSV.getSelectedItem();
        layThongTinHopDongChuaDangKy(maSVChuaCoHD);
    }//GEN-LAST:event_ComboBoxMaSVActionPerformed

    private void btnAddSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddSVMouseClicked
        try {
            SimpleDateFormat sp = new SimpleDateFormat("MM-yyyy");
            String d1 = sp.format(txtaddngayHDBD.getDate());
            Date d1n = sp.parse(d1);
            Date ngayhientai = new Date();
            if (d1n.compareTo(ngayhientai) > 0) {
                QuanLySinhVienDAO svd = new QuanLySinhVienDAO();
                int test = JOptionPane.showConfirmDialog(null, "Bạn chắc có muốn đăng ký hay không !", "Thông báo đăng ký", JOptionPane.YES_NO_OPTION);
                if (test == JOptionPane.YES_OPTION) {
                    Object maSV = ComboBoxMaSV.getSelectedItem();
                    Object maPhong = ComboBoxMaPhong.getSelectedItem();
                    svd.updateTrangThaiKhiAdminDangKy(maSV.toString());
                    ThemThongTinSVDangKy(maSV.toString(), maPhong.toString(), keyradiothang, d1n);
                    JOptionPane.showMessageDialog(null, "Bạn đã đăng ký thành công");
                    TrangChuHopDongKTX.setVisible(true);
                    AddSVVaoKTX.setVisible(false);
                    showTable();
                    count = -1;
                } else if (test == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(null, "Bạn đã hủy đăng ký thành công");
                    TrangChuHopDongKTX.setVisible(true);
                    AddSVVaoKTX.setVisible(false);
                    showTable();
                    count = -1;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ngày vào phải lớn hơn ngày hiện tại");
            }
        } catch (ParseException ex) {
            Logger.getLogger(DangKiPhong.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddSVMouseClicked

    private void jLabel55MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel55MouseClicked
        TrangChuHopDongKTX.setVisible(true);
        AddSVVaoKTX.setVisible(false);
        ViewSV.setVisible(false);
    }//GEN-LAST:event_jLabel55MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        TrangChuHopDongKTX.setVisible(true);
        AddSVVaoKTX.setVisible(false);
        UpdateSV.setVisible(false);
        ViewSV.setVisible(false);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void ComboBoxMaPhong1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComboBoxMaPhong1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxMaPhong1MouseClicked

    private void btnUpdateSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateSVMouseClicked
        ThongTinSVTrongKTX sv = listsinhvien.get(count);
        int test = JOptionPane.showConfirmDialog(null, "Bạn chắc có muốn cập nhật phòng mới cho sinh viên hay không !", "Thông báo đăng ký", JOptionPane.YES_NO_OPTION);
        if (test == JOptionPane.YES_OPTION) {
            updateSV(sv.getMaSV());
            TrangChuHopDongKTX.setVisible(true);
            JOptionPane.showMessageDialog(null, "Bạn đã cập nhật thành công");
            UpdateSV.setVisible(false);
        } else if (test == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Bạn đã hủy cập nhật thành công");
        }
    }//GEN-LAST:event_btnUpdateSVMouseClicked

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        if (txtSearch.isSelected()) {
            int option = txtSearch.getSelectedIndex();
            String textsearch = txtSearch.getText().trim();
            if (choice == 0) {
                if (option == 0) {
                    showTableSearch("maSV", textsearch);
                } else if (option == 1) {
                    showTableSearch("maPhong", textsearch);
                } else if (option == 2) {
                    showTableSearch("gioiTinh", textsearch);
                } else if (option == 3) {
                    showTableSearch("ngayHDKT", textsearch);
                }
            } else if (choice == 1) {
                if (option == 0) {
                    showTableSearch("maSV", textsearch);
                } else if (option == 1) {
                    showTableSearch("maPhong", textsearch);
                } else if (option == 2) {
                    showTableSearch("gioiTinh", textsearch);
                } else if (option == 3) {
                    showTableSearch("ngayHDKT", textsearch);
                }
            } else if (choice == 2) {
                if (option == 0) {
                    showTableSearch("maSV", textsearch);
                } else if (option == 1) {
                    showTableSearch("maPhong", textsearch);
                } else if (option == 2) {
                    showTableSearch("gioiTinh", textsearch);
                } else if (option == 3) {
                    showTableSearch("ngayHDKT", textsearch);
                }
            } else if (choice == 3) {
                if (option == 0) {
                    showTableSearch("maSV", textsearch);
                } else if (option == 1) {
                    showTableSearch("maPhong", textsearch);
                } else if (option == 2) {
                    showTableSearch("gioiTinh", textsearch);
                } else if (option == 3) {
                    showTableSearch("ngayHDKT", textsearch);
                }
            } else if (choice == 4) {
                if (option == 0) {
                    showTableSearch("maSV", textsearch);
                } else if (option == 1) {
                    showTableSearch("maPhong", textsearch);
                } else if (option == 2) {
                    showTableSearch("gioiTinh", textsearch);
                } else if (option == 3) {
                    showTableSearch("ngayHDKT", textsearch);
                }
            }
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    void AddSearch() {
        txtSearch.addEventOptionSelected(new SearchOptionEvent() {
            @Override
            public void optionSelected(SearchOption option, int index) {
                txtSearch.setHint("Tìm kiếm " + option.getName() + "....");
            }
        });
        txtSearch.addOption(new SearchOption("Mã Sinh Viên", new ImageIcon(getClass().getResource("/img/notebook.png"))));
        txtSearch.addOption(new SearchOption("Mã phòng", new ImageIcon(getClass().getResource("/img/username.png"))));
        txtSearch.addOption(new SearchOption("Giới tính", new ImageIcon(getClass().getResource("/img/creditcard.png"))));
        txtSearch.addOption(new SearchOption("Ngày kết thúc hợp đồng", new ImageIcon(getClass().getResource("/img/presentation.png"))));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddSVVaoKTX;
    private javax.swing.JComboBox<String> ComboBoxMaPhong;
    private javax.swing.JComboBox<String> ComboBoxMaPhong1;
    private javax.swing.JComboBox<String> ComboBoxMaSV;
    private javax.swing.JScrollPane ScrollPaneSV;
    private javax.swing.JPanel TrangChuHopDongKTX;
    private javax.swing.JPanel UpdateSV;
    private javax.swing.JPanel ViewSV;
    private javax.swing.JLabel addSV;
    private javax.swing.JButton btnAddSV;
    private javax.swing.JButton btnUpdateSV;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel deleteSV;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel loadSV;
    private javax.swing.JTable tableSV;
    private java.awt.TextField txtMaSV;
    private java.awt.TextField txtNgayHDBD;
    private java.awt.TextField txtNgayHDKT;
    private textfield.TextFieldSearchOption txtSearch;
    private java.awt.TextField txtTenSV;
    private java.awt.TextField txtTenSV1;
    private javax.swing.JLabel txtViewCCCDSV;
    private javax.swing.JLabel txtViewEmailSV;
    private javax.swing.JLabel txtViewGioiTinh;
    private javax.swing.JLabel txtViewHoTenSV;
    private javax.swing.JLabel txtViewMaLopSV;
    private javax.swing.JLabel txtViewMaPhongSV;
    private javax.swing.JLabel txtViewMaSoSV;
    private com.toedter.calendar.JDateChooser txtViewNgaySinhSV;
    private javax.swing.JLabel txtViewQueQuan;
    private javax.swing.JLabel txtViewSoDienThoaiSV;
    private com.toedter.calendar.JDateChooser txtaddngayHDBD;
    private javax.swing.JRadioButton txtrd1thang;
    private javax.swing.JRadioButton txtrd2thang;
    private javax.swing.JRadioButton txtrd3thang;
    private javax.swing.JLabel updateSV;
    private javax.swing.JLabel viewSV;
    // End of variables declaration//GEN-END:variables

    private void showTable() {
        listsinhvien = new QuanLySinhVienDAO().getAllThongTinSVTrongKTX();
        Model.setRowCount(0);
        for (ThongTinSVTrongKTX sv : listsinhvien) {
            Model.addRow(new Object[]{
                sv.getMaSV(), sv.getTenSV(), sv.getMaPhong(), sv.getGioiTinh(), sv.getNgayLapHD(), sv.getNgayBDHD(), sv.getNgayKTHD()
            });
        }
        count = -1;
    }

    public void layThongTinHopDongChuaDangKy(String masv) {
        ThongTinSinhVien sv = new HopDongKTXDAO().getAllThongTinSVchuadangky(masv);
        HopDongKTXDAO hd = new HopDongKTXDAO();
        String gioitinh = sv.getGioiTinh();
        ComboBoxMaPhong(gioitinh);
        String tenSV = sv.getTenSV();
        Date ngayBD = hd.layNgayHDBDtuDangKYPhong(masv);
        Date ngayKT = hd.layNgayHDKTtuDangKYPhong(masv);
        txtTenSV.setText(tenSV);
        txtaddngayHDBD.setDate(ngayBD);
        //txtaddngayHDKT.setDate(ngayKT);
        txtTenSV.setEditable(false);
    }

    void ComboBoxMaPhong(String gioitinh) {
        PhongDAO pd = new PhongDAO();
        ComboBoxMaPhong.removeAllItems();
        List<ThongTinPhong> listphong = new PhongDAO().getAllThongTinPhongTheoGioiTinh(gioitinh);
        for (ThongTinPhong phong : listphong) {
            if (pd.CheckPhong(phong.getMaPhong()) == 1) {
                ComboBoxMaPhong.addItem(phong.getMaPhong());
            }
        }
        if (ComboBoxMaPhong.getItemCount() > 0) {
            ComboBoxMaPhong.setSelectedIndex(0);
        }
    }

    void AddComboBoxMasv() {
        PhongDAO pd = new PhongDAO();
        ComboBoxMaSV.removeAllItems();
        List<String> listmasv = new HopDongKTXDAO().LayMaSinhVienChuaCoHopDong();
        for (String i : listmasv) {
            ComboBoxMaSV.addItem(i);
        }
    }

    void ThemThongTinSVDangKy(String masv, String maPhongDuocChon, int thang, Date ngayHDBD) {
        Connection con = KetNoiSQL.getConnection();
        QuanLySinhVienDAO svd = new QuanLySinhVienDAO();
        Date datesv;
        String datestr = "";
        SimpleDateFormat sp = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cld = Calendar.getInstance();
        Date date1 = txtaddngayHDBD.getDate();
        cld.setTime(date1);
        cld.add(Calendar.MONTH, thang);
        datesv = cld.getTime();
        datestr = sp.format(datesv);
        String sql = "insert into HopDongKTX (maSV, maPhong, ngayLapHD, ngayHDKT, ngayHDBD) values(?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, masv);
            ps.setString(2, maPhongDuocChon);
            ps.setString(3, java.sql.Date.valueOf(java.time.LocalDate.now()).toString());
            ps.setString(4, datestr); // Convert to java.sql.Date
            ps.setDate(5, new java.sql.Date(ngayHDBD.getTime()));
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DangKiPhong.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void LayThongTinSinhVienView(int count) {
        Connection con = KetNoiSQL.getConnection();
        String sql = "SELECT maSV, maPhong FROM HopDongKTX ORDER BY maSV OFFSET ? ROWS FETCH NEXT 1 ROWS ONLY";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, count); // Thiết lập tham số cho chỉ số hàng
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String maSV = rs.getString("maSV");
                String maPhong = rs.getString("maPhong");
                String sqlSV = "SELECT tenSV, CCCD, ngaySinh, maLop, gioiTinh, soDienThoai, queQuan, email FROM SinhVien WHERE maSV = ?";
                PreparedStatement psSV = con.prepareStatement(sqlSV);
                psSV.setString(1, maSV);
                ResultSet result = psSV.executeQuery();
                if (result.next()) {
                    String tenSV = result.getString("tenSV");
                    String CCCD = result.getString("CCCD");
                    Date ngaySinh = result.getDate("ngaySinh");
                    String maLop = result.getString("maLop");
                    String gioiTinh = result.getString("gioiTinh");
                    String soDienThoai = result.getString("soDienThoai");
                    String queQuan = result.getString("queQuan");
                    String email = result.getString("email");
                    txtViewHoTenSV.setText(tenSV);
                    txtViewCCCDSV.setText(CCCD);
                    txtViewNgaySinhSV.setDate(ngaySinh);
                    txtViewMaLopSV.setText(maLop);
                    txtViewGioiTinh.setText(gioiTinh);
                    txtViewSoDienThoaiSV.setText(soDienThoai);
                    txtViewQueQuan.setText(queQuan);
                    txtViewEmailSV.setText(email);
                } else {
                    txtViewHoTenSV.setText("Không có thông tin sinh viên");
                }
                txtViewMaSoSV.setText(maSV);
                txtViewMaPhongSV.setText(maPhong);
            } else {
            }
        } catch (SQLException ex) {
            Logger.getLogger(DangKiPhong.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void LayMaSinhVien(int count) {
        ThongTinSVTrongKTX sv = listsinhvien.get(count);
        maSV = sv.getMaSV();
    }

    private void LayThongTinSinhVienUp(int count) {
        ThongTinSVTrongKTX sv = listsinhvien.get(count);
        PhongDAO pd = new PhongDAO();
        txtMaSV.setText(sv.getMaSV());
        txtTenSV1.setText(sv.getTenSV());
        ComboBoxMaPhong1.removeAllItems();
        String gioitinh = sv.getGioiTinh();
        List<ThongTinPhong> listphong = new PhongDAO().getAllThongTinPhongTheoGioiTinh(gioitinh);
        ComboBoxMaPhong1.addItem(sv.getMaPhong());
        for (ThongTinPhong phong : listphong) {
            if (pd.CheckPhong(phong.getMaPhong()) == 1 && !phong.getMaPhong().equals(sv.getMaPhong())) {
                ComboBoxMaPhong1.addItem(phong.getMaPhong());
            }
        }
        if (ComboBoxMaPhong1.getItemCount() > 0) {
            ComboBoxMaPhong1.setSelectedIndex(0);
        }
        txtNgayHDBD.setText(sv.getNgayBDHD().toString());
        txtNgayHDKT.setText(sv.getNgayKTHD().toString());
    }
    
    private void updateSV(String masv) {
        try {
            Connection conn = KetNoiSQL.getConnection();
            String sql = "update HopDongKTX set maPhong = ? where maSV = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ComboBoxMaPhong1.getSelectedItem().toString());
            ps.setString(2, masv);
            ps.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DangKiPhong.class.getName()).log(Level.SEVERE, null, ex);
        }
        showTable();
    }
    
    private void showTableSearch(String where, String text) {
        listsinhvien = new QuanLySinhVienDAO().getAllThongTinSVSearchTK(where, text);
        Model.setRowCount(0);
        for (ThongTinSVTrongKTX sv : listsinhvien) {
            Model.addRow(new Object[]{
                sv.getMaSV(), sv.getTenSV(), sv.getMaPhong(), sv.getGioiTinh(), sv.getNgayLapHD(), sv.getNgayBDHD(), sv.getNgayKTHD()
            });
        }
        //count = -1;
    }

}
