package Connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KetNoiSQL {
    private Connection con = null;
    static String instance = "";
    static String serverName = "localhost";
    static String portNumber = "1433";
    static String dbName = "quanliktxDLT";
    static String userID = "sa";
    static String password = "Lehuuloc1";

    public static Connection getConnection() {
        String url = "jdbc:sqlserver://" + serverName + ":" + portNumber + ";databaseName=" + dbName ;
        Connection con = null;
        try {
            con = DriverManager.getConnection(url,userID,password);
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
   
    public ResultSet GetResultSet(String tableName) throws SQLException {
        ResultSet rs = null;
        Statement stmt = con.createStatement();
        String sql = "select * from " + tableName;
        rs = stmt.executeQuery(sql);
        return rs;
    }
   
    public void Close() throws Exception {
        con.close();
    }

    public static void main(String args[]) {
        try {
            // connnect to database 'testdb'
            Connection conn = getConnection();
            // crate statement
            Statement stmt = conn.createStatement();
            // get data from table 'student'
            ResultSet rs = stmt.executeQuery("select * from SinhVien");
            // show data
            while (rs.next()) {
                System.out.println(rs.getString(1) 
                        + "  " + rs.getString(2)
                        + "  " + rs.getString(3)
                        + "  " + rs.getString(4)
                        + "  " + rs.getDate(5) 
                        + "  " + rs.getString(6)
                        + "  " + rs.getString(7)
                        + "  " + rs.getString(8)
                        + "  " + rs.getString(9)
                        + "  " + rs.getString(10)
                );
            }
            // close connection
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
