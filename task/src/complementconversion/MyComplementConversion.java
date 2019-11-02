package complementconversion;
import java.util.Scanner;

public class MyComplementConversion {

	public static void main(String[] args) {
		System.out.println("请输入要转换的int型的整数：");
		Scanner read=new Scanner(System.in);
		int s=read.nextInt();
		transform(s);
		read.close();
	}
	/**
	 * 转换函数，如果是正数用模2取余的方法实现int型整数到32位二进制数(补码)的转换，并在控制台输出转换后的二进制补码数字串。
	 * 如果是负数，则用其绝对值的原码，从低位向高位检索，出现1之前不变，从第一个1出现后到最高位（包括符号位）都取反（不包括第一个1）。
	 * @param n 要进行转换的int型整数
	 */
	public static void transform(int n) {
		if(n>=0) {
			int[] a=new int[32];  //存放目标结果的倒序。
			int a_index=0;  
			while(n!=0) {    //一直模到n为0为止。
				a[a_index++]=n%2;
				n=n/2;
			}
			while(a_index<32) {  //补位，凑够32位，多的位数用0补。
				a[a_index++]=0;
			}
			for(int i=a.length-1;i>=0;i--) {  //倒序输出数字串a。
				System.out.print(a[i]);
			}
			System.out.println();
		}else if(n<0) {
			n=Math.abs(n);
			int[] a=new int[32];  //存放目标结果的倒序。
			int a_index=0;  
			while(n!=0) {    //一直模到n为0为止。
				a[a_index++]=n%2;
				n=n/2;
			}
			while(a_index<32) {  //补位，凑够32位，多的位数用0补。
				a[a_index++]=0;
			}
			int location=0;     //从低位向高位定位，定位到第一个不是0的位置。
			for(int i=0;i<a.length;i++) {
				if(a[i]==0) {
					continue;
				}else {
					location=i;
					break;
				}
			}
			//除了从后向前数第一个1以及它后面的0之外，其他位取反。
			for(int i= location+1;i<a.length;i++) {
				if(a[i]==0) {
					a[i]=1;
				}else {
					a[i]=0;
				}
			}
			for(int i=a.length-1;i>=0;i--) {  //倒序输出数字串a。
				System.out.print(a[i]);
			}
			System.out.println();
		}
		
	}
}
