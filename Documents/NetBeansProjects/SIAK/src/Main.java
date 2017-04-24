
import java.util.Date;
import java.util.Scanner;

/**
 * main program untuk SIAK
 * @author IMAN_IT
 */

public class Main {
    private static int pilih;
    
    public static void main (String[] args) {
        SIAK k1 = new SIAK();
        Scanner in = new Scanner(System.in);
        
        while (!k1.isMulai()) {
            System.out.println("SISTEM INFORMASI ADMINISTRASI KEMAHASISWAAN");
            System.out.println("1. Menampilkan Daftar Mahasiswa");
            System.out.println("2. Menambah Data Mahasiswa");
            System.out.println("3. Menghapus Data Mahasiswa");
            System.out.println("4. Menampilkan Daftar Mata Kuliah");
            System.out.println("5. Menambah Data Mata Kuliah");
            System.out.println("6. Menghapus Data Mata Kuliah");
            System.out.println("7. Menampilkan Daftar Nilai ");
            //System.out.println("8. Menambah Daftar Nilai");
            //System.out.println("9. Menghapus Data Mahasiswa");
            System.out.println("0. Selesai");
            System.out.println("");
            System.out.print("Pilihan menu ");
            pilih = in.nextInt();
        
            switch (pilih) {
                case 1 :
                    k1.SelectDaftarMahasiswa();
                    break;
                case 2 :
                    k1.InputDataMahasiswa();
                    break;
                case 3 :
                    k1.HapusDataMahasiswa();
                    break;
                case 4 :
                    k1.SelectDaftarMatKul();
                    break;
                case 5 :
                    k1.InputDataMatKul();
                    break;
                case 6 :
                    k1.HapusDataMatkul();
                    break;
                case 7 :
                    k1.SelectDaftarNilai();
                    break;
                case 0 :
                    k1.mulai = true;
                    break;
            }
        }
    }
}
