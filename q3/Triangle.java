package Lab9.q3;

public class Triangle extends Shape {
	private int base, height;
	public Triangle(int base, int height,
			int x, int y) {
		this.base = base;
		this.height = height;
		super.setxPos(x);
		super.setyPos(y);
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
    public String toString() {
        return "triangle...with base ="+this.getBase()+" height = "+this.getHeight()+" at position "+super.getxPos()+", "+super.getyPos();
    }
	@Override
    public void accept(Visittor visitor) {
        visitor.visit(this);
    }
}
