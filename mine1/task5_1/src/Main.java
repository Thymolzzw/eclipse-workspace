import electronics.*;
import java.util.Scanner;
public class Main {
	/**
	 * ��ȡ����
	 * @param u ����ת��Ϊ�ӿ�����
	 * @return ���ص���
	 */
	static double get(UnitPrice u) {
		return u.unitprice();
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("��ֱ����뱾�µ��ӡ���������ֻ������۸�����");
		TV tv=new TV(2000);
		Computer pc=new Computer(4000);
		Phone ph=new Phone(3000);
		System.out.printf("�����۶%.1f", in.nextDouble()*tv.unitprice()+in.nextDouble()*pc.unitprice()+in.nextDouble()*ph.unitprice());
		in.close();
	}

}
