
package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author ankit
 */
public  class Dashboard extends JFrame implements ActionListener{
       String username;
       JButton addPersonalDetails,payments, calculator,about, ViewPersonalDetails,viewbookedhotel, updatePersonalDetails, viewPackages, checkPackages, bookPackages, viewhotel, destinations, bookhotel;
        Dashboard(String username){
            this.username = username;
        //1 setBounds(0,0,1600,1000);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0, 102));
        p1.setBounds(0, 0, 1600, 65);
        add(p1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70,70, Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(5, 0, 70, 70);
        p1.add(icon);
        
        JLabel heading = new JLabel("Dashboard");
         heading.setBounds(80,10,300,40);
         heading.setForeground(Color.WHITE);
         heading.setFont(new Font("Tahoma",Font.BOLD,30)); 
         p1.add(heading);
         
         
                 
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0, 102));
        p2.setBounds(0,65,300,900);
        add(p2);
        
        addPersonalDetails =new JButton("Add Personal Details");
        addPersonalDetails.setBounds(0,0,300,50);
        addPersonalDetails.setBackground(new Color(0,0,102));
        addPersonalDetails.setForeground(Color.WHITE);
        addPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        addPersonalDetails.setMargin(new Insets(0,0,0,60));
        addPersonalDetails.addActionListener(this);
        p2.add(addPersonalDetails);
        
         updatePersonalDetails =new JButton("Update Personal Details");
        updatePersonalDetails.setBounds(0,50,300,50);
        updatePersonalDetails.setBackground(new Color(0,0,102));
        updatePersonalDetails.setForeground(Color.WHITE);
        updatePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        updatePersonalDetails.setMargin(new Insets(0,0,0,40));
                updatePersonalDetails.addActionListener(this);

        p2.add(updatePersonalDetails);

 

        ViewPersonalDetails =new JButton("View Personal Details");
        ViewPersonalDetails.setBounds(0,100,300,50);
        ViewPersonalDetails.setBackground(new Color(0,0,102));
        ViewPersonalDetails.setForeground(Color.WHITE);
        ViewPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        ViewPersonalDetails.setMargin(new Insets(0,0,0,60));
                ViewPersonalDetails.addActionListener(this);

        p2.add(ViewPersonalDetails);

        JButton DeletePersonalDetails =new JButton("Delete Personal Details");
        DeletePersonalDetails.setBounds(0,150,300,50);
        DeletePersonalDetails.setBackground(new Color(0,0,102));
        DeletePersonalDetails.setForeground(Color.WHITE);
        DeletePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        DeletePersonalDetails.setMargin(new Insets(0,0,0,50));
        DeletePersonalDetails.addActionListener(this);

        p2.add(DeletePersonalDetails);
       
         checkPackages =new JButton("Check Packages");
        checkPackages.setBounds(0,200,300,50);
        checkPackages.setBackground(new Color(0,0,102));
        checkPackages.setForeground(Color.WHITE);
        checkPackages.setFont(new Font("Tahoma",Font.PLAIN,20));
        checkPackages.setMargin(new Insets(0,0,0,110));
        checkPackages.addActionListener(this);
        p2.add(checkPackages);
        
        
         bookPackages =new JButton("Book Packages");
        bookPackages.setBounds(0,250,300,50);
        bookPackages.setBackground(new Color(0,0,102));
        bookPackages.setForeground(Color.WHITE);
        bookPackages.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookPackages.setMargin(new Insets(0,0,0,110));
        bookPackages.addActionListener(this);
        p2.add(bookPackages);
        
         viewPackages =new JButton("View Packages");
        viewPackages.setBounds(0,300,300,50);
        viewPackages.setBackground(new Color(0,0,102));
        viewPackages.setForeground(Color.WHITE);
        viewPackages.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewPackages.setMargin(new Insets(0,0,0,110));
        viewPackages.addActionListener(this);

        p2.add(viewPackages);
        
         bookhotel =new JButton("Book Hotel");
        bookhotel.setBounds(0,350,300,50);
        bookhotel.setBackground(new Color(0,0,102));
        bookhotel.setForeground(Color.WHITE);
        bookhotel.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookhotel.setMargin(new Insets(0,0,0,140));
                bookhotel.addActionListener(this);

