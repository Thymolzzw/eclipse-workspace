package student;
import java.util.Scanner;
import java.util.Arrays;
public class MyStudents {
	
	public static void main(String[] args) {
		System.out.println("������Ҫ����ѧ����Ϣ��ѧ������");
		Scanner read = new Scanner(System.in);
		int number = read.nextInt();
		Student[] mystudents = new Student[number];
		for(int i=0;i<number;i++) {
			System.out.println("������"+(i+1)+"��ѧ������Ϣ��"+"(ѧ�� ���� ��ѧ�ɼ� ������ɼ�)");
			mystudents[i] = new Student(null, null, i, i);
		    mystudents[i].setId(read.next());
		    mystudents[i].setName(read.next());
		    mystudents[i].setMathGrades(read.nextDouble());
		    mystudents[i].setComputerGrades(read.nextDouble());
		}
		read.close();
		System.out.println("��ʼѧ����ϢΪ��");
		show(mystudents);
		System.out.println("������ѧ�ɼ�����");
		mySort(mystudents,"������ѧ�ɼ�");
		show(mystudents);
		System.out.println("���ռ�����ɼ�����");
		mySort(mystudents,"���ռ�����ɼ�");
		show(mystudents);
		
	}
	/**
	 * ����show������ʵ�������̨���ѧ����Ϣ��
	 * @param mystudents  Ҫ�����ѧ��������
	 */
	public static void show(Student[] mystudents) {
		System.out.println("---------------------------------------------------------------------");
		for(int i=0;i<mystudents.length;i++) {
			System.out.println("��"+(1+i)+"��ѧ������ϢΪ��");
			System.out.println("ѧ�ţ�"+mystudents[i].getId()+" ������"+mystudents[i].getName()+" ��ѧ�ɼ���"+mystudents[i].getMathGrades()+" ������ɼ���"+mystudents[i].getComputerGrades());
		}
		System.out.println("---------------------------------------------------------------------");
		System.out.println();
	}
	/**
	 * ����mySort���������ݲ�������������
	 * @param mystudents  Ҫ���������ѧ��������
	 * @param standard  ����������ǡ�������ѧ�ɼ����򡱣�������ѧ�ɼ���������ǡ����ռ�����ɼ����򡱣����ռ�����ɼ�����
	 */
	public static void mySort(Student[] mystudents,String standard) {
	/*	if(standard.equals("������ѧ�ɼ�")) {
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
		}else if(standard.equals("���ռ�����ɼ�")){
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
