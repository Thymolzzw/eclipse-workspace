package myTest;

import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class Example10_2
{  
    public static void main(String args[])
    { 
      new FirstWindow("һ���򵥵Ĵ���");  
    }
}
class FirstWindow extends JFrame  
{  
	JMenuBar menubar;
    JMenu menu;
    JMenuItem item1,item2; 

    FirstWindow(String s) 
    {  
      setTitle(s);        
      setSize(160,170);
      setLocation(120,120);
      setVisible(true); 
              
      menubar=new JMenuBar();
 
      menu=new JMenu("�ļ�");
	  
  
      item1=new JMenuItem("��",new ImageIcon("open.gif"));
      
      item2=new JMenuItem("����",new ImageIcon("save.gif"));

      item1.setAccelerator(KeyStroke.getKeyStroke('O')); 
      item2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,InputEvent.CTRL_MASK)); 
        
      menu.add(item1);
      menu.addSeparator();
      menu.add(item2);

      menubar.add(menu);
      setJMenuBar(menubar);

      validate();
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    } 
}