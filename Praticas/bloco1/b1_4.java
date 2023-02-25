package Praticas.bloco1;

import java.util.Scanner;
import java.util.Map;

public class b1_4 {
    public static void main(String[] args) {
        Map<String, Integer> map = b1_3.readInfo("Praticas/bloco1/numbers.txt");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        sc.close();

        String[] words = b1_3.translate(map, line).replaceAll("[^A-Za-z0-9]", " ").split("\\s+");
        int numbers[] = new int[words.length];
        int count = 0;
        for(String w : words){
            try {
                numbers[count] = Integer.parseInt(w);
            } catch (NumberFormatException e) {
                continue;
            }
            count++;
        }

        int result = calculate(numbers);
        System.out.println(line + " -> " + result);

    }

    public static int sizeOfNumber(int number){
        return String.valueOf(number).length();
    }

    private static int calculate(int numbers[]){
        int count = 0;
        int result = 0;
        int actualNumber, nextNumber, tempNumber;
        int temp_flag = 0;

        while(true){
            if(count == numbers.length-1){
                if(temp_flag == 0)
                    result += numbers[count];
                break;
            }
            temp_flag = 0;
            actualNumber = numbers[count];
            nextNumber = numbers[++count];
            tempNumber = actualNumber;
            while(sizeOfNumber(nextNumber) > sizeOfNumber(actualNumber)){
                tempNumber *= nextNumber;
                actualNumber = nextNumber;
                if(count >= numbers.length-1)
                    break;
                nextNumber = numbers[++count];
                temp_flag = 1;
            }
            if(temp_flag == 1){
                result += tempNumber;
                tempNumber = actualNumber;
            }else{
                result += actualNumber;
            }
        }

        return result;
    }
}
