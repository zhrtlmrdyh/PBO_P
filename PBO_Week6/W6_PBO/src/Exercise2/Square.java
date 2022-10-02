package Exercise2;

public class Square extends Rectangle {
	
	public Square() {
		super();
	}
	
	public Square(double side) {
		super(side, side);
	}
	
	public Square(double side, String c, boolean f) {
		super (side, side, c, f);
	}
	
	public double getSide() {
		return super.getWidth();
	}
	
	public void setWidth(double side) {
		setWidth(side);
		setLength(side);
	}
	
	@Override
	public void setLength(double side) {
		super.setLength(side);
	}
	
	@Override
	public String toString() {
		return "A Square with side = " + this.getSide() + " , Which is a subclass of " + super.toString();
	}

}
