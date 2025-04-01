import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userInput;
        Scanner scanner = new Scanner(System.in);
        userInput = scanner.nextLine();

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        System.out.println("You entered " + userInput);
        MyClass myClass = new MyClass(1, 2);
        scanner.close();
    }
}