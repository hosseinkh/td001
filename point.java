

public class point {

	
	private final double x;
	private final double y;
	private static int nbPoint;
	private int id;
	public point(double x, double y) {
		this.x = x;
		this.y = y;
		id = nbPoint++;
		
	}
	
	public point (point p2) {
		x = p2.x;
		y = p2.y;
	}
	
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	
	public int getId() {
		return nbPoint;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {return true;}
		if (obj instanceof point) {
			point p = (point) obj;
			if (p.x == this.x && p.y == this.y) {
				return true;
			}
			return false;
		}
		return false;
	}
	
	public point translate(double dx , double dy) {
		point p = new point (this.x + dx , this.y + dy);
		return p;
	}
}
