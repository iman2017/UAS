
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
            System.out.println("SISTEM INFORMASI SIAK");
            System.out.println("1. Menampilkan Daftar Mahasiswa");
            System.out.println("2. Menambah Daftar Mahasiswa");
            System.out.println("3. Menghapus Daftar Mahasiswa");
            System.out.println("4. Menampilkan Daftar Mata Kuliah");
            System.out.println("5. Menampilkan Daftar Nilai ");
            System.out.println("6. Selesai");
            System.out.println("");
            System.out.print("Pilihan menu ");
            pilih = in.nextInt();
        
            switch (pilih) {
                case 1 :
                    k1.SelectDataMahasiswa();
                    break;
                case 2 :
                    k1.InputDataMahasiswa();
                    break;
                case 3 :
                    
                case 4 :
                    k1.SelectData();
                    break;
                case 5 :
                    k1.SelectDataNilai();
                    break;
                case 6 :
                    k1.mulai = true;
                    break;
            }
        }
    }
}
