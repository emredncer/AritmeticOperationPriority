import java.util.Scanner;

public class AritmeticOperationPriority {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Please enter first number(a): ");
        int a = read.nextInt();
        System.out.print("Please enter second number(b): ");
        int b = read.nextInt();
        System.out.print("Please enter third number(c): ");
        int c = read.nextInt();
        System.out.print("a+b*c-b = "+(a+b*c-b)); //tahmin etmesi güç değil önce çarpma işlemi yapılacak
    }
}
