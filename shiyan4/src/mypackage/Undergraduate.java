package mypackage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import mypackage.Student;

public class Undergraduate extends Student{
	int id;
	String name;
	double mathScore;
	double computerScore;
	public Undergraduate(int id,String name,double mathScore,double computerScore){
		super(id,name,mathScore,computerScore);
	}

	public void print()
	{	
		System.out.println("ѧ�ţ�"+this.getId()+" ������"+this.getName()+" ��ѧ�ɼ���"
				+this.getMathScore()+" ������ɼ���"+this.getComputerScore());
	}


	public void writeReport(String fileName) {
		File file=new File(fileName);
		try {
			FileWriter writer=new FileWriter(file,true);
			writer.write(""+getId()+'\t'+getName()+'\t'+getMathScore()+'\t'+getComputerScore()+"\r\n");
			writer.close();
			
		}catch(IOException e){
			System.out.println(e);
		}
		
	}

}