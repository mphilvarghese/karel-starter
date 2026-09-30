//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));

    for (int i = 1; i <= 5; i++) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        IO.println("i = " + i);
    }
}

public class CSDemo
{
    public static void main(String[] args)
    {
        System.out.println("How to get output?");
            String name;
            int hours;
            double payRate;
            double grossPay;

            //Create scanner object
            Scanner keyboard = new Scanner (System.in);

                    //new Scanner(System.in)
            name = keyboard.nextLine();
            System.out.println("Your name is: " + name);

            System.out.print("How many hours do you work");
            hours = keyboard.nextInt();
            System.out.println("Your working hours: " + hours);

            

    }
}
