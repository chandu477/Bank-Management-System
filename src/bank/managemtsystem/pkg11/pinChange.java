
package bank.managemtsystem.pkg11;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class pinChange extends JFrame implements ActionListener {
    
     JPasswordField renewpin,newpin;
      JButton change,back;
    String pinNumber;
    
    
    pinChange(String pinNumber){
        this.pinNumber=pinNumber;
        setLayout(null);
         ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text= new JLabel("CHANGE YOUR PIN");
        text.setForeground(Color.WHITE);
        text.setFont(new Font ("System",Font.BOLD,16));
        text.setBounds(250,280,500,35);
        image.add(text);
        
         JLabel pintext= new JLabel("NEW PIN:");
        pintext.setForeground(Color.WHITE);
        pintext.setFont(new Font ("System",Font.BOLD,16));
        pintext.setBounds(165,320,180,25);
        image.add(pintext);
        
       newpin=new JPasswordField();
        newpin.setFont(new Font("raleway",Font.BOLD,25));
        newpin.setBounds(330,320,180,25);
        image.add(newpin);
        
        
         JLabel repintext= new JLabel(" RE-ENTER NEW PIN:");
        repintext.setForeground(Color.WHITE);
       repintext.setFont(new Font ("System",Font.BOLD,16));
        repintext.setBounds(160,360,180,25);
        image.add(repintext);
        
         renewpin=new JPasswordField();
        renewpin.setFont(new Font("raleway",Font.BOLD,25));
        renewpin.setBounds(330,360,180,25);
        
        image.add(renewpin);
        
        change =new JButton("CHANGE");
        change.setBounds(355,485,150,30);
        change.addActionListener(this);
        image.add(change);
        
      back =new JButton("BACK");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        image.add(back);
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
        
        
    }
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource()==change){
            
        
        
        try{
            String npin= newpin.getText();
             String rpin= renewpin.getText();
             
             if(!npin.equals(rpin)){
                 JOptionPane.showMessageDialog(null, "Entered Pin Does not Match");
                 return;
             
        }
             if(npin.equals("")){
                   JOptionPane.showMessageDialog(null, "Please Enter New Pin ");
                 return;
             }
             
             if(rpin.equals("")){
                   JOptionPane.showMessageDialog(null, "Please Re-Enter Pin ");
                 return;
             }
             conn conn= new conn();
             String query1= "update bank set pin = '"+rpin+"' where pin ='"+pinNumber+"'";
              String query2= "update login set pin = '"+rpin+"' where pin ='"+pinNumber+"'";
               String query3= "update signup3 set pin = '"+rpin+"' where pin ='"+pinNumber+"'";
               
               conn.s.executeUpdate(query1);
             conn.s.executeUpdate(query2);
             conn.s.executeUpdate(query3);
             
               JOptionPane.showMessageDialog(null, "Pin Changed Successfully ");
                
               setVisible(false);
               new transaction(rpin).setVisible(true);
               
        }catch(Exception e){
            System.out.println(e);
        }
        }else{
            setVisible(false);
            new transaction(pinNumber).setVisible(true);
        }
    }
}

   

