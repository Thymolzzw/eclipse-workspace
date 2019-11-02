package mypackage;

import mypackage.Student;
import java.util.*;
import java.io.*;
public class Postgraduate extends Student
{
	
	String tutor;
	String researchArea;
	public Postgraduate(int id,String name,double mathScore,double computerScore,String tutor,String area)
	{
		super(id,name,mathScore,computerScore);
		this.tutor=tutor;
		this.researchArea=area;
	}
	
	public void print()
	{
		System.out.println("学号："+this.getId()+" 姓名："+this.getName()+" 数学成绩："
				+this.getMathScore()+" 计算机成绩："+this.getComputerScore()
				+" 导师："+this.getTutor()+" 研究方向："+this.getResearchArea());
	}

	public String getTutor()
	{
		return tutor;
	}

	public void setTutor(String tutor)
	{
		this.tutor = tutor;
	}

	public String getResearchArea()
	{
		return researchArea;
	}

	public void setResearchArea(String researchArea)
	{
		this.researchArea = researchArea;
	}


	public void writeReport(String fileName) {
		File file=new File(fileName);
		try {
			FileWriter writer=new FileWriter(file,true);
			writer.write(""+getId()+'\t'+getName()+'\t'+getMathScore()+'\t'+getComputerScore()+'\t'+getTutor()
											+'\t'+getResearchArea()+"\r\n");
			writer.close();
			
		}catch(IOException e){
			System.out.println(e);
		}
		
		
	}

}

