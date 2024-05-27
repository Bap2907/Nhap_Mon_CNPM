package JFrameQuanLyKyTucXa;

import Connector.KetNoiSQL;
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
import model.ThongTinSinhVien;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import static services.HashingPass.PasswordHash;
import textfield.SearchOptionEvent;
import textfield.SearchOption;

public class QuanLySinhVien extends javax.swing.JPanel {

    private List<ThongTinSinhVien> listsinhvien;
    private DefaultTableModel Model;
    private DefaultTableModel Modeldelete;
    private int count = -1;
    private String maSV, tenDangNhap;
    private QuanLySinhVienDAO quanlysinhviendao;
    private String selectedQueQuan = "An Giang", selectedUpQueQuan = "An Giang";
    private String gioitinh;
    private String cccd, sdt, email;
    private int evcbbtt;
    
    public QuanLySinhVien() {
        initComponents();
        AddSearch();
        Model = (DefaultTableModel) tableSV.getModel();
        Modeldelete = (DefaultTableModel) tableSV1.getModel();
        showTable();
        tableSV.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tableSV.getTableHeader().setOpaque(false);
        tableSV.getTableHeader().setBackground(new Color(0,102,102));
        tableSV.getTableHeader().setForeground(new Color(225, 225, 225));
        tableSV1.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tableSV1.getTableHeader().setOpaque(false);
        tableSV1.getTableHeader().setBackground(new Color(0,102,102));
        tableSV1.getTableHeader().setForeground(new Color(225, 225, 225));
    }
    void hidepanel(){
        UpdateSV.setVisible(false);
        QuanLyThongTinSV.setVisible(false);
        AddSV.setVisible(false);
        ViewSV.setVisible(false);
        jPanel1.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        QuanLyThongTinSV = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        loadSV = new javax.swing.JLabel();
        addSV = new javax.swing.JLabel();
        viewSV = new javax.swing.JLabel();
        updateSV = new javax.swing.JLabel();
        deleteSV = new javax.swing.JLabel();
        ScrollPaneSV = new javax.swing.JScrollPane();
        tableSV = new javax.swing.JTable();
        txtSearch = new textfield.TextFieldSearchOption();
        cbbtrangthai = new javax.swing.JComboBox<>();
        Bin = new javax.swing.JLabel();
        AddSV = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        txtCCCDSV = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        rdNam = new javax.swing.JRadioButton();
        rdNu = new javax.swing.JRadioButton();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        txtTenSV = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        txtMaSoSV = new javax.swing.JTextField();
        txtMaLopSV = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        txtTenDangNhapSV = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtMatKhauSV = new javax.swing.JPasswordField();
        txtNhapLaiMatKhauSV = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        btnAddSV = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        txtSoDienThoaiSV = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        txtQueQuanSV = new javax.swing.JComboBox<>();
        show_eye = new javax.swing.JLabel();
        hide_eye = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNgaySinh = new com.toedter.calendar.JDateChooser();
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
        UpdateSV = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        rdUpNam = new javax.swing.JRadioButton();
        rdUpNu = new javax.swing.JRadioButton();
        txtUpQueQuanSV = new javax.swing.JComboBox<>();
        btnUpdateSV = new javax.swing.JButton();
        txtUpTenSV = new javax.swing.JTextField();
        txtUpMaSoSV = new javax.swing.JTextField();
        txtUpCCCD = new javax.swing.JTextField();
        txtUpMaLopSV = new javax.swing.JTextField();
        txtUpSoDienThoaiSV = new javax.swing.JTextField();
        txtUpEmail = new javax.swing.JTextField();
        txtUpNgaySinh = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        deleteSV1 = new javax.swing.JLabel();
        TableSVDelete = new javax.swing.JScrollPane();
        tableSV1 = new javax.swing.JTable();
        restore = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.CardLayout());

