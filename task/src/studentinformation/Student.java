package studentinformation;

public class Student {
	public static void main(String[] args) {
		System.out.println("ʹ�ó�ʼ������Ϊ���鸳ֵ��");
		double student[][]=useInitilize();
		show(student);
		System.out.println("ʹ��new�ؼ��ִ�������֮���ٸ�ֵ��");
		double student1[][]=useNew();
		show(student1);
	}
	static double[][] useInitilize() {
		double student[][]= {
				{85,90,96},
				{90,85},
				{90,90,80,95}
		};
		return student;
	}
	static double[][] useNew() {
		double student[][];
		student =new double[3][];
		student[0]=new double[3];
		student[1]=new double[2];
		student[2]=new double[4];
		student[0][0]=85;
		student[0][1]=90;
		student[0][2]=96;
		student[1][0]=90;
		student[1][1]=85;
		student[2][0]=90;
		student[2][1]=90;
		student[2][2]=80;
		student[2][3]=95;
		
		return student;
	}
	static void show(double a[][]) {
		for(int i=0;i<a.length;i++) {
			for(double j:a[i]) {
				System.out.println(j);
			}
		}
	}
}
