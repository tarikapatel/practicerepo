import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);//this line will stay same every time
        System.out.println("Please enter your first number = ");
        int x = scanner.nextInt();

        System.out.println("Please enter your second number =");
        int y = scanner.nextInt();

        System.out.println("The sum of " +x+ "+" +y+ " = " + (x + y));
    }
}
