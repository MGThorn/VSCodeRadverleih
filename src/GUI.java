import javax.swing.*;
import java.awt.Toolkit;
import java.awt.Dimension;

public class GUI {
    private JFrame frame;
    private Dimension dim;

    private JLabel lblStationsnummer;
    private JLabel lblKundennummer;

    private AusleihButton bAusleihe;
    private JButton bRückgabe;
    private JButton bRegistrieren;

    JTextField txtStationsnummer;
    JTextField txtKundennummer;
    JTextField txtAusgabe;




    public GUI() throws Exception {
        
        this.initialize();
        //Lennard ist ein richtig geiler Hengst
        
    }

    
    private void initialize() {
        frame = new JFrame();
        dim = Toolkit.getDefaultToolkit().getScreenSize();

        frame.setSize(dim);
        frame.setUndecorated(true);
        frame.setAlwaysOnTop(true);
        frame.setVisible(true);

        lblKundennummer = new JLabel("Kundennummer");
        lblKundennummer = new JLabel("Kundennummer");

        bAusleihe = new AusleihButton(this);


        frame.add(lblStationsnummer);
        frame.add(lblKundennummer);
        frame.add(txtStationsnummer);
        frame.add(txtKundennummer);
        frame.add(txtAusgabe);
        frame.add(bRegistrieren);
        frame.add(bRückgabe);
        frame.add(bAusleihe);


        
    }
}
