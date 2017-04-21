/**
 * @author IMAN_IT
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Properties;

public class SIAK {
    String confTimeZone = " "; //serverTimezone=Asia/Jakarta
    boolean mulai;
    String nim;
    String nama;
    Date tgllahir;
    int kode_mk;
    String nm_mk;
    int sks;

    public void setMulai(boolean mulai) {
        this.mulai = mulai;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTgllahir(Date tgllahir) {
        this.tgllahir = tgllahir;
    }
    
    public void setKode_mk(int kode_mk) {
        this.kode_mk = kode_mk;
    }

    public void setNm_mk(String nm_mk) {
        this.nm_mk = nm_mk;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public boolean isMulai() {
        return mulai;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public Date getTgllahir() {
        return tgllahir;
    }

    public int getKode_mk() {
        return kode_mk;
    }

    public String getNm_mk() {
        return nm_mk;
    }

    public int getSks() {
        return sks;
    }
    
    public void koneksi() {
        Connection conn1 = null;
        Connection conn2 = null;
        Connection conn3 = null;
        
        try {
            String url1 = "jdbc:mysql://localhost:3306/SIAK?" + confTimeZone;
            String user = "root";
            String password = "";
            
            conn1 = DriverManager.getConnection(url1, user, password);
            
            if (conn1 != null) {
                System.out.println("Connected to the database SIAK cara 1");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * @cara menampilkan isi dari tabel
     */
    public void SelectDataMahasiswa(){
        String url1 = "jdbc:mysql://localhost:3306/SIAK?" + confTimeZone;
        String user = "root";
        String password = "";
        Connection connection;
        
        try {
            connection = DriverManager.getConnection(url1, user, password);
            String sql = "SELECT * FROM t_mahasiswa";
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            System.out.print("NIM");
            System.out.print("\tNAMA");
            System.out.println("\t\tTANGGAL LAHIR");
            System.out.println("==============================================");
            while (rs.next()){
                System.out.print(rs.getString("nim"));
                System.out.print("\t" + rs.getString("nama"));
                System.out.println("\t\t" + rs.getString("tgllahir"));
            }
            System.out.println();
            connection.close();
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
   public void SelectData(){
        String url1 = "jdbc:mysql://localhost:3306/SIAK?" + confTimeZone;
        String user = "root";
        String password = "";
        Connection connection;
        
        try {
            connection = DriverManager.getConnection(url1, user, password);
            String sql = "SELECT * FROM matakuliah";
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            System.out.print("Kode Mata Kuliah");
            System.out.print("\tMata Kuliah");
            System.out.println("\t\tSKS");
            System.out.println("===================================================");
            while (rs.next()){
                System.out.print(rs.getInt("kode_mk"));
                System.out.print("\t" + rs.getString("nm_mk"));
                System.out.println("\t\t" + rs.getInt("sks"));
            }
            System.out.println();
            connection.close();
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
   
   public void SelectDataNilai(){
        String url1 = "jdbc:mysql://localhost:3306/SIAK?" + confTimeZone;
        String user = "root";
        String password = "";
        Connection connection;
        
        try {
            connection = DriverManager.getConnection(url1, user, password);
            String sql = "SELECT * FROM nilai";
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            System.out.print("NIM");
            System.out.print("\tKode Mata Kuliah");
            System.out.println("\tNilai");
            System.out.println("==============================================");
            while (rs.next()){
                System.out.print(rs.getString("nim"));
                System.out.print("\t" + rs.getInt("kode_mk"));
                System.out.println("\t" + rs.getString("nilai"));
            }
            System.out.println();
            connection.close();
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
   
   public void InputDataMahasiswa(){
        String url1 = "jdbc:mysql://localhost:3306/SIAK?" + confTimeZone;
        String user = "root";
        String password = "";
        Connection connection;
        
        try {
            connection = DriverManager.getConnection(url1, user, password);
            String sql = "INSERT INTO t_mahasiswa (nim, nama, tgllahir) VALUES('141540908','SUSAN','1980-08-21')";
            Statement statement = connection.createStatement();
            int rs = statement.executeUpdate(sql);
            
            connection.close();
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
