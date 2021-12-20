import java.awt.*; 
import javax.swing.*; 

public class pizzaCal {

    public static void createMainWindow(){
        JFrame mainWindow = new JFrame("Test window");
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel textLabel = new JLabel("This is a test label because i dont know if the window will render without anything inside of it or not.", SwingConstants.CENTER);
        mainWindow.getContentPane().add(textLabel, BorderLayout.CENTER);

        mainWindow.setLocationRelativeTo(null);
        mainWindow.pack();
        mainWindow.setVisible(true);
    }

    public static void main(String[] args){
        createMainWindow();
    }
}
