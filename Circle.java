/*
  Daniel Thompson
  CS360
  This also implements shape. Can check the radius, position, color and if it is
  filled or not.
  Uses simple math to calculate the area, and can also check if it's equal to another circle.
*/

import java.util.*;
import java.awt.*;

public class Circle implements Shape{


    private double _radius;
    private Point _position;
    private Color _color;
    private boolean _filled;

    //Constructor
    public Circle( double radius, Point position, Color color, boolean filled){
	_radius = radius;
	_position = position;
	_color = color;
        _filled = filled;
    }

    //Various setters and getters below for radius, position, etc.
    public double getRadius(){

	return _radius;
    }

    public void setRadius( double radius ){

	_radius = radius;
    }

    public Point getPosition()
    {
	return _position;
    }

    //This overrides the equal function.
    //Checks of the circles are equal but not necessarily in the same spot
    @Override
    public boolean equals( Object obj ){


	if( !(obj instanceof Circle) )
	    return false;
	
	Circle ob = (Circle)obj;

	if( this == null && ob == null )
	    return false;

	if( this == null && ob != null || ob == null && this != null)
	    return false;
	
	if(this.getRadius() == ob.getRadius() ){
	    if( this.getColor() == ob.getColor() ){
		    if( this.getFilled() && ob.getFilled() || !this.getFilled() && !ob.getFilled() ){
			return true;
		    }
		}
	}
	
	return false;
           
    }

    //More setters and getters
    public void setFilled( boolean filled ){
	_filled = filled;
    }

    public boolean getFilled(){
	return _filled;
    }

    //Return the area using basic pi*(r^2) formula
    public double getArea(){
	return  Math.PI * ( Math.pow( getRadius(), 2) );
    }

    //set and get color
    public Color getColor(){
	return _color;
    }

    public void setColor( Color color ){
	_color = color;
    }

    //Move the circle based on the point given
    public void move( Point point ){
	_position.setLocation( this._position.getX() + point.getX(), this._position.getY() + point.getY() );
	
	
    }
}

    

