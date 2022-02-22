/**
 *
 * @author Admin
 */
public class PokerTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Poker p = new Poker(); //call Poker constructor to create green window and button
    }
    
}





import javax.swing.*;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Admin
 */
public class Poker {
    private final JFrame w; //JFrame, JPnel, JButton are class attributes
    private final JButton shuffle;
    private final JPanel p;
    
    public Poker() //constructor creates, frame, button, background color, 
    {
    w = new JFrame("Poker space"); //create JFrame and JPanel objects
    p = new JPanel();
    
    shuffle = new JButton("SHUFFLE"); //creat the button and set it to fill the bottom of the whole window
    shuffle.setBounds(0, 830, 1200, 30);
    shuffle.addActionListener(new ActionListener()
            { 
                public void actionPerformed (ActionEvent e)
                {
                    shuffle();
                }
            });
    
    w.add(p); //add the Jpanel to the JFrame
    p.add(shuffle); //add the JButton to the JPanel
    w.setSize(1200, 900); //set the size of the JFrame window
    p.setBackground(Color.GREEN.darker().darker()); //set the background color of the jpanel and thus the whole thing
    //w.getContentPane().setBackground(Color.GREEN);
    p.setLayout(null); //lets you place the button wherever you want
    w.setVisible(true); //sets the window to visible
    }
    
    //button calls this to display random cards
    public void shuffle()
    {
        
        
    }
}
