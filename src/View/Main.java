/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Controller.ChangeNumbersController;
import Model.Element;

/**
 *
 * @author ADMIN
 */

public class Main {
    public static void main(String[] args) {
        Element model = new Element();
        Menu view = new Menu();
        ChangeNumbersController controller = new ChangeNumbersController(model, view);

        controller.processUserInput();
    }
}

