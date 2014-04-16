package calculator;

import javax.swing.*;

/**
 * @author kevin
 * @date 4/16/14
 */
public class CalculatorTest {
    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        Calculator calc = new Calculator();

        calc.pack();
        calc.setVisible(true);

    }

}
