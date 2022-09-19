/*
 * Nama  : Zahratul Mardiyah
 * NIM   : 211511064
 * Kelas : 2B - D3 Teknik Informatika
*/

package Kasus1;

public class Barang {
	String kode_barang;
	String nama_barang;
	private int stok; 
	/*disini saya melakukan encapsulasi pada "int stok" dengan menggunakan
	variabel private untuk melarang penggunaan
	operasi aritmatika lain selain pertambahan 
	*/
	
public int UpStok(){
	    return stok; //untuk mendapatkan stok setelah menambahkan kuantitas
	}

public void AddStok(int stok){
	    this.stok += stok; //untuk mengatur stok dengan menambahkan kuantitas
	}

public Barang(String kode, String nama, int stk) {
	kode_barang = kode;
	nama_barang = nama;
	stok = stk;
	}
}
