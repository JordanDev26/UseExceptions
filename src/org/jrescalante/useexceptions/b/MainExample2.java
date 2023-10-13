package org.jrescalante.useexceptions.b;

import javax.swing.*;

public class MainExample2 {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        String dividend = JOptionPane.showInputDialog("Enter the number dividend");
        String divisor1 = JOptionPane.showInputDialog("Enter the number divisor");
        try {
            double division2 = cal.divide(dividend, divisor1);
            System.out.println("division2 = " + division2);
        } catch (Division0Exception e) {
            System.out.println("We catch the exception at runtime: " + e.getMessage());
            main(args);
        } catch (NumberrFormatException e) {
            System.out.println("Exception: " + e.getMessage());
            e.printStackTrace(System.out);
        } finally {
            System.out.println("It always runs");
        }
        System.out.println("We continue with the flow of our application.");
    }
}
