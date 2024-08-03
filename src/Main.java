import java.util.Scanner;
/*
one time use calculator
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first integer:");
        while (!in.hasNextInt()) {
            System.out.println("Not a valid integer, try again:");
            in.next();
        }
        int firstNumber = in.nextInt();

        System.out.println("Enter the second integer:");
        while (!in.hasNextInt()) {
            System.out.println("Not a valid integer, try again:");
            in.next();
        }
        int secondNumber = in.nextInt();
        in.nextLine();

        System.out.println("Enter operation type: \"+\",\"-\",\"*\",\"/\"");
        String aaa = in.nextLine();
        if (aaa.equals("+")) {
            System.out.println(firstNumber + secondNumber);
        } else if (aaa.equals("-")) {
            System.out.println(firstNumber - secondNumber);
        } else if (aaa.equals("*")) {
            System.out.println(firstNumber * secondNumber);
        } else if (aaa.equals("/")) {
            System.out.println(firstNumber / secondNumber);
        } else {
            while(!(aaa.equals("+")) && !(aaa.equals("+")) && (aaa.equals("+")) && (aaa.equals("+"))) {
                System.out.println("Not a valid operation, try again:");
            }
        }
    }
}
