package mypeople;

public class Undergraduate extends Student{
	
	public Undergraduate(int id,String name,double math_grades,double computer_grades){
		super(id,name,math_grades,computer_grades);
	}
	
	public void print() {
		System.out.println("ѧ�ţ�"+this.getId()+" ������"+this.getName()+" ��ѧ�ɼ���"
							+this.getMathGrades()+" ������ɼ���"+this.getComputerGrades());
	}
}
