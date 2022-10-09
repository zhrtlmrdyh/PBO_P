/*
 * Nama		: Zahratul Mardiyah
 * NIM		: 211511064
 * Kelas	: 2B - D3 Teknik Informatika
 */

package StudiKasus2;

public class Paint {
	private double coverage;
	
	public double getCoverage() {
		return coverage;
	}

	public void setCoverage(double coverage) {
		this.coverage = coverage;
	}

	public Paint(double c) {
		coverage = c;
	}
	
	public double amount(Shape s) {
		System.out.print("Computing amount for " + s + " is ");
		return s.area()/coverage;
	}
}

