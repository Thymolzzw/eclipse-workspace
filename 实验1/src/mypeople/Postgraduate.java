package mypeople;

public class Postgraduate extends Student{
	String tutor;
	String researchDirection;
	public Postgraduate(int id,String name,double math_grades,double computer_grades,String tutor,String researchDirection){
		super(id,name,math_grades,computer_grades);
		this.tutor=tutor;
		this.researchDirection=researchDirection;
	}
	public void print() {
		System.out.println("ѧ�ţ�"+this.getId()+" ������"+this.getName()+" ��ѧ�ɼ���"
							+this.getMathGrades()+" ������ɼ���"+this.getComputerGrades()
							+" ��ʦ��"+this.tutor+" �о�����"+this.researchDirection);
		
	}
}
