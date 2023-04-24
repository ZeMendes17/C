import java.util.Scanner;

public class Output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fraction v1 = new Fraction(1, 1);
        Fraction v2 = new Fraction(1, 1);
        Fraction v3 = v1.add(v2);
        Fraction v4 = v3.pow(2);
        System.out.println(v4);
        sc.close();
    }
}
