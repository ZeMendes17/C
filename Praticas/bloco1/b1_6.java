package Praticas.bloco1;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.util.List;
import java.util.ArrayList;
import java.io.FileNotFoundException;

public class b1_6{
    public static void main(String[] args) {
        File file;
        Scanner sc = new Scanner(System.in);
        String inputDic, input;
        StringBuilder translation = new StringBuilder();

        System.out.print("Dictionary file: ");
        inputDic = sc.nextLine();
        file = new File(inputDic);
        Map<String, String> wordsMap = getTranslation(file);
        List<String> words;
        do {
            System.out.print("File to translate: ");
            input = sc.nextLine();
            file = new File(input);
            words = getPhrase(file);
            if(words != null){
                for (String s : words) {
                    if(wordsMap.containsKey(s))
                        translation.append(wordsMap.get(s));
                    else
                        translation.append(s);
                    translation.append(" ");
                }

                System.out.println(translation.toString());
            }
        } while (!input.isEmpty());
        sc.close();
    }

    public static Map<String, String> getTranslation(File file){

        try{
            Scanner sc = new Scanner(file);
            Map<String, String> wordsMap = new HashMap<>();
            String line;
            String words[];

            while(sc.hasNextLine()){
                line = sc.nextLine();
                words = line.split(" ");
                wordsMap.put(words[0], words[1]);
            }

            sc.close();
            return wordsMap;
        }catch(FileNotFoundException e){
            System.err.println("File not found");
            return null;
        }
    }

    public static List<String> getPhrase(File file){
        try {
            Scanner sc = new Scanner(file);
            List<String> phrase = new ArrayList<>();
            String line;
            String words[];

            while(sc.hasNextLine()){
                line = sc.nextLine();
                words = line.split(" ");
                for (String string : words) {
                    phrase.add(string);
                }
                phrase.add("\n"); // para indicar que é uma linha nova
            }
            sc.close();
            return phrase;

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return null;
        }
    }
}