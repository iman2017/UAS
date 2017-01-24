/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*package Hitung;
*/
/**
 *
 * @author Team IT
 */
public class HitungLuas {
    public static void main(String[] args) {
        int panjang = 7;
        int lebar = 6;
        int Luas = LuasPersegiPanjang(panjang, lebar);
        
        System.out.println("Panjangnya "+panjang);
        System.out.println("Lebarnya "+lebar);
        System.out.println("Luasnya adalah "+ Luas);
    }

public static int LuasPersegiPanjang(int panjang, int lebar) {
        int luas;
        luas = panjang*lebar;
        return luas;
    }    
}
