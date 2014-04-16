package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/**
 * This class holds the buttons on the calculator and the listeners for those buttons
 * @author kevin
 * @date 4/16/14
 */
public class CalculatorButtons extends JPanel {

    public static final String[][] BUTTON_LAYOUT =
           {{"C", "+-", "x^y", "/"},
            {"7", "8", "9", "*"},
            {"4", "5", "6", "-"},
            {"1", "2", "3", "+"},
            {"0", "",  ".",  "="}};
    public static final int NUMBER_OF_ROWS = BUTTON_LAYOUT.length;
    public static final int NUMBER_OF_COLUMNS = BUTTON_LAYOUT[0].length;

    private List<JButton> buttons;
    private final ActionListener buttonListener;

    public CalculatorButtons(final Calculator calculator) {
        setLayout(new GridLayout(NUMBER_OF_ROWS, NUMBER_OF_COLUMNS));

        buttons = new ArrayList<>();

        // ActionListener that attaches to each button
        buttonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculator.reactToButtonPress(e.getActionCommand());
            }
        };


        // Creates all of the buttons with their attached listeners
        // If a "button" was defined as being totally empty, hide it so that it looks like that is an empty space
        for (String[] buttonRow : BUTTON_LAYOUT) {
            for (final String button : buttonRow) {
                buttons.add(new JButton(button) {{
                    addActionListener(buttonListener);
                    if (button.equals("")) {
                        setOpaque(false);
                        setContentAreaFilled(false);
                        setBorderPainted(false);
                        setEnabled(false);
                    }
                }});
            }
        }

        // Adds these buttons to the panel
        for (JButton button : buttons) {
            add(button);
        }
    }
}
