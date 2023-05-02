import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 class ButtonExample {
    public static void main(String[] args) {

        // Creates a new frame and button
        JFrame f =new JFrame("Hangman Menu");
        JButton b =new JButton("Start Game");

        // Sets the color of the words in button
        b.setForeground(Color.BLACK);

        // X, Y, Width, and Height of button
        b.setBounds(660,300,125,40);

        // The menu screen image
        JLabel hangmanImage = CustomTools.loadImage(CommonConstants.PACMAN_IMAGE);
        hangmanImage.setBounds(0, 0, hangmanImage.getPreferredSize().width, hangmanImage.getPreferredSize().height);



        // When the button is clicked the game starts with ActionListener
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new Hangman().setVisible(true);
            }
        });
        // Adding button to screen
        f.add(b);
        // Set size of the button
        f.setSize(1450,840);
        f.setLayout(null);
        // Make button visible
        f.setVisible(true);
        f.getContentPane().add(hangmanImage);

    }
}

