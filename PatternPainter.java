import org.code.neighborhood.*;
/*
 * MuralPainter is a PainterPlus that paints
 * murals in The Neighborhood
 */
public class PatternPainter extends PainterPlus {

  /*
   * Paints each row of The Neighborhood with the color
   * where size is the size of the grid
   */
  public void paintPattern(String color) {

    setPaint(1000);

    int length = 7;
    for (int i = 0; i < length; i++) {
      paint(color);
      move();
      paint(color);

     
    }
    
  }
}