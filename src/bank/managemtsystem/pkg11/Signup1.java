
package bank.managemtsystem.pkg11;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java .util.*;

import java.awt.event.*;
import com.toedter.calendar.JDateChooser();


public  class Signup1 extends JFrame implements ActionListener{
    long random;
   
    JTextField nameTextField,fnameTextField,emailTextField,addressTextField,cityTextField,stateTextField,pincodeTextField;
    JButton next;
    JRadioButton male,female,other,married,unmarried;
    JDateChooser dateChoser;
    Signup1(){
        
       setLayout((null));
        Random ran = new Random(); 
        random=Math.abs((ran.nextLong()%9000L +1000L));
        
        
        JLabel Formno =new JLabel("APPLICATION FORM NO. "+ random);
       Formno.setFont(new Font("Raleway",Font.BOLD,38));
        Formno.setBounds(140,20,600,40);
        add(Formno);
        
        JLabel personalDetails =new JLabel("Page no:1 Personal Details");
       personalDetails.setFont(new Font("Raleway",Font.BOLD,20));
        personalDetails.setBounds(290,80,400,30);
        add(personalDetails);
        
         JLabel name =new JLabel("NAME:");
        name.setFont(new Font("Raleway",Font.BOLD,20));
         name.setBounds(100,140,100,30);
        add( name);
        
        
         nameTextField= new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        nameTextField.setBounds(300, 140, 400, 30);
        add(nameTextField);
        
        
         JLabel fname =new JLabel("FATHER'S NAME:");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
         fname.setBounds(100,190,200,30);
        add( fname);
        
         fnameTextField= new JTextField();
        fnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        fnameTextField.setBounds(300, 190, 400, 30);
        add(fnameTextField);
        
         JLabel dob =new JLabel("Date Of Birth:");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
         dob.setBounds(100,240,200,30);
        add( dob);
        
        dateChoser = new JDateChooser();  //callender formate
        dateChoser.setBounds(300, 240, 400, 30);
        dateChoser.setForeground(Color.BLACK);
        add(dateChoser);
        
        JLabel gender =new JLabel("Gender:");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add( gender);
        
         male= new JRadioButton("Male");  //radio button
        male.setBounds(300, 290, 60, 30);
        male.setBackground(Color.WHITE);
        add(male);
        
         female= new JRadioButton("female");
        female.setBounds(450, 290, 70, 30);
         female.setBackground(Color.WHITE);
        add(female);
        
        ButtonGroup gendergroup= new ButtonGroup();//responsible for only selecting one value among male and female
        gendergroup.add(male);
         gendergroup.add(female);

        
        JLabel email =new JLabel("Email Address:");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add( email);
        
        emailTextField= new JTextField();
        emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
        emailTextField.setBounds(300, 340, 400, 30);
        add(emailTextField);
        
        JLabel marital =new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add( marital);
        
         married= new JRadioButton("married");  //radio button
        married.setBounds(300, 390, 100, 30);
        married.setBackground(Color.WHITE);
        add(married);
        
         unmarried= new JRadioButton("unmarried");
        unmarried.setBounds(450, 390, 100, 30);
         unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        other= new JRadioButton("other");
        other.setBounds(630, 390, 100, 30);
         other.setBackground(Color.WHITE);
        add(other);
        
        
        ButtonGroup maritalgroup= new ButtonGroup();//responsible for only selecting one value among male and female
        maritalgroup.add(married );
         maritalgroup.add(unmarried);
          maritalgroup.add(other);
        
        JLabel address =new JLabel("Address:");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add( address);
        
        addressTextField= new JTextField();
        addressTextField.setFont(new Font("Raleway",Font.BOLD,14));
        addressTextField.setBounds(300, 440, 400, 30);
        add(addressTextField);
        
         JLabel city =new JLabel("CITY:");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add( city);
        
        cityTextField= new JTextField();
        cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
        cityTextField.setBounds(300, 490, 400, 30);
        add(cityTextField);
        
         JLabel state =new JLabel("STATE:");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add( state);
        
       stateTextField= new JTextField();
        stateTextField.setFont(new Font("Raleway",Font.BOLD,14));
        stateTextField.setBounds(300, 540, 400, 30);
        add(stateTextField);
        
        JLabel pincode =new JLabel("PINCODE:");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add( pincode);
        
         pincodeTextField= new JTextField();
        pincodeTextField.setFont(new Font("Raleway",Font.BOLD,14));
        pincodeTextField.setBounds(300, 590, 400, 30);
        add(pincodeTextField);
        
      next= new JButton("NEXT");
       next.setBackground(Color.BLACK);
       next.setForeground(Color.WHITE);
       next.setFont(new Font("Raleway",Font.BOLD,14));
       next.setBounds(620, 660, 80, 30);
       
           next.addActionListener(this);
       add(next);
       
     getContentPane().setBackground(Color.WHITE);
    setSize(850,800);
    setLocation(350,10);
    setVisible(true);
}
   

    public void actionPerformed(ActionEvent ae){
        String formno="" +random;
        String name = nameTextField.getText();    
         String fname = fnameTextField.getText();    
         String dob = ((JTextField)dateChoser.getDateEditor().getUiComponent()).getText(); 
         String gender=null;
         if(male.isSelected()){
             gender="Male";
         }else if(female.isSelected()){
             gender="Female";
         }
          String email = emailTextField.getText();  
         
          String marital=null;
         if(married.isSelected()){
             marital="Married";
         }else if(unmarried.isSelected()){
             marital="Unmarried";
         }else if(other.isSelected()){
             marital="Other";
         }
           String address = addressTextField.getText();  
           
            String city =cityTextField.getText(); 
            
             String state = stateTextField.getText();  
             String pincode=pincodeTextField.getText();
             
             
          try{
             if(name.equals("")){
                     JOptionPane.showMessageDialog(null,"Name is required");
                 }
          
                  else{
                     conn c= new conn();
                     String query="insert into signup values ('" +formno+"','" +name+"','" +fname+"','" +dob+"','" +gender+"','" +email+"','" +marital+"','" +address+"','" +city+"','" +pincode+"','" +state+"')";
                     c.s.executeUpdate(query);
                     
                     setVisible(false);
                     new Signup2(formno).setVisible(true);
                     
                     
                 }
             }catch(Exception e){
                 System.out.println(e);
             }
    }

 

 
}

   

   
