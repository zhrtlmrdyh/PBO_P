/*
 * Nama  : Zahratul Mardiyah
 * NIM   : 211511064
 * Kelas : 2B - D3 Teknik Informatika
 */

package Latihan_soal3;
import java.util.Scanner;

public class berhitung{

    public static void main(String[] args) {
        // kamus data
        int angka1;
        int angka2;
        int hasil;
        char operasi;
        
        // untuk membuat inputan untuk angka1, operasi, dan angka2
        Scanner input = new Scanner(System.in);
        angka1 = input.nextInt();
        operasi = input.next().charAt(0);
        angka2 = input.nextInt();
        // angka1 dan angka2 tidak boleh lebih dari 1000
        if((angka1 >= 1 && angka1 <= 1000)&&(angka2 >= 1 && angka2 <= 1000)){
        switch (operasi){
            //pertambahan(+)
            case '+':
            hasil = angka1 + angka2;
            System.out.println(hasil);
            break;
            
            // pengurangan(-)
            case '-':
            hasil = angka1 - angka2;
            System.out.println(hasil);
            break;
            
            // perkalian(*)
            case '*':
            hasil = angka1 * angka2;
            System.out.println(hasil);
            break;
            
            // pembagian(/)
            case '/':
            hasil = angka1 / angka2;
            System.out.println(hasil);
            break;
            
            // modulus(%)
            case '%':
            hasil = angka1 % angka2;
            System.out.println(hasil);
            break;
            default:
               System.out.println("Operasi Salah!");
               break;
        }
            input.close();
        }else System.out.println("Hanya bisa diinputkan 1 sampai 1000 saja"); 
    }
    
}