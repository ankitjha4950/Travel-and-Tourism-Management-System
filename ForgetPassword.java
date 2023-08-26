
package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ForgetPassword extends JFrame implements ActionListener {
    
    JTextField tfusername, tfname, tfquestion, tfanswer, tfpassword;
    JButton search, retrieve,back;
    
    ForgetPassword(){
        setBounds(350,200,850,380);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/forgotpassword.jpg"));
        Image i2=i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(580,70,200,200);
        add(image);
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(30,30,500,280);
        add(p1);
        
        JLabel lb1username =new JLabel("Username");
        lb1username.setBounds(40,20,100,25);
        lb1username.setFont(new Font("Tahoma",Font.BOLD, 14));
        p1.add(lb1username);
        
        tfusername = new JTextField();
        tfusername.setBounds(220, 20, 150, 25);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);
        
        search = new JButton("Search");
        search.setBackground(Color.gray);
        search.setForeground(Color.white);
        search.setBounds(380, 20, 100, 25);
                search.addActionListener(this);

        p1.add(search);
        
         JLabel lb1name =new JLabel("Name");
        lb1name.setBounds(40,60, 100, 25);
        lb1name.setFont(new Font("Tahoma",Font.BOLD, 14));
        p1.add(lb1name);
        
        tfname = new JTextField();
        tfname.setBounds(220, 60, 150, 25);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);
        
        JLabel lb1question =new JLabel("Security Question");
        lb1question.setBounds(40, 100, 150, 25);
        lb1question.setFont(new Font("Tahoma",Font.BOLD, 14));
        p1.add(lb1question);
        
        tfquestion = new JTextField();
        tfquestion.setBounds(220, 100, 150, 25);
        tfquestion.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfquestion);
        
        JLabel lblansswer =new JLabel("Answer");
        lblansswer.setBounds(40, 140, 150, 25);
        lblansswer.setFont(new Font("Tahoma",Font.BOLD, 14));
        p1.add(lblansswer);
        
        tfanswer = new JTextField();
        tfanswer.setBounds(220, 140, 150, 25);
        tfanswer.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfanswer);
        
        retrieve = new JButton("Retrieve");
        retrieve.setBackground(Color.gray);
        retrieve.setForeground(Color.white);
        retrieve.setBounds(380, 140, 100, 25);
        retrieve.addActionListener(this);
        p1.add(retrieve);
        
     
          JLabel lb1password =new JLabel("Password");
        lb1password.setBounds(40,180, 100, 25);
        lb1password.setFont(new Font("Tahoma",Font.BOLD, 14));
        p1.add(lb1password);
        
        tfpassword = new JTextField();
        tfpassword.setBounds(220, 180, 150, 25);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfpassword);
        
        back = new JButton("Back");
        back.setBackground(Color.gray);
        back.setForeground(Color.white);
        back.setBounds(170, 230, 100, 25);
        back.addActionListener(this);

        p1.add(back);
        
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == search){
            try{
                String query = "select * from account where username = '"+tfusername.getText()+"'  ";
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                while(rs.next()){
                    tfname.setText(rs.getString("name"));
                    tfquestion.setText( rs.getString("security"));
                }
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource() == retrieve) {
            try{
                String query = "select * from account where answer = '"+tfanswer.getText()+"'  AND username = '"+tfusername.getText()+"' ";
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                while(rs.next()){
                    tfpassword.setText(rs.getString("password"));
                }
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }else{
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args){
        
        new ForgetPassword();
    }
    
}
