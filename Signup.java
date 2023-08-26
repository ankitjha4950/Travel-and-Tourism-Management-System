
package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Signup extends JFrame implements ActionListener{
    
    JButton create, back;
    JTextField tfname,tfusername,tfpassword,tfanswer;
    Choice security;
    
    Signup(){
          setSize(900, 400);

        setBounds(350, 200, 500, 360);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(50, 20, 125, 25);
        lblusername.setFont(new Font("TAHOMA", Font.BOLD, 16));
        add(lblusername);
        
         tfusername = new JTextField();
        tfusername.setBounds(190, 20, 180, 25);       
        add(tfusername);
        
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(50, 60, 125, 25);
        lblname.setFont(new Font("TAHOMA", Font.BOLD, 16));
        add(lblname);
        
         tfname = new JTextField();
        tfname.setBounds(190, 60, 180, 25);       
        add(tfname);
        
         JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(50, 100, 125, 25);
        lblpassword.setFont(new Font("TAHOMA", Font.BOLD, 16));
        add(lblpassword);
        
         tfpassword = new JTextField();
        tfpassword.setBounds(190, 100, 180, 25);       
        add(tfpassword);
        
        JLabel lblsecurity = new JLabel("Security Question");
        lblsecurity.setBounds(50, 140, 125, 25);
        lblsecurity.setFont(new Font("TAHOMA", Font.BOLD, 16));
        add(lblsecurity);
        
         security = new Choice();
        security.add("Fav Colour");
        security.add("your Old School Name");
        security.add("Your lucky Number");
        security.add("Your chiledhood fav TV show");
        security.setBounds(190, 140, 180, 25);
        add(security);
        
         JLabel lblanswer = new JLabel("Answer");
        lblanswer.setBounds(50, 180, 125, 25);
        lblanswer.setFont(new Font("TAHOMA", Font.BOLD, 16));
        add(lblanswer);
        
         tfanswer = new JTextField();
        tfanswer.setBounds(190, 180, 180, 25);       
        add(tfanswer);
        
         create = new JButton("Create");
        create.setBackground(new Color(133, 193, 233));
        create.setForeground(Color.WHITE);
        create.setFont(new Font("tahoma", Font.BOLD, 14));
        create.setBounds(80, 250, 100, 30);
        create.addActionListener(this);
        add(create);
        
         back = new JButton("Back");
        back.setBackground(new Color(133, 193, 233));
        back.setForeground(Color.WHITE);
        back.setFont(new Font("tahoma", Font.BOLD, 14));
        back.setBounds(250, 250, 100, 30);
        back.addActionListener(this);

        add(back);
        
        
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource() == create){
            String username = tfusername.getText();
            String name = tfname.getText();
            String password = tfpassword.getText();
            String question = security.getSelectedItem();
            String answer = tfanswer.getText();

            String query = "insert into account values('"+username+"', '"+name+"', '"+password+"', '"+question+"', '"+answer+"' )";
            
            try{
                Conn c = new Conn();
                c.s.executeUpdate(query);
                
                
                JOptionPane.showMessageDialog(null, "Account Created Successfully");
                setVisible(false);
                new Login();
            }catch(Exception e){
                e.printStackTrace();
            }
                    
        }else if (ae.getSource() == back){
            setVisible(false);
            new Login();
        }
        
    }
    
    
    
    public static void main(String[] args){
        new Signup();
    }
}
