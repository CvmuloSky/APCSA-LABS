import java.awt.*;
public class Rectangle extends Shape{
	private int base, height;

	public Rectangle(int xcor, int ycor, int b, int h)
	{
		super(xcor, ycor);
		base = b;
		height = h;
	}	


	@Override
	public void paintShape(Graphics g) {
	  g.setColor(randomColor());
	  g.fillRect(getX(), getY(), base, height);
	}

@Override
public void prepInfo(Graphics g) {
    int area = base * height;
    super.showShapeInfo(g, area);
}
}
