import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double num1 = scn.nextInt();
        double num2 = scn.nextInt();
        char operation = scn.next().charAt(0);

        double result = 0;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation!");
                return;
        }
        
        System.out.println("Result: " + result);
    }
}
