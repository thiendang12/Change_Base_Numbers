/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author ADMIN
 */
// View/Input.java
public class Input {

    private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public String getInput(String msg, int base, String err) {
        String value;
        while (true) {
            try {
                System.out.println(msg);
                value = in.readLine();
                switch (base) {
                    case 2:
                        if (value.matches("[0-1]+")) {
                            return value;
                        }
                        break;
                    case 10:
                        if (value.matches("[0-9]+")) {
                            return value;
                        }
                        break;
                    case 16:
                        if (value.matches("[0-9a-fA-F]+")) {
                            return value;
                        }
                        break;
                }
            } catch (IOException e) {
                e.printStackTrace(System.out);
            }
            System.out.println(err);
        }
    }
}

