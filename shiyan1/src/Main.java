import mypeople.*;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		StuList list=new StuList(20);  //ѧ�������������20��ѧ��
		int num;  //ʵ�������ѧ����Ϣ
		System.out.println("Ҫ������������Ϣ�����о�����Ϣ��\nA.������\tB.�о���");
		switch(in.next().toCharArray()[0])
		{
			case 'A':
			case 'a':
				System.out.println("����Ҫ������ٸ�����������Ϣ��");
				num=in.nextInt();
				for(int i=0;i<num;i++)
				{
					System.out.println("�������"+(i+1)+"λѧ����ѧ�ţ���������ѧ��������ɼ�");
					list.addStu(new Undergraduate(in.nextInt(),in.next(),in.nextDouble(),in.nextDouble()));
				}
				list.print();
				list.addStu(new Undergraduate(1312,"shgd",99,98.5));
				list.addStu(new Undergraduate(1316,"ddsa",89,88.5));
				list.print();
				break;
			case 'B':
			case 'b':
				System.out.println("����Ҫ������ٸ��о�������Ϣ��");
				num=in.nextInt();
				for(int i=0;i<num;i++)
				{
					System.out.println("�������"+(i+1)+"λѧ����ѧ�ţ���������ѧ��������ɼ�����ʦ���о������Կո����");
					list.addStu(new Postgraduate(in.nextInt(),in.next(),in.nextDouble(),in.nextDouble(),in.next(),in.next()));
				}
				list.print();
				list.addStu(new Postgraduate(1312,"shgd",99,98.5,"xyy","os"));
				list.addStu(new Postgraduate(1316,"ddsa",89,88.5,"wcl","rgzn"));
				list.print();
				break;
			default:
				System.out.println("������󣡣���");
				break;
		}
		
		in.close();
		
		list.removeStu(2);
		list.print();
		list.sort(1);
		list.print();
		list.sort(2);
		list.print();
	}
}
