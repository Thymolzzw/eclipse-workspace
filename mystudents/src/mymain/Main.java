package mymain;
import mystudent.*;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		StuList list=new StuList(20);  //ѧ�����������20��ѧ��
		System.out.println("Ҫ������ٸ�ѧ������Ϣ��");
		int num=in.nextInt();
		for(int i=0;i<num;i++)
		{
			System.out.println("�������"+(i+1)+"λѧ����ѧ�ţ���������ѧ��������ɼ�");
			Student t=new Student(in.nextInt(),in.next(),in.nextDouble(),in.nextDouble()); //��һ�룬��ʱѧ������֮������пո��� ������
			list.addStu(t);
		}
		list.print();
	
		list.addStu(new Student(1321,"liu",90,60));
		list.addStu(new Student(1331,"guo",96,80));
		list.addStu(new Student(1326,"niu",80,90));
		list.removeStu(3);
		list.print();
		System.out.println("����ѧ�ɼ�����");
		list.sort(1);
		list.print();
		System.out.println("��������ɼ�����");
		list.sort(2);
		list.print();
	
		in.close(); //��һ�룬�����������ã�  �ر����������ͷ��ڴ�
	}
}

