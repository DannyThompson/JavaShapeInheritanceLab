/**
   @author: Daniel Thompson
   CS360
   This File uses all of the shapes and tests them in various ways.
   For example, it adds only specific shapes to their respective arraylists.
   Has remove+return functionality, size, get, etc.
*/

import java.util.*;
import java.io.*;
import java.awt.*;

public class WorkSpace{

    private ArrayList<Shape> shapes = new ArrayList<Shape>(); 

    //Default Constructor
    public WorkSpace(){}

    //Add a shape
    public void add( Shape shape ){
	shapes.add( shape );
    }

    //Returns a shape and removes it
    public Shape remove( int index ){

	//Returns a message and null if an invalid index is given
	if( shapes.get(index) == null || index > size() ){
	    System.out.println("Index out of bounds.");
	    return null;
	}

	//Return and remove the shape
	return shapes.remove( index );
    
    }

    //Returns a shape but doesn't remove it
    public Shape get( int index ){
	return shapes.get( index );
    }

    //Returns the size of the array list
    public int size(){
	return shapes.size();
    }

    //Returns all the objects that are circles
    public  ArrayList<Circle> getCircles(){
	ArrayList<Circle> circles = new ArrayList<Circle>();
	
	for(int i = 0; i < size(); i++){
	    if( shapes.get(i) instanceof Circle ){
		circles.add( (Circle)shapes.get(i) );
	    }
	}

	return circles;
    }

    //Same as above, but for rectangles
    public ArrayList<Rectangle> getRectangles(){
	ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
	
	for(int i = 0; i < size(); i++){
	    if( shapes.get(i) instanceof Rectangle ){
		rectangles.add( (Rectangle)shapes.get(i) );
	    }
	}
	
	return rectangles;
    }


    //Same as above for triangles
    public ArrayList<Triangle> getTriangles(){
	ArrayList<Triangle> triangles = new ArrayList<Triangle>();
	
	for(int i = 0; i < size(); i++){
	    if( shapes.get(i) instanceof Triangle ){
		triangles.add( (Triangle)shapes.get(i) );
	    }
	}
	
	return triangles;
    }

    //Same as above for Conv. Polygons
    public ArrayList<ConvexPolygon> getConvexPolygons(){
	ArrayList<ConvexPolygon> polygon = new ArrayList<ConvexPolygon>();
	
	for(int i = 0; i < size(); i++){
	    if( shapes.get(i) instanceof ConvexPolygon ){
		polygon.add( (ConvexPolygon)shapes.get(i) );
	    }
	}

	return polygon;
    }

    //Returns all shapes that have the same color given
    public ArrayList<Shape> getShapesByColor( Color color ){
	ArrayList<Shape> colors = new ArrayList<Shape>();
	
	for(int i = 0; i < size(); i++){
	    if( shapes.get(i).getColor() == color )
		colors.add( shapes.get(i) );
	}
	return colors;
    }

    //Adds up the area of all shapes and returns that
    public double getAreaOfAllShapes(){
	double area = 0;

	for(int i = 0; i < size(); i++){
	    area = area +  shapes.get(i).getArea();
	}

	return area;
    }

    
    
}
