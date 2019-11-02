package one;
public class Main{
	public static void main(String[] args) {
		Daemon D=new Daemon();
		D.zhang.start();
		D.wang.start();
		D.boss.setDaemon(true);
		D.boss.start();	
		
	}
}

class Daemon implements Runnable{
	Thread zhang,wang,boss;
	Daemon(){
		zhang=new Thread(this);
		wang=new Thread(this);
		boss=new Thread(this);
		
	}
	public void run() {
		if(Thread.currentThread()==zhang) {
			
			for(int i=0;i<3;i++) {
				System.out.println("张工已般运了"+(i+1)+"箱苹果。");
				System.out.println();
				if(i!=2) {
					try {
						Thread.sleep(10000);
						
					}catch(InterruptedException e) {
						System.out.println("老板让张工继续工作！");
					}
				}
			}
			
			if(!wang.isAlive()) {
				System.out.println("老板说可以下班了！");
			}
		}else if(Thread.currentThread()==wang) {
			for(int i=0;i<3;i++) {
				System.out.println("王工已般运了"+(i+1)+"箱苹果。");
				System.out.println();
				if(i!=2) {
					try {
						Thread.sleep(10000);
						
					}catch(InterruptedException e) {
						System.out.println("老板让王工继续工作！");
					}
				}
				
			}
			
			if(!zhang.isAlive()) {
				System.out.println("老板说可以下班了！");
			}
		}else if(Thread.currentThread()==boss) {
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
			}
			while(true) {
				
				zhang.interrupt();
				wang.interrupt();	
			/*	if(!zhang.isAlive()&&!wang.isAlive()) {
					System.out.println("老板说可以下班了！");
					break;
				}*/
				
				try {
					Thread.sleep(100);
				}catch(InterruptedException e) {
				}
			}
			
			
		}
		
	}
	
}