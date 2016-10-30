/*
* File: TestPolygon.java
* Author: Stephen Harrington
* Date: September 18, 2016
* Purpose: This program creates five different polygons and tests there methods
*/
public class TestPolygon {
    public static void main(String[] args) {
        //Create new Polygon objects     
        Polygon p1 = new Polygon();
        Polygon p2 = new Polygon(5, 12.0, 1.0, 2.0, 6.0);
        Polygon p3 = new Polygon(6, 8.0,  4.0, 3.0, 7.0);
        Polygon p4 = new Polygon(7, 6.0, 2.0, 5.0, 8.0);
        Polygon p5 = new Polygon(3, 15.0, 5.0, 6.0, 2.0);
        
        //Print Methods
        System.out.println("Polygon 1: ");
        System.out.println(p1.toString());
        System.out.println("getNumSides() results: " + p1.getNumSides());
        System.out.println("getSideLength() results: " + p1.getSideLength());
        System.out.println("getXCoord() results: " + p1.getXCoord());
        System.out.println("getYCoord() results: " + p1.getYCoord()); 
        System.out.println("getApothem() results: " + p1.getApothem());
        System.out.println("getArea() results: " + p1.getArea());
        p1.setNumSides(4);
        System.out.println("setNumSides(4) Results: " + p1.getNumSides());
        p1.setSideLength(3);
        System.out.println("setSideLength(3) Results: " + p1.getSideLength());
        p1.setXCoord(2.0);
        System.out.println("setXCoord(2.0) Results: " + p1.getXCoord());
        p1.setYCoord(2.0);
        System.out.println("setYCoord(2.0) Results: " + p1.getYCoord());
        p1.setApothem(2.0);
        System.out.println("setApothem(2.0) Results: " + p1.getApothem());
              
        System.out.println();
        System.out.println("Polygon 2: ");
        System.out.println(p2.toString());
        System.out.println("getNumSides() results: " + p2.getNumSides());
        System.out.println("getSideLength() results: " + p2.getSideLength());
        System.out.println("getXCoord() results: " + p2.getXCoord());
        System.out.println("getYCoord() results: " + p2.getYCoord()); 
        System.out.println("getApothem() results: " + p2.getApothem());
        System.out.println("getArea() results: " + p2.getArea());
        p2.setNumSides(4);
        System.out.println("setNumSides(4) Results: " + p2.getNumSides());
        p2.setSideLength(3);
        System.out.println("setSideLength(3) Results: " + p2.getSideLength());
        p2.setXCoord(2.0);
        System.out.println("setXCoord(2.0) Results: " + p2.getXCoord());
        p2.setYCoord(2.0);
        System.out.println("setYCoord(2.0) Results: " + p2.getYCoord());
        p2.setApothem(2.0);
        System.out.println("setApothem(2.0) Results: " + p2.getApothem());
        
        System.out.println();       
        System.out.println("Polygon 3: ");
        System.out.println(p3.toString());
        System.out.println("getNumSides() results: " + p3.getNumSides());
        System.out.println("getSideLength() results: " + p3.getSideLength());
        System.out.println("getXCoord() results: " + p3.getXCoord());
        System.out.println("getYCoord() results: " + p3.getYCoord()); 
        System.out.println("getApothem() results: " + p3.getApothem());
        System.out.println("getArea() results: " + p3.getArea());
        p3.setNumSides(4);
        System.out.println("setNumSides(4) Results: " + p3.getNumSides());
        p3.setSideLength(3);
        System.out.println("setSideLength(3) Results: " + p3.getSideLength());
        p3.setXCoord(2.0);
        System.out.println("setXCoord(2.0) Results: " + p3.getXCoord());
        p3.setYCoord(2.0);
        System.out.println("setYCoord(2.0) Results: " + p3.getYCoord());
        p3.setApothem(2.0);
        System.out.println("setApothem(2.0) Results: " + p3.getApothem());
                
        System.out.println();
        System.out.println("Polygon 4: ");
        System.out.println(p4.toString());
        System.out.println("getNumSides() results: " + p4.getNumSides());
        System.out.println("getSideLength() results: " + p4.getSideLength());
        System.out.println("getXCoord() results: " + p4.getXCoord());
        System.out.println("getYCoord() results: " + p4.getYCoord()); 
        System.out.println("getApothem() results: " + p4.getApothem());
        System.out.println("getArea() results: " + p4.getArea());
        p4.setNumSides(4);
        System.out.println("setNumSides(4) Results: " + p4.getNumSides());
        p4.setSideLength(3);
        System.out.println("setSideLength(3) Results: " + p4.getSideLength());
        p4.setXCoord(2.0);
        System.out.println("setXCoord(2.0) Results: " + p4.getXCoord());
        p4.setYCoord(2.0);
        System.out.println("setYCoord(2.0) Results: " + p4.getYCoord());
        p4.setApothem(2.0);
        System.out.println("setApothem(2.0) Results: " + p4.getApothem());
        
        System.out.println();
        System.out.println("Polygon 5: ");
        System.out.println(p5.toString());
        System.out.println("getNumSides() results: " + p5.getNumSides());
        System.out.println("getSideLength() results: " + p5.getSideLength());
        System.out.println("getXCoord() results: " + p5.getXCoord());
        System.out.println("getYCoord() results: " + p5.getYCoord()); 
        System.out.println("getApothem() results: " + p5.getApothem());
        System.out.println("getArea() results: " + p5.getArea());
        p5.setNumSides(4);
        System.out.println("setNumSides(4) Results: " + p5.getNumSides());
        p5.setSideLength(3);
        System.out.println("setSideLength(3) Results: " + p5.getSideLength());
        p5.setXCoord(2.0);
        System.out.println("setXCoord(2.0) Results: " + p5.getXCoord());
        p5.setYCoord(2.0);
        System.out.println("setYCoord(2.0) Results: " + p5.getYCoord());
        p5.setApothem(2.0);
        System.out.println("setApothem(2.0) Results: " + p5.getApothem());
         
        
    }
}