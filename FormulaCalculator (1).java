package task;

//Class for immutable constants
final class Constants {
 public static final double PI = 3.14159265359; // Immutable value of pi
}

//Class for mutable radius and operations
class CircleSphereCalculator {
 private double radius; // Mutable value of radius

 // Constructor to initialize radius
 public CircleSphereCalculator(double radius) {
     this.radius = radius;
 }

 // Getter and Setter for radius
 public double getRadius() {
     return radius;
 }

 public void setRadius(double radius) {
     this.radius = radius;
 }

 // Method to calculate circumference of circle
 public double calculateCircumference() {
     return 2 * Constants.PI * radius;
 }

 // Method to calculate area of circle
 public double calculateCircleArea() {
     return Constants.PI * Math.pow(radius, 2);
 }

 // Method to calculate volume of sphere
 public double calculateSphereVolume() {
     return (4.0 / 3.0) * Constants.PI * Math.pow(radius, 3);
 }

 // Method to calculate surface area of sphere
 public double calculateSphereSurfaceArea() {
     return 4 * Constants.PI * Math.pow(radius, 2);
 }
}

//Main class to test the program
public class FormulaCalculator {
 public static void main(String[] args) {
     // Initialize radius (mutable value)
     CircleSphereCalculator calculator = new CircleSphereCalculator(5.0);

     // Perform calculations
     System.out.println("Initial Calculations with Radius = 5.0");
     System.out.println("Circumference of Circle: " + calculator.calculateCircumference());
     System.out.println("Area of Circle: " + calculator.calculateCircleArea());
     System.out.println("Volume of Sphere: " + calculator.calculateSphereVolume());
     System.out.println("Surface Area of Sphere: " + calculator.calculateSphereSurfaceArea());

     // Modify the radius
     calculator.setRadius(7.0);
     System.out.println("\nCalculations after Updating Radius to 7.0");
     System.out.println("Circumference of Circle: " + calculator.calculateCircumference());
     System.out.println("Area of Circle: " + calculator.calculateCircleArea());
     System.out.println("Volume of Sphere: " + calculator.calculateSphereVolume());
     System.out.println("Surface Area of Sphere: " + calculator.calculateSphereSurfaceArea());
 }
}
