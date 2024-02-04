package JFrameQuanLyKyTucXa;


import JFrameQuanLyKyTucXa.Login;
public class Run {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            Login LoginFrame = new Login();
            LoginFrame.setVisible(true);
            LoginFrame.pack(); 
            LoginFrame.setLocationRelativeTo(null);
        });
    }
}
