// Calculates the distance traveled of a moving object
import java.util.*; 

public class Distance {
    public static void main(String[] args) {
     
        Scanner in = new Scanner(System.in);  
        double speed, time;
        double distance; 

        System.out.print("Enter the speed: "); 
        speed = in.nextDouble();
        System.out.print("Enter the time: ");
        time = in.nextDouble();
       
        distance = speed*time; 

        System.out.print("Distance traveled: "); 
        System.out.print( distance );
        System.out.println(" miles.");
    }
}