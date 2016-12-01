/*
  Daniel Thompson
  CS360
  The most complicated of the shapes, also implements the Shape class.
  Mostly same functionality as the other classes.
  Like Triangle, it also uses point geometry to figure out the area.
  This time, the points are stored in an array of vertices, instead of separate point memebers
*/

import java.util.*;
import java.awt.*;

public class ConvexPolygon implements Shape{

    private Point [] vertices;
    private Color color;
    private boolean filled;

    //Constructor
    public ConvexPolygon(  Point[] vertices, Color color, boolean filled ){
	this.vertices = vertices;
	this.color = color;
        this.filled = filled;
    }

    //Get the vertex at the given index
    public Point getVertex( int index ){
	return vertices[index];
    }

    //Set a vertex
    public void setVertex( int index, Point point ){
	vertices[index] = point;
    }

    //This overrides the equal function.
    //Checks if they are equal but not necessarily in the same spot
    @Override
    public boolean equals( Object obj ){

	if( !(obj instanceof ConvexPolygon) )
	    return false;
	
	ConvexPolygon ob = (ConvexPolygon)obj;
	
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

    //Gets the area using a formula found on google using coordinate geometry for convex polygons
    public double getArea(){

	int area = 0;
	int length = vertices.length;
	for(int i = 0; i < length - 1; i++){
	    area += ( ( vertices[i].getX() * vertices[i+1].getY() ) -
		      ( vertices[i].getY() * vertices[i+1].getX() ) );
	}

	area +=  ( ( vertices[length-1].getX() * vertices[0].getY() ) -
		   ( vertices[length-1].getY() * vertices[0].getX() ) );

	return (double)Math.abs( area / 2 );
    }	

    //Set whether its filled or not
    public void setFilled( boolean filled ){
	this.filled = filled;
    }

    //Returns whether its filled or not
    public boolean getFilled(){
	return filled;
    }

    //return the color
    public Color getColor(){
	return color;
    }

    //set the color
    public void setColor( Color color ){
	this.color = color;
    }

    //move the polygon relative to the point passed
    public void move( Point p ){

	for(int i = 0; i < vertices.length; i++){
	    this.vertices[i].setLocation( this.vertices[i].getX() + p.getX(),
					  this.vertices[i].getY() + p.getY() );
	}
	
    }
}

    

