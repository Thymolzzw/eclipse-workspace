package student;
import java.util.Scanner;
import java.util.Arrays;
public class MyStudents {
	
	public static void main(String[] args) {
		System.out.println("请输入要输入学生信息的学生数：");
		Scanner read = new Scanner(System.in);
		int number = read.nextInt();
		Student[] mystudents = new Student[number];
		for(int i=0;i<number;i++) {
			System.out.println("请输入"+(i+1)+"个学生的信息："+"(学号 姓名 数学成绩 计算机成绩)");
			mystudents[i] = new Student(null, null, i, i);
		    mystudents[i].setId(read.next());
		    mystudents[i].setName(read.next());
		    mystudents[i].setMathGrades(read.nextDouble());
		    mystudents[i].setComputerGrades(read.nextDouble());
		}
		read.close();
		System.out.println("初始学生信息为：");
		show(mystudents);
		System.out.println("按照数学成绩排序：");
		mySort(mystudents,"按照数学成绩");
		show(mystudents);
		System.out.println("按照计算机成绩排序：");
		mySort(mystudents,"按照计算机成绩");
		show(mystudents);
		
	}
	/**
	 * 定义show函数，实现向控制台输出学生信息。
	 * @param mystudents  要输出的学生类数组
	 */
	public static void show(Student[] mystudents) {
		System.out.println("---------------------------------------------------------------------");
		for(int i=0;i<mystudents.length;i++) {
			System.out.println("第"+(1+i)+"个学生的信息为：");
			System.out.println("学号："+mystudents[i].getId()+" 姓名："+mystudents[i].getName()+" 数学成绩："+mystudents[i].getMathGrades()+" 计算机成绩："+mystudents[i].getComputerGrades());
		}
		System.out.println("---------------------------------------------------------------------");
		System.out.println();
	}
	/**
	 * 定义mySort方法，根据参数，进行排序。
	 * @param mystudents  要进行排序的学生类数组
	 * @param standard  参数，如果是“按照数学成绩排序”，则按照数学成绩排序，如果是“按照计算机成绩排序”，则按照计算机成绩排序
	 */
	public static void mySort(Student[] mystudents,String standard) {
	/*	if(standard.equals("按照数学成绩")) {
			for(int i=1;i<mystudents.length;i++) {
				for(int j=0;j<mystudents.length-i;j++) {
					if(mystudents[j].getMathGrades()>mystudents[j+1].getMathGrades()) {
						Student temp;
						temp=mystudents[j];
						mystudents[j]=mystudents[j+1];
						mystudents[j+1]=temp;
					}
				}
			}
		}else if(standard.equals("按照计算机成绩")){
			for(int i=1;i<mystudents.length;i++) {
				for(int j=0;j<mystudents.length-i;j++) {
					if(mystudents[j].getComputerGrades()>mystudents[j+1].getComputerGrades()) {
						Student temp;
						temp=mystudents[j];
						mystudents[j]=mystudents[j+1];
						mystudents[j+1]=temp;
					}
				}
			}
		}*/
		Student.mathOrComputer=standard;
		Arrays.sort(mystudents);
		
		
		
	}
}
