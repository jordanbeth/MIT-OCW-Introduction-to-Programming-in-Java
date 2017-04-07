import java.awt.Color;
import java.awt.Graphics;

public class DrawGraphics {
    BouncingBox box1;
    BouncingBox box2;
    BouncingBox box3;
    BouncingBox box4;

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        box1 = new BouncingBox(200, 50, Color.RED);
        box2 = new BouncingBox(150, 60, Color.blue);
        box3 = new BouncingBox(220, 70, Color.magenta);
        box4 = new BouncingBox(100, 40, Color.lightGray);

    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        surface.setColor(Color.cyan);
        surface.drawLine(50, 50, 250, 250);
        surface.setColor(Color.green);
        surface.drawRect(70, 70, 90, 90);
        surface.setColor(Color.blue);
        surface.drawString("WATCH US GO!", 40, 40);

        box1.draw(surface);
        box2.draw(surface);
        box3.draw(surface);
        box4.draw(surface);
        box1.setMovementVector(0, 1);
        box2.setMovementVector(-1, 2);
        box3.setMovementVector(-14, 8);
        box4.setMovementVector(1, 9);
    }
}
