
package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;


public class BookPackage extends JFrame implements ActionListener{
    
    
    Choice cpackage;
    JTextField tfperson;
    String username;
    JLabel labelusername,labelid, labelnumber, labelphn,  labelprice;
    JButton checkprice, bookpkg, back;
    BookPackage(String username){
        this.username = username;
        setBounds(350,200,1100,500);
        setLayout(null);
        
        
        JLabel text = new JLabel("BOOK PACKAGE");
             text.setBounds(100, 10, 200,30);
             text.setFont(new Font("tahoma",Font.BOLD,20));
             add(text);
             
         
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setFont(new Font("tahoma",Font.PLAIN,16));

             lblusername.setBounds(40, 70,100,20);
             add(lblusername);
             
              labelusername = new JLabel();
            labelusername.setFont(new Font("tahoma",Font.PLAIN,16));
            labelusername.setBounds(250, 70,100,20);
             add(labelusername);
             
              JLabel lblpackage = new JLabel("Select Package");
              lblpackage.setFont(new Font("tahoma",Font.PLAIN,16));
             lblpackage.setBounds(40,110, 150,20);
             add(lblpackage);
             
             cpackage =new Choice();
             cpackage.add("Gold Package");
             cpackage.add("Silver Package");
             cpackage.add("Bronze Package");
             cpackage.setBounds(250,110,200,20);
             add(cpackage);
             
             
             
             JLabel lblperson = new JLabel("Total Person");
             lblperson.setFont(new Font("tahoma",Font.PLAIN,16));
             lblperson.setBounds(40,150, 150,25);
             add(lblperson);
             
             
             tfperson = new JTextField("1");
             tfperson.setBounds(250,150,200, 25);
             add(tfperson);
             
              JLabel lblid = new JLabel("Id");
             lblid.setFont(new Font("tahoma",Font.PLAIN,16));
             lblid.setBounds(40,190, 150,20);
             add(lblid);
             
              labelid = new JLabel(); 
             labelid.setFont(new Font("tahoma",Font.PLAIN,16));
             labelid.setBounds(250,190,200,25);
             add(labelid);
             
             JLabel lblnumber = new JLabel("Number");
             lblnumber.setFont(new Font("tahoma",Font.PLAIN,16));
             lblnumber.setBounds(40,230, 150,25);
             add(lblnumber);
             
             labelnumber = new JLabel();
             labelnumber.setFont(new Font("tahoma",Font.PLAIN,16));
              
             labelnumber.setBounds(250,230,200,25);
             add(labelnumber);
             
             JLabel lblphn = new JLabel("Phone");
             lblphn.setFont(new Font("tahoma",Font.PLAIN,16));
             lblphn.setBounds(40,270, 150,20);
             add(lblphn);
             
             labelphn = new JLabel();
             labelphn.setFont(new Font("tahoma",Font.PLAIN,16));

             labelphn.setBounds(250,270, 200, 25);
             add(labelphn);
             
             JLabel lbltotal = new JLabel("Total Price");
             lbltotal.setFont(new Font("tahoma",Font.PLAIN,16));
             lbltotal.setBounds(40,330, 150,20);
             add(lbltotal);
             
             labelprice = new JLabel();
             labelprice.setFont(new Font("tahoma",Font.PLAIN,16));
             labelprice.setBounds(250,330, 200, 25);
             add(labelprice);
             
             checkprice =new JButton("Check price");
            checkprice.setBounds(60,380,120,25);
            checkprice.setBackground( Color.black);
            checkprice.setForeground(Color.WHITE);
            checkprice.setFont(new Font("Tahoma",Font.PLAIN,15));
           // checkprice.setMargin(new Insets(0,0,0,155));
           checkprice.addActionListener(this);
           add(checkprice );
             
           bookpkg =new JButton("Book Package");
            bookpkg.setBounds(200,380,120,25);
            bookpkg.setBackground(new Color(0,0,102));
            bookpkg.setForeground(Color.WHITE);
            bookpkg.setFont(new Font("Tahoma",Font.PLAIN,15));
           // bookpkg.setMargin(new Insets(0,0,0,155));
           bookpkg.addActionListener(this);

          add(bookpkg );
        
        
        
           back =new JButton("BACK");
            back.setBounds(340,380,120,25);
            back.setBackground( Color.black);
            back.setForeground(Color.WHITE);
            back.setFont(new Font("Tahoma",Font.PLAIN,15));
           // back.setMargin(new Insets(0,0,0,155));
             back.addActionListener(this);

           add(back );
           
             ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bookpackage.jpg"));
                Image i2 = i1.getImage().getScaledInstance(600,300, Image.SCALE_DEFAULT);
                ImageIcon i3 =new ImageIcon(i2);
                JLabel shree = new JLabel(i3);
                shree.setBounds(550,70,500,300);
                add(shree);
        
        
        
      
        
        
        
        
        
             try{
                   Conn c = new Conn();
                   String query = "select * from customer where username = '"+username+"' ";
                   ResultSet rs = c.s.executeQuery(query);
                   while(rs.next()){
                             labelusername.setText(rs.getString("username"));
                             labelid.setText(rs.getString("id"));
                             labelnumber.setText(rs.getString("number"));
                             labelphn.setText(rs.getString("phoneno"));
              
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }

             
             setVisible(true);
             
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == checkprice){
            
            String pack = cpackage.getSelectedItem();
            
            int cost = 0;
            
            if(pack.equals("Gold Package")){
                cost += 12000;
            }else if(pack.equals("Silver Package")){
                cost += 25000;
            } else {
                cost += 32000;
            }
            
            int persons = Integer.parseInt(tfperson.getText());
            cost *= persons;
            
            labelprice.setText("Rs " +cost);
            
            
            
        } else if(ae.getSource() == bookpkg){
            
            try{
                Conn c = new Conn();
                c.s.executeUpdate("insert into Bookpackage values('"+labelusername.getText()+"', '"+cpackage.getSelectedItem()+"', '"+tfperson.getText()+"', '"+labelid.getText()+"',  '"+labelnumber.getText()+"', '"+labelphn.getText()+"',  '"+labelprice.getText()+"')" );
                JOptionPane.showMessageDialog(null, "Package Booked Successfully");
                setVisible(false);
                               
            }catch(Exception e){
                e.printStackTrace();
            }
            
            
            
        }else {
            setVisible(false);
        }
    }
    
    
    
    public static void main(String[] args){
        
        new BookPackage("ankit");
    }
    
}
