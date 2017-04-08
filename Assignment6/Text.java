import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Text implements Sprite {
  private String text;
  private Color color;
  private int width;
  private int height;

public Text(String text, Color color, int width, int height){
  this.text = text;
  this.color = color;
  this.width = width;
  this.height = height;
}

public void draw(Graphics surface, int x, int y){

  surface.setColor(color);
  surface.drawString(text, x, y);
  surface.setColor(Color.MAGENTA);
  ((Graphics2D) surface).setStroke(new BasicStroke(5.0f));

}

public int getWidth(){
  return this.width;
}

public int getHeight(){
  return this.height;
}



}
