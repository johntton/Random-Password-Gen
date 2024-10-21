import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener{
    int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;
    private JTextArea text;
    public GUI() {
        frame = new JFrame();

        text = new JTextArea("How Many Characters?");

        JButton button = new JButton("Enter");
        button.addActionListener(this);

        label = new JLabel();

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(250,250,250,250 ));
        panel.setLayout(new FlowLayout(FlowLayout.LEFT, 150, 10));
        panel.add(text);
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Random Password Generator");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int x = Integer.parseInt(text.getText());
        Generator gen = new Generator(x);
        String genPass = gen.getPassword();
        label.setText("Password Generated: " + genPass);
    }
}

