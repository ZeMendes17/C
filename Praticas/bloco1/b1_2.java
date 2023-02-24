package Praticas.bloco1;

import java.util.Stack;
import java.util.Scanner;

public class b1_2 {
   public static void main(String[] args) {
    String operation, operator;
    double number, firstNumber, secondNumber, result;
    String[] items;
    Stack<Double> stack = new Stack<>();
    Scanner sc = new Scanner(System.in);

    operation = sc.nextLine();
    items = operation.split(" ");

    for(String item : items){
        try {
            number = Double.parseDouble(item);
            stack.push(number);
        } catch (NumberFormatException e) {
            if(stack.size() < 2){
                System.err.println("Impossible operation");
                sc.close();
                return;
            }
            firstNumber = stack.pop();
            secondNumber = stack.pop();
            operator = item;
            
            result = calculate(firstNumber, secondNumber, operator);
            stack.push(result);
        }
        System.out.println("Stack : " + stack);
    }
    sc.close();
   }

   private static Double calculate(double firstNumber, double secondNumber, String operator){
    double result;

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
            return null;
    }
    return result;
}
}
