

package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;


public class BookHotel extends JFrame implements ActionListener{
    
    
    Choice chotel, cac,  cfood;

    public BookHotel() throws HeadlessException {
    }
    JTextField tfdays,tfperson;
    String username;
    JLabel labelusername,labelid, labelnumber, labelphn,  labelprice;
    JButton checkprice, bookpkg, back;
    
    
    
    BookHotel (String username) {
        this.username = username;
        setBounds(350,200,1100,600);
        setLayout(null);
        
        
        JLabel text = new JLabel("BOOK HOTEL");
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
             
              JLabel lblpackage = new JLabel("Select HOTEL");
              lblpackage.setFont(new Font("tahoma",Font.PLAIN,16));
             lblpackage.setBounds(40,110, 150,20);
             add(lblpackage);
             
             chotel =new Choice();
         
             chotel.setBounds(250,110,200,20);
             
             add(chotel);
             
             try{
                 Conn c = new Conn();
                 ResultSet rs = c.s.executeQuery("select * from hotel");
                 while(rs.next()){
                    chotel.add(rs.getString("name"));   
                 }
             }catch(Exception e){
                 e.printStackTrace();
             }
             
             
             
             
             JLabel lblperson = new JLabel("Total Person");
             lblperson.setFont(new Font("tahoma",Font.PLAIN,16));
             lblperson.setBounds(40,150, 150,25);
             add(lblperson);
             
             
             tfperson = new JTextField("1");
             tfperson.setBounds(250,150,200, 25);
             add(tfperson);
             
             JLabel lbldays = new JLabel("No. of Days");
             lbldays.setFont(new Font("tahoma",Font.PLAIN,16));
             lbldays.setBounds(40,190, 150,25);
             add(lbldays);
             
             
             tfdays = new JTextField("1");
             tfdays.setBounds(250,190,200, 25);
             add(tfdays);
             
             JLabel lblac = new JLabel("Non AC/ AC");
             lblac.setFont(new Font("tahoma",Font.PLAIN,16));
             lblac.setBounds(40,230, 150,25);
             add(lblac);
             
             
             cac =new Choice();
             cac.add("AC");
             cac.add("Non-AC");
             cac.setBounds(250,230,200,20);
             
             add(cac);
             
             
             
               JLabel lblfood = new JLabel("Food Included");
             lblfood.setFont(new Font("tahoma",Font.PLAIN,16));
             lblfood.setBounds(40,270, 150,25);
             add(lblfood);
             
             
             cfood =new Choice();
             cfood.add("YES");
             cfood.add("No");
             cfood.setBounds(250,270,200,20);
             
             add(cfood);
             
             
              JLabel lblid = new JLabel("Id");
             lblid.setFont(new Font("tahoma",Font.PLAIN,16));
             lblid.setBounds(40,310, 150,20);
             add(lblid);
             
              labelid = new JLabel(); 
             labelid.setFont(new Font("tahoma",Font.PLAIN,16));
             labelid.setBounds(250,310,200,25);
             add(labelid);
             
             JLabel lblnumber = new JLabel("Number");
             lblnumber.setFont(new Font("tahoma",Font.PLAIN,16));
             lblnumber.setBounds(40,350, 150,25);
             add(lblnumber);
             
             labelnumber = new JLabel();
             labelnumber.setFont(new Font("tahoma",Font.PLAIN,16));
              
             labelnumber.setBounds(250,350,200,25);
             add(labelnumber);
             
             JLabel lblphn = new JLabel("Phone");
             lblphn.setFont(new Font("tahoma",Font.PLAIN,16));
             lblphn.setBounds(40,390, 150,20);
             add(lblphn);
             
             labelphn = new JLabel();
             labelphn.setFont(new Font("tahoma",Font.PLAIN,16));

             labelphn.setBounds(250,390, 200, 25);
             add(labelphn);
             
             JLabel lbltotal = new JLabel("Total Price");
             lbltotal.setFont(new Font("tahoma",Font.PLAIN,16));
             lbltotal.setBounds(40,430, 150,20);
             add(lbltotal);
             
             labelprice = new JLabel();
             labelprice.setFont(new Font("tahoma",Font.PLAIN,16));
             labelprice.setBounds(250,430, 200, 25);
             add(labelprice);
            
        
        
        

           
             ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/book.jpg"));
                Image i2 = i1.getImage().getScaledInstance(600,300, Image.SCALE_DEFAULT);
                ImageIcon i3 =new ImageIcon(i2);
                JLabel shree = new JLabel(i3);
                shree.setBounds(500,50,600,300);
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
             
             
             
                 checkprice =new JButton("Check price");
            checkprice.setBounds(60,490,120,25);
            checkprice.setBackground( Color.black);
            checkprice.setForeground(Color.WHITE);
            checkprice.setFont(new Font("Tahoma",Font.PLAIN,15));
           // checkprice.setMargin(new Insets(0,0,0,155));
           checkprice.addActionListener(this);
           add(checkprice );
             
           bookpkg =new JButton("Book Hotel");
            bookpkg.setBounds(200,490,120,25);
            bookpkg.setBackground(new Color(0,0,102));
            bookpkg.setForeground(Color.WHITE);
            bookpkg.setFont(new Font("Tahoma",Font.PLAIN,15));
           // bookpkg.setMargin(new Insets(0,0,0,155));
           bookpkg.addActionListener(this);

          add(bookpkg );
        
        
        
           back =new JButton("BACK");
            back.setBounds(340,490,120,25);
            back.setBackground( Color.black);
            back.setForeground(Color.WHITE);
            back.setFont(new Font("Tahoma",Font.PLAIN,15));
           // back.setMargin(new Insets(0,0,0,155));
             back.addActionListener(this);

           add(back );
           

             
             setVisible(true);
             
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == checkprice){
            try{
                Conn c = new Conn();
                ResultSet  rs = c.s.executeQuery("select * from hotel where name = '"+chotel.getSelectedItem()+"' ");
                while(rs.next()){
                    int cost = Integer.parseInt(rs.getString("costperperson"));
                     int food = Integer.parseInt(rs.getString("foodIncluded"));
                    int ac = Integer.parseInt(rs.getString("acroom"));

                    int person = Integer.parseInt(tfperson.getText());
                    int days = Integer.parseInt(tfdays.getText());
                    
                    String acselected =cac.getSelectedItem();
                    String foodselected =cfood.getSelectedItem();
                    
                    if(person * days > 0){
                        int total =0;
                        total += acselected.equals("AC") ? ac : 0; 
                        total += foodselected.equals("Yes") ? food : 0;
                        total += cost;
                        total = total * person  * days;
                        labelprice.setText("Rs."+total);
                    }else {
                         JOptionPane.showMessageDialog(null,"please enter a valid number");
                    
                    }

                    

                }

                
                
                
                

        }catch(Exception e){
                e.printStackTrace();
                } 
            
        } else if(ae.getSource() == bookpkg){
            
            try{
                Conn c = new Conn();
                c.s.executeUpdate("insert into Bookhotel values('"+labelusername.getText()+"', '"+chotel.getSelectedItem()+"', '"+tfperson.getText()+"','"+tfdays.getText()+"', '"+cac.getSelectedItem()+"','"+cfood.getSelectedItem()+"' ,'"+labelid.getText()+"',  '"+labelnumber.getText()+"', '"+labelphn.getText()+"',  '"+labelprice.getText()+"')" );
                JOptionPane.showMessageDialog(null, "Hotel Booked Successfully");
                setVisible(false);
                               
            }catch(Exception e){
                e.printStackTrace();
            }
            
            
            
        }else {
            setVisible(false);
        }
    }
    
    
    
    public static void main(String[] args){
        
        new BookHotel("ankit");
    }
    
}

