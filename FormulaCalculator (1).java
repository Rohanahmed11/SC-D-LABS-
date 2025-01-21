package task;

final class Constants {
 public static final double PI = 3.14159265359; 
}

class CircleSphereCalculator {
 private double radius; 

 public CircleSphereCalculator(double radius) {
     this.radius = radius;
 }

 public double getRadius() {
     return radius;
 }

 public void setRadius(double radius) {
     this.radius = radius;
 }

 public double calculateCircumference() {
     return 2 * Constants.PI * radius;
 }

 public double calculateCircleArea() {
     return Constants.PI * Math.pow(radius, 2);
 }

 public double calculateSphereVolume() {
     return (4.0 / 3.0) * Constants.PI * Math.pow(radius, 3);
 }

 public double calculateSphereSurfaceArea() {
     return 4 * Constants.PI * Math.pow(radius, 2);
 }
}

public class FormulaCalculator {
 public static void main(String[] args) {
     CircleSphereCalculator calculator = new CircleSphereCalculator(5.0);

     System.out.println("Initial Calculations with Radius = 5.0");
     System.out.println("Circumference of Circle: " + calculator.calculateCircumference());
     System.out.println("Area of Circle: " + calculator.calculateCircleArea());
     System.out.println("Volume of Sphere: " + calculator.calculateSphereVolume());
     System.out.println("Surface Area of Sphere: " + calculator.calculateSphereSurfaceArea());

     calculator.setRadius(7.0);
     System.out.println("\nCalculations after Updating Radius to 7.0");
     System.out.println("Circumference of Circle: " + calculator.calculateCircumference());
     System.out.println("Area of Circle: " + calculator.calculateCircleArea());
     System.out.println("Volume of Sphere: " + calculator.calculateSphereVolume());
     System.out.println("Surface Area of Sphere: " + calculator.calculateSphereSurfaceArea());
 }
}
