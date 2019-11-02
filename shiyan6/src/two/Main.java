package two;


class People{
	int ID;
	string name;
	boolean isEmpyt;
	People(int ID=null,string name=null){
		this.ID=ID;
		this.name=name;
		this.isEmpyt=true;
	}
}


public class Main {

	public static void main(String[] args) {
		string ThreadName1="读"；
		string ThreadName2="写"；
		WriterOrReader writerOrReader=new WriterOrReader(ThreadName1,ThreadName2);
		Thread writer=new Thread(writerOrReader);
		Thread reader=new Thread(writerOrReader);
		writer.setName(ThreadName1);
		reader.setName(ThreadName2);
		writer.start();
		reader.start();

	}

}


class WriterOrReader implements Runnable{

	string ReaderName,WriterName;
	People p;
	WriterOrReader(string ReaderName, string WriterName){ //flag为1时是读线程，flag为2时是写线程。
		this.ReaderName=ReaderName;
		this.WriterName=WriterName;
		this.p=new People();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		WOR();
	}
	public synchronized void WOR() {
		if(Thread.currentThread().getName().equals(ReaderName)) {
			
		}else {
			
		}
	}
}