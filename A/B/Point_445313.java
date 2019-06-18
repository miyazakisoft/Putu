/*
学生番号：g445313
氏名：宮崎光
*/
public class Point_445313 {
	public void run() {
		Point p1 = new Point();
		p1.x = 3;
		p1.y = 2;
		Point p2 = scale(p1, 2);
		p2.show();
	}

	public Point scale(Point p, int s) {
		Point point = new Point();
		point.x = p.x * s;//3*2
		point.y = p.y * s;//2*2
		return point;
	}

	public static void main(String[] args) {
		Point_445313 ps = new Point_445313();
		ps.run();
	}
}

class Point {
	int x, y;

	void show() {
		System.out.println("x=" + x + " , y=" + y);
	}
}