/*
 * Nama  : Zahratul Mardiyah
 * NIM   : 211511064
 * Kelas : 2B - D3 Teknik Informatika
 */

package Latihan_soal1;

import java.util.Scanner;

public class InputOutput1 {
    static int n;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        // memisahkan string dari karakter tersebut
        String[] temp = s.split("[! , . ? _ ' @]+");
        n = temp.length;
        // print n
        System.out.println(n);
        // print split string
        for (int i=0;i<temp.length;i++ ){
            System.out.println(temp[i]);
        }
    }
}
    