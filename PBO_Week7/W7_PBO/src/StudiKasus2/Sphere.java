/*
 * Nama		: Zahratul Mardiyah
 * NIM		: 211511064
 * Kelas	: 2B - D3 Teknik Informatika
 */

package StudiKasus2;

public class Sphere extends Shape{
	private double radius;
	private double height;
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public Sphere(double r) {
		super("Sphere");
		radius = r;
	}
	
	public double area() {
		return 4*Math.PI*radius*radius;
	}
	
	public String toString() {
		return super.toString() + " of radius "+ radius;
	}
}