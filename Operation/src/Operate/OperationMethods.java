package Operate;
public class OperationMethods {

	boolean error=false;
	double ans=0.0;
	/**
	 * ���巽�� toDo,���������ʵ������
	 * @param a �������
	 * @param b �������
	 * @param ch �������
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
				System.out.println("��������Ϊ0��");
			}else {
				System.out.printf("a/b=%.2f\n",ans);
			}
			
		}else {
			System.out.println("�Բ��������������������"+ch);
		}
	}
	/**
	  *  ����ӷ�������Ϊa,b
	 * @param a �������
	 * @param b �������
	 */
	public void add(double a,double b) {
		this.ans=a+b;
	}
	/**
	  * �������������Ϊa,b
	 * @param a ������
	 * @param b ����
	 */
	public void sub(double a,double b) {
		this.ans=a-b;
	}
	/**
	 * ����˷��� ����Ϊa,b
	 * @param a �˷��������
	 * @param b �˷��������
	 */
	public void mul(double a,double b) {
		this.ans=a*b;
	}
	/**
	 * �������������Ϊa,b
	 * @param a ������
	 * @param b ����
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
