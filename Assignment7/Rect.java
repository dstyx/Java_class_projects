import java.awt.*;
public class Rect
{
   private int x;
   private int y;
   private Color color;
   private int width;
   private int height;
  
   public Rect(int x1, int y1, int width, int height, Color color)
   {
       x = x1;
       y = y1;
       this.width = width;
       this.height = height;
       this.color = color;
   }
   public void draw(Graphics page)
   {
       page.setColor(color);
       page.fillRect(x, y, width, height);
   }
  

}