        QuanLyThongTinSV.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(19, 90, 118));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quản lý thông tin sinh viên");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(19, 90, 118)));

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
                "Mã sinh viên", "Tên sinh viên", "CCCD", "Giới tính", "Ngày sinh", "Mã lớp ", "Số điện thoại", "Trạng thái"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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

        cbbtrangthai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Chưa đăng ký", "Đang chờ duyệt", "Đang ở" }));
        cbbtrangthai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbtrangthaiActionPerformed(evt);
            }
        });

        Bin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/restore (2).png"))); // NOI18N
        Bin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BinMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout QuanLyThongTinSVLayout = new javax.swing.GroupLayout(QuanLyThongTinSV);
        QuanLyThongTinSV.setLayout(QuanLyThongTinSVLayout);
        QuanLyThongTinSVLayout.setHorizontalGroup(
            QuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuanLyThongTinSVLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(loadSV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(addSV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(viewSV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(updateSV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteSV, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Bin, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(cbbtrangthai, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addGroup(QuanLyThongTinSVLayout.createSequentialGroup()
                .addGroup(QuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(QuanLyThongTinSVLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(ScrollPaneSV, javax.swing.GroupLayout.PREFERRED_SIZE, 1149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 13, Short.MAX_VALUE))
        );
        QuanLyThongTinSVLayout.setVerticalGroup(
            QuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuanLyThongTinSVLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(QuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(QuanLyThongTinSVLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(QuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loadSV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addSV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewSV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateSV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteSV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(QuanLyThongTinSVLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(QuanLyThongTinSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbbtrangthai, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(ScrollPaneSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(QuanLyThongTinSV, "card10");

        AddSV.setBackground(new java.awt.Color(0, 102, 102));
        AddSV.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Hệ thống quản lý ký túc xá sinh viên");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 255, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Thêm thông tin sinh viên ở ký túc xá");

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Ngày sinh :");

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Giới tính :");

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Email :");

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Mã lớp :");

        txtCCCDSV.setBackground(new java.awt.Color(0, 102, 102));
        txtCCCDSV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtCCCDSV.setForeground(new java.awt.Color(255, 255, 255));
        txtCCCDSV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtCCCDSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCCCDSVjCanCuocSVActionPerformed(evt);
            }
        });

        txtEmail.setBackground(new java.awt.Color(0, 102, 102));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailjEmailSVActionPerformed(evt);
            }
        });

        rdNam.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(rdNam);
        rdNam.setForeground(new java.awt.Color(255, 255, 255));
        rdNam.setSelected(true);
        rdNam.setText("Nam");
        rdNam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdNamMouseClicked(evt);
            }
        });

        rdNu.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(rdNu);
        rdNu.setForeground(new java.awt.Color(255, 255, 255));
        rdNu.setText("Nữ");
        rdNu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdNuMouseClicked(evt);
            }
        });
        rdNu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdNujRadioButton2ActionPerformed(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Họ và tên sinh viên :");

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Mã số sinh viên :");

        txtTenSV.setBackground(new java.awt.Color(0, 102, 102));
        txtTenSV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtTenSV.setForeground(new java.awt.Color(255, 255, 255));
        txtTenSV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtTenSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenSVjHoTenSVActionPerformed(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Căn cước công dân :");

        txtMaSoSV.setBackground(new java.awt.Color(0, 102, 102));
        txtMaSoSV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtMaSoSV.setForeground(new java.awt.Color(255, 255, 255));
        txtMaSoSV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtMaSoSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaSoSVjMaSoSVActionPerformed(evt);
            }
        });

        txtMaLopSV.setBackground(new java.awt.Color(0, 102, 102));
        txtMaLopSV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtMaLopSV.setForeground(new java.awt.Color(255, 255, 255));
        txtMaLopSV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtMaLopSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaLopSVjMaLopSVActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(19, 90, 118));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 537, Short.MAX_VALUE)
        );

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Tên đăng nhập :");

        txtTenDangNhapSV.setBackground(new java.awt.Color(0, 102, 102));
        txtTenDangNhapSV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtTenDangNhapSV.setForeground(new java.awt.Color(255, 255, 255));
        txtTenDangNhapSV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtTenDangNhapSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenDangNhapSVActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Mật khẩu :");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Nhập lại mật khẩu :");

        txtMatKhauSV.setBackground(new java.awt.Color(0, 102, 102));
        txtMatKhauSV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtMatKhauSV.setForeground(new java.awt.Color(255, 255, 255));
        txtMatKhauSV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtMatKhauSV.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txtNhapLaiMatKhauSV.setBackground(new java.awt.Color(0, 102, 102));
        txtNhapLaiMatKhauSV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtNhapLaiMatKhauSV.setForeground(new java.awt.Color(255, 255, 255));
        txtNhapLaiMatKhauSV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtNhapLaiMatKhauSV.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Thông tin của sinh viên");

        btnAddSV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAddSV.setForeground(new java.awt.Color(19, 90, 118));
        btnAddSV.setText("Lưu sinh viên");
        btnAddSV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddSVMouseClicked(evt);
            }
        });
        btnAddSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSVActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Thông tin tài khoản của sinh viên");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Số điện thoại :");

        txtSoDienThoaiSV.setBackground(new java.awt.Color(0, 102, 102));
        txtSoDienThoaiSV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtSoDienThoaiSV.setForeground(new java.awt.Color(255, 255, 255));
        txtSoDienThoaiSV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtSoDienThoaiSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoDienThoaiSVjMaLopSVActionPerformed(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Quê quán :");

        txtQueQuanSV.setForeground(new java.awt.Color(19, 90, 118));
        txtQueQuanSV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "An Giang", "Bà Rịa – Vũng Tàu", "Bắc Giang", "Bắc Kạn", "Bạc Liêu", "Bắc Ninh", "Bến Tre", "Bình Định", "Bình Dương", "Bình Phước", "Bình Thuận", "Cà Mau", "Cần Thơ", "Cao Bằng", "Đà Nẵng", "Đắk Lắk", "Đắk Nông", "Điện Biên", "Đồng Nai", "Đồng Tháp", "Gia Lai", "Hà Giang", "Hà Nam", "Hà Nội", "Hà Tĩnh", "Hải Dương", "Hải Phòng", "Hậu Giang", "Hòa Bình", "Hưng Yên", "Khánh Hòa", "Kiên Giang", "Kon Tum", "Lai Châu", "Lâm Đồng", "Lạng Sơn", "Lào Cai", "Long An", "Nam Định", "Nghệ An", "Ninh Bình", "Ninh Thuận", "Phú Thọ", "Phú Yên", "Quảng Bình", "Quảng Nam", "Quảng Ngãi", "Quảng Ninh", "Quảng Trị", "Sóc Trăng", "Sơn La", "Tây Ninh", "Thái Bình", "Thái Nguyên", "Thanh Hóa", "Thừa Thiên Huế", "Tiền Giang", "TP Hồ Chí Minh", "Trà Vinh", "Tuyên Quang", "Vĩnh Long", "Vĩnh Phúc", "Yên Bái", "Khác" }));
        txtQueQuanSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQueQuanSVActionPerformed(evt);
            }
        });

        show_eye.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show_eye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                show_eyeMousePressed(evt);
            }
        });

        hide_eye.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hide_eye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hide_eyeMousePressed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_white.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout AddSVLayout = new javax.swing.GroupLayout(AddSV);
        AddSV.setLayout(AddSVLayout);
        AddSVLayout.setHorizontalGroup(
            AddSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddSVLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(AddSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddSVLayout.createSequentialGroup()
                        .addGroup(AddSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(AddSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(AddSVLayout.createSequentialGroup()
                                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(116, 116, 116)
                                        .addComponent(txtMaLopSV, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AddSVLayout.createSequentialGroup()
                                        .addGroup(AddSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddSVLayout.createSequentialGroup()
                                                .addComponent(jLabel45)
                                                .addGap(46, 46, 46))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddSVLayout.createSequentialGroup()
                                                .addComponent(jLabel46)
                                                .addGap(71, 71, 71)))
                                        .addGroup(AddSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtMaSoSV, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTenSV, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AddSVLayout.createSequentialGroup()
                                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(AddSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(AddSVLayout.createSequentialGroup()
                                                .addGap(50, 50, 50)
                                                .addComponent(txtCCCDSV, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(AddSVLayout.createSequentialGroup()
                                                .addGap(48, 48, 48)
                                                .addComponent(txtNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(AddSVLayout.createSequentialGroup()
                                    .addGap(177, 177, 177)
                                    .addGroup(AddSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(AddSVLayout.createSequentialGroup()
                                            .addComponent(rdNam, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(40, 40, 40)
                                            .addComponent(rdNu, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtSoDienThoaiSV, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtQueQuanSV, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddSVLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)))
                        .addGap(80, 80, 80)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(AddSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddSVLayout.createSequentialGroup()
                                .addGap(491, 491, 491)
                                .addGroup(AddSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hide_eye, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(show_eye, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(AddSVLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(AddSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(AddSVLayout.createSequentialGroup()
                                        .addGap(171, 171, 171)
                                        .addComponent(txtTenDangNhapSV, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(AddSVLayout.createSequentialGroup()
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(txtMatKhauSV, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(AddSVLayout.createSequentialGroup()
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(txtNhapLaiMatKhauSV, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnAddSV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(AddSVLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(AddSVLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(AddSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 951, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 924, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        AddSVLayout.setVerticalGroup(
            AddSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddSVLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddSVLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(AddSVLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AddSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddSVLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(AddSVLayout.createSequentialGroup()
                                .addGroup(AddSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(AddSVLayout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addGroup(AddSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(AddSVLayout.createSequentialGroup()
                                                .addGap(70, 70, 70)
                                                .addGroup(AddSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txtTenDangNhapSV, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(AddSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(AddSVLayout.createSequentialGroup()
                                                        .addComponent(txtMatKhauSV, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(1, 1, 1)))
                                                .addGap(27, 27, 27)
                                                .addGroup(AddSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(AddSVLayout.createSequentialGroup()
                                                        .addComponent(txtNhapLaiMatKhauSV, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(1, 1, 1))))
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(AddSVLayout.createSequentialGroup()
                                                .addGap(123, 123, 123)
                                                .addGroup(AddSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(hide_eye, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(show_eye, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(37, 37, 37)
                                        .addComponent(btnAddSV, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(AddSVLayout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(AddSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(AddSVLayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(AddSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(txtTenSV, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(22, 22, 22)
                                        .addGroup(AddSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtMaSoSV, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(33, 33, 33)
                                        .addGroup(AddSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCCCDSV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(AddSVLayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(33, 33, 33)
                                        .addGroup(AddSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(27, 27, 27)
                                        .addGroup(AddSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(AddSVLayout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(txtMaLopSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(36, 36, 36)
                                        .addGroup(AddSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rdNam)
                                            .addComponent(rdNu))
                                        .addGap(28, 28, 28)
                                        .addGroup(AddSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtSoDienThoaiSV, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(34, 34, 34)
                                        .addGroup(AddSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtQueQuanSV)
                                            .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(26, 26, 26)
                                        .addGroup(AddSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );

        add(AddSV, "card3");

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
                        .addGap(0, 53, Short.MAX_VALUE)
                        .addGroup(ViewSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewSVLayout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 1077, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewSVLayout.createSequentialGroup()
                                .addGroup(ViewSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(ViewSVLayout.createSequentialGroup()
                                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtViewMaLopSV, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ViewSVLayout.createSequentialGroup()
                                        .addComponent(jLabel54)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtViewMaSoSV, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ViewSVLayout.createSequentialGroup()
                                        .addComponent(jLabel53)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtViewHoTenSV, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ViewSVLayout.createSequentialGroup()
                                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtViewGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ViewSVLayout.createSequentialGroup()
                                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtViewSoDienThoaiSV, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ViewSVLayout.createSequentialGroup()
                                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtViewQueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ViewSVLayout.createSequentialGroup()
                                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(78, 78, 78)
                                        .addComponent(txtViewEmailSV, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewSVLayout.createSequentialGroup()
                                        .addGroup(ViewSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(ViewSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtViewCCCDSV, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                                            .addComponent(txtViewNgaySinhSV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(356, 356, 356))))))
        );
        ViewSVLayout.setVerticalGroup(
            ViewSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewSVLayout.createSequentialGroup()
                .addGroup(ViewSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ViewSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtViewHoTenSV, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(ViewSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtViewMaSoSV, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(ViewSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtViewCCCDSV, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(ViewSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtViewNgaySinhSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(ViewSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtViewMaLopSV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(ViewSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtViewGioiTinh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(ViewSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ViewSVLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ViewSVLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtViewSoDienThoaiSV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(25, 25, 25)
                .addGroup(ViewSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtViewQueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(ViewSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtViewEmailSV, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(146, Short.MAX_VALUE))
        );

        add(ViewSV, "card4");

        UpdateSV.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(237, 50, 55));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Thông tin sinh viên");

        jLabel56.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(19, 90, 118));
        jLabel56.setText("Họ và tên sinh viên :");

        jLabel57.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(19, 90, 118));
        jLabel57.setText("Mã số sinh viên :");

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(19, 90, 118));
        jLabel37.setText("Căn cước công dân :");

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(19, 90, 118));
        jLabel38.setText("Ngày sinh :");

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(19, 90, 118));
        jLabel39.setText("Mã lớp :");

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(19, 90, 118));
        jLabel48.setText("Giới tính :");

        jLabel52.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(19, 90, 118));
        jLabel52.setText("Số điện thoại :");

        jLabel58.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(19, 90, 118));
        jLabel58.setText("Quê quán :");

        jLabel59.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(19, 90, 118));
        jLabel59.setText("Email :");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_main.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel60.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(19, 90, 118));
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("Hệ thống quản lý ký túc xá sinh viên");

        rdUpNam.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdUpNam);
        rdUpNam.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdUpNam.setForeground(new java.awt.Color(19, 90, 118));
        rdUpNam.setText("Nam");
        rdUpNam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdUpNamMouseClicked(evt);
            }
        });

        rdUpNu.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdUpNu);
        rdUpNu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdUpNu.setForeground(new java.awt.Color(19, 90, 118));
        rdUpNu.setText("Nữ");
        rdUpNu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdUpNuMouseClicked(evt);
            }
        });
        rdUpNu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdUpNuActionPerformed1(evt);
            }
        });

        txtUpQueQuanSV.setForeground(new java.awt.Color(19, 90, 118));
        txtUpQueQuanSV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "An Giang", "Bà Rịa – Vũng Tàu", "Bắc Giang", "Bắc Kạn", "Bạc Liêu", "Bắc Ninh", "Bến Tre", "Bình Định", "Bình Dương", "Bình Phước", "Bình Thuận", "Cà Mau", "Cần Thơ", "Cao Bằng", "Đà Nẵng", "Đắk Lắk", "Đắk Nông", "Điện Biên", "Đồng Nai", "Đồng Tháp", "Gia Lai", "Hà Giang", "Hà Nam", "Hà Nội", "Hà Tĩnh", "Hải Dương", "Hải Phòng", "Hậu Giang", "Hòa Bình", "Hưng Yên", "Khánh Hòa", "Kiên Giang", "Kon Tum", "Lai Châu", "Lâm Đồng", "Lạng Sơn", "Lào Cai", "Long An", "Nam Định", "Nghệ An", "Ninh Bình", "Ninh Thuận", "Phú Thọ", "Phú Yên", "Quảng Bình", "Quảng Nam", "Quảng Ngãi", "Quảng Ninh", "Quảng Trị", "Sóc Trăng", "Sơn La", "Tây Ninh", "Thái Bình", "Thái Nguyên", "Thanh Hóa", "Thừa Thiên Huế", "Tiền Giang", "TP Hồ Chí Minh", "Trà Vinh", "Tuyên Quang", "Vĩnh Long", "Vĩnh Phúc", "Yên Bái", "Khác" }));
        txtUpQueQuanSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpQueQuanSVActionPerformed(evt);
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

        txtUpTenSV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtUpTenSV.setForeground(new java.awt.Color(19, 90, 118));
        txtUpTenSV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(19, 90, 118)));
        txtUpTenSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpTenSVActionPerformed1(evt);
            }
        });

        txtUpMaSoSV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtUpMaSoSV.setForeground(new java.awt.Color(19, 90, 118));
        txtUpMaSoSV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(19, 90, 118)));
        txtUpMaSoSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpMaSoSVActionPerformed1(evt);
            }
        });

        txtUpCCCD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtUpCCCD.setForeground(new java.awt.Color(19, 90, 118));
        txtUpCCCD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(19, 90, 118)));
        txtUpCCCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpCCCDActionPerformed1(evt);
            }
        });

        txtUpMaLopSV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtUpMaLopSV.setForeground(new java.awt.Color(19, 90, 118));
        txtUpMaLopSV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(19, 90, 118)));
        txtUpMaLopSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpMaLopSVActionPerformed1(evt);
            }
        });

        txtUpSoDienThoaiSV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtUpSoDienThoaiSV.setForeground(new java.awt.Color(19, 90, 118));
        txtUpSoDienThoaiSV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(19, 90, 118)));
        txtUpSoDienThoaiSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpSoDienThoaiSVActionPerformed1(evt);
            }
        });

        txtUpEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtUpEmail.setForeground(new java.awt.Color(19, 90, 118));
        txtUpEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(19, 90, 118)));
        txtUpEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpEmailActionPerformed1(evt);
            }
        });

        javax.swing.GroupLayout UpdateSVLayout = new javax.swing.GroupLayout(UpdateSV);
        UpdateSV.setLayout(UpdateSVLayout);
        UpdateSVLayout.setHorizontalGroup(
            UpdateSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateSVLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel60, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
                .addGap(131, 131, 131))
            .addGroup(UpdateSVLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 1077, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpdateSVLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(UpdateSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnUpdateSV, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(UpdateSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpdateSVLayout.createSequentialGroup()
                            .addGroup(UpdateSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel57)
                                .addComponent(jLabel56)
                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(UpdateSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtUpTenSV, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                                .addComponent(txtUpMaSoSV)
                                .addComponent(txtUpCCCD)
                                .addComponent(txtUpMaLopSV)
                                .addComponent(txtUpNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpdateSVLayout.createSequentialGroup()
                            .addGroup(UpdateSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                            .addGroup(UpdateSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpdateSVLayout.createSequentialGroup()
                                    .addComponent(rdUpNam, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(37, 37, 37)
                                    .addComponent(rdUpNu, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(51, 51, 51))
                                .addComponent(txtUpQueQuanSV, 0, 263, Short.MAX_VALUE)
                                .addComponent(txtUpSoDienThoaiSV)
                                .addComponent(txtUpEmail)))))
                .addGap(367, 367, 367))
        );
        UpdateSVLayout.setVerticalGroup(
            UpdateSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateSVLayout.createSequentialGroup()
                .addGroup(UpdateSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(UpdateSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUpTenSV, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(UpdateSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UpdateSVLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(UpdateSVLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtUpMaSoSV, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(UpdateSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUpCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(UpdateSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUpNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(UpdateSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUpMaLopSV, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(UpdateSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdUpNu)
                    .addComponent(rdUpNam))
                .addGap(18, 18, 18)
                .addGroup(UpdateSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(UpdateSVLayout.createSequentialGroup()
                        .addComponent(txtUpSoDienThoaiSV, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(29, 29, 29)
                .addGroup(UpdateSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUpQueQuanSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(UpdateSVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btnUpdateSV, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 43, Short.MAX_VALUE))
        );

        add(UpdateSV, "card5");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_main.png"))); // NOI18N
        jLabel61.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel61MouseClicked(evt);
            }
        });

        deleteSV1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteSV1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        deleteSV1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteSV1MouseClicked(evt);
            }
        });

        TableSVDelete.setBackground(new java.awt.Color(255, 255, 255));
        TableSVDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableSVDeleteMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TableSVDeleteMouseExited(evt);
            }
        });

        tableSV1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableSV1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sinh viên", "Tên sinh viên", "CCCD", "Giới tính", "Ngày sinh", "Mã lớp ", "Số điện thoại", "Trạng thái"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableSV1.setFocusable(false);
        tableSV1.setGridColor(new java.awt.Color(255, 255, 255));
        tableSV1.setRowHeight(25);
        tableSV1.setSelectionBackground(new java.awt.Color(0, 102, 102));
        tableSV1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tableSV1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSV1MouseClicked(evt);
            }
        });
        TableSVDelete.setViewportView(tableSV1);

        restore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backup.png"))); // NOI18N
        restore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                restoreMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(237, 50, 55));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Thông tin sinh viên đã xoá");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TableSVDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 1204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(restore, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteSV1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(259, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(306, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel61)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(56, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(deleteSV1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(restore, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addComponent(TableSVDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(24, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(608, Short.MAX_VALUE)))
        );

        add(jPanel1, "card6");
    }// </editor-fold>//GEN-END:initComponents

    private void tableSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSVMouseClicked
        count = tableSV.getSelectedRow();
        LayMaSinhVien(count);
    }//GEN-LAST:event_tableSVMouseClicked

    private void ScrollPaneSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScrollPaneSVMouseClicked

    }//GEN-LAST:event_ScrollPaneSVMouseClicked

    private void ScrollPaneSVMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScrollPaneSVMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_ScrollPaneSVMouseExited

    private void loadSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadSVMouseClicked
        showTable();
        count = -1;
    }//GEN-LAST:event_loadSVMouseClicked

    private void addSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addSVMouseClicked
        QuanLyThongTinSV.setVisible(false);
        AddSV.setVisible(true);
    }//GEN-LAST:event_addSVMouseClicked

    private void jLabel55MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel55MouseClicked
        hidepanel();
        QuanLyThongTinSV.setVisible(true);
       
    }//GEN-LAST:event_jLabel55MouseClicked

    private void viewSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewSVMouseClicked
        count = tableSV.getSelectedRow();
        if (count == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn sinh viên để xem!");
        } else {
            QuanLyThongTinSV.setVisible(false);
            AddSV.setVisible(false);
            ViewSV.setVisible(true);
            LayThongTinSinhVienView(count);
        }
        showTable();
    }//GEN-LAST:event_viewSVMouseClicked

    private void viewSVMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewSVMouseEntered

    }//GEN-LAST:event_viewSVMouseEntered

    private void deleteSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteSVMouseClicked
        count = tableSV.getSelectedRow();
        if (count == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn sinh viên để xóa!");
        } else {
            int test = JOptionPane.showConfirmDialog(null, "Bạn chắc có muốn xóa sinh viên hay không !", "Thông báo", JOptionPane.YES_NO_OPTION);
            if (test == JOptionPane.YES_OPTION) {
                LayMaSinhVien(count);
                new TaiKhoanDAO().XoaTaiKhoan(email);
                JOptionPane.showMessageDialog(null, "Xoá sinh viên thành công!");
            } else if (test == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Bạn đã hủy xóa sinh viên thành công");
            }
        }
        showTable();
    }//GEN-LAST:event_deleteSVMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        hidepanel();
        QuanLyThongTinSV.setVisible(true);
       
    }//GEN-LAST:event_jLabel9MouseClicked

    private void rdUpNamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdUpNamMouseClicked
        if (rdUpNam.isSelected()) {
            gioitinh = "Nam";
        } else {
            gioitinh = "Nữ";
        }
        String masv = txtUpMaSoSV.getText();
    }//GEN-LAST:event_rdUpNamMouseClicked

    private void rdUpNuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdUpNuMouseClicked
        if (rdUpNam.isSelected()) {
            gioitinh = "Nam";
        } else {
            gioitinh = "Nữ";
        }
        String masv = txtUpMaSoSV.getText();
    }//GEN-LAST:event_rdUpNuMouseClicked

    private void rdUpNuActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdUpNuActionPerformed1

    }//GEN-LAST:event_rdUpNuActionPerformed1

    private void txtUpQueQuanSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpQueQuanSVActionPerformed
        selectedUpQueQuan = (String) txtUpQueQuanSV.getSelectedItem();
    }//GEN-LAST:event_txtUpQueQuanSVActionPerformed

    private void btnUpdateSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateSVMouseClicked
        ThongTinSinhVien sv = listsinhvien.get(count);
        String hotensv = txtUpTenSV.getText().trim();
        String masv = txtUpMaSoSV.getText().trim();
        String cccdsv = txtUpCCCD.getText().trim();
        Date ngaysinhsv = txtUpNgaySinh.getDate();
        String malopsv = txtUpMaLopSV.getText().trim();
        String sodienthoaisv = txtUpSoDienThoaiSV.getText().trim();
        String emailsv = txtUpEmail.getText().trim();

        // Ràng buộc điều kiện chi tiết
        String ycmasv = "[A-Z]{1}[0-9]{2}[A-Z]{4}[0-9]{3}";
        String ycsdt = "^[0]{1}[0-9]{9}";
        String yccccd = "^([0-9]{9})*([0-9]{12})*$";
        String ycmalop = "^[A-Z]{1}[0-9]{2}[A-Z]{4}[0-9]{2}";
        String yctandangnhap = "^[a-zA-Z0-9]+$";

        //Kiểm tra tài khoản, thông tin đã tồn tại hay chưa
        boolean kiemtramaso = new QuanLySinhVienDAO().UpKiemTraMaSoSV(masv, maSV);
        boolean kiemtracccd = new QuanLySinhVienDAO().UpKiemTraCCCDSV(cccdsv, cccd);
        boolean kiemtraemail = new QuanLySinhVienDAO().UpKiemTraEmailSV(emailsv, email);
        boolean kiemtrasdt = new QuanLySinhVienDAO().UpKiemTraSDTSV(sodienthoaisv, sdt);

        if (hotensv.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống họ tên sinh viên. Vui lòng điền thông tin đầy đủ!");
        } else if (masv.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống mã số sinh viên. Vui lòng điền thông tin đầy đủ!");
        } else if (cccdsv.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống căn cước công dân sinh viên. Vui lòng điền thông tin đầy đủ!");
        } else if (malopsv.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống mã lớp sinh viên. Vui lòng điền thông tin đầy đủ!");
        } else if (sodienthoaisv.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống số điện thoại sinh viên. Vui lòng điền thông tin đầy đủ!");
        } else if (emailsv.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống email sinh viên. Vui lòng điền thông tin đầy đủ!");
        } else if (!masv.matches(ycmasv)) {
            JOptionPane.showMessageDialog(null, "Định dạng mã số sinh viên không dúng. Ví dụ : N21DCCN001");
        } else if (!cccdsv.matches(yccccd)) {
            JOptionPane.showMessageDialog(null, "Định dạng căn cước công dân không đúng. Vui lòng nhập lại!");
        } else if (!sodienthoaisv.matches(ycsdt)) {
            JOptionPane.showMessageDialog(null, "Định dạng số điện thoại không dúng. Ví dụ : 0827364857");
        } else if (!malopsv.matches(ycmalop)) {
            JOptionPane.showMessageDialog(null, "Định dạng mã lớp không dúng. Ví dụ : D21CQCN01");
        } else if (!emailsv.contains("@gmail.com")) {
            JOptionPane.showMessageDialog(null, "Định dạng gmail không đúng. Vui lòng nhập lại");
        }  else {
            int test = JOptionPane.showConfirmDialog(null, "Bạn chắc có muốn cập nhật thông tin sinh viên hay không !", "Thông báo đăng ký", JOptionPane.YES_NO_OPTION);
            if (test == JOptionPane.YES_OPTION) {
                new TaiKhoanDAO().CapNhatEmail(sv.getEmail(), emailsv);
                updateSV(sv.getMaSV());
                QuanLyThongTinSV.setVisible(true);
                UpdateSV.setVisible(false);
            } else if (test == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Bạn đã hủy cập nhật thành công");
            }
        }
    }//GEN-LAST:event_btnUpdateSVMouseClicked

    private void updateSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateSVMouseClicked
        count = tableSV.getSelectedRow();
        if (count == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn sinh viên để update!");
        } else {
            UpdateSV.setVisible(true);
            QuanLyThongTinSV.setVisible(false);
            AddSV.setVisible(false);
            ViewSV.setVisible(false);
            LayThongTinSinhVienUp(count);
            LayMaSinhVien(count);
        }
    }//GEN-LAST:event_updateSVMouseClicked

    private void txtUpTenSVActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpTenSVActionPerformed1

    }//GEN-LAST:event_txtUpTenSVActionPerformed1

    private void txtUpMaSoSVActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpMaSoSVActionPerformed1

    }//GEN-LAST:event_txtUpMaSoSVActionPerformed1

    private void txtUpCCCDActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpCCCDActionPerformed1

    }//GEN-LAST:event_txtUpCCCDActionPerformed1

    private void txtUpMaLopSVActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpMaLopSVActionPerformed1

    }//GEN-LAST:event_txtUpMaLopSVActionPerformed1

    private void txtUpSoDienThoaiSVActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpSoDienThoaiSVActionPerformed1

    }//GEN-LAST:event_txtUpSoDienThoaiSVActionPerformed1

    private void txtUpEmailActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpEmailActionPerformed1

    }//GEN-LAST:event_txtUpEmailActionPerformed1

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        if (txtSearch.isSelected()) {
            int option = txtSearch.getSelectedIndex();
            String textsearch = txtSearch.getText().trim();
            if (evcbbtt == 0) {
                if (option == 0) {
                    showTable("maSV", textsearch);
                } else if (option == 1) {
                    showTable("tenSV", textsearch);
                } else if (option == 2) {
                    showTable("CCCD", textsearch);
                } else if (option == 3) {
                    showTable("maLop", textsearch);
                }
            } else if (evcbbtt == 1) {
                if (option == 0) {
                    showTableTT("maSV", textsearch, 1);
                } else if (option == 1) {
                    showTableTT("tenSV", textsearch, 1);
                } else if (option == 2) {
                    showTableTT("CCCD", textsearch, 1);
                } else if (option == 3) {
                    showTableTT("maLop", textsearch, 1);
                }
            } else if (evcbbtt == 2) {
                if (option == 0) {
                    showTableTT("maSV", textsearch, 3);
                } else if (option == 1) {
                    showTableTT("tenSV", textsearch, 3);
                } else if (option == 2) {
                    showTableTT("CCCD", textsearch, 3);
                } else if (option == 3) {
                    showTableTT("maLop", textsearch, 3);
                }
            } else if (evcbbtt == 3) {
                if (option == 0) {
                    showTableTT("maSV", textsearch, 2);
                } else if (option == 1) {
                    showTableTT("tenSV", textsearch, 2);
                } else if (option == 2) {
                    showTableTT("CCCD", textsearch, 2);
                } else if (option == 3) {
                    showTableTT("maLop", textsearch, 2);
                }
//            } else if (evcbbtt == 4) {
//                if (option == 0) {
//                    showTableTT("maSV", textsearch, 0);
//                } else if (option == 1) {
//                    showTableTT("tenSV", textsearch, 0);
//                } else if (option == 2) {
//                    showTableTT("CCCD", textsearch, 0);
//                } else if (option == 3) {
//                    showTableTT("maLop", textsearch, 3);
//                }
            }
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        hidepanel();
        QuanLyThongTinSV.setVisible(true);

    }//GEN-LAST:event_jLabel5MouseClicked

    private void hide_eyeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hide_eyeMousePressed
        hide_eye.setVisible(false);
        show_eye.setVisible(true);
        txtMatKhauSV.setEchoChar('*');
        txtNhapLaiMatKhauSV.setEchoChar('*');
    }//GEN-LAST:event_hide_eyeMousePressed

    private void show_eyeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show_eyeMousePressed
        show_eye.setVisible(false);
        hide_eye.setVisible(true);
        txtMatKhauSV.setEchoChar((char) 0);
        txtNhapLaiMatKhauSV.setEchoChar((char) 0);
    }//GEN-LAST:event_show_eyeMousePressed

    private void txtQueQuanSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQueQuanSVActionPerformed

    }//GEN-LAST:event_txtQueQuanSVActionPerformed

    private void txtSoDienThoaiSVjMaLopSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoDienThoaiSVjMaLopSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoDienThoaiSVjMaLopSVActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        hidepanel();
        QuanLyThongTinSV.setVisible(true);
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnAddSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSVActionPerformed

    }//GEN-LAST:event_btnAddSVActionPerformed

    private void btnAddSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddSVMouseClicked
        String hotensv = txtTenSV.getText().trim();
        String masv = txtMaSoSV.getText().trim();
        String cccdsv = txtCCCDSV.getText().trim();
        Date ngaysinhsv = txtNgaySinh.getDate();
        String malopsv = txtMaLopSV.getText().trim();
        String sodienthoaisv = txtSoDienThoaiSV.getText().trim();
        String emailsv = txtEmail.getText().trim();
        String tendangnhapsv = txtTenDangNhapSV.getText().trim();
        String matkhau = txtMatKhauSV.getText().trim();
        String nhaplaimatkhau = txtNhapLaiMatKhauSV.getText().trim();

        // Ràng buộc điều kiện chi tiết
        String ycmasv = "[A-Z]{1}[0-9]{2}[A-Z]{4}[0-9]{3}";
        String ycsdt = "^[0]{1}[0-9]{9}";
        String yccccd = "^([0-9]{9})*([0-9]{12})*$";
        String ycmalop = "^[A-Z]{1}[0-9]{2}[A-Z]{4}[0-9]{2}";
        String yctandangnhap = "^[a-zA-Z0-9]+$";

        //Kiểm tra tài khoản, thông tin đã tồn tại hay chưa
        boolean kiemtramaso = new QuanLySinhVienDAO().KiemTraMaSoSV(masv);
        boolean kiemtracccd = new QuanLySinhVienDAO().KiemTraCCCDSV(cccdsv);
        boolean kiemtraemail = new QuanLySinhVienDAO().KiemTraEmailSV(emailsv);
        boolean kiemtrasdt = new QuanLySinhVienDAO().KiemTraSDTSV(sodienthoaisv);

        if (hotensv.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống họ tên sinh viên. Vui lòng điền thông tin đầy đủ!");
        } else if (masv.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống mã số sinh viên. Vui lòng điền thông tin đầy đủ!");
        } else if (cccdsv.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống căn cước công dân sinh viên. Vui lòng điền thông tin đầy đủ!");
        } else if (malopsv.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống mã lớp sinh viên. Vui lòng điền thông tin đầy đủ!");
        } else if (sodienthoaisv.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống số điện thoại sinh viên. Vui lòng điền thông tin đầy đủ!");
        } else if (emailsv.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống email sinh viên. Vui lòng điền thông tin đầy đủ!");
        } else if (tendangnhapsv.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống tên đăng nhập. Vui lòng điền thông tin đầy đủ!");
        } else if (matkhau.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống mật khẩu. Vui lòng điền thông tin đầy đủ!");
        } else if (nhaplaimatkhau.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống nhập lại mật khẩu. Vui lòng điền thông tin đầy đủ!");
        } else if (!masv.matches(ycmasv)) {
            JOptionPane.showMessageDialog(null, "Định dạng mã số sinh viên không dúng. Ví dụ : N21DCCN001");
        } else if (!cccdsv.matches(yccccd)) {
            JOptionPane.showMessageDialog(null, "Định dạng căn cước công dân không đúng. Vui lòng nhập lại!");
        } else if (!sodienthoaisv.matches(ycsdt)) {
            JOptionPane.showMessageDialog(null, "Định dạng số điện thoại không dúng. Ví dụ : 0827364857");
        } else if (!malopsv.matches(ycmalop)) {
            JOptionPane.showMessageDialog(null, "Định dạng mã lớp không dúng. Ví dụ : D21CQCN01");
        } else if (!emailsv.contains("@gmail.com")) {
            JOptionPane.showMessageDialog(null, "Định dạng gmail không đúng. Vui lòng nhập lại");
        } else if (!matkhau.equals(nhaplaimatkhau)) {
            JOptionPane.showMessageDialog(null, "Mật khẩu nhập lại không trùng với mật khẩu. Vui lòng nhập lại!");
        } else if (kiemtramaso) {
            JOptionPane.showMessageDialog(null, "Mã số sinh viên đã được đăng ký!");
        } else {
            int test = JOptionPane.showConfirmDialog(null, "Bạn chắc có muốn thêm sinh viên hay không !", "Thông báo đăng ký", JOptionPane.YES_NO_OPTION);
            if (test == JOptionPane.YES_OPTION) {
                AddTaiKhoan();
                AddSinhVien();
                resetForm();
            } else if (test == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Bạn đã hủy thêm sinh viên thành công");
            }
        }
    }//GEN-LAST:event_btnAddSVMouseClicked

    private void txtTenDangNhapSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenDangNhapSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenDangNhapSVActionPerformed

    private void txtMaLopSVjMaLopSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaLopSVjMaLopSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaLopSVjMaLopSVActionPerformed

    private void txtMaSoSVjMaSoSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaSoSVjMaSoSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaSoSVjMaSoSVActionPerformed

    private void txtTenSVjHoTenSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenSVjHoTenSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenSVjHoTenSVActionPerformed

    private void rdNujRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdNujRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdNujRadioButton2ActionPerformed

    private void rdNuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdNuMouseClicked

    }//GEN-LAST:event_rdNuMouseClicked

    private void rdNamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdNamMouseClicked

    }//GEN-LAST:event_rdNamMouseClicked

    private void txtEmailjEmailSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailjEmailSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailjEmailSVActionPerformed

    private void txtCCCDSVjCanCuocSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCCCDSVjCanCuocSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCCCDSVjCanCuocSVActionPerformed

    private void cbbtrangthaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbtrangthaiActionPerformed
        String trangthai = "";
        evcbbtt = cbbtrangthai.getSelectedIndex();
        int k = cbbtrangthai.getSelectedIndex();
        QuanLySinhVienDAO svd = new QuanLySinhVienDAO();
        if (k == 0) {
            showTable();
        } else if (k == 1) {
            showTableTT(1);
        } else if (k == 2) {
            showTableTT(3);
        } else if (k == 3) {
            showTableTT(2);
//        } else if (k == 4) {
//            showTableTT(0);
        }
    }//GEN-LAST:event_cbbtrangthaiActionPerformed

    private void BinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BinMouseClicked
            hidepanel();
            jPanel1.setVisible(true);
            showTabledelte();
            
    }//GEN-LAST:event_BinMouseClicked

    private void tableSV1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSV1MouseClicked
        count = tableSV.getSelectedRow();
        LayMaSinhVien(count);
    }//GEN-LAST:event_tableSV1MouseClicked

    private void TableSVDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableSVDeleteMouseClicked
        count = tableSV1.getSelectedRow();
        LayMaSinhVien(count);
    }//GEN-LAST:event_TableSVDeleteMouseClicked

    private void TableSVDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableSVDeleteMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_TableSVDeleteMouseExited

    private void jLabel61MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel61MouseClicked
        hidepanel();
        QuanLyThongTinSV.setVisible(true);
        
    }//GEN-LAST:event_jLabel61MouseClicked

    private void deleteSV1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteSV1MouseClicked
        count = tableSV1.getSelectedRow();
        if (count == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn sinh viên để xóa!");
        } else {
            int test = JOptionPane.showConfirmDialog(null, "Bạn chắc có muốn xóa sinh viên hay không !", "Thông báo", JOptionPane.YES_NO_OPTION);
            if (test == JOptionPane.YES_OPTION) {
                LayMaSinhVien(count);
                new TaiKhoanDAO().XoaTaiKhoanbin(email);
                new QuanLySinhVienDAO().Xoathongtinbin(email);
                JOptionPane.showMessageDialog(null, "Xoá sinh viên thành công!");
            } else if (test == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Bạn đã hủy xóa sinh viên thành công");
            }
        }
        showTabledelte();
    }//GEN-LAST:event_deleteSV1MouseClicked

    private void restoreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restoreMouseClicked
        count = tableSV1.getSelectedRow();
        if (count == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn sinh viên để khôi phục!");
        } else {
            int test = JOptionPane.showConfirmDialog(null, "Bạn chắc có muốn khôi phục sinh viên hay không !", "Thông báo", JOptionPane.YES_NO_OPTION);
            if (test == JOptionPane.YES_OPTION) {
                LayMaSinhVien(count);
                new TaiKhoanDAO().KhoiphucTaiKhoan(email);
                JOptionPane.showMessageDialog(null, "Khôi phục sinh viên thành công!");
            } 
        }
        showTabledelte();
    }//GEN-LAST:event_restoreMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddSV;
    private javax.swing.JLabel Bin;
    private javax.swing.JPanel QuanLyThongTinSV;
    private javax.swing.JScrollPane ScrollPaneSV;
    private javax.swing.JScrollPane TableSVDelete;
    private javax.swing.JPanel UpdateSV;
    private javax.swing.JPanel ViewSV;
    private javax.swing.JLabel addSV;
    private javax.swing.JButton btnAddSV;
    private javax.swing.JButton btnUpdateSV;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbbtrangthai;
    private javax.swing.JLabel deleteSV;
    private javax.swing.JLabel deleteSV1;
    private javax.swing.JLabel hide_eye;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
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
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel loadSV;
    private javax.swing.JRadioButton rdNam;
    private javax.swing.JRadioButton rdNu;
    private javax.swing.JRadioButton rdUpNam;
    private javax.swing.JRadioButton rdUpNu;
    private javax.swing.JLabel restore;
    private javax.swing.JLabel show_eye;
    private javax.swing.JTable tableSV;
    private javax.swing.JTable tableSV1;
    private javax.swing.JTextField txtCCCDSV;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMaLopSV;
    private javax.swing.JTextField txtMaSoSV;
    private javax.swing.JPasswordField txtMatKhauSV;
    private com.toedter.calendar.JDateChooser txtNgaySinh;
    private javax.swing.JPasswordField txtNhapLaiMatKhauSV;
    private javax.swing.JComboBox<String> txtQueQuanSV;
    private textfield.TextFieldSearchOption txtSearch;
    private javax.swing.JTextField txtSoDienThoaiSV;
    private javax.swing.JTextField txtTenDangNhapSV;
    private javax.swing.JTextField txtTenSV;
    private javax.swing.JTextField txtUpCCCD;
    private javax.swing.JTextField txtUpEmail;
    private javax.swing.JTextField txtUpMaLopSV;
    private javax.swing.JTextField txtUpMaSoSV;
    private com.toedter.calendar.JDateChooser txtUpNgaySinh;
    private javax.swing.JComboBox<String> txtUpQueQuanSV;
    private javax.swing.JTextField txtUpSoDienThoaiSV;
    private javax.swing.JTextField txtUpTenSV;
    private javax.swing.JLabel txtViewCCCDSV;
    private javax.swing.JLabel txtViewEmailSV;
    private javax.swing.JLabel txtViewGioiTinh;
    private javax.swing.JLabel txtViewHoTenSV;
    private javax.swing.JLabel txtViewMaLopSV;
    private javax.swing.JLabel txtViewMaSoSV;
    private com.toedter.calendar.JDateChooser txtViewNgaySinhSV;
    private javax.swing.JLabel txtViewQueQuan;
    private javax.swing.JLabel txtViewSoDienThoaiSV;
    private javax.swing.JLabel updateSV;
    private javax.swing.JLabel viewSV;
    // End of variables declaration//GEN-END:variables
    

    
    void AddSinhVien() {
        Connection conn = KetNoiSQL.getConnection();
        String sql = "insert into SinhVien (maSV, tenSV, CCCD, gioiTinh, ngaySinh, email, soDienThoai, queQuan, maLop, trangThai, tenDangNhap)" 
                + "values(?,?,?,?,?,?,?,?,?,?,?)";
        int row = 0;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, txtMaSoSV.getText().trim());
            ps.setString(2, txtTenSV.getText().trim());
            ps.setString(3, txtCCCDSV.getText().trim());
            if (rdNam.isSelected()) {
                ps.setString(4, "Nam");
            } else {
                ps.setString(4, "Nữ");
            }
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(txtNgaySinh.getDate());
            ps.setString(5, date);
            ps.setString(6, txtEmail.getText().trim());
            ps.setString(7, txtSoDienThoaiSV.getText().trim());
            String selectedQueQuan = (String) txtQueQuanSV.getSelectedItem();
            ps.setString(8, selectedQueQuan);
            ps.setString(9, txtMaLopSV.getText().trim());
            ps.setInt(10, 1);
            ps.setString(11, txtTenDangNhapSV.getText().trim());
            row = ps.executeUpdate();
            if (row > 0) {
                JOptionPane.showMessageDialog(null, "Thêm sinh viên thành công");
                QuanLyThongTinSV.setVisible(true);
                AddSV.setVisible(false);
                ViewSV.setVisible(false);
                showTable();
            } else {
                JOptionPane.showMessageDialog(null, "Thêm sinh viên không thành công");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    private void resetForm() {
        txtMaSoSV.setText("");
        txtTenSV.setText("");
        txtCCCDSV.setText("");
        txtEmail.setText("");
        txtMatKhauSV.setText("");
        txtTenDangNhapSV.setText("");
        txtNgaySinh.setDate(null);
        txtMatKhauSV.setText("");
        txtNhapLaiMatKhauSV.setText("");
        txtSoDienThoaiSV.setText("");
        txtMaLopSV.setText("");
        rdNam.setSelected(true);
    }
    
    void AddTaiKhoan() {
        Connection conn = KetNoiSQL.getConnection();
        int row = 0;
        String sql1 = "insert into TaiKhoan (tenDangNhap, email, matKhau, phanQuyen) values(?,?,?,?)";
        try {
            PreparedStatement ps1 = conn.prepareStatement(sql1);

            String password = PasswordHash(txtMatKhauSV.getText().trim());
            ps1.setString(1, txtTenDangNhapSV.getText().trim());
            ps1.setString(2, txtEmail.getText().trim());
            ps1.setString(3, PasswordHash(password));
            ps1.setString(4, "Sinh Viên");

            row = ps1.executeUpdate();
            if (row > 0) {
                JOptionPane.showMessageDialog(null, "Thêm Tài khoản thành công");
            } else {
                JOptionPane.showMessageDialog(null, "Thêm Tài khoản không thành công");

            }
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    private void LayThongTinSinhVienView(int count) {
        ThongTinSinhVien sv = listsinhvien.get(count);
        txtViewHoTenSV.setText(sv.getTenSV());
        txtViewMaSoSV.setText(sv.getMaSV());
        if (sv.getGioiTinh().equals("Nam")) {
            txtViewGioiTinh.setText("Nam");
        } else {
            txtViewGioiTinh.setText("Nữ");
        }
        txtViewMaLopSV.setText(sv.getMaLop());
        txtViewSoDienThoaiSV.setText(sv.getSoDienThoai());
        txtViewNgaySinhSV.setDate(sv.getNgaySinh());
        txtViewCCCDSV.setText(sv.getCCCD());
        txtViewEmailSV.setText(sv.getEmail());
        txtViewQueQuan.setText(sv.getQueQuan());
    }
    
    private void LayMaSinhVien(int count) {
        ThongTinSinhVien sv = listsinhvien.get(count);
        maSV = sv.getMaSV();
        gioitinh = sv.getGioiTinh();
        email = sv.getEmail();
    }
    
    private void updateSV(String masv) {
        try {
            Connection conn = KetNoiSQL.getConnection();
            String sql = "update SinhVien set tenSV=?,maSV=?, gioiTinh=?, ngaySinh=?, email=?, soDienThoai=?, queQuan=?, maLop=?,CCCD=? where maSV='" + masv + "'";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, txtUpTenSV.getText().trim());
            ps.setString(2, txtUpMaSoSV.getText().trim());
            if (rdUpNam.isSelected()) {
                ps.setString(3, "Nam");
            } else {
                ps.setString(3, "Nữ");
            }
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(txtUpNgaySinh.getDate());
            ps.setString(4, date);
            ps.setString(5, txtUpEmail.getText().trim());
            ps.setString(6, txtUpSoDienThoaiSV.getText().trim());
            String selectedQueQuann = (String) txtUpQueQuanSV.getSelectedItem();
            ps.setString(7, selectedQueQuann);
            ps.setString(8, txtUpMaLopSV.getText().trim());
            ps.setString(9, txtUpCCCD.getText().trim());
            ps.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLySinhVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        showTable();
    }
    
    private void LayThongTinSinhVienUp(int count) {
        ThongTinSinhVien sv = listsinhvien.get(count);
        txtUpTenSV.setText(sv.getTenSV());
        txtUpMaSoSV.setText(sv.getMaSV());
        if (sv.getGioiTinh().equals("Nam")) {
            rdUpNam.setSelected(true);
            gioitinh = "Nam";
        } else {
            rdUpNu.setSelected(true);
            gioitinh = "Nữ";
        }
        txtUpMaLopSV.setText(sv.getMaLop());
        txtUpSoDienThoaiSV.setText(sv.getSoDienThoai());
        txtUpNgaySinh.setDate(sv.getNgaySinh());
        txtUpCCCD.setText(sv.getCCCD());
        txtUpEmail.setText(sv.getEmail());
        txtUpQueQuanSV.setSelectedItem(sv.getQueQuan());
        email = sv.getEmail();
        sdt = sv.getSoDienThoai();
        cccd = sv.getCCCD();
    }
    
    private void showTable(String where, String text) {
        listsinhvien = new QuanLySinhVienDAO().getAllThongTinSVSearch(where, text);
        Model.setRowCount(0);

        for (ThongTinSinhVien sv : listsinhvien) {
            String trangThaiText = "";
            switch (sv.getTrangThai()) {
//                case 0:
//                    trangThaiText = "Đã xoá";
//                    break;
                case 1:
                    trangThaiText = "Chưa đăng kí";
                    break;
                case 2:
                    trangThaiText = "Đang ở";
                    break;
                case 3:
                    trangThaiText = "Đang chờ duyệt";
                    break;
                default:
                    trangThaiText = "Trạng thái không xác định";
            }
            if (!trangThaiText.equals("Đã xoá")) {
                Model.addRow(new Object[]{
                    sv.getMaSV(), sv.getTenSV(), sv.getCCCD(), sv.getGioiTinh(), sv.getNgaySinh(), sv.getMaLop(), sv.getSoDienThoai(), trangThaiText
                });
            }
        }
    }
        private void showTable() {
        listsinhvien = new QuanLySinhVienDAO().getAllThongTinSV();
        Model.setRowCount(0);
        for (ThongTinSinhVien sv : listsinhvien) {
            String trangThaiText = "";
            switch (sv.getTrangThai()) {
                case 1:
                    trangThaiText = "Chưa đăng kí";
                    break;
                case 2:
                    trangThaiText = "Đang ở";
                    break;
                case 3:
                    trangThaiText = "Đang chờ duyệt";
                    break;
                default:
                    trangThaiText = "Trạng thái không xác định";
            }
                Model.addRow(new Object[]{
                    sv.getMaSV(), sv.getTenSV(), sv.getCCCD(), sv.getGioiTinh(), sv.getNgaySinh(), sv.getMaLop(), sv.getSoDienThoai(), trangThaiText
                });
        }
        count = -1;
    }
    
    private void showTableTT(String where, String text, int trangthai) {
        listsinhvien = new QuanLySinhVienDAO().getAllThongTinSVSearchTT(where, text, trangthai);
        Model.setRowCount(0);

        for (ThongTinSinhVien sv : listsinhvien) {
            String trangThaiText = "";
            switch (sv.getTrangThai()) {
                case 1:
                    trangThaiText = "Chưa đăng kí";
                    break;
                case 2:
                    trangThaiText = "Đang ở";
                    break;
                case 3:
                    trangThaiText = "Đang chờ duyệt";
                    break;
                default:
                    trangThaiText = "Trạng thái không xác định";
            }
            Model.addRow(new Object[]{
                sv.getMaSV(), sv.getTenSV(), sv.getCCCD(), sv.getGioiTinh(), sv.getNgaySinh(), sv.getMaLop(), sv.getSoDienThoai(), trangThaiText
            });
        }
    }
    
    void AddSearch() {
        txtSearch.addEventOptionSelected(new SearchOptionEvent() {
            @Override
            public void optionSelected(SearchOption option, int index) {
                txtSearch.setHint("Tìm kiếm " + option.getName() + "....");
            }
        });
        txtSearch.addOption(new SearchOption("Mã Sinh Viên", new ImageIcon(getClass().getResource("/img/notebook.png"))));
        txtSearch.addOption(new SearchOption("Tên Sinh Viên", new ImageIcon(getClass().getResource("/img/username.png"))));
        txtSearch.addOption(new SearchOption("CCCD", new ImageIcon(getClass().getResource("/img/creditcard.png"))));
        txtSearch.addOption(new SearchOption("Mã Lớp", new ImageIcon(getClass().getResource("/img/presentation.png"))));
    }
    
    private void showTableTT(int trangthai) {
        listsinhvien = new QuanLySinhVienDAO().getAllThongTinSVTrangThai(trangthai);
        Model.setRowCount(0);

        for (ThongTinSinhVien sv : listsinhvien) {
            String trangThaiText = "";
            switch (sv.getTrangThai()) {
                case 1:
                    trangThaiText = "Chưa đăng kí";
                    break;
                case 2:
                    trangThaiText = "Đang ở";
                    break;
                case 3:
                    trangThaiText = "Đang chờ duyệt";
                    break;
                default:
                    trangThaiText = "Trạng thái không xác định";
            }
            Model.addRow(new Object[]{
                sv.getMaSV(), sv.getTenSV(), sv.getCCCD(), sv.getGioiTinh(), sv.getNgaySinh(), sv.getMaLop(), sv.getSoDienThoai(), trangThaiText
            });
        }
    }
       private void showTabledelte() {
        listsinhvien = new QuanLySinhVienDAO().getAllThongTinSVDelete();
        Modeldelete.setRowCount(0);
        for (ThongTinSinhVien sv : listsinhvien) {
                Modeldelete.addRow(new Object[]{
                    sv.getMaSV(), sv.getTenSV(), sv.getCCCD(), sv.getGioiTinh(), sv.getNgaySinh(), sv.getMaLop(), sv.getSoDienThoai(), "Đã Xóa"
                });
//            }
        }
        count = -1;
    }

}
