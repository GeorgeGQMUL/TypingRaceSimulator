import java.awt.*;
import javax.swing.*;

public class MainMenu extends JFrame {

    public MainMenu() {
        setTitle("Game Main Menu");
        setSize(1000, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel titlePanel = new JPanel();
        JPanel playPanel = new JPanel();
        JPanel createPanel = new JPanel();
        playPanel.setLayout(new GridLayout(1, 4, 10, 10));


        // Create 4 identical-looking buttons
        JButton shortBtn = createButton("Short");
        JButton medBtn = createButton("Medium");
        JButton longBtn = createButton("Long");
        JButton playCustomBtn = createButton("Custom");
        JButton createCustomBtn = createButton("Custom");


        // Assign different return values
        shortBtn.addActionListener(e -> onButtonPressed(1));
        medBtn.addActionListener(e -> onButtonPressed(2));
        longBtn.addActionListener(e -> onButtonPressed(3));
        playCustomBtn.addActionListener(e -> onButtonPressed(4));

        playPanel.add(shortBtn);
        playPanel.add(medBtn);
        playPanel.add(longBtn);
        playPanel.add(playCustomBtn);

        add(playPanel);

        setVisible(true);
    }

    private JButton createButton(String text) {
        JButton button = new JButton(text);

        // Make them visually identical (optional styling)
        button.setFocusPainted(false);
        button.setBackground(Color.DARK_GRAY);
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Arial", Font.BOLD, 16));

        return button;
    }

    private void onButtonPressed(int value) {
        System.out.println("Button pressed returned: " + value);

        // Example integration point:
        // Game.start(value);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MainMenu::new);
    }
}
