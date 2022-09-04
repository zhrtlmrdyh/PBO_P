/*
 * Nama	 : Zahratul Mardiyah
 * NIM	 : 211511064
 * Kelas :D3-2B Teknik Informatika
*/

package Latihan_soal1;

import java.util.Scanner;

public class datatype{
	
		public static void main(String[] args) {
			long inputAngka; //variabel untuk memasukkan nilai maksimal
			int i; //kondisi awal perulangan
			
			//untuk membuuat scanner baru
			Scanner input = new Scanner(System.in);
			
			//untuk membuat jumlah angka menjadi inputan
			inputAngka = input.nextLong();
			
			try {
				long perubahan = inputAngka;
				System.out.println(perubahan + " can be fitted in: ");
				if ((perubahan > -9223372036854775808L)&&(perubahan < 9223372036854775807L))
					System.out.println("Long");
				if ((perubahan > -2147483648)&&(perubahan < 2147483647))
					System.out.println("Int");
				if ((perubahan > -32768)&&(perubahan < 32767))
					System.out.println("Short");
			} catch (NumberFormatException e) {
				System.out.println(inputAngka + " can't be fitten in: ");
			} 
		}
	}