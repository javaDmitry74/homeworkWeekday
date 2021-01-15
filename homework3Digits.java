public class homework3Digits {
    public static void main(String[] args) {
        int a = 2500;
        int b = 2530;
        int c = 2440;
        int average = (a + b + c) / 3;
        if (a > b && a > c && c < b ) {
            System.out.println("We have 3 numbers : " + a +", " + b + ", " + c );
            System.out.println("A is highest number and it " + a);
            System.out.println(" and C is smallest number " + c);
                        System.out.println("Average of all our numbers is = " + average);
        } else {
            if (a > b && a > c && b < c) {
                System.out.println("We have 3 numbers : " + a +", " + b + ", " + c );
                System.out.println("A is highest number and it " + a);
                System.out.println(" and b is smallest number " + b);
                System.out.println("Average of all our numbers is = " + average);
            } else {
                if (b > a && b > c && c < a) {
                    System.out.println("We have 3 numbers : " + a +", " + b + ", " + c );
                    System.out.println("B is highest number and it " + b);
                    System.out.println(" and C is smallest number " + c);
                    System.out.println("Average of all our numbers is = " + average);
                } else {
                    if (b > c && b > a &&  a < c) {
                        System.out.println("We have 3 numbers : " + a +", " + b + ", " + c );
                        System.out.println("B is highest number and it " + b);
                        System.out.println(" and A is smallest number " + a);
                        System.out.println("Average of all our numbers is = " + average);
                    } else {
                       if (c > a && c > b && a < b ) {
                           System.out.println("We have 3 numbers : " + a +", " + b + ", " + c );
                           System.out.println("C is highest number and it " + c);
                           System.out.println(" and A is smallest number " + a);
                           System.out.println("Average of all our numbers is = " + average);
                    } else  {
                           if (c > a && c > b && b < a ) {
                               System.out.println("We have 3 numbers : " + a +", " + b + ", " + c );
                                System.out.println("C is highest number and it " + c);
                                System.out.println(" and B is smallest number " + b);
                                System.out.println("Average of all our numbers is = " + average);
                            }
                                }
                            }

                        }
                    }
                }
            }
        }


