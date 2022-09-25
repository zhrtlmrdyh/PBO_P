package Kasus1;

public class Makanan {
	private String nama_makanan;
	private double harga_makanan;
	private int stok;
	
	public String getNama_makanan() {
		return nama_makanan;
	}

	public void setNama_makanan(String nama_makanan) {
		this.nama_makanan = nama_makanan;
	}

	public double getHarga_makanan() {
		return harga_makanan;
	}

	public void setHarga_makanan(double harga_makanan) {
		this.harga_makanan = harga_makanan;
	}

	public void setStok(int stok) {
		this.stok = stok;
	}

	//Membuat Constructor
	public Makanan (String nama_makanan, double harga_makanan, int stok) 
	{
		this.nama_makanan = nama_makanan;
		this.harga_makanan = harga_makanan;
		this.stok = stok;
	}
	
	public Makanan() {
		this.nama_makanan = "belum diisi";
		this.harga_makanan = 0;
		this.stok= 0;
	}
	
	//Encapsulation
	public String getNamaMakanan()
	{
		return nama_makanan;
	}
	
	public int getStok()
	{
		return stok;
	}
	
	public void TampilMenuMakanan()
	{
		System.out.println(nama_makanan + "[" + stok + "]" + "Rp." + harga_makanan);
	}
	
	public void kurangStok (int jumlah)
	{
		stok -= jumlah;
	}
}
