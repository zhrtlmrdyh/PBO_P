/*
 * Nama		: Zahratul Mardiyah
 * NIM		: 211511064
 * Kelas	: 2B - D3 Teknik Informatika
 */

package Kasus1;

public class Restaurant {
	private Makanan[] menu_makanan;
	private int valid;
	private static byte id=0;
	
	public Restaurant()
	{
		this.menu_makanan = new Makanan[10];
        for(int i=0;i<10;i++){
            this.menu_makanan[i] = new Makanan();
        }
    }
	
	public void tampilMenuMakanan()
	{
		for(int i =0; i<=id; i++) 
		{
			if(!isOutOfStock(i)) 
			{
				//yang saya ubah
				System.out.println(this.menu_makanan[i].getNama_makanan() + "[" + this.menu_makanan[i].getStok() + "]");
			}
		}
	}
	
	public void tambahMenuMakanan(String nama, double harga, int stok) 
	{
		menu_makanan[id].setNama_makanan(nama);
		menu_makanan[id].setHarga_makanan(harga);
		menu_makanan[id].setStok(stok);
	}
	
	public boolean isOutOfStock(int id) 
	{
		return menu_makanan[id].getStok() == 0;
	}
	
	public static void nextId(){
        id++;
    }
	
	//Fitur tambahan
	public void Pemesanan(String nama_makanan, int jumlah)
	{
		for(int i = 0; i <= id; i++)
		{
			if(nama_makanan.equals(menu_makanan[i].getNama_makanan())) 
			{
				if(menu_makanan[i].getStok() >= jumlah)
				{
				System.out.println(jumlah + " " + menu_makanan[i].getNama_makanan() + " Berhasil Terjual");
				menu_makanan[i].kurangStok(jumlah);
				}  else{
                    System.out.println("Orderan");
                    int nama;
					System.out.println(jumlah + "x " + nama + "\t\tRp. " + this.menu_makanan[i].getHarga_makanan() + "/pcs");
                    System.out.println("Total pembayaran : \tRp. " + jumlah*this.menu_makanan[i].getHarga_makanan());
                    updateStok(i,jumlah);
                    valid = 1;
                    }
            }
        }
        if(valid == 0){
            System.out.println("Please input the correct Food!");
        }
    }
    
		//pengurangan stok ketika sudah dipesan(pengembangan)
    	public void updateStok (int i, int jumlah) {
    		this.menu_makanan[i].setStok(this.menu_makanan[i].getStok() - jumlah);
    	}
	}

}
