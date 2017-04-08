// import delcarations, sometimes called import "statements", make it possible to abbreviate references to data and methods in other packages
import java.awt.Color;
import java.awt.Graphics;
// import Array List class
import java.util.ArrayList;

public class DrawGraphics {
  Bouncer movingSprite1;
  Bouncer movingSprite2;
  Bouncer myMovingSprite;
  // initialize a new Array List
  ArrayList<Bouncer> movingSprites = new ArrayList<Bouncer>();
  /** Initializes this class for drawing. */
  public DrawGraphics() {
        Rectangle box1 = new Rectangle(15, 20, Color.RED);
        Rectangle box2 = new Rectangle(30, 40, Color.CYAN);
        Text myText = new Text("Let's Go Champ!", Color.BLUE, 102, 3);

        movingSprite1 = new Bouncer(100, 170, box1);
        movingSprite1.setMovementVector(3, 1);

        // added an extra rectangle
        movingSprite2 = new Bouncer(100, 170, box2);
        movingSprite2.setMovementVector(0, 2);

        myMovingSprite = new Bouncer(50, 85, myText);
        myMovingSprite.setMovementVector(4, 3);

        movingSprites.add(movingSprite1);
        movingSprites.add(movingSprite2);
        movingSprites.add(myMovingSprite);
  }
  /** Draw the contents of the window on surface. */
  public void draw(Graphics surface) {
        for(Bouncer movingSprite : movingSprites){
          movingSprite.draw(surface);
        }
  }
}
