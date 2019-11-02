package complementconversion;
import java.util.Scanner;
public class ComplementConversion {

	public static void main(String[] args) {
		System.out.println("请输入要转换的int型的整数：");
		Scanner read=new Scanner(System.in);
		int s=read.nextInt();
		transform(s);
		read.close();
	}
	/**
	 * 补码转换函数，用位运算的方法实现int型整数到32位二进制数(补码)的转换，并在控制台输出转换后的二进制数字串
	 * @param n 要进行转换的int型整数
	 */
	public static void transform(int n) {
		int template=1;
		template=template<<31;  //2^31，相当于1后面有31个零。
		int result;
		for(int i=0;i<32;i++) {
			result=template&n;   //判断此时n二进制的最高位是否是1，是1则result为1，是0则result为0。
			if(result==0) {
				System.out.print(0);
			}else {
				System.out.print(1);
			}
			n=n<<1;  //左移1位。
		}
		System.out.println();
	}
}
