public class homework3Digits {
    public static void main(String[] args) {
        int a = 2380;
        int b = 2370;
        int c = 2395;
        int average = (a + b + c) / 3;
        if (a > b && a > c && c < b && c < a) {
            System.out.println("A is highest number and it " + a);
            System.out.println(" and C is smallest number " + c);
            System.out.println("Average of all our numbers is = " + average);
        } else {
            if (a > b && a > c && b < c && b < a) {
                System.out.println("A is highest number and it " + a);
                System.out.println(" and b is smallest number " + b);
                System.out.println("Average of all our numbers is = " + average);
            } else {
                if (b > a && b > c && c < b && c < a) {
                    System.out.println("B is highest number and it " + b);
                    System.out.println(" and C is smallest number " + c);
                    System.out.println("Average of all our numbers is = " + average);
                } else {
                    if (b > c && b > a && a < b & a < c) {
                        System.out.println("B is highest number and it " + b);
                        System.out.println(" and A is smallest number " + a);
                        System.out.println("Average of all our numbers is = " + average);
                    } else {
                       if (c > a && c > b && a < b && a < c) {
                        System.out.println("C is highest number and it " + c);
                        System.out.println(" and A is smallest number " + a);
                        System.out.println("Average of all our numbers is = " + average);
                    } else  {
                           if (c > a && c > b && b < a && b < c) {
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


