package Praticas.bloco1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class b1_6_c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line, input, word;
        Map<String, String> wordsMap;
        String phrase[];
        int count;

        System.out.print("Dictionary file: ");
        line = sc.nextLine();
        wordsMap = getTranslation(new File(line)); // has the defenitions
        System.out.print("Text to translate: ");
        input = sc.nextLine();
        phrase = getPhrase(input);
        
        count = 0;
        List<String> temp = new ArrayList<>();
        while(true){
            if(count >= phrase.length)
                break;

            word = phrase[count];
            if(wordsMap.containsKey(word)){
                String definition[] = wordsMap.get(word).split(" ");
                for(String s : definition)
                    temp.add(s);

                for(int i = count+1; i < phrase.length; i++)
                    temp.add(phrase[i]);
                
                String tempPhrase[] = new String[temp.size()];
                int j = 0;
                for(String s : temp){
                    tempPhrase[j] = s;
                    j++;
                }
                phrase = tempPhrase;
                count = 0;
                temp = new ArrayList<>();
                continue;

            } else{
                temp.add(word);
            }
            count++;
        }
        StringBuilder sb = new StringBuilder();
        for(String s : phrase)
            sb.append(s + " ");
        System.out.println(input + " -> " + sb.toString());
        sc.close();
    }

    public static String[] getPhrase(String s){
        return s.split(" ");
    }

    public static Map<String, String> getTranslation(File file){
        Map<String, String> map = new HashMap<>();

        try {
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                String words[] = sc.nextLine().split("\\s+");
                StringBuilder sb = new StringBuilder();
                for(int i = 1; i < words.length; i++)
                    sb.append(words[i] + " ");
                
                map.put(words[0], sb.toString());
            }

            sc.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
            return null;
        }

        return map;
    }
}
