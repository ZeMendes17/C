package Praticas.bloco1;

import java.util.Map;
import java.util.HashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class b1_3 {
    public static void main(String[] args) {
        Map<String, Integer> map = readInfo("Praticas/bloco1/numbers.txt");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String result = translate(map, line);

        System.out.println(result);
        sc.close();
    }

    public static Map<String, Integer> readInfo(String file){
        Map<String, Integer> translator = new HashMap<>();

        try {
            File f = new File(file);
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                String[] translation = sc.nextLine().split(" - ");
                translator.put(translation[1], Integer.parseInt(translation[0]));
            }

            sc.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
            return null;
        }
        return translator;
    }

    public static String translate(Map<String, Integer> map, String str){
        StringBuilder sb = new StringBuilder();
        String[] words = str.split("\\s+|-");

        for(String w : words){
            if(map.containsKey(w.replaceAll("[^A-Za-z0-9]", "").toLowerCase()))
                sb.append(map.get(w.replaceAll("[^A-Za-z0-9]", "").toLowerCase()));
            else
                sb.append(w);
            sb.append(" ");
        }
        return sb.toString();
    }
}
