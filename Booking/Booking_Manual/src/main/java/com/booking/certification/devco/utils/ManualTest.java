package com.booking.certification.devco.utils;

import javax.swing.*;

import static org.junit.Assert.assertEquals;

public class ManualTest {

    private static final String message = "The step \"%s\" was execute successfully?";
    private static final String reason = "Enter the reason why the test did not run successfully";

    private ManualTest() {
    }

    public static void validate(String step, String scenario) {
        int expected = 1;
        String error = "";
        String[] options = {"No", "Yes"};
        int option = JOptionPane.showOptionDialog(new JFrame(), String.format(message, step), scenario, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        if (option == 0) {
            error = JOptionPane.showInputDialog(reason);
        }
        assertEquals(error, expected, option);
    }
}