import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your number: ");
        int number = input.nextInt();
        System.out.println("Your number is: " + (number % 2 == 0 ? "Even" : "Odd"));
    }
}