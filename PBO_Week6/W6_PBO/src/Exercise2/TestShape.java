package Exercise2;

public class TestShape {
	public static void main (String args[]) {
		Shape s1 = new Shape();
		System.out.println(s1.toString());
		
		Shape s2 = new Shape ("white", false);
		System.out.println(s2.toString());
		
		Circle c1 = new Circle();
		System.out.println(c1.toString());
		System.out.println("Luas = " + c1.getArea());
		
		Circle c2 = new Circle(7.0);
		System.out.println(c2.toString());
		System.out.println("Memiliki Luas = " + c2.getArea());
		
		Rectangle r1 = new Rectangle();
		System.out.println(r1.toString());
		System.out.println("Memiliki Luas = " + r1.getArea() + "Keliling = " + r1.getPerimeter());
		
		Rectangle r2 = new Rectangle(10.0, 5.0);
		System.out.println(r2.toString());
		System.out.println("Memiliki Luas = " + r2.getArea() + "Keliling = " + r2.getPerimeter());
		
		Rectangle r3 = new Rectangle(10.0, 5.0, "Pink", true);
		System.out.println(r3.toString());
		System.out.println("Memiliki Luas = " + r3.getArea() + "Keliling = " + r3.getPerimeter());
		
		Square q1 = new Square();
		System.out.println(q1.toString());
		System.out.println("Memiliki Luas = " + q1.getArea() + "Keliling = " + q1.getPerimeter());
	}
}
