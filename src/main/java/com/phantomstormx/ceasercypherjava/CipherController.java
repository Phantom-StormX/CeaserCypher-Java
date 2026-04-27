package com.phantomstormx.ceasercypherjava;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CipherController {

    //connects objects from fxml to controller
    @FXML
    private TextArea inputText;

    @FXML
    private TextField shiftField;

    @FXML
    private TextArea outputText;

    @FXML

    /*
    .MIN_VALUE is a constant available in wrapper
    classes that represents the smallest value a
    specific numeric data type can hold.
     */

    private void handleEncrypt() {
        String text = inputText.getText(); // yoinks the text input
        int shift = parseShift(); // yoinks the shift input
        if (shift == Integer.MIN_VALUE) return; // invalid input — message already shown

        if (text == null || text.isEmpty()) { // pretty self-explanatory
            outputText.setText("Please enter some text to encode.");
            return;
        }

        StringBuilder encoded = CipherEngine.decode(text, shift);
        outputText.setText(encoded.toString());
    }

    @FXML
    private void handleDecode() {
        String text = inputText.getText(); // yoinks the input(should already be encoded.
        int shift = parseShift();
        if (shift == Integer.MIN_VALUE) return;

        if (text == null || text.isEmpty()) {
            outputText.setText("Please enter some text to decode.");
            return;
        }

        String decoded = CipherEngine.encrypt(text, shift);
        outputText.setText(decoded);
    }

    // Reads the shift field, returns Integer.MIN_VALUE on error
    // basically a try catch for (respectfully)stupid people who do not want to input a NUMBER into the shift. :)
    private int parseShift() {
        String shiftStr = shiftField.getText();
        if (shiftStr == null || shiftStr.trim().isEmpty()) {
            outputText.setText("Please enter a shift number.");
            return Integer.MIN_VALUE;
        }
        try {
            if(Integer.parseInt(shiftStr) <= 0) {
                outputText.setText("Shift must be a positive integer");
                return Integer.MIN_VALUE;
            }
            return Integer.parseInt(shiftStr.trim());
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            outputText.setText("Shift must be a whole number.");
            return Integer.MIN_VALUE;
        }
    }
}