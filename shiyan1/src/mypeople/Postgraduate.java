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
		System.out.println("学号："+this.getId()+" 姓名："+this.getName()+" 数学成绩："
							+this.getMathGrades()+" 计算机成绩："+this.getComputerGrades()
							+" 导师："+this.tutor+" 研究方向："+this.researchDirection);
		
	}
}
