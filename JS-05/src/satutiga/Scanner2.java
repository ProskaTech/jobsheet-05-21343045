/**
 * Created by 21343045_Farraz Hadyan
 */
package satutiga;

import java.util.Scanner;

public class Scanner2 {
    public static void main (String[] args) {
        float angka1, angka2, jumlah;
        Scanner dataMasuk = new Scanner (System.in);
        
        System.out.print("Masukkan Angka Ke-1 : ");
        angka1 = dataMasuk.nextFloat();
        
        System.out.print("Masukkan Angka Ke-2 : ");
        angka2 = dataMasuk.nextFloat();
        
        jumlah = angka1 + angka2;
        
        System.out.println("Masukkan Angka Ke-1 : " + angka1);
        System.out.println("Masukkan Angka Ke-2 : " + angka2);
        System.out.println("Jumlah : " + jumlah);
    }
}
