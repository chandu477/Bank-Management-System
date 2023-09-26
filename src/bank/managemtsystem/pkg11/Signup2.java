

package bank.managemtsystem.pkg11;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public  class Signup2 extends JFrame implements ActionListener{
    
   
    JTextField aadharTextField, panTextField;
    JButton next;
    JRadioButton eyes,eno,syes,sno;
    String formno;
    JComboBox religion,catogery,income,education,occupation;
    
    Signup2(String formno){
        this.formno=formno;
       setLayout((null));
        
        setTitle("NEW ACCOUNT APPLICATION FORM--2");
        
 
       JLabel additionalDetails =new JLabel("Page no:2 Additional Details");
       additionalDetails.setFont(new Font("Raleway",Font.BOLD,20));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
        
         JLabel rEligion =new JLabel("Religion:");
        rEligion.setFont(new Font("Raleway",Font.BOLD,20));
        rEligion.setBounds(100,140,100,30);
        add(rEligion);
        
         String valReligion[]={"Hindu"," Muslim"," Sikh","Christian","Other"};
         religion=new JComboBox (valReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        
        JLabel cAtogery =new JLabel("Category:");
       cAtogery.setFont(new Font("Raleway",Font.BOLD,20));
      cAtogery.setBounds(100,190,200,30);
        add( cAtogery);
        
       
        
         String valcatogery[]={"General","OBC","SC","ST","Other"};
         catogery=new JComboBox (valcatogery);
        catogery.setFont(new Font("Raleway",Font.BOLD,14));
        catogery.setBounds(300, 190, 400, 30);
         catogery.setBackground(Color.WHITE);
         add(catogery);
         
       
        
         JLabel iNcome =new JLabel("Income:");
        iNcome.setFont(new Font("Raleway",Font.BOLD,20));
        iNcome.setBounds(100,240,200,30);
        add( iNcome);
        
        
         String valIncome[]={"NULL","< 1,50,000","< 2,50,000","< 5,00,000"," UPTO 10,00,000"};
      income=new JComboBox (valIncome);
      income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);
         
        
        JLabel eDucation =new JLabel("Educational");
        eDucation.setFont(new Font("Raleway",Font.BOLD,20));
        eDucation.setBounds(100,290,200,30);
        add( eDucation);
        
    JLabel qualification =new JLabel("Qualification:");
       qualification .setFont(new Font("Raleway",Font.BOLD,20));
       qualification .setBounds(100,315,200,30);
        add( qualification );
        
        String valeducation[]={"Non-Graduation","Graduate","Post_Graduation","Doctrate"," others"};
        education=new JComboBox (valeducation);
      education.setBounds(300, 315, 400, 30);
        education.setBackground(Color.WHITE);
        add(education);
        
      
        
        JLabel Occupation =new JLabel("Occupation:");
        Occupation.setFont(new Font("Raleway",Font.BOLD,20));
        Occupation.setBounds(100,390,200,30);
        add( Occupation);
        
         String valoccupation[]={"Salaried","Self-Employed","Bussiness","Student","retired"};
       occupation=new JComboBox (valoccupation);
     occupation.setBounds(300, 390, 400, 30);
      occupation.setBackground(Color.WHITE);
        add(occupation);
        
        
         JLabel pan=new JLabel("Pan Number:");
        pan.setFont(new Font("Raleway",Font.BOLD,20));
        pan.setBounds(100,490,200,30);
        add(  pan);
        
         panTextField= new JTextField();
         panTextField.setFont(new Font("Raleway",Font.BOLD,14));
          panTextField.setBounds(300, 490, 400, 30);
        add(  panTextField);
        
         JLabel aadhar =new JLabel("Aadhar no:");
        aadhar.setFont(new Font("Raleway",Font.BOLD,20));
        aadhar.setBounds(100,540,200,30);
        add( aadhar);
        
        aadharTextField= new JTextField();
       aadharTextField.setFont(new Font("Raleway",Font.BOLD,14));
        aadharTextField.setBounds(300, 540, 400, 30);
        add(aadharTextField);
        
          JLabel pincode =new JLabel("Senior Citizen:");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,440,200,30);
        add( pincode);
        
          syes= new JRadioButton("YES");  //radio button
        syes.setBounds(300, 440, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
         sno= new JRadioButton("NO");
        sno.setBounds(450, 440, 100, 30);
         sno.setBackground(Color.WHITE);
        add(sno);
        
       ButtonGroup seniorcitizengroup= new ButtonGroup();//responsible for only selecting one value among male and female
        seniorcitizengroup.add(syes );
         seniorcitizengroup.add(sno);
         
          

        
        JLabel eaccount=new JLabel("Existing Account:");
        eaccount.setFont(new Font("Raleway",Font.BOLD,20));
        eaccount.setBounds(100,590,200,30);
        add( eaccount);
        
         eyes= new JRadioButton("YES");  //radio button
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
         eno= new JRadioButton("NO");
        eno.setBounds(450, 590, 100, 30);
         eno.setBackground(Color.WHITE);
        add(eno);
        
       ButtonGroup existingaccount= new ButtonGroup();//responsible for only selecting one value among male and female
        existingaccount.add(eyes );
        existingaccount.add(eno);
        
        
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
       //  JComboBox religion,catogery,income,education,occupation;
    
       String sreligion =(String)religion.getSelectedItem();    
        String scatogery = (String)catogery.getSelectedItem();
         String sincome = (String)income.getSelectedItem();  
          String seducation = (String)education.getSelectedItem();  
          String soccupation = (String)occupation.getSelectedItem(); 
          
         //    JRadioButton eyes,eno,syes,sno;
        
       String seniorCitizen=null;
     if(syes.isSelected()){
         seniorCitizen ="YES";
   }else if(sno.isSelected()){
         seniorCitizen="NO";
      }
       
     String existingAccount=null;
     if(eyes.isSelected()){
         existingAccount ="YES";
   }else if(eno.isSelected()){
         existingAccount="NO";
      }
         // JTextField aadharTextField, panTextField;
       
        
           String span =panTextField.getText(); 
           
            String saddhar = aadharTextField.getText();  
       
            
             
          try{
            
        
               
                   conn c= new conn();
                   String query="insert into signup2 values ('" +formno+"','" + sreligion+"','" + scatogery+"','" +sincome+"','" +seducation+"','" +soccupation+"','" +seniorCitizen +"','" +existingAccount+"','" +span+"','" +saddhar+"')";
                    c.s.executeUpdate(query);
               
                    setVisible(false);
                    new Signup3(formno).setVisible(true);
           }catch(Exception e){
               System.out.println(e);
           }
   }


}

   

   