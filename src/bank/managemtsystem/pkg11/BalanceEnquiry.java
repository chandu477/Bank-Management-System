 
package bank.managemtsystem.pkg11;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class BalanceEnquiry extends JFrame implements ActionListener{
    
    JButton back;
    String pinnumber;
    BalanceEnquiry(String pinnumber){
        this.pinnumber= pinnumber;
        setLayout(null);
         ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        back= new JButton("BACK");
        back.setBounds(355,520,150,30 );
        back.addActionListener(this);
        image.add(back);
        
        
        
        

//            try{
//                ResultSet rs= c.s.executeQuery("Select * from bank where pin='"+pinnumber+"'");
//              
//                while(rs.next()){
//                    if(rs.getString("type").equals("deposit")){
//                        balance +=Integer.parseInt(rs.getString("amount"));
//                    }else{
//                        balance-=Integer.parseInt(rs.getString("amount"));
//                    }
//                }
//                
//            }
int  balance =0;
             try{
             conn c= new conn();
         
            ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
            while (rs.next()) {
                if (rs.getString("type").equals("deposit")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
            }catch(Exception e){}
              JLabel text= new JLabel("Your Current Account Balance is Rs :       "+  balance);
            text.setForeground(Color.WHITE);
            text.setBounds(170,300,400,30);
            image.add(text);
        
           setSize(900,900);
        setLocation(500,0);
       setUndecorated(true);
       
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new transaction(pinnumber).setVisible(true);
    }
}
