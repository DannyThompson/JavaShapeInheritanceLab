/*Daniel Thompson
  CS360
  This interface was provided by you as the superclass.
*/

 /*
*This is a Java interface called Shape

*/

import java.awt.Color;
import java.awt.Point;

public interface Shape {
    double getArea(); // Calculates and returns the area of the objec
    Color getColor();  // Returns the Color of the object.
    void setColor(Color color);  // Sets the Color of the object.
    boolean getFilled(); // Returns true if the object is filled with color, otherwise false.
    void setFilled(boolean filled); // Sets the filled state of the object.
    void move(Point point) ; // Moves the shape by the x and y amounts specified in the Point.
}
