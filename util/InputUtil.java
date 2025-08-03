package util;

import java.util.Scanner;

public class InputUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static double getDoubleInput(String prompt) {
        double value = -1;
        while (true) {
            try {
                System.out.print(prompt);
                value = Double.parseDouble(scanner.nextLine());
                if (value >= 0) return value;
                else System.out.println("Please enter a non-negative number.");
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a numeric value.");
            }
        }
    }

    public static String getStringInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static int getIntChoice(String prompt, int min, int max) {
        int choice;
        while (true) {
            try {
                System.out.print(prompt);
                choice = Integer.parseInt(scanner.nextLine());
                if (choice >= min && choice <= max) return choice;
                else System.out.println("Choice must be between " + min + " and " + max);
            } catch (Exception e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }
}
