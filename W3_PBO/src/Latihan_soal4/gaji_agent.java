/*
 * Nama  : Zahratul Mardiyah
 * NIM   : 211511064
 * Kelas : 2B - D3 Teknik Informatika
 */

package Latihan_soal4;
import java.util.Scanner;


public class gaji_agent{

    public static void main(String[] args) {
        // kamus data
        int gajiPokok = 500000;
        int item;
        double bonus;
        double TotalGaji;
        double potongGaji;
        int HargaPerBarang = 50000;
        
         //membuat imputan untuk jumlah item pada bulan ini
            Scanner input = new Scanner(System.in);
            item = input.nextInt();
            // operasi sesuai dengan kondisi item yang terjual
            if(item > 80){
                TotalGaji = item * HargaPerBarang * 35/100;
               
            }else if(item >= 40){
                TotalGaji = item * HargaPerBarang * 1/4;
               
            }else if(item < 15){
                item = 15 - item;
                potongGaji = (0.15*50000*item);
                TotalGaji = (500000 - potongGaji);
                
            }else{
                bonus = (0.10)*(item*50000);
                TotalGaji = 500000 + bonus;
           
            }
            // menampilkan dan mengkonversi double menjadi int
            System.out.println((int)TotalGaji);
            input.close();
        }
        
    }