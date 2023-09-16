package View;

import java.util.Scanner;

public class Menu {

    private Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        System.out.println("Address Book Menu");
        System.out.println("1. Choose the base number input");
        System.out.println("2. Choose the base number output");
        System.out.println("3. Enter input");
        System.out.println("4. Enter output");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    public int getUserChoice() {
        return scanner.nextInt();
    }

    public int getInputBase() {
        int inputBase;
        do {
            System.out.println("Enter base number (2, 10, 16): ");
            inputBase = scanner.nextInt();
        } while (inputBase != 2 && inputBase != 10 && inputBase != 16);
        return inputBase;
    }

    public int getOutputBase() {
        int outputBase;
        do {
            System.out.println("Enter base number (2, 10, 16): ");
            outputBase = scanner.nextInt();
        } while (outputBase != 2 && outputBase != 10 && outputBase != 16);
        return outputBase;
    }

    public String getInputValue() {
        System.out.println("Enter input value: ");
        return scanner.next();
    }

    public void displayResult(int result) {
        System.out.println("Output: " + result);
    }
    
    public void displayResultString(String result) {
        System.out.println("Output: " + result);
    }

    public void displayErrorMessage(String message) {
        System.out.println("Error: " + message);
    }

}
