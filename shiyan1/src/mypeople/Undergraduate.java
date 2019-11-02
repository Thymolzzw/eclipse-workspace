package mypeople;

public class Undergraduate extends Student{
	
	public Undergraduate(int id,String name,double math_grades,double computer_grades){
		super(id,name,math_grades,computer_grades);
	}
	
	public void print() {
		System.out.println("学号："+this.getId()+" 姓名："+this.getName()+" 数学成绩："
							+this.getMathGrades()+" 计算机成绩："+this.getComputerGrades());
	}
}
