/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.managemtsystem.pkg11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;
public class fastcash extends JFrame implements ActionListener {
    
   JButton r1,r2,r3,r4,r5,r6,back;
   String  pinNumber;
    fastcash(String  pinNumber){
        this.pinNumber=pinNumber;
        setLayout(null);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text= new JLabel("Select withdrawl amount");
        text.setBounds(210,300,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text); 
        
        
        r1 = new JButton("RS 100");
        r1.setBounds(170,415,150,30);
        r1.addActionListener(this);
        image.add(r1);
        
        r2 = new JButton("RS 500");
        r2.setBounds(355,415,150,30);
        r2.addActionListener(this);
        image.add(r2);
        
       r3 = new JButton("RS 1000");
       r3.setBounds(170,450,150,30);
         r3.addActionListener(this);
        image.add(r3);
        
         r4 = new JButton("RS 2000");
          r4.setBounds(355,450,150,30);
         r4.addActionListener(this);
        image.add(  r4);
        
        r5 = new JButton("RS 5000");
       r5.setBounds(170,485,150,30);
         r5.addActionListener(this);
        image.add( r5);
        
     r6= new JButton("RS 10000");
     r6 .setBounds(355,485,150,30);
       r6.addActionListener(this);
        image.add( r6);
        
       back = new JButton("Back");
        back .setBounds(355,520,150,30);
         back.addActionListener(this);
        image.add(  back);
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
        
       
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==back){
            setVisible(false);
            new transaction(pinNumber).setVisible(true);
        }else{
            String amount = ((JButton)ae.getSource()).getText().substring(3);
            conn c= new conn();
            try{
                ResultSet rs= c.s.executeQuery("Select * from bank where pin='"+pinNumber+"'");
                int balance =0;
                while(rs.next()){
                    if(rs.getString("type").equals("deposit")){
                        balance +=Math.abs(Integer.parseInt(rs.getString("amount")));
                    }else{
                        balance -=(Integer.parseInt(rs.getString("amount")));
                    }
                }
                System.out.println(balance);
                if(ae.getSource()!= back && balance <Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return;
                }else{
                     Date date= new Date();
                String query= "insert into bank values('"+pinNumber+"','"+date+"','withdrawl','"+amount+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"RS"+amount +"Debited Sucessfully");
                
                setVisible(false);
                new transaction(pinNumber).setVisible(true);
                }
                       
                
                
            
            
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
