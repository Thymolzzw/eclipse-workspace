import functions.*;
import java.util.Scanner;
public class Main {

	/**
	 * 定义get()函数，打印物体的体积。
	 * @param obj 向上转型
	 */
	static void get(ObjectVolume obj) {
		System.out.printf("体积为：%.2f", obj.getVolume());
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("请输入1, 2 or 3: 1表示球体，2表示立方体，3表示圆柱体");
		int flag=in.nextInt();
		if(flag==1) {
			System.out.println("请输入球的半径：");
			Ball ball=new Ball(in.nextDouble());
			get(ball);
		}else if(flag==2) {
			System.out.println("请输入立方体的边长：");
			Cube cube=new Cube(in.nextDouble());
			get(cube);
		}else if(flag==3) {
			System.out.println("请输入圆柱体的底面半径和高：");
			Cylinder cylinder=new Cylinder(in.nextDouble(),in.nextDouble());
			get(cylinder);
		}
	
	}

}
