import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

    BackgroundPainter bp = new BackgroundPainter ();
    PatternPainter pp = new PatternPainter ();    

    bp.paintBackground ("White",32);
    
     pp.paintPattern ("DarkSeaGreen");
      pp.turnRight();
    pp.move();
    pp.move();
    pp.turnRight();
    pp.paintPattern ("Pink");
    pp.turnLeft();
    pp.move();
    pp.move();
    pp.turnLeft();
     pp.paintPattern ("LightCoral");
 pp.turnRight();
    pp.move();
    pp.move();
    pp.turnRight();
 pp.paintPattern ("SkyBlue");
    pp.turnLeft();
    pp.move();
    pp.turnLeft();
     pp.paintPattern ("PowderBlue");
    pp.turnLeft();
    pp.move();
    pp.move();
    pp.turnLeft();
     pp.paintPattern ("Gold");
    pp.turnRight();
    pp.move();
    pp.move();
    pp.turnRight();
 pp.paintPattern ("Bisque");
     pp.turnLeft();
    pp.move();
    pp.move();
    pp.turnLeft();
     pp.paintPattern ("Honeydew");
    pp.turnRight();
  }
}