import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;
class PoliceWindow extends JFrame implements ActionListener
{ 		
    JTextField titleText;
    JPasswordField passwordText; 
    PoliceWindow() 
    { 
      titleText=new JTextField(10);

      passwordText=new JPasswordField(10);
      passwordText.setEchoChar('*');

      titleText.addActionListener(this);
      passwordText.addActionListener(this);

      setLayout(new FlowLayout());
      add(titleText); 
      add(passwordText); 

      setBounds(100,100,150,150);
      setVisible(true);
      validate();
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) 
    {
    //  JTextField textSource=(JTextField)e.getSource();  
      if(e.getSource()==titleText)
       {
         this.setTitle(titleText.getText());
       }
      else if(e.getSource()==passwordText)
       {
         char c[]=passwordText.getPassword();
         titleText.setText(new String(c));
       }   
    }
}
public class Example10_9
{
    public static void main(String args[ ])
    { 
       PoliceWindow win=new PoliceWindow();
    }
}