import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class TestJScrollPane extends JFrame implements ActionListener
{
	JPasswordField pp;
	JTextArea ppp;
    TestJScrollPane()
   {
	JPanel p = new JPanel();

	for(int i=0; i<30; i++)
       {
	   p.add(new JButton("°´Å¥" + (i+1)));
       }

//	JScrollPane scrollPane = new JScrollPane(p);
	pp=new JPasswordField(10);
	pp.setEchoChar('#');
	pp.addActionListener(this);
	ppp=new JTextArea();
	JSplitPane jsp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,pp,ppp);
	jsp.setDividerLocation(70);
	add(new JLabel("111"),BorderLayout.NORTH);
	add(new JLabel("111"),BorderLayout.SOUTH);
	add(new JLabel("111"),BorderLayout.WEST);
	add(new JLabel("111"),BorderLayout.EAST);
	add(jsp, BorderLayout.CENTER);

	
	setTitle("JScrollPaneÖÐ¼äÈÝÆ÷");
	setLocation(200, 200);
	setSize(750, 300);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
    
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== pp) {
			ppp.setText(new String(pp.getPassword()));
		}
		
	}
    public static void main(String[] args)
   {
	new TestJScrollPane();
   }
	
}