package calculator;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;

/**
 * A calculator object. This object holds the buttons and display, and the logic to do the math
 * @author kevin
 * @date 4/16/14
 */

public class Calculator extends JFrame {

    public static final String TITLE = "Calculator";


    CalculatorMath display;
    CalculatorButtons buttons;

    public Calculator() {
        setLayout(new MigLayout("flowy"));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle(TITLE);

        display = new CalculatorMath(this);
        add(display, "growx");

        buttons = new CalculatorButtons(this);
        add(buttons, "growx");

    }


    public void reactToButtonPress(String buttonPressed) {
        switch (buttonPressed) {
            case "C":
                // clear
                break;
            case "+-":
                // negate
                break;
            case "x^y":
                // exponent
                break;
            case "/":
                // divide
                break;
            case "*":
                // multiply
                break;
            case "-":
                // subtract
                break;
            case "+":
                // add
                break;
            case "":
                // blank
                break;
            case ".":
                // decimal
                break;
            case "=":
                // equals
                break;
            default:
                // numbers
                break;
        }
    }
}
