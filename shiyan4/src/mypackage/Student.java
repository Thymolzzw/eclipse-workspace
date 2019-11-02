package mypackage;

public abstract class Student 
{
	int id;
	String name;
	double mathScore;
	double computerScore;
	
	public Student(int id,String name,double mathScore,double computerScore)
	{
		this.id=id;
		this.name=name;
		this.mathScore=mathScore;
		this.computerScore=computerScore;
	}
	
	public int getId() 
	{
		return id;
	}
	
	public void setId(int id) 
	{
		this.id = id;
	}
	
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	
	public double getMathScore()
	{
		return mathScore;
	}

	public void setMathScore(double mathScore)
	{
		this.mathScore = mathScore;
	}
	
	
	public double getComputerScore()
	{
		return computerScore;
	}

	public void setComputerScore(double computerScore)
	{
		this.computerScore = computerScore;
	}
	
	public abstract void writeReport(String fileName); //实验4新加的方法
	public abstract void print();
	
}
