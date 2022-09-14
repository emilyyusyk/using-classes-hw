package com.company;
import static ibio.Helpers.*;

public class hw2 {

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            String operation = input ("give operation: ");
            if (operation.equalsIgnoreCase("end"))
                running = false;
            else {
                int a = inputInt ("give first integer operand: ");
                int b = inputInt ("give second integer operand: ");
                if (operation.equalsIgnoreCase ("add"))
                    output (a + b);
                else if (operation.equalsIgnoreCase ("sub"))
                    output (a - b);
                else
                    output ("unknown operation");
                System.out.println ();
            }
        }
    }
}
