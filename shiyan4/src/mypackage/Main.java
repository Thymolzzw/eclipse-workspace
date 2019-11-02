package mypackage;
import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		StuList list=new StuList();  //创建学生链表，和实验1不同了，构造方法中没有参数了
		int num;  //实际输入的学生信息
		System.out.println("要创建本科生信息表还是研究生信息表？\nA.本科生\tB.研究生");
		switch(in.next().charAt(0))
		{
		case 'A':
		case 'a':
			System.out.println("请问要输入多少个本科生的信息？");
			num=in.nextInt();
			for(int i=0;i<num;i++)
			{
				System.out.println("请输入第"+(i+1)+"位学生的学号，姓名，数学、计算机成绩");
				Student t=new Undergraduate(in.nextInt(),in.next(),in.nextDouble(),in.nextDouble());
				list.addStu(t);
			}
			list.print();
			list.addStu(new Undergraduate(1312,"shgd",99,98.5));
			list.addStu(new Undergraduate(1316,"ddsa",89,88.5));
			list.print();
			break;
		case 'B':
		case 'b':
			System.out.println("请问要输入多少个研究生的信息？");
			num=in.nextInt();
			for(int i=0;i<num;i++)
			{
				System.out.println("请输入第"+(i+1)+"位学生的学号，姓名，数学、计算机成绩，导师和研究方向，以空格隔开");
				Student t=new Postgraduate(in.nextInt(),in.next(),in.nextDouble(),in.nextDouble(),in.next(),in.next());
				list.addStu(t);
			}
			list.print();
			list.addStu(new Postgraduate(1312,"shgd",99,98.5,"xyy","os"));
			list.addStu(new Postgraduate(1316,"ddsa",89,88.5,"wcl","rgzn"));
			list.print();
			break;
		default:
			System.out.println("输入错误！！！");
			break;
		}
		
		in.close();
		
		list.removeStu(2);
		list.print();
                                //和实验1不同了，删除了两个sort方法下面的print方法。
		list.sort(1);
		list.sort(2);
	}
}
