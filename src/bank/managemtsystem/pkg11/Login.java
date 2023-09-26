
package bank.managemtsystem.pkg11;

import javax.swing.*;
import java.awt.*;
import static java.awt.Color.WHITE;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame  implements ActionListener{
    JButton Login,signUp, Clear; //global-variable
    JTextField cardTextField;
     JPasswordField pinTextField;
    Login(){
        setTitle("AUTOMATED TELLER MACHINE");
        setLayout(null);
        //logo
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel lable= new JLabel(i3);
        lable.setBounds(70,10,100,100);
        add(lable);
        
        //welcome statemt side of logo
        JLabel text= new JLabel("Wellcome to ATM");
        text.setFont(new Font("Osward",Font.BOLD,36));
        text.setBounds(200, 40, 400, 40);
        add(text);
        //cardno text and textfield
        JLabel CardNo= new JLabel("CARD NO:");
        CardNo.setFont(new Font("Raleway",Font.BOLD,28));
        CardNo.setBounds(120, 150, 150, 30);
        add(CardNo);
        
        cardTextField= new JTextField();
        cardTextField.setBounds(300, 150, 230, 30);
        cardTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(cardTextField);
        //pin text and textfield
        JLabel Pin= new JLabel("PIN:");
        Pin.setFont(new Font("Raleway",Font.BOLD,28));
        Pin.setBounds(120, 220, 250, 30);
        add(Pin);
        
        pinTextField= new JPasswordField();
        pinTextField.setBounds(300, 220, 230, 30);
        pinTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(pinTextField);
        
        //interface background 
        
        getContentPane().setBackground(WHITE);
         setSize(800,480);
         setVisible(true);
         setLocation(350,200);
        
         //buttons
         
          Login= new JButton("SIGN IN");
         Login.setBounds(300, 300, 100, 30);
         Login.setBackground(Color.BLACK);
         Login.setForeground(Color.WHITE);
         Login.addActionListener(this);
         add(Login);
         
          Clear= new JButton("CLEAR");
         Clear.setBounds(430, 300, 100, 30);
         Clear.setBackground(Color.BLACK);
         Clear.setForeground(Color.WHITE);
         Clear.addActionListener(this);
         add(Clear);
         
         signUp= new JButton("SIGN UP");
         signUp.setBounds(300, 350, 230, 30);
         signUp.setBackground(Color.BLACK);
         signUp.setForeground(Color.WHITE);
         signUp.addActionListener(this);
         add(signUp);
    }
   public void actionPerformed(ActionEvent ae){
        try{
            if(ae.getSource() == Clear){
           cardTextField.setText("");
           pinTextField.setText("");
       }else if(ae.getSource() == Login){
           conn con=new conn();
           String cardnumber=cardTextField.getText();
           String pinNumber=pinTextField.getText();
            
           String query="select * from login where cardnumber = '" +cardnumber+"' and pin= '" +pinNumber+"'";
          
              ResultSet rs= con.s.executeQuery(query);
              if(rs.next()){
                  setVisible(false);
                  new transaction( pinNumber).setVisible(true);
              }else{
                  JOptionPane.showMessageDialog(null, "Incorrect Card Number Or Pin");
              }
           
       }else if(ae.getSource() == signUp){
           setVisible(false);
           new  Signup1().setVisible(true);
       } 
       
        }catch(Exception e){
               System.out.println(e);
           }
   }
   }

