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
import model.ThongTinSVDangKyKTX;
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

public class QuanLySVDangChoDuyet extends javax.swing.JPanel {

    private List<ThongTinSVDangKyKTX> listsinhvien;
    private DefaultTableModel Model;
    private int count = -1;
    private String maSV;
    private int evcbbtt;
    private JTable table;
    private int choice;

    public QuanLySVDangChoDuyet() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        loadSV = new javax.swing.JLabel();
        deleteSV = new javax.swing.JLabel();
        ScrollPaneSV = new javax.swing.JScrollPane();
        tableSV = new javax.swing.JTable();
        confirmSV = new javax.swing.JLabel();
        txtSearch = new textfield.TextFieldSearchOption();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(19, 90, 118));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Quản lý sinh viên đang chờ duyệt ở KTX");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(19, 90, 118)));

        loadSV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loadSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/loading.png"))); // NOI18N
        loadSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loadSVMouseClicked(evt);
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
                "Mã sinh viên", "Tên sinh viên", "Mã phòng", "Giới tính", "Ngày HDBD", "Ngày HDKT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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

        confirmSV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        confirmSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/confirmation.png"))); // NOI18N
        confirmSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmSVMouseClicked(evt);
            }
        });

        txtSearch.setBorder(null);
        txtSearch.setForeground(new java.awt.Color(19, 90, 118));
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(87, Short.MAX_VALUE)
                        .addComponent(ScrollPaneSV, javax.swing.GroupLayout.PREFERRED_SIZE, 1053, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(loadSV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteSV, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(confirmSV, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(loadSV, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addComponent(deleteSV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(confirmSV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ScrollPaneSV, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 107, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1204, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 643, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loadSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadSVMouseClicked
        showTable();
        count = -1;
    }//GEN-LAST:event_loadSVMouseClicked

    private void deleteSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteSVMouseClicked
        count = tableSV.getSelectedRow();
        if (count == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn sinh viên để xóa khỏi danh sách đăng ký!");
        } else {
            int test = JOptionPane.showConfirmDialog(null, "Bạn chắc có muốn xóa sinh viên khỏi danh sách đăng ký hay không !", "Thông báo", JOptionPane.YES_NO_OPTION);
            if (test == JOptionPane.YES_OPTION) {
                LayMaSinhVien(count);
                new QuanLySinhVienDAO().XoaSVKhoiDangChoDuyet(maSV);
                JOptionPane.showMessageDialog(null, "Xoá thành công!");
            } else if (test == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Bạn đã hủy xóa thành công");
            }
        }
        showTable();
    }//GEN-LAST:event_deleteSVMouseClicked

    private void tableSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSVMouseClicked
        count = tableSV.getSelectedRow();
        LayMaSinhVien(count);
    }//GEN-LAST:event_tableSVMouseClicked

    private void ScrollPaneSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScrollPaneSVMouseClicked

    }//GEN-LAST:event_ScrollPaneSVMouseClicked

    private void ScrollPaneSVMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScrollPaneSVMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_ScrollPaneSVMouseExited

    private void confirmSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmSVMouseClicked
        count = tableSV.getSelectedRow();
        if (count == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn sinh viên để xác nhận!");
        } else {
            int test = JOptionPane.showConfirmDialog(null, "Bạn có muốn xác nhận sinh viên vào ở kí túc xá không !", "Thông báo", JOptionPane.YES_NO_OPTION);
            if (test == JOptionPane.YES_OPTION) {
                LayMaSinhVien(count);
                new QuanLySinhVienDAO().ConfirmSVVaoKTX(maSV);
                JOptionPane.showMessageDialog(null, "Xác nhận thành công!");
            } else if (test == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Bạn đã hủy xác nhận thành công");
            }
        }
        showTable();
    }//GEN-LAST:event_confirmSVMouseClicked

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
    private javax.swing.JScrollPane ScrollPaneSV;
    private javax.swing.JLabel confirmSV;
    private javax.swing.JLabel deleteSV;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel loadSV;
    private javax.swing.JTable tableSV;
    private textfield.TextFieldSearchOption txtSearch;
    // End of variables declaration//GEN-END:variables

    private void showTable() {
        listsinhvien = new QuanLySinhVienDAO().getAllThongTinSVDangKyKTX();
        Model.setRowCount(0);
        for (ThongTinSVDangKyKTX sv : listsinhvien) { 
            Model.addRow(new Object[]{
                sv.getMaSV(), sv.getTenSV(), sv.getMaPhong(), sv.getGioiTinh(), sv.getNgayBDHD(), sv.getNgayKTHD()
            });
        }
        count = -1;
    }

    private void LayMaSinhVien(int count) {
        ThongTinSVDangKyKTX sv = listsinhvien.get(count);
        maSV = sv.getMaSV();
    }

    private void showTable(String where, String text) {
        listsinhvien = new QuanLySinhVienDAO().getAllThongTinSVDangKyKTXSearch(where, text);
        Model.setRowCount(0);
        String trangThaiText = "NULL";
        for (ThongTinSVDangKyKTX sv : listsinhvien) {
            Model.addRow(new Object[]{
                sv.getMaSV(), sv.getTenSV(), sv.getMaPhong(), sv.getGioiTinh(), sv.getGioiTinh(), sv.getNgayBDHD(), sv.getNgayKTHD(), trangThaiText
            });
        }
    }
    
    private void showTableSearch(String where, String text) {
        listsinhvien = new QuanLySinhVienDAO().getAllThongTinSVSearchDangKyKTX(where, text);
        Model.setRowCount(0);
        for (ThongTinSVDangKyKTX sv : listsinhvien) {
            Model.addRow(new Object[]{
                sv.getMaSV(), sv.getTenSV(), sv.getMaPhong(), sv.getGioiTinh(), sv.getNgayBDHD(), sv.getNgayKTHD()
            });
        }
    }

}
