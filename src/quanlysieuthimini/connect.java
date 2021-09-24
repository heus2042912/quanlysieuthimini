/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysieuthimini;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Admin
 */
public class connect {
    public Connection  getConnection(){
    Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //tạo chuỗi connection
            String connectionUrl="jdbc:sqlserver://ACERNITROASHURA\\NTA;database=sieuthimini";
            //kết nối đến csdl sử dụng cnnt: 3 tham số: connection, username, password, của csdl
            String dbuser="sa";
            String password="123456";
            
            conn = DriverManager.getConnection(connectionUrl, dbuser, password);
            //thử kết nối
            if(conn!= null){
                System.out.println("Kêt nối thành công");
            }else{
                System.out.println("Kêt nối không thành công");
            }
        } catch (Exception e) {
        }
        return conn; 
    }
}
   
