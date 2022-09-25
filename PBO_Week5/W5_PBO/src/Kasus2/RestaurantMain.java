/*
* Nama		: Zahratul Mardiyah
* NIM		: 211511064
* Kelas	: 2B - D3 Teknik Informatika
*/

package Kasus2;
import java.util.Scanner;
import Kasus1.Restaurant;

public class RestaurantMain {
	public static void main(String[] args) {
		boolean quit = true;
		Restaurant menu = new Restaurant();
		Scanner scan = new Scanner(System.in);
		String nama;
		Integer jumlah;
		char stopper;
		
		menu.tambahMenuMakanan("Bala-bala", 1_000, 20);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Gehu", 1_000, 20);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Tahu", 1_000, 0);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Molen", 1_000, 20);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Ayam", 1_000, 20);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Thai Tea", 1_000, 20);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Teh Pucuk", 1_000, 20);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Roti goreng", 1_000, 20);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Gorengan", 1_000, 20);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Coklat", 1_000, 20);
		
		while(quit == true)
		{   
	        //Pemesanan makanan
	        System.out.println("=====Menu=====");
	        menu.tampilMenuMakanan();
	        System.out.println("");
	        System.out.println("Input");
	        scan.nextLine();
	        System.out.print("Nama Makanan : ");
	        nama = scan.nextLine();
	        System.out.print("Berapa banyak : ");
	        jumlah = scan.nextInt();
	        System.out.println("");
	        menu.Pemesanan(nama,jumlah);
	        
	        System.out.print("Apakah masih ingin memesan (y/n) : ");
	        stopper = scan.next().charAt(0);
	        System.out.println(" ");
	        if(stopper == 'n')
	        	quit = false;
		}
		scan.close();
	}
			

}

