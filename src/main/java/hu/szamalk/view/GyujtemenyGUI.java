package hu.szamalk.view;

import javax.swing.*;

public class GyujtemenyGUI {
    JFrame gui;
    private JPanel panel;
    private JToolBar toolBar1;
    private JButton okButton;
    private JButton cancelButton;
    private JComboBox comboBox1;
    private JTextField textField1;
    private JButton hozzáadButton;

    public GyujtemenyGUI() {
        ini();
        createUIComponents();
    }

    private void ini() {
        gui = new JFrame("Műkincsek");
        gui.setSize(320, 240);
        gui.setLocationRelativeTo(null);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
    }

    private void createUIComponents() {
        panel = new JPanel();
        toolBar1 = new JToolBar();
        panel.add(toolBar1);
        gui.add(panel);
    }

    public static void main(String[] args) {
        new GyujtemenyGUI();
    }
}
