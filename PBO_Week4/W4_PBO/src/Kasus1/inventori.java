/*
 * Nama  : Zahratul Mardiyah
 * NIM   : 211511064
 * Kelas : 2B - D3 Teknik Informatika
*/

package Kasus1;

public class inventori {
	Barang[] barangs;
	
	void initBarang() {
		barangs = new Barang[2];
		barangs[0] = new Barang("001", "Baju", 10); // barang pertama
		barangs[1] = new Barang("002", "Celana", 20); // barang kedua
		}

void showBarang() {
	System.out.println(barangs[0].nama_barang + "(" + barangs[0].UpStok() + ")");
	System.out.println(barangs[1].nama_barang + "(" + barangs[1].UpStok() + ")");
	}

void pengadaan() {
	initBarang(); //Untuk menambah stok
	barangs[0].AddStok(20); //menambah 20 stock baju (barang pertama)
	barangs[1].AddStok(15); //menambah 15 stock celana (barang kedua)
	showBarang(); /* menampilkan nomor dan nama setelah menambahkan stock baru*/
}
	
public static void main(String[] args) {
    inventori beli = new inventori(); // untuk memanggil class inventori
    beli.pengadaan(); // untuk memanggil void pengadaan dan penambahan stok
    }
}
