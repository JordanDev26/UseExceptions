package org.jrescalante.useexceptions.a;

import javax.swing.*;

public class MainExample {
    public static void main(String[] args) {
        String numberStr = JOptionPane.showInputDialog("Enter the number");
        int divider;
        try {

            divider = Integer.parseInt(numberStr);
            int division = 10 / divider;
            System.out.println(division);
        } catch (NumberFormatException e) {
            System.out.println("We catch the exception at runtime: " + e.getMessage());
            main(args);
        } catch (ArithmeticException e) {
            System.out.println("We catch the exception at runtime: " + e.getMessage());
            main(args);
        } finally {
            System.out.println("It always runs");
        }
        System.out.println("We continue with the flow of our application.");
    }
}
