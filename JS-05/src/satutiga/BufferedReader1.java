/**
 * Created by 21343045_Farraz Hadyan
 */
package satutiga;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReader1 {
    public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader (new InputStreamReader(System.in));

        String a, b;
        float angka1,angka2,jumlah;
        System.out.println("Program Penjumlahan Dua Buah Bilangan");

        try{
            System.out.print("Masukkan angka pertama : ");
            a = dataIn.readLine();
            /*Data yang akan diproses aritmatika harus dikonversikan dulu
             * dari tipe data String ke tipe data angka yang diperlukan.
             * Data yang diperoleh dari inputan kelas BufferedReade tipe datanya selalu String*/
            angka1 =Float.parseFloat(a);

            System.out.print("Masukkan angka kedua : ");
            b = dataIn.readLine();
            angka2 = Float.parseFloat(b);

            jumlah = angka1 + angka2;
            System.out.println("Jumlah : " + jumlah);
        }
        catch (IOException e){
            System.out.println("gagal membaca keyboard");
        }
    }
}
