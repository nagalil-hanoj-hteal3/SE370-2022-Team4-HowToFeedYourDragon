package cards;
/*

 *
 * @author Admin
 */


import java.awt.Color;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
/**
 *
 * @author Admin
 */
public class cards {
    private final JFrame w; //JFrame, JPnel, JButton are class attributes
    private final JButton shuffle;
    private final JPanel p;
    
    public cards() //constructor creates, frame, button, background color, 
    {
        
        int[] deck = new int[52];
    w = new JFrame("Poker space"); //create JFrame and JPanel objects
    p = new JPanel();
    
    shuffle = new JButton("Shuffle"); //creat the button and set it to fill the bottom of the whole window
    shuffle.setBounds(0, 830, 1200, 30);
    shuffle.addActionListener(new ActionListener()
    { 
         public void actionPerformed (ActionEvent e)
            {
                shuffle(e);
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
    public void shuffle(ActionEvent e)
    {

        for int (i=0; i<deck.length; i++){
        deck[i] = getCard();}
        
        
    }
        
        
        
        
       
    }
    public int getCard(){
        boolean init[] = new boolean[52];
        Random r = new Random ();
        int i = r.nextInt(52);
            while(init[i]){
                i = r.nextInt(52);}
            init[i]=true;
            return i;
        }
}
