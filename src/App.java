import javax.swing.*;
import java.awt.Toolkit;

public class App {
    private static JFrame frame;


    public static void main(String[] args) throws Exception {
        initialize();
        
    }


    private static void initialize() {
        frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        
    }
}
