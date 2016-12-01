/*
  Daniel Thompson
  CS360
  This class implements the Shape superclass.
  It has multiple private members as you can see below which are used in getting the area,
  Seeing if the shape is filled or not(boolean) and which color it is.
  It also can check if it's equal to another rectanlge.
*/

import java.util.*;
import java.awt.*;

public class Rectangle implements Shape{

    private double width;
    private double height;
    private Point position;
    private Color color;
    private boolean filled;
    
    public Rectangle(double width, double height, Point position, Color color, boolean filled){
	this.width = width;
	this.height = height;
	this.position = position;
	this.color = color;
	this.filled = filled;
    }

    public double getWidth(){
	return this.width;
    }

    public void move(Point point){

	this.position.setLocation( point.getX() + this.position.getX(), point.getY() + this.position.getY() );
    }
			
    public void setWidth(double width){
	this.width = width;
    }

    public double getHeight(){
	return this.height;
    }

    public void setHeight(double height){
	this.height = height;
    }

    public Point getPosition(){
	return this.position;
    }
    
    public boolean getFilled(){
	return this.filled;
    }

    public double getArea(){
	return this.width * this.height;
    }
    
    public void setFilled( boolean filled ){
	this.filled = filled;
    }

    public void setColor( Color color ){
	this.color = color;
    }

    public Color getColor(){
	return this.color;
    }

    //Checks if two rectangles are equal but not necessarily in the same spot
    @Override

    
    
    public boolean equals(Object obj){

		//If the object passed isn't a rectangle, return false
	if( !(obj instanceof Rectangle) )
	    return false;

	
	Rectangle b = (Rectangle) obj;


	//Various null checks for false and true
	if( obj == null && this == null )
	    return true;
	if( obj == null && this != null || obj != null && this == null )
	    return false;

	//Rest of the check
	if( this.getWidth() == b.getWidth() ){
	    if( b.getHeight() == this.getHeight() ){
		if( this.getColor() == b.getColor() ){
		    if( this.getFilled() && b.getFilled() || !this.getFilled() && !b.getFilled() ){
			return true;
		    }
		}
	    }
	}
	return false;
    }
    
    
}
