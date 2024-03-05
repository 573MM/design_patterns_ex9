package Lab9.q3;

public class Circle extends Shape {
	private double radius;
	public Circle(double radius, int x, int y) {
		this.radius = radius;
		super.setxPos(x);
		super.setyPos(y);
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		
		this.radius = radius;
	}
	@Override
    public String toString() {
        return "circle... with radius= "+this.getRadius()+" at position "+this.getxPos()+", "+this.getyPos();
    }
	
	@Override
	public void accept(Visittor visitor) {
		visitor.visit(this);
	}


}
