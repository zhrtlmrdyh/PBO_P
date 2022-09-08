/*
 * Nama  : Zahratul Mardiyah
 * NIM   : 211511064
 * Kelas : 2B - D3 Teknik Informatika
 */

package Latihan_soal5;
import java.util.Scanner;

public class Buka_Tutup_Jalan {

    public static void main(String[] args) {
        
        //input plat nomor 4 mobil
        Scanner input = new Scanner(System.in);
		
        String platNomor = input.nextLine();
        String[] a = platNomor.split(" ");
        String result = "";
        
        for (String x : a){
            result += x;
        }

        long plat = Long.parseLong(result);

        if ((plat - 999999)%5 == 0){
        	System.out.println("berhenti");
        }
        else {
        	System.out.println("jalan");
        }
        input.close();
    }
}