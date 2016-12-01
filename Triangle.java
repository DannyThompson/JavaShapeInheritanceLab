/*
  Daniel Thompson
  CS360
  This implements shape as well. Private members, and this has 3 private points.
  All same methods as Rectangle and Circle, but area is a bit differrent in that
  point geometry equations were used to find the area.
*/

import java.util.*;
import java.awt.*;

public class Triangle implements Shape{

    private Point a;
    private Point b;
    private Point c;
    private Color _color;
    private boolean _filled;

    //Constructor
    public Triangle(  Point a, Point b, Point c, Color color, boolean filled ){
	this.a = a;
	this.b = b;
	this.c = c;
	_color = color;
        _filled = filled;
    }

    //The next 6 functions just set and return verteces
    public Point getVertexA(){
	return a;
    }

    public Point getVertexB(){
	return b;
    }

    public Point getVertexC(){
	return c;
    }

    public void setVertexA( Point a ){
	this.a = a;
    }

    public void setVertexB( Point b ){
	this.b = b;
    }

    public void setVertexC( Point c ){
	this.c = c;
    }

    //This overrides the equal function.
    //Checks of the triangles are equal but not necessarily in the same spot
    @Override
    public boolean equals( Object obj ){

	if( !(obj instanceof Triangle) )
	    return false;
	
	Triangle ob = (Triangle)obj;
	
	if(this == null && ob == null)
	    return true;
	
	if(this == null && ob != null || this != null && ob == null)
	    return false;
	
	if( this.getArea() == ob.getArea() ){
	    if( this.getColor() == ob.getColor() ){
		if( this.getFilled() && ob.getFilled() || !this.getFilled() && !ob.getFilled() ){
		    return true;
		}
	    }
	}
       
	return false;
        
    }

    //Set if its filled and the getter followed below
    public void setFilled( boolean filled ){
	_filled = filled;
    }

    public boolean getFilled(){
	return _filled;
    }

    //This formula calculates the area.
    //It was found by googling a way to calculate area given 3 points.
    public double getArea(){
	double n =  ( ( a.getX() * ( b.getY() - c.getY() ) ) + ( b.getX() * ( c.getY() - a.getY() ) ) + ( c.getX() * ( a.getY() - b.getY() ) ) ) / 2;
	
	return Math.abs(n);
    }

    //Setter and getter for the color
    public Color getColor(){
	return _color;
    }

    public void setColor( Color color ){
	_color = color;
    }

    //Move relative to the X and Y coordinates provided by the point
    public void move( Point p ){
	this.a.setLocation( this.a.getX() + p.getX(), this.a.getY() + p.getY() );
	this.b.setLocation( this.b.getX() + p.getX(), this.b.getY() + p.getY() );
	this.c.setLocation( this.c.getX() + p.getX(), this.c.getY() + p.getY() );
    }
}

    

