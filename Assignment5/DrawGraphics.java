import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    BouncingBox box1;
    BouncingBox box2;
    BouncingBox box3;
    BouncingBox box4;
    ArrayList<BouncingBox> boxes = new ArrayList<BouncingBox>();

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        box1 = new BouncingBox(200, 50, Color.RED);
        box2 = new BouncingBox(150, 60, Color.blue);
        box3 = new BouncingBox(220, 70, Color.magenta);
        box4 = new BouncingBox(100, 40, Color.lightGray);
        boxes.add(box1);
        boxes.add(box2);
        boxes.add(box3);
        boxes.add(box4);

    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        surface.setColor(Color.cyan);
        surface.drawLine(50, 50, 250, 250);
        surface.setColor(Color.green);
        surface.drawRect(70, 70, 90, 90);
        surface.setColor(Color.blue);
        surface.drawString("WATCH US GO!", 40, 40);

        for(BouncingBox box : boxes){
          box.draw(surface);
        }

        box1.setMovementVector(0, 1);
        box2.setMovementVector(-1, 2);
        box3.setMovementVector(-14, 8);
        box4.setMovementVector(1, 9);
    }
}
