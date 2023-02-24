import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        double firstNumber, secondNumber, result;
        String operator;
        Scanner sc = new Scanner(System.in);
        try {
            firstNumber = sc.nextDouble();
            operator = sc.next();
            secondNumber = sc.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("The arguments passed must be: <number> <operator> <number>");
            sc.close();
            return;
        }
        sc.close();

        switch(operator){
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                result = firstNumber / secondNumber;
                break;
            default:
                System.err.println("Invalid operator. Try: +, -, x or /");
                return;
        }

        System.out.printf("%2.2f %1s %2.2f = %2.2f\n", firstNumber, operator, secondNumber,result);
    }
}
