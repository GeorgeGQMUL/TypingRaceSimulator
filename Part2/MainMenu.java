import java.awt.*;
import javax.swing.*;

public class MainMenu extends JFrame {

    public MainMenu() {
        setTitle("Game Main Menu");
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // ===== TITLE =====
        JLabel title = new JLabel("Typing Race", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 36));
        title.setOpaque(true);
        title.setBackground(new Color(180, 190, 200));
        title.setBorder(BorderFactory.createEmptyBorder(30, 0, 30, 0));
        add(title, BorderLayout.NORTH);

        // ===== MAIN CENTER PANEL =====
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(3, 1, 20, 20));

        // ===== ROW 1: GAME MODES =====
        JPanel playPanel = new JPanel(new GridLayout(1, 5, 10, 10));

        JButton shortBtn = createButton("Short");
        JButton medBtn = createButton("Medium");
        JButton longBtn = createButton("Long");
        JButton customBtn = createButton("Custom");
        JButton createBtn = createButton("Create");

        shortBtn.addActionListener(e -> onButtonPressed(1));
        medBtn.addActionListener(e -> onButtonPressed(2));
        longBtn.addActionListener(e -> onButtonPressed(3));
        customBtn.addActionListener(e -> onButtonPressed(4));

        playPanel.add(shortBtn);
        playPanel.add(medBtn);
        playPanel.add(longBtn);
        playPanel.add(customBtn);
        playPanel.add(createBtn);

        // ===== ROW 2: MODIFIERS =====
        JPanel modifierPanel = new JPanel(new GridLayout(1, 3, 10, 10));

        modifierPanel.add(createTogglePanel("Caffeine"));
        modifierPanel.add(createTogglePanel("Night"));
        modifierPanel.add(createTogglePanel("Autocorrect"));

        // ===== ROW 3: SLIDER =====
        JPanel sliderPanel = new JPanel();
        sliderPanel.setLayout(new BorderLayout());

        JLabel sliderLabel = new JLabel("Seat Count: (2-6)", SwingConstants.CENTER);

        JSlider slider = new JSlider(2, 6, 2);
        slider.setMajorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        slider.addChangeListener(e -> {
            int value = slider.getValue();
            System.out.println("Seat count: " + value);
        });

        sliderPanel.add(sliderLabel, BorderLayout.NORTH);
        sliderPanel.add(slider, BorderLayout.CENTER);

        // ===== ADD TO MAIN =====
        mainPanel.add(playPanel);
        mainPanel.add(modifierPanel);
        mainPanel.add(sliderPanel);

        add(mainPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    // ===== TOGGLE PANEL (ON/OFF BUTTON) =====
    private JPanel createTogglePanel(String name) {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        JLabel label = new JLabel(name, SwingConstants.CENTER);

        JToggleButton toggle = new JToggleButton("OFF");
        toggle.setBackground(Color.DARK_GRAY);
        toggle.setForeground(Color.WHITE);

        // default = OFF (false)
        toggle.setSelected(false);

        toggle.addActionListener(e -> {
            boolean state = toggle.isSelected();
            toggle.setText(state ? "ON" : "OFF");

            System.out.println(name + ": " + state);
        });

        panel.add(label, BorderLayout.NORTH);
        panel.add(toggle, BorderLayout.CENTER);

        return panel;
    }

    // ===== BUTTON STYLE =====
    private JButton createButton(String text) {
        JButton button = new JButton(text);
        button.setFocusPainted(false);
        button.setBackground(Color.DARK_GRAY);
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Arial", Font.BOLD, 16));
        return button;
    }

    private void onButtonPressed(int value) {
        System.out.println("Mode selected: " + value);
        GameGUI.main(null);
        dispose();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MainMenu::new);
    }
}