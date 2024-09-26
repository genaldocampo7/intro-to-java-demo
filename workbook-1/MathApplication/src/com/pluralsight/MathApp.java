package com.pluralsight;

// Find and determine highest salary of two variables named bobSalary and garySalary
public class MathApp {
   public static void main(String[]args) {
       int bobSalary = 60000;
       int garySalary = 70000;

       // Determine highest salary
       int highestSalary = Math.max(bobSalary, garySalary);

       // print the result
       System.out.println("The answer is: " + highestSalary);


// Find and display the smallest of two variables named carPrice and truckPrice
       int carPrice = 23000;
       int truckPrice = 45000;

       int smallestPrice = Math.min(carPrice, truckPrice);

       // print the result
       System.out.println("The answer is: " + smallestPrice);

       // Find and display the area of a circle whose radius is 7.25
       float radius = 7.25F;
       double area = Math.PI * radius * radius;

       System.out.println("The area of the circle with radius of 7.25" + area);

 // Find and display the square root a variable after it is set to 5.0
       float value = 5.0f;
       double squareRoot = Math.sqrt(value);
       System.out.println("The square root of the number + value is" + squareRoot);


// Find and display the distance between the points (5, 10) and (85, 50)
       double x1 = 5;
       double y1 = 10;
       double x2 = 85;
       double y2 = 50;

       double dx = x2-x1;
       double dy = y2-y1;

       double dist = Math.sqrt((dy + dy) +(dy*dy));

       System.out.println("The distance between the point is" + dist);

// Question 6
       float neg = -3.8f;

       System.out.println("abosulte value of -3.8" + Math.abs(neg));

 // Question 7
       System.out.printf("The random number is %#.2f", Math.random());

   }
}





