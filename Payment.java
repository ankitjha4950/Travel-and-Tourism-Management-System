
package travel.management.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Payment extends JFrame implements ActionListener{
    
    JButton back, pay;
    
    Payment(){
        
        
        setBounds(500, 200, 800, 600);
        setLayout(null);
        
          ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/paytm.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(800,600, Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0, 800,600);
        add(image);
        
         pay =new JButton("PAY");
        pay.setBounds(420,0,80,40);
       // pay.setBackground(Color.BLACK);
        //pay.setForeground(Color.WHITE);
        pay.addActionListener(this);
       // back.setFont(new Font("Tahoma",Font.PLAIN,20));
       // back.setMargin(new Insets(0,0,0,130));
        image.add(pay );
        
        
         back =new JButton("BACK");
        back.setBounds(520,0,80,40);
        //back.setBackground(Color.BLACK);
       // back.setForeground(Color.WHITE);
        back.addActionListener(this);
       // back.setFont(new Font("Tahoma",Font.PLAIN,20));
       // back.setMargin(new Insets(0,0,0,130));
        image.add(back );
        
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== pay){
          setVisible(false);
          new Paytm();
        }else{
            setVisible(false);
        }
    }
    
    
    public static void main(String[] args){
        new Payment();
    }
}

