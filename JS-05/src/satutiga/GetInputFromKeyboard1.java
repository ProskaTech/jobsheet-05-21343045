/**
 * Created by 21343045_Farraz Hadyan
 */
package satutiga;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class GetInputFromKeyboard1 {
    public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        
        String name = "", hoby = "";
        
        try{
            System.out.print("Nama Anda : ");
            name = dataIn.readLine();
            System.out.print("Hobby Anda : ");
            hoby = dataIn.readLine();
        }
        catch (IOException e) {
            System.out.println("Gagal Membaca Keyboard");
        }
        
        System.out.println("Jadi Hobby Anda "+hoby+". Hobby yang Bagus " + name);
    }
}
