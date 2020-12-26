import java.util.Scanner;

public class homeworkWeekdays {
    public static void main(String[] args) {
        System.out.println("Please enter number, any number you think of, ");// asking user to enter number , with little point about week days//
        System.out.println("but try to think about days of the week at same time ! ");
        Scanner num = new Scanner(System.in);
        int a;
        a = num.nextInt();
        {
            System.out.println("You entered number  " + a);// confirming to user hes entry number //
            if (a < 1 || a > 7) {// checking if number entered by user within range 1-7 ( weekdays) //
                System.out.println("Sorry but according to our records there is no week day related to number you entered  " + a);
                System.out.println("You could run program again and use our hint about week days " );

            }     else {
                if (a == 1) {
                    System.out.println("Great you tough about Monday!"); // let user know to what day of the week hes number related//
                } else {
                        if (a == 2) {
                            System.out.println("Great , you used our hint, you tough about Tuesday!");
                    } else {
                        if (a == 3) {
                            System.out.println("Great , you used our hint, you tough about Wendsday!");
                        } else {
                            if (a == 4) {
                                System.out.println("Great , you used our hint, you tough about Thursday!");
                            } else {
                                if (a == 5) {
                                    System.out.println("Great , you used our hint, you tough about Friday!");
                                } else {
                                    if (a == 6) {
                                        System.out.println("Great , you used our hint, you tough about Saturday!");
                                    } else {
                                        if (a == 7) {
                                            System.out.println("Great , you used our hint, you tough about Sunday!");
                                        }
                                    }
                                }
                            }
                        }
                    }

                }
            }
        }
    }
}