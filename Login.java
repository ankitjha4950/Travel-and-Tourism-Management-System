
package travel.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;



public class Login extends JFrame implements ActionListener{
    
    JButton login, signup, forget;
    JTextField tfpassword, tfusername;
    Login(){
        setSize(700, 400);
        setLocation(350,220);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(40, 20, 100, 25);
        lblusername.setFont(new Font("SAN SERIF", Font.PLAIN, 16));
        add(lblusername);
        
         tfusername = new JTextField();
        tfusername.setBounds(40,60,300,30);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        add(tfusername);
        
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(40, 100, 100, 25);
        lblpassword.setFont(new Font("SAN SERIF", Font.PLAIN, 16));
        add(lblpassword);
        
         tfpassword = new JTextField();
        tfpassword.setBounds(40, 140, 300, 30);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        add(tfpassword);
        
         login = new JButton("Login");
        login.setBounds(40, 200, 130, 30);
        login.setBackground(new Color(133, 193, 233));
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        signup = new JButton("Signup");
        signup.setBounds(200, 200, 130, 30);
        signup.setBackground(new Color(133, 193, 233));
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);

        add(signup);
        
        forget = new JButton("Forget Password");
        forget.setBounds(120, 240, 130, 30);
        forget.setBackground(new Color(133, 193, 233));
        forget.setForeground(Color.WHITE);
        forget.addActionListener(this);        
        add(forget);
        
        JLabel text = new JLabel("Trouble is login...");
        text.setBounds(270, 250, 150, 20);
        text.setForeground(Color.RED);
        add(text);
        
        JPanel p1=new JPanel();
        p1.setBounds(0,0,400,400);
        p1.setLayout(null);
        add(p1);
       
        
           
                
        JPanel p2=new JPanel();
        p2.setBounds(400,30,450,300);
        p2.setBackground(new Color(131,193,233));

        p2.setLayout(null);
        add(p2);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
           Image i2 = i1.getImage().getScaledInstance(230,220, Image.SCALE_DEFAULT);
                ImageIcon i3 =new ImageIcon(i2);
                JLabel shree = new JLabel(i3);
                shree.setBounds(270,10, 500,400);
                
                p2.add(shree);
        
        setVisible(true);
    }

   public void actionPerformed(ActionEvent ae){
       if (ae.getSource() == login){
           
           try{
               String username = tfusername.getText();
               String pass = tfpassword.getText();
               
               String query = "select * from account where username = '"+username+"' AND password = '"+pass+"' " ;
               Conn c = new Conn();
               ResultSet rs = c.s.executeQuery(query);
               if(rs.next()){ 
                   setVisible(false);
                  new Loading(username);
                   
               }else{
                   JOptionPane.showMessageDialog(null, " Incorrect Useranme or Password" );
               }
               
               
           }catch(Exception e){
               e.printStackTrace();
           }
           
           
           
       }else if (ae.getSource() == signup){
           setVisible(false);
           new Signup();
       }else{
           setVisible(false);
           new ForgetPassword();
       }
   }

   public static void main(String[] args){
        new Login();
        
    }
}
