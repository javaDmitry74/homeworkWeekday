import java.util.Random;
import java.util.Scanner;

public class homework2GuessTheNumber {

    public static void main(String args[]) {

        final int MIN = 1;
        final int MAX = 100;
        int count = 0;

//               int ranNumber = 0;
        System.out.println("Please enter number between " + MIN + " and " + MAX);
        Scanner userNumber = new Scanner(System.in);
        int x = userNumber.nextInt();
        System.out.println("And computer will try to guess it");

        Random r = new Random();
        int b = 1;
        int a = r.nextInt(100) + 1;
        while(x != a){
            System.out.println("The number is " + a + " we guessed "+ b + " times!");
             a = r.nextInt(100)+ 1;
             b++;
        }
        System.out.println( "We finally guessed it!! it is : " + x);



    }

}





