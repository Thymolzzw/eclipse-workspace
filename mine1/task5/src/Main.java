import functions.*;
import java.util.Scanner;
public class Main {

	/**
	 * ����get()��������ӡ����������
	 * @param obj ����ת��
	 */
	static void get(ObjectVolume obj) {
		System.out.printf("���Ϊ��%.2f", obj.getVolume());
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("������1, 2 or 3: 1��ʾ���壬2��ʾ�����壬3��ʾԲ����");
		int flag=in.nextInt();
		if(flag==1) {
			System.out.println("��������İ뾶��");
			Ball ball=new Ball(in.nextDouble());
			get(ball);
		}else if(flag==2) {
			System.out.println("������������ı߳���");
			Cube cube=new Cube(in.nextDouble());
			get(cube);
		}else if(flag==3) {
			System.out.println("������Բ����ĵ���뾶�͸ߣ�");
			Cylinder cylinder=new Cylinder(in.nextDouble(),in.nextDouble());
			get(cylinder);
		}
	
	}

}
