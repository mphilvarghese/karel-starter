import java.util.Scanner;

public class karelStarterCode {
    public static void main(String[] args) {
        // 1. Create Scanner object for user input
        Scanner keyboard = new Scanner(System.in);

        // 2. Prompt user and read String input
        System.out.print("Enter your name: ");
        String name = keyboard.nextLine();
        System.out.println("Your name is: " + name);

        // 3. Prompt user and read Integer input
        System.out.print("How many hours do you work? ");
        int hours = keyboard.nextInt();
        System.out.println("Your working hours: " + hours);

        // Optional: Prompt for pay rate and calculate gross pay if needed
        // System.out.print("Enter your pay rate: ");
        // double payRate = keyboard.nextDouble();
        // double grossPay = hours * payRate;
        // System.out.println("Gross pay: $" + grossPay);

        // 4. Close the scanner resource
        keyboard.close();
    }
}