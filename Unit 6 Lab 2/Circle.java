import java.awt.*;

public class Circle extends Shape{
	private int radius;

	public Circle(int x, int y, int r)
	{
		super(x, y);
		radius = r;
		
	}
	@Override
	public void paintShape(Graphics g) {
	  g.setColor(randomColor());
	  g.fillOval(this.getX(), this.getY(), radius * 2, radius * 2);
	}
	@Override
	void prepInfo(Graphics g) {
	  int area = (int)Math.PI * radius * radius;
	  super.showShapeInfo(g, area);
		
	}

}
