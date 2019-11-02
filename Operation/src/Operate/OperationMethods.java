package Operate;
public class OperationMethods {

	boolean error=false;
	double ans=0.0;
	/**
	 * 定义方法 toDo,根据运算符实现运算
	 * @param a 运算参数
	 * @param b 运算参数
	 * @param ch 运算符号
	 */
	public void toDo(double a,double b,char ch) {
		if(ch=='+') {
			add(a,b);
			System.out.printf("a+b=%.2f\n",ans);
			
		}else if(ch=='-') {
			sub(a,b);
			System.out.printf("a-b=%.2f\n",ans);
			
		}else if(ch=='*') {
			mul(a,b);
			System.out.printf("a*b=%.2f\n",ans);
			
		}else if(ch=='/') {
			div(a,b);
			if(error==true) {
				System.out.println("除数不能为0！");
			}else {
				System.out.printf("a/b=%.2f\n",ans);
			}
			
		}else {
			System.out.println("对不起运算器处理不了运算符"+ch);
		}
	}
	/**
	  *  定义加法，参数为a,b
	 * @param a 运算加数
	 * @param b 运算加数
	 */
	public void add(double a,double b) {
		this.ans=a+b;
	}
	/**
	  * 定义减法，参数为a,b
	 * @param a 被减数
	 * @param b 减数
	 */
	public void sub(double a,double b) {
		this.ans=a-b;
	}
	/**
	 * 定义乘法， 参数为a,b
	 * @param a 乘法运算参数
	 * @param b 乘法运算参数
	 */
	public void mul(double a,double b) {
		this.ans=a*b;
	}
	/**
	 * 定义除法，参数为a,b
	 * @param a 被除数
	 * @param b 除数
	 */
	public void div(double a,double b) {
		if(b==0) {
			error=true;
		}else {
			error=false;
			this.ans=a/b;
		}
		
	}
}
