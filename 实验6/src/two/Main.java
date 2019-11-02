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
		String ThreadName1="��";
		String ThreadName2="д";
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
							System.out.println("������ѧ�ţ�");
							p.ID=r.nextLine();
							if(p.ID.equals("finish")) {
								flag=false;
								break;
							}
							System.out.println("������������");
							p.name=r.nextLine();
							p.isEmpyt=false;
						}
					}else {
						System.out.println("������ѧ�ţ�");
						p.ID=r.nextLine();
						if(p.ID.equals("finish")) {
							flag=false;
							break;
						}
						System.out.println("������������");
						p.name=r.nextLine();
						p.isEmpyt=false;
					}	
		
			}else{
				if(p.ID.equals("finish")) {
					System.out.println("��������д���̹���������");
					break;
				}
				if(p.isEmpyt) {
					try {
						wait();
					}catch(InterruptedException e) {
						System.out.print("���ѧ�ţ�");
						System.out.print(p.ID+", "+"���������");
						System.out.println(p.name);
						p.isEmpyt=true;
					}
					
				}else {
					System.out.print("���ѧ�ţ�");
					System.out.print(p.ID+", "+"���������");
					System.out.println(p.name);
					p.isEmpyt=true;
				}
			}
			notify();
			
		}
		r.close();

	}
}











