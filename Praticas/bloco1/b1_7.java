package Praticas.bloco1;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class b1_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String expression, token;
        String tokens[];
        List<Node> nodes;
        ExpressionTree tree;
        boolean inserted = false;
        int i;

        expression = in.nextLine();
        in.close();
        tokens = expression.split(" ");
        int count_nums = 0;
        int count_simb = 0;

        // validates if the input is valid 1/3
        for(String s : tokens){
            try {
                Double.parseDouble(s);
                count_nums++;
            } catch (NumberFormatException e) {
                count_simb++;
            }
        }
        if(count_nums != ++count_simb){
            System.err.println("Invalid Expression");
            return;
        }

        // o primeiro é a root
        tree = new ExpressionTree(new Node(tokens[0]));

        for(i = 1; i < tokens.length; i++){
            token = tokens[i];
            nodes = tree.DFT();
            for(Node node : nodes){
                try {
                    Double.parseDouble(node.value);
                    continue; // if its a number then it does not have child nodes
                } catch (NumberFormatException e) {
                    // 2/3
                    if(!token.equals("+") && !token.equals("*") && !token.equals("-") && token.equals("/")){
                        System.out.println(token);

                        System.err.println("Invalid Expression");
                        return;
                    }

                    if(node.left == null){
                        node.left = new Node(token);
                        inserted = true;
                        break;
                    }
                }
            }
            if(inserted == false){
                Collections.reverse(nodes); // starts putting in the right from the end
                for(Node node : nodes){
                    try {
                        Double.parseDouble(node.value);
                        continue; // if its a number then it does not have child nodes
                    } catch (NumberFormatException e) {
                        // 2/3
                        if(!token.equals("+") && !token.equals("*") && !token.equals("-") && token.equals("/")){
                            System.err.println("Invalid Expression");
                            return;
                        }
                        if(node.right == null){
                            node.right = new Node(token);
                            break;
                        }
                    }
                }
            }
            inserted = false;
        }
        // verifies if the input function is valid
        // 3/3
        nodes = tree.DFT();

        for(Node node : nodes){
            try {
                Double.parseDouble(node.value);
                if(node.left == null && node.right == null)
                    continue;
                else{
                    System.err.println("Invalid Expression");
                    return;
                }

            } catch (NumberFormatException e) {
                if(node.left != null && node.right != null){
                    continue;
                } else {
                    System.err.println("Invalid Expression");
                    return;
                }
            }
        }   

        tree.printInfix();
        double result = tree.eval();
        System.out.print(" = " + result + "\n");
    }
}
