/*
 * Nama	 : Zahratul Mardiyah
 * NIM	 : 211511064
 * Kelas :D3-2B Teknik Informatika
*/

package Latihan_soal4;

public class ConvertDataType {
	static short methodOne(long l)
	{
		int i = (int) l;
		return (short)i;
		}
	public static void main(String[] args)
	{
		double d = 10.25;
		float f = (float) d; 
		byte b = (byte) methodOne((long) f); 
		System.out.println(b);
		}
	}