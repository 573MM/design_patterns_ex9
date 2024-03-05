package Lab9.q3;

public abstract class Shape implements Element{
	private int xPos, yPos;
	public int getxPos() {
		return xPos;
	}
	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public int getyPos() {
		return yPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}
	@Override
	public String toString() {
		return super.toString();
	}
	public abstract void accept(Visittor visitor);
}
