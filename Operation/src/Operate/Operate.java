package Operate;
import java.util.Scanner;
public class Operate {
	static boolean continueOrFinish=true;
	public static void main(String[] args) {
		while(continueOrFinish) {
			System.out.println("������������������һ���������");
			Scanner read=new Scanner(System.in);
			double a=read.nextDouble();
			double b=read.nextDouble();
			char ch;
			String str;
			str=read.nextLine();
			str=read.nextLine();
			ch=str.toCharArray()[0];
			OperationMethods oper=new OperationMethods();
			oper.toDo(a, b, ch);
			boolean flag=true;
			while(flag) {
				System.out.println("����������㣬������continue��֮�󰴻س���������������㣬������finish,֮�󰴻س�����");
				str=read.nextLine();
				if(str.equals("continue")) {
					continueOrFinish=true;
					flag=false;
				}else if(str.equals("finish")){
					continueOrFinish=false;
					flag=false;
					read.close();
					break;
				}else {
					System.out.println("���벻�Ϸ���");
					flag=true;
				}
			}
			
		}
	}
}
