import java.awt.*;
public abstract class Shape{
    private int x, y;

    public Shape(int xcor, int ycor)
    {
        x = xcor;
        y = ycor;
    }

    public int getX()
    {
        return x;

    }
    public int getY()
    {
        return y;

    }
    public Color randomColor(){
        int r = (int)(Math.random()*256);
        int g = (int)(Math.random()*256);
        int b = (int)(Math.random()*256);
        Color skibidi = new Color(r,g,b);
        return skibidi;
    }

    public void showShapeInfo(Graphics g, int area) {
        g.setColor(this.randomColor());

      g.setFont(new Font("Arial", Font.ITALIC, 20));
      g.drawString(this.getClass().getName(), x - 15, y - 25);

        g.drawString("Area: " + area + " in^2", x - 15, y - 5);
      }


      abstract void paintShape(Graphics g);
      abstract void prepInfo(Graphics g);

    public void mRight() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mRight'");
    }

    public void setX(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setX'");
    }
  

}