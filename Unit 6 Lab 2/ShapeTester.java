//Nathan Nguyen
//On my honor as a student, I have not given nor received any unauthorized assistance on this assignment

import java.awt.*;
import javax.swing.*;
public class ShapeTester extends JPanel
{
   private Shape[][] skibidi;
   public ShapeTester(){
   
      skibidi = new Shape[3][3];
      for(int r = 0; r < 3; r++)
      {
         for(int c = 0; c < 3; c++)
         {
            int random = (int)(Math.random()*4);
            if(random == 0)
            {
               skibidi[r][c] = new Circle(50 + 200*c, 50 + 200 * r, ((int)(Math.random()*31))+20);
            
            }
            else if(random == 1)
            {
               skibidi[r][c] = new Rectangle(50 + 200*c, 50 + 200 * r, ((int)(Math.random()*61))+40, ((int)(Math.random()*61))+40);
            
            }
            else if(random == 2)
            {
               skibidi[r][c] = new RightTriangle(50 + 200*c, 50 + 200 * r, ((int)(Math.random()*61))+40, ((int)(Math.random()*61))+40);
            
            }
            else if(random == 3)
            {
               skibidi[r][c] = new Square(50 + 200*c, 50 + 200 * r, ((int)(Math.random()*61))+40);
            
            }
         }
      
      }
   
   }

   public void paintComponent(Graphics g) {
      g.setColor(Color.black);
      g.fillRect(0, 0, getWidth(), getHeight());
      for (Shape[] row : skibidi){
         for (Shape shape : row){        	
            shape.prepInfo(g);
            shape.paintShape(g);
         }
      }
   }
   public static void main(String[] args) {
      JFrame frame = new JFrame("Shapes Aplenty!");
      frame.setSize(600, 600);
      frame.setResizable(false);
      frame.setContentPane(new ShapeTester());
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLocation(100, 100);
      frame.setVisible(true);
   }
}
