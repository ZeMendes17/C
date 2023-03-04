package Praticas.bloco1;

import java.util.List;
import java.util.ArrayList;

public class ExpressionTree {
    Node root;
    int found;

    public ExpressionTree(Node root){
        this.root = root;
        this.found = 0;
    }

    // simple getter
    public Node getRoot(){
        return root;
    }
    // simple setter
    public void setRoot(Node root){
        this.root = root;
    }

    // depth first search retreving a list preorderes
    public List<Node> DFT() {
        List<Node> result = new ArrayList<>();
        DFSRecursive(root, result);
        return result;
    }
    
    // recursion that completes the List defined above
    private void DFSRecursive(Node current, List<Node> result) {
        if (current == null) {
            return;
        }
        result.add(current);
        DFSRecursive(current.left, result);
        DFSRecursive(current.right, result);
    }

    // recursive method that transforms the expression in prefix mode
    public void printInfix(){
        StringBuilder result = new StringBuilder();
        printInfixRecursion(root, result);
        System.out.print(result.toString());
    }

    private void printInfixRecursion(Node current, StringBuilder result){
        try {
            Double val = Double.parseDouble(current.value);
            result.append(val);
            return;
        } catch (NumberFormatException e) {
            result.append("(");
            printInfixRecursion(current.left, result);
            result.append(current.value);
            printInfixRecursion(current.right, result);
            result.append(")");
        }
    }

    public double eval(){
        while(root.left != null && root.right != null){
            List<Node> nodes = DFT();
            for(Node node : nodes){
                if(node.left != null && node.right != null){
                    try {
                        double left = Double.parseDouble(node.left.value);
                        double right = Double.parseDouble(node.right.value);
                        String token = node.value;
                        double result = b1_1_2.calculate(left, right, token);
                        node.left = null;
                        node.right = null;
                        node.value = Double.toString(result);
                    } catch (NumberFormatException e) {
                        continue;
                    }
                }
            }
        }
        return Double.parseDouble(root.value);
    }
}
