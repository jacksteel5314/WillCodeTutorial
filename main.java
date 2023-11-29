/* 

You start at position (0, 0). 
You have to get to randomized position (x,y) where 0 < x, y < 10
Each move you can only move left, right, up, or down. 
If you hit a (2x) rock, you stay in the same place.
If you hit a (2x) hole, you lose. 

*/  


import java.util.*;
public class main{
    public static void Main(String[] args){

        Scanner scan = new Scanner(System.in);

        int x = 0;
        int y = 0; 

        System.out.println("Welcome to DeathCube!");
        System.out.println("You are at the position (0, 0).");
        System.out.println("The position you want to get to is: " + "RANDOM FUNCTION HERE");

        while(true){

            System.out.println("Which direction do you want to go?"); 
            String direction = scan.nextLine(); 


            if(direction.equals("right")){
                // CALL A FUNCTION THAT ADD ONE TO THE X-VALUE (RIGHT) 
            }
            else if(direction.equals("left")){
                // CALL A FUNCTION THAT SUBTRACTS ONE FROM THE X-VALUE (LEFT)
            }
            else if(direction.equals("up")){
                // CALL A FUNCTION THAT ADD ONE TO THE Y-VALUE (UP) 
            }
            else if(direction.equals("down")){
                // CALL A FUNCTION THAT SUBTRACT ONE FROM THE Y-VALUE (DOWN) 
            }

            if( CALL A ENDGOAL FUNCTION USING COORDINATES ) {
                System.out.println("You Win.");
                break; 
            }

            else if( CALL A HOLE FUNCTION USING COORDINATES ){
                System.out.println("You Lose.");
                break;
            }

            else if( CALL A ROCK FUNCTION USING COORDINATES ) {
                x = 0;
                y = 0; 
            }

            else if( CALL X OUT-OF-BOUNDS FUNCTION ){
                System.out.println("That was an invalid move.");
            }

            else if( CALL Y OUT-OF-BOUNDS FUNCTION ){
                System.out.println("That was an invalid move.");
            }

            else{
                System.out.println("That was a valid move"); 
            }
            System.out.println("Your current position is: " + "(" + x + ", " + y + ")");

        }
    }
}