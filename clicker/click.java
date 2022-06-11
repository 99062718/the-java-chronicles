import javax.swing.*;

public class click {
    public static void main(String[] args){
        JFrame frame = new JFrame("Test");
        JButton button = new JButton("Java time");
        button.setBounds(50, 50, 200, 20);
        frame.add(button);
        frame.setSize(400, 200);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
