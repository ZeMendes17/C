package Praticas.bloco1;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class b1_1_2 {
    public static void main(String[] args) {
        double firstNumber, secondNumber, result;
        String operator, line;
        Scanner sc = new Scanner(System.in);
        Map<String, Double> vars = new HashMap<String, Double>();

        while(true){
            line = sc.nextLine();
            if(line.isEmpty())
                break;
            
            String[] info = line.split(" ");
            if(info.length != 3 && info.length != 5){
                System.err.println("Invalid format");
                continue;
            }

            if(info[1].equals("=")){
                if(info.length == 3){
                    if(info[0].matches("[0-9]+")){
                        System.err.println("Invalid variable");
                        continue;
                    }
                    vars.put(info[0], Double.parseDouble(info[2]));
                }else{
                    try {
                        firstNumber = Double.parseDouble(info[2]);
                    } catch (NumberFormatException e) {
                        if(!vars.containsKey(info[2])){
                            System.err.println("Variable does not exist");
                            continue;
                        }else{
                            firstNumber = vars.get(info[2]);
                        }
                    }
                    operator = info[3];
                    try {
                        secondNumber = Double.parseDouble(info[4]);
                    } catch (NumberFormatException e) {
                        if(!vars.containsKey(info[4])){
                            System.err.println("Variable does not exist");
                            continue;
                        }else{
                            secondNumber = vars.get(info[4]);
                        }
                    }

                    result = calculate(firstNumber, secondNumber, operator);
                    if(info[0].matches("[0-9]+")){
                        System.err.println("Invalid name for variable");
                        continue;
                    }else{
                        vars.put(info[0], result);
                    }
                    System.out.printf("%2.2f %1s %2.2f = %2.2f\n", firstNumber, operator, secondNumber,result);
                }
            }else{
                if(info.length != 3){
                    System.err.println("Invalid format.");
                    continue;
                }
                try {
                    firstNumber = Double.parseDouble(info[0]);
                } catch (Exception e) {
                    if(!vars.containsKey(info[0])){
                        System.err.println("Variable does not exist");
                        continue;
                    }else{
                        firstNumber = vars.get(info[0]);
                    }
                }
                operator = info[1];
                try {
                    secondNumber = Double.parseDouble(info[2]);
                } catch (Exception e) {
                    if(!vars.containsKey(info[2])){
                        System.err.println("Variable does not exist");
                        continue;
                    }else{
                        secondNumber = vars.get(info[2]);
                    }
                }
                result = calculate(firstNumber, secondNumber, operator);
                System.out.printf("%2.2f %1s %2.2f = %2.2f\n", firstNumber, operator, secondNumber,result);
            }
        }
        sc.close();
    }

    public static Double calculate(double firstNumber, double secondNumber, String operator){
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
