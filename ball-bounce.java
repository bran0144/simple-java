// With input from user, calculates the height of ball, given 
// height of ball, restitution coefficient, and number of bounces

import java.util.*; 

public class BouncingBallCLI { 
    public static void main(String[] args) { 
       
        Scanner in = new Scanner(System.in); 
        double height, coefficient; 
        int bounces;

        System.out.println("Bouncing Ball: Subproblem 1"); 
        System.out.print("Enter the height: ");
        height = in.nextDouble(); 
        System.out.print("Enter restitution coefficient: "); 
        coefficient = in.nextDouble();
        System.out.print("Enter the number of bounces: ");
        bounces = in.nextInt();

        double bounceHeight = height*Math.pow(coefficient,bounces);
        String message = "After " + bounces +
            " bounces the height of the ball is: " + bounceHeight + " feet";
        System.out.println(message);
    }
}