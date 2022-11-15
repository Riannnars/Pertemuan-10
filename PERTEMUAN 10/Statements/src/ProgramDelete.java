import java.sql.Connection;
import java.sql.SQLClientInfoException;
import java.sql.Statement;
import java.sql.SQLException;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class ProgramDelete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection koneksi = KoneksiDatabase.getKoneksi();
            Statement statement = null;
            try{
                statement = koneksi.createStatement();
                System.out.println("Statement berhasil dibuat");
            String url= "DELETE from barang WHERE kode_barang ='B001'";
            statement.executeUpdate(url);    
            }catch(SQLException ex){
            System.out.println("Statement gagal dibuat");
            System.out.println("Pesan :" +ex.getMessage());
            }finally{
            if(statement != null){
            try{
                statement.close();
                System.out.println("Statement berhasil ditutup");
            }catch(SQLException ex){
                System.out.println("Statement gagal ditutup");
                System.out.println("Peaan :" +ex.getMessage());
                }
}
    
}
}
}