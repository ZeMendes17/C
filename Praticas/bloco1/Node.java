package Praticas.bloco1;

public class Node {
    String value;
    int number;
    Node left;
    Node right;

    public Node(String value){
        this.value = value;
        left = null;
        right = null;
    }

    public Node(int number){
        this.number = number;
        left = null;
        right = null;
    }

    // getters
    public String getValue(){
        return value;
    }
    public Integer getNumber(){
        return number;
    }
    public Node getLeft(){
        return left;
    }
    public Node getRigth(){
        return right;
    }

    // setters
    public void setValue(String value){
        this.value = value;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public void setLeft(Node left){
        this.left = left;
    }
    public void setRight(Node right){
        this.right = right;
    }


    @Override
    public String toString(){
        if(value != null)
            return "Value of node: " + value + "; Left node: " + left + "; Right node: " + right + "\n";
        else 
            return "Value of node: " + number + "; Left node: " + left + "; Right node: " + right + "\n";
    }
}
