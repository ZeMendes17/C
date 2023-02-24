package Praticas.bloco1;

import java.util.Map;
import java.util.HashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class b1_3 {
    public static void main(String[] args) {
        Map<String, Integer> palavras = new HashMap<String, Integer>();
        String translation[], line[];
        String input;
        StringBuilder sb = new StringBuilder();
        Scanner sc_in = new Scanner(System.in);
        File file = new File("Praticas/bloco1/numbers.txt");

        try {
            Scanner sc_file = new Scanner(file);
            while(sc_file.hasNext()){
                translation = sc_file.nextLine().split(" - ");
                palavras.put(translation[1], Integer.parseInt(translation[0]));
            }
            sc_file.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
            sc_in.close();
            return;
        }

        input = sc_in.nextLine();
        sc_in.close();
        line = input.split("\\W+");
        for(String s : line){
            if(palavras.containsKey(s)){
                sb.append(palavras.get(s));
            }else{
                sb.append(s);
            }
            sb.append(" ");
        }

        System.out.println(sb.toString());
    }
}
