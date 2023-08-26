
package travel.management.system;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;


public class Paytm extends JFrame implements ActionListener{
    //String meter;
      JButton back;
    
    Paytm(){
        
        
        JEditorPane j = new JEditorPane();
        j.setEditable(false);
        
        setBounds(500, 200, 800, 600);

        
        
        try{
            j.setPage("https://paytm.com/rent-payments");
        }catch(Exception e){
            j.setContentType("text/html");
            j.setText("<html>Could not load<html>");
        }
        
        JScrollPane pane = new JScrollPane(j);
        
        getContentPane().add(pane);
        
        back = new JButton("CLOSE");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(610, 20, 80, 40);
        j.add(back);
        back.addActionListener(this);
        
        
        
        setSize(800, 600);
        setLocation(400, 150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Payment();

    }
    public static void main(String[] args){
        new Paytm();
    }
}
