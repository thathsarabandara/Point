/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.point;

/**
 *
 * @author thath
 */
import java.util.Scanner;

public class Point {
       Scanner input = new Scanner(System.in);
       double x;
       double y;
       final static double pi= Math.PI;
       static int objects =0;
       
    
    
    public static void main (String[]args){
        
        int loop = 0;
        
        while (loop != 3){
            displayMenu();
            loop = new Scanner(System.in).nextInt();
            switch(loop){
                case 1 -> {
                    System.out.println("Ceating New Objects");
                    createNewObject();
                }
                case 2 -> {
                    System.out.println("Here is the number of objects ");
                    getNumberOfObjectsCreated();
                }
                case 3 -> System.out.println("Exiting from the system");
                default -> System.out.println("You Entered Invalid Number ");
                    
            }
            
        }
        
    }
    public static void displayMenu(){
        System.out.println("1.Create a new object");
        System.out.println("2.Display The number of Objects");
        System.out.println("3.Exit From the system ");
        
    }
    public static void createNewObject(){     
        Point point = new Point();
        objects++;
        System.out.println("Enter the x value ");
        point.x = point.input.nextFloat();
        System.out.println("Enter the y value ");
        point.y = point.input.nextFloat();
        
        getTheCartesianCoordinateSystem(point.x , point.y);
        getTheAngleInDegrees(point.x, point.y);
        getTheAngleInRadians(point.x, point.y);
        getTheDistanceFromAnotherPoint(point.x, point.y);
        getTheDistanceFromTheOrigin(point.x, point.y);
     }
    public static void getNumberOfObjectsCreated(){
        System.out.println("Here is the objects that created by you "+objects);
    }
    public static void getTheCartesianCoordinateSystem(double x , double y){
        System.out.println("The Cordinates in Cartesian system.=(" +x+","+y+")1");
     
    }
    public static void getTheAngleInDegrees(double x ,double y){
        double value = y/x;
        double arctangent = Math.atan(value);
        double degrees = Math.toDegrees(arctangent);
        
        System.out.println("Angle in Degrees = "+degrees);
        
    }
    public static void getTheAngleInRadians(double x ,double y){
        double value = y/x;
        double arctangent = Math.atan(value);
        System.out.println("Angle in Radians = "+arctangent);
        
    }
    public static void getTheDistanceFromAnotherPoint(double x ,double y){
        double secondX;
        double secondY;
        System.out.println("Enter the x value of another point: ");
        secondX = new Scanner(System.in).nextDouble();
        System.out.println("Enter the y value of another point: ");
        secondY = new Scanner(System.in).nextDouble();
        double temp = Math.pow((secondX - x), 2) + Math.pow((secondY - y), 2);
        double distance = Math.sqrt(temp);
        System.out.println("Distance from another point: " + distance);
    }
        
    public static void getTheDistanceFromTheOrigin(double x ,double y){
        double temp = Math.pow((x), 2) + Math.pow((y), 2);
        double distance = Math.sqrt(temp);
        System.out.println("Distance from the origin : " + distance);
        
     }
   
   
}