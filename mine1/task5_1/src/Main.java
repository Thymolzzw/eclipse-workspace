import electronics.*;
import java.util.Scanner;
public class Main {
	/**
	 * 获取单价
	 * @param u 向上转型为接口类型
	 * @return 返回单价
	 */
	static double get(UnitPrice u) {
		return u.unitprice();
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("请分别输入本月电视、计算机和手机的销售个数：");
		TV tv=new TV(2000);
		Computer pc=new Computer(4000);
		Phone ph=new Phone(3000);
		System.out.printf("总销售额：%.1f", in.nextDouble()*tv.unitprice()+in.nextDouble()*pc.unitprice()+in.nextDouble()*ph.unitprice());
		in.close();
	}

}
