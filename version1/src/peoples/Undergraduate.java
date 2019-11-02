package peoples;

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
		System.out.println("学号："+this.getId()+" 姓名："+this.getName()+" 数学成绩："
				+this.getMathScore()+" 计算机成绩："+this.getComputerScore());
	}

}