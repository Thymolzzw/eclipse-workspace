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
		System.out.println("ѧ�ţ�"+this.getId()+" ������"+this.getName()+" ��ѧ�ɼ���"
				+this.getMathScore()+" ������ɼ���"+this.getComputerScore());
	}

}