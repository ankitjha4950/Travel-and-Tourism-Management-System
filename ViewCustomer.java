
package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;


public class ViewCustomer extends JFrame implements ActionListener{
    
    JButton back;

         ViewCustomer(String username){
             setBounds(450, 180, 870, 625);
             getContentPane().setBackground(Color.WHITE);
             setLayout(null);
             
             JLabel lblusername = new JLabel("Username");
             lblusername.setBounds(30, 50, 150,25);
             add(lblusername);
             
             JLabel labelusername = new JLabel();
             labelusername.setBounds(220, 50, 150, 25);
             add(labelusername);
             
              JLabel lblid = new JLabel("Id");
             lblid.setBounds(30,110, 150,25);
             add(lblid);
             
             JLabel labelid = new JLabel();
             labelid.setBounds(220 ,110, 150, 25);
             add(labelid);
             
             JLabel lblnumber = new JLabel("Number");
             lblnumber.setBounds(30,170, 150,25);
             add(lblnumber);
             
             JLabel labelnumber = new JLabel();
             labelnumber.setBounds(220,170, 150, 25);
             add(labelnumber);
             
              JLabel lblname = new JLabel("Name");
             lblname.setBounds(30,230, 150,25);
             add(lblname);
             
             JLabel labelname = new JLabel();
             labelname.setBounds(220,230, 150, 25);
             add(labelname);
             
             JLabel lblgender = new JLabel("Gender");
             lblgender.setBounds(30,290, 150,25);
             add(lblgender);
             
             JLabel labelgender = new JLabel();
             labelgender.setBounds(220,290, 150, 25);
             add(labelgender);
             
             JLabel lblcountry = new JLabel("Country");
             lblcountry.setBounds(500,50, 150,25);
             add(lblcountry);
             
             JLabel labelcontry = new JLabel();
             labelcontry.setBounds(690,50, 150, 25);
             add(labelcontry);
             
              JLabel lbladdress= new JLabel("Address");
             lbladdress.setBounds(500,110, 150,25);
             add(lbladdress);
             
             JLabel labeladdress= new JLabel();
             labeladdress.setBounds(690,110, 150, 25);
             add(labeladdress);
             
           
             
             JLabel lblphn = new JLabel("Phone");
             lblphn.setBounds(500,170, 150,25);
             add(lblphn);
             
             JLabel labelphn = new JLabel();
             labelphn.setBounds(690,170, 150, 25);
             add(labelphn);
             
              JLabel lblemail= new JLabel("Email");
             lblemail.setBounds(500,230, 150,25);
             add(lblemail);
             
             JLabel labelemail= new JLabel();
             labelemail.setBounds(690,230, 150, 25);
             add(labelemail);
             
        back =new JButton("BACK");
        back.setBounds(350,350,100,25);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
       // back.setFont(new Font("Tahoma",Font.PLAIN,20));
       // back.setMargin(new Insets(0,0,0,130));
        add(back );
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600,200, Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(20, 400, 600,200);
        add(image);
        
         ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
        Image i5 = i4.getImage().getScaledInstance(600,200, Image.SCALE_DEFAULT);
        ImageIcon i6 =new ImageIcon(i5);
        JLabel image2 = new JLabel(i6);
        image2.setBounds(600, 400, 600,200);
        add(image2);
        
        try{
            Conn c = new Conn();
            String query = "select * from customer where username = '"+username+"' ";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                labelid.setText(rs.getString("id"));
                labelnumber.setText(rs.getString("number"));
                labelname.setText(rs.getString("name"));
                labelgender.setText(rs.getString("gender"));
                labelcontry.setText(rs.getString("country"));
                labeladdress.setText(rs.getString("address"));
                labelphn.setText(rs.getString("phoneno"));
                labelemail.setText(rs.getString("Email"));
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
               
             
             
             
             
             setVisible(true);
         }
         
         public void actionPerformed(ActionEvent ae){
             setVisible(false);
         }
         
         
         public static void main(String[] args){
             new ViewCustomer("ankit");
         }
}
