/*
 * Nama  : Zahratul Mardiyah
 * NIM   : 211511064
 * Kelas : 2B - D3 Teknik Informatika
 */

package Latihan_soal2;

import java.util.Scanner;

public class InputOutput2 {
    public static void main(String[] args) {
        // membuat array of String untuk menampung kata sebanyak 3
        String[] kata = new String[3];
        
        // membuat array of integer untuk menampung angka sebanyak 3
        int[] x = new int[3];
        
        // membuat inputan untuk kata dan angka 
        Scanner input =new Scanner(System.in);
        for (int i=0; i<3; i++){
        String s = input.next();
        kata[i] = s;
        int n = input.nextInt();
        x[i] = n;
        }
        
        
        // untuk menampilkan hasilnya
        System.out.println("================================");
        for(int i=0;i<3;i++){
        System.out.printf("%-15s%03d%n", kata[i], x[i]);
        
        }
        System.out.println("================================");

    }
}
