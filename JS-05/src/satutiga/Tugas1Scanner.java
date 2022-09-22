/**
 * Created by 21343045_Farraz Hadyan
 */
package satutiga;

import java.util.Scanner;

public class Tugas1Scanner {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter word1: ");
        String word1 = in.nextLine();

        System.out.print("Enter word2: ");
        String word2 = in.nextLine();

        System.out.print("Enter word3: ");
        String word3 = in.nextLine();

        System.out.println(word1+" "+word2+" "+word3);
}
}