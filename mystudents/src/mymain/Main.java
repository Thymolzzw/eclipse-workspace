package mymain;
import mystudent.*;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		StuList list=new StuList(20);  //学生表可以容纳20个学生
		System.out.println("要输入多少个学生的信息？");
		int num=in.nextInt();
		for(int i=0;i<num;i++)
		{
			System.out.println("请输入第"+(i+1)+"位学生的学号，姓名，数学、计算机成绩");
			Student t=new Student(in.nextInt(),in.next(),in.nextDouble(),in.nextDouble()); //想一想，这时学生姓名之间可以有空格吗？ 可以有
			list.addStu(t);
		}
		list.print();
	
		list.addStu(new Student(1321,"liu",90,60));
		list.addStu(new Student(1331,"guo",96,80));
		list.addStu(new Student(1326,"niu",80,90));
		list.removeStu(3);
		list.print();
		System.out.println("按数学成绩排序：");
		list.sort(1);
		list.print();
		System.out.println("按计算机成绩排序：");
		list.sort(2);
		list.print();
	
		in.close(); //想一想，这条语句的作用？  关闭输入流，释放内存
	}
}

