/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cards;

/**
 *
 * @author elaet
 */
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.*;//includes the ImageIcon and button
import java.util.Random;//Randomize the cards when shuffling

public class cards {
    public static void main(String[] args) {
    //Poker p = new Poker();
    MainClass m = new MainClass();
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setPreferredSize(new Dimension(1000, 500));
    frame.getContentPane().setBackground(Color.GREEN.darker().darker().darker());
    frame.pack();
    frame.setVisible(true);
    //frame.add(b);
      
    //JFrame f =new JFrame("Button Example");  
    JButton b = new JButton("SHUFFLE");  
    //b.setBounds(50,100,95,30);  
        /*b.addActionListener(new ActionListener()) {
            public void actionPerformed(ActionEvent e) {
                
            }
        });*/
    m.add(b);  
    b.setSize(400,400);  
    b.setLayout(null);  
    b.setVisible(true);   
    }
    
    /*
    boolean in[] = new boolean[52];
    Random r = new Random();
    int getNextCard() {
        int i = r.nextInt(52);
        while(in[i])
            i = r.nextInt(52);
        in[i] = true;
        return i;
    }
    void shuffleCards() {   
    int[] deck = new int[52];
    for (int i = 0; i < deck.length; i++) {
        deck[i] = getNextCard();
    }
    System.out.println(Arrays.toString(deck));*/
//}
}
