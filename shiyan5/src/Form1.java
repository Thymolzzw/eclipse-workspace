import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;


public class Form1 extends JFrame implements ActionListener 
{

	JTextField filepath;
	JTextField addtext;
	JPanel jpanel;
	JButton jbutton;
	JTextArea jtext;
	Form1(String title)
	{
		filepath= new JTextField(25);
		addtext= new JTextField(25);
		jpanel=new JPanel();
		jtext=new JTextArea();
		jbutton=new JButton("将文本区的内容写入文件");
		jpanel.setLayout(new GridLayout(3,2));
		jpanel.add(new JLabel("请输入文件路径和名称："));
		jpanel.add(filepath);
		jpanel.add(new JLabel("请输入需要追加的内容："));
		jpanel.add(addtext);
		jpanel.add(jbutton);
		add(BorderLayout.NORTH,jpanel);
		add(BorderLayout.CENTER,jtext);
		addtext.addActionListener(this);
		jbutton.addActionListener(this);
		setLocation(200, 200);
		setTitle(title);
		setSize(700, 300);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		
		if(e.getSource()==addtext) 
		{
			jtext.append("\r\n"+addtext.getText());
		}
		else if(e.getSource()==jbutton) 
		{
			try 
			{
				FileWriter writer =new FileWriter(new File(filepath.getText()));
				writer.write(jtext.getText().replaceAll("\n", "\r\n"));
			//	writer.write(jtext.getText());
				writer.close();
			}
			catch(IOException E) 
			{
				System.out.println(E);
			}
		}
	}
	public static void main(String[] args) 
	{
		Form1 f= new Form1("Hello");
	}
}






















