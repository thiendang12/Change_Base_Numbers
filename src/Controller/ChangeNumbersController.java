package Controller;

import Model.Element;
import View.Menu;

public class ChangeNumbersController {

    private Element model;
    private Menu view;

    public ChangeNumbersController(Element model, Menu view) {
        this.model = model;
        this.view = view;
    }

    public int parseIntWithBase(String s, int base) {
        return Integer.parseInt(s, base);
    }

    public void processUserInput() {
        int choice = 0;
        int inputBase = 0, outputBase = 0;
        String inputValue = "";

        do {
            view.displayMenu();
            choice = view.getUserChoice();

            switch (choice) {
                case 1: {
                    do {
//                        System.out.println("Enter base number (2, 10, 16): ");
                        inputBase = view.getInputBase();
                    } while (inputBase != 2 && inputBase != 10 && inputBase != 16);
                    break;
                }

                case 2: {
                    do {
//                        System.out.println("Enter base number (2, 10, 16): ");
                        outputBase = view.getOutputBase();
                        if (inputBase == outputBase) {
                            System.out.println("Error: Output base must be different from input base.");
                        }
                    } while (outputBase != 2 && outputBase != 10 && outputBase != 16);
                    break;
                }

                case 3: {
                    inputValue = view.getInputValue();
                    break;
                }

                case 4: {
                    if (outputBase == 10) {
                        int decimalValue = model.otherToDec(inputValue, inputBase);
                        model.setResult(decimalValue);
                        view.displayResult(model.getResult());
                    } else {
                        int decimalValue = model.otherToDec(inputValue, inputBase);
                        // int result = parseIntWithBase(model.decToOther(decimalValue, outputBase), outputBase);
                        String result = model.decToOther(decimalValue, outputBase);
                        model.setResultString(result);
                        view.displayResultString(model.getResultString());
                    }
                    // view.displayResult(model.getResult());
                    break;
                }

                default: {
                    view.displayErrorMessage("Invalid choice");
                }
            }
        } while (choice != 5);
    }
}
