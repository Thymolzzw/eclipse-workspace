import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;


public class Form2 extends JFrame implements ActionListener 
{

	
	JTextField predicttext;
	JPanel jpanel1;
	JPanel jpanel2;
	JPanel jpanel3;
	JPanel jpanel4;
	JPanel jpanel5;
	JButton jbutton1;
	JButton jbutton2;
	JLabel jlabel;
	int true_value;
	
	Form2(String title)
	{
		
		predicttext= new JTextField(25);
		jpanel1=new JPanel();
		jpanel2=new JPanel();
		jpanel3=new JPanel();
		jpanel4=new JPanel();
		jpanel5 =new JPanel();
		jbutton1=new JButton("�õ�һ�������");
		jbutton2=new JButton("ȷ��");
		jlabel=new JLabel("�޷�����Ϣ");
		
		jpanel1.setLayout(new GridLayout(1,2));
		jpanel1.add(new Label("��ȡ[1,10)֮����������"));
		jpanel1.add(jbutton1);
		
		jpanel2.setLayout(new GridLayout(1,2));
		jpanel2.add(new Label("�������Ĳ²⣺"));
		jpanel2.add(predicttext);
		
		jpanel3.add(new Label("����ȷ����ť��"));
		jpanel3.add(jbutton2);
		
		jlabel.setForeground(Color.blue);
		jpanel4.add(jlabel);
		
		jpanel5.setLayout(new GridLayout(4,1));
		jpanel5.add(jpanel1);
		jpanel5.add(jpanel2);
		jpanel5.add(jpanel3);
		jpanel5.add(jpanel4);
		
		this.add(jpanel5);
		
		jbutton1.addActionListener(this);
		jbutton2.addActionListener(this);
		
		
		this.setLocation(200, 200);
		this.setTitle(title);
		this.setSize(700, 300);
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==jbutton1) 
		{
			true_value=(int)(Math.random()*10+1);
		}
		if(e.getSource()==jbutton2) 
		{
			if(predicttext.getText().equals("")) 
			{
				jlabel.setText("�޷�����Ϣ");
			}
			else 
			{
				if(Integer.parseInt(predicttext.getText())<true_value) 
				{
					jlabel.setText("��С��");
				}
				else if(Integer.parseInt(predicttext.getText())>true_value) 
				{
					jlabel.setText("�´���");
				}else 
				{
					jlabel.setText("�¶���");
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		Form2 f=new Form2("С��Ϸ");
	}
}






















