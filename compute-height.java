// Computes height of ball with given inputs

public class ComputeHeight {
    public static void main(String[] args) {
      
        double height = 15, coefficient = 0.3;
        int bounces = 10;
     
        double bounceHeight = height*Math.pow(coefficient,bounces);
        System.out.println(bounceHeight); 
    }
}