 
package travel.management.system;
import javax.swing.*;
import java.awt.*;

public class Loading extends JFrame implements Runnable{
    Thread t;
    JProgressBar bar;
    
    String username;
    
    public void run(){
        try{
            for(int i=1; i<=101; i++){
                
                int max = bar.getMaximum();
                int value = bar.getValue();
                
                if(value < max){
                    bar.setValue(bar.getValue()+1);
                   
                } else {
                    setVisible(false);
                }
                Thread.sleep(50);
                
                
            }
            new Dashboard("");
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    
    Loading(String username){
        this.username = username;
        t = new Thread(this);
        
        setBounds(500, 200, 650,400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        JLabel text = new JLabel("Travel and Tourism Application");
        text.setBounds(50, 20,600, 40 );
        text.setForeground(Color.CYAN);
        text.setFont(new Font("Raleway", Font.BOLD, 35));        
        add(text);
        
          bar = new JProgressBar();
        bar.setBounds(150, 100, 300, 35);
        bar.setStringPainted(true);  
        add(bar);
        
        
        JLabel loading = new JLabel("Loading Please Wait..");
        loading.setBounds(220,140,150, 30 );
        loading.setForeground(Color.RED);
        loading.setFont(new Font("Raleway", Font.BOLD,16));        
        add(loading);
        
        
        JLabel lb1username = new JLabel("welcome ankit");
        lb1username.setBounds(20,310,400, 40 );
        lb1username.setForeground(Color.RED);
        lb1username.setFont(new Font("Raleway", Font.BOLD, 16));        
        add(lb1username);
        
        
        t.start();
        
        
        setVisible(true);
    }
    
    
    
    public static void main(String[] args){
        new Loading("");
    }
}
