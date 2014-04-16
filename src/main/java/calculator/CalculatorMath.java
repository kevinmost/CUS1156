package calculator;

import javax.swing.*;

/**
 * This class holds the display for the calculator
 * @author kevin
 * @date 4/16/14
 */
public class CalculatorMath extends JTextField {
// TODO: Put math functionality in here
    // The value the user sees and interacts with, and that acts as the second operand when performing operations
    private double displayedValue;

    // The value that the calculator keeps "hidden" and uses as the first operand when performing operations
    private double currentValue;

    public CalculatorMath(Calculator calculator) {
        displayedValue = 0;
        currentValue = 0;

        setText(""+displayedValue);

        setHorizontalAlignment(RIGHT);
    }


}