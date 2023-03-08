import javax.swing.*;
import java.awt.Toolkit;

public class App {
    private static JFrame frame;


    public static void main(String[] args) throws Exception {
        initialize();
        //Lennard ist ein richtig geiler Hengst
        
    }


    private static void initialize() {
        frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        
    }
}
