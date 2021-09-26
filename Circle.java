

public class Circle {
	
	private final point center;
	private final double r;

	public Circle(point p, double r) {
		//this.p = p;
		this.center = new point(p);	//copie defensive
		this.r = r;
	}

	public Circle translate(double dx, double dy) {
		return new Circle(center.translate(dx, dy), r);
	}

	@Override
	public String toString() {
		return center.toString() + " " + r + " " + surface();
	}

	public point getCenter() {
		//return p;
		//copie defensive
		return new point(center);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj==this)return true;
		if(!(obj instanceof Circle)) return false;
		Circle c = (Circle)obj;
		return c.center.equals(center) && r==c.r;
	}

	public double surface() {
		//pi.r^2
		return Math.PI*r*r;
	}
	
	/*distance au carré*/
	private double squareDistance(point p) {
		double dx = p.getX() - center.getX();
		double dy = p.getY() - center.getY();
		
		return  dx * dx + dy * dy;
	}
	
	public boolean contains(point p) {
		//pythagore
		return squareDistance(p) <= r*r;
	}
	
	public static boolean contains(point p, Circle...circles) {
		for(Circle c: circles) {
			if(c.contains(p))return true;
		}
		return false;
	}

}
