package peoples;

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
		System.out.println("ѧ�ţ�"+this.getId()+" ������"+this.getName()+" ��ѧ�ɼ���"
				+this.getMathScore()+" ������ɼ���"+this.getComputerScore()
				+" ��ʦ��"+this.getTutor()+" �о�����"+this.getResearchArea());
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

}

