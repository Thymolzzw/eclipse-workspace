package two;
import java.util.*;

class People{
	String ID;
	String name;
	boolean isEmpyt;
	People(String ID, String name){
		this.ID=ID;
		this.name=name;
		this.isEmpyt=true;
	}
}
public class Main {

	public static void main(String[] args){
		String ThreadName1="读";
		String ThreadName2="写";
		WriterOrReader writerOrReader=new WriterOrReader(ThreadName1,ThreadName2);
		Thread writer=new Thread(writerOrReader);
		Thread reader=new Thread(writerOrReader);
		reader.setName(ThreadName1);
		writer.setName(ThreadName2);
		reader.start();
		writer.start();
		
			
	
	}
}
class WriterOrReader implements Runnable{

	String ReaderName,WriterName;
	People p;
	WriterOrReader(String ReaderName, String WriterName){ 
		this.ReaderName=ReaderName;
		this.WriterName=WriterName;
		this.p=new People(null,null);
	}
	@Override
	public void run() {
		WOR();
		
	}
	public synchronized void WOR() {
		boolean flag=true;
		Scanner r=new Scanner(System.in);
		while(flag) {
			
			if(Thread.currentThread().getName().equals(ReaderName)) {
				
					if(!p.isEmpyt) {
						try {
							wait();
						}catch(InterruptedException e) {
							System.out.println("请输入学号：");
							p.ID=r.nextLine();
							if(p.ID.equals("finish")) {
								flag=false;
								break;
							}
							System.out.println("请输入姓名：");
							p.name=r.nextLine();
							p.isEmpyt=false;
						}
					}else {
						System.out.println("请输入学号：");
						p.ID=r.nextLine();
						if(p.ID.equals("finish")) {
							flag=false;
							break;
						}
						System.out.println("请输入姓名：");
						p.name=r.nextLine();
						p.isEmpyt=false;
					}	
		
			}else{
				if(p.ID.equals("finish")) {
					System.out.println("读进程与写进程工作结束！");
					break;
				}
				if(p.isEmpyt) {
					try {
						wait();
					}catch(InterruptedException e) {
						System.out.print("输出学号：");
						System.out.print(p.ID+", "+"输出姓名：");
						System.out.println(p.name);
						p.isEmpyt=true;
					}
					
				}else {
					System.out.print("输出学号：");
					System.out.print(p.ID+", "+"输出姓名：");
					System.out.println(p.name);
					p.isEmpyt=true;
				}
			}
			notify();
			
		}
		r.close();

	}
}











