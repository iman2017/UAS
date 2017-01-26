public class HitungLuas2 {
    public static void main(String[] args) {
        int panjang = 7;
        int lebar = 6;
	int setengah = 1/2;
	int alas = 5;
	int tinggi = 8;
        int Luaspersegi = LuasPersegiPanjang(panjang, lebar);
        int Luassegitiga = LuasSegitiga(setengah, alas, tinggi);
        System.out.println("Panjangnya "+panjang);
        System.out.println("Lebarnya "+lebar);
        System.out.println("Luasnya Persegi Panjang adalah "+ Luaspersegi);
	System.out.println("");
	System.out.println("Panjang Alas adalah "+ alas);
	System.out.println("Tinggi adalah       "+ tinggi);
	System.out.println("Luasnya Segitiga adalah "+ Luassegitiga);
    }
public static int LuasPersegiPanjang(int panjang, int lebar) {
        int luas;
        luas = panjang*lebar;
        return luas;
    } 
public static int LuasSegitiga(int setengah, int alas, int tinggi)   {
	int luas;
	luas = alas*tinggi/2;
	return luas;
    } 
}