        p2.add(bookhotel);
        
         viewhotel =new JButton(" View Hotels ");
        viewhotel.setBounds(0,400,300,50);
        viewhotel.setBackground(new Color(0,0,102));
        viewhotel.setForeground(Color.WHITE);
        viewhotel.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewhotel.setMargin(new Insets(0,0,0,140));
         viewhotel.addActionListener(this);

        p2.add(viewhotel );
        
        viewbookedhotel =new JButton("  View Booked Hotel ");
        viewbookedhotel.setBounds(0,450,300,50);
        viewbookedhotel.setBackground(new Color(0,0,102));
        viewbookedhotel.setForeground(Color.WHITE);
        viewbookedhotel.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewbookedhotel.setMargin(new Insets(0,0,0,77));
         viewbookedhotel.addActionListener(this);

        p2.add(viewbookedhotel );
        
         destinations =new JButton("Destinations");
        destinations.setBounds(0,500,300,50);
        destinations.setBackground(new Color(0,0,102));
        destinations.setForeground(Color.WHITE);
        destinations.setFont(new Font("Tahoma",Font.PLAIN,20));
        destinations.setMargin(new Insets(0,0,0,130));
        destinations.addActionListener(this);

        p2.add(destinations );
        
         payments =new JButton("Payments");
        payments.setBounds(0,550,300,50);
        payments.setBackground(new Color(0,0,102));
        payments.setForeground(Color.WHITE);
        payments.setFont(new Font("Tahoma",Font.PLAIN,20));
        payments.setMargin(new Insets(0,0,0,155));
                payments.addActionListener(this);

        p2.add(payments );
        
         calculator =new JButton("Calculator");
        calculator.setBounds(0,600,300,50);
        calculator.setBackground(new Color(0,0,102));
        calculator.setForeground(Color.WHITE);
        calculator.setFont(new Font("Tahoma",Font.PLAIN,20));
        calculator.setMargin(new Insets(0,0,0,155));
        calculator.addActionListener(this);

        p2.add(calculator );
        
         about =new JButton("About");
        about.setBounds(0,650,300,50);
        about.setBackground(new Color(0,0,102));
        about.setForeground(Color.WHITE);
        about.setFont(new Font("Tahoma",Font.PLAIN,20));
        about.setMargin(new Insets(0,0,0,170));
        about.addActionListener(this);
                                                                    
        p2.add(about );
        
         ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650,1000, Image.SCALE_DEFAULT);
        ImageIcon i6 =new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(0, 0, 1650, 1000);
        add(image);
        
        JLabel text = new JLabel("Travel and Tourism Management System");
        text.setBounds(400,70,1200,70);
         text.setForeground(Color.black);
         text.setFont(new Font("Raleway",Font.BOLD,55));
         image.add(text);

         
        
        setVisible(true);
        
        }
        
        public void actionPerformed(ActionEvent ae){
            if( ae.getSource() == addPersonalDetails ){
                new AddCustomer(username);
            }else if(ae.getSource() == ViewPersonalDetails){
                new ViewCustomer(username);
            }else if(ae.getSource() == updatePersonalDetails){
                new UpdateCustomer(username);
            }else if(ae.getSource()== viewPackages){
                 new ViewPackage(username);
            }else if (ae.getSource() == checkPackages){
               new CheckPackage();
            }else if(ae.getSource()== bookPackages){
                 new BookPackage(username);
            }else if(ae.getSource()== viewhotel){
                 new CheckHotels();
            }else if(ae.getSource()== destinations){
                 new Destinations();
            }else if(ae.getSource()== bookhotel){
                 new BookHotel(username);
            }else if(ae.getSource()== viewbookedhotel){
                 new ViewBookedHotel(username);
            }else if(ae.getSource()== payments){
                 new Payment();
            }else if(ae.getSource()== calculator){
                 try{
                     Runtime.getRuntime().exec("calc.exe");
                 }catch (Exception e){
                     e.printStackTrace();
                 }
            }else if(ae.getSource()== about){
                 new About();
            }
        }
    
    public static void main(String[] args){
        new Dashboard("");
      
    }

   

   
}