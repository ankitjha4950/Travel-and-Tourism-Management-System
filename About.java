
package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 


public class About extends JFrame implements ActionListener {
    
    JButton back;
    
    About(){
                setBounds(600, 200, 500, 550);
                setLayout(null);
                
                getContentPane().setBackground(Color.WHITE);
                  
        JLabel l1 = new JLabel("ABOUT");
             l1.setBounds(200, 10,100,40);
             l1.setForeground(Color.RED);

             l1.setFont(new Font("tahoma",Font.BOLD,20));
             add(l1);
             
             String s = "ABOUT PROJECT.......\n"+
                     
                     " \n"+
                     "The obejective of the travel and turism management system project is to developed a system that automatics the processes and activities of a travel and the purpose is to design a system using which one can perform all oprations related to travelling "
                     + " \n\n"+
                     "Advantages of project \n \n\n" +
                     "Gives accurate information \n\n" +
                     "Simplify the manual work \n\n" +
                     
                    
                     "It minimize the documentation related work  \n\n" +
                     
                     "Friendly environment by providing warning messages. \n\n" +
                     "Travels details can we provided \n\n" +
                     "Booking confirmation notification ";
             
             
                     
             
             
             TextArea area =new TextArea(s,10,40,Scrollbar.VERTICAL);
             area.setEditable(false);
             area.setBounds(20, 100, 460, 300);
             add(area);
             
        back = new JButton("CLOSE");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(610, 20, 80, 40);
        add(back);
        back.addActionListener(this);
             
             
             
             setVisible(true);

    }
 
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
    }
    
    
    
    
    public static void main(String[] args){
         new About();
    }
}
