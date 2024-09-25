import java.util.Scanner;

public class NumCompare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Enter your first integer:");
        if (scan.hasNextInt()) {
            num1 = scan.nextInt();
            System.out.println("Enter your second integer:");
            if (scan.hasNextInt()) {
                num2 = scan.nextInt();
                if (num1 > num2) {
                    System.out.println(num1 + " is greater than " + num2 + ".");
                }
                else if (num1 < num2) {
                    System.out.println(num1 + " is less than " + num2 + ".");
                }
                else {
                    System.out.println(num1 + " is equal to " + num2 + ".");
                }
            }
            else
            {
                System.out.println("Invalid data type");
                System.exit(0);
            }
        }
        else
        {
            System.out.println("Invalid data type");
            System.exit(0);
        }


    }
}