package complementconversion;
import java.util.Scanner;

public class MyComplementConversion {

	public static void main(String[] args) {
		System.out.println("������Ҫת����int�͵�������");
		Scanner read=new Scanner(System.in);
		int s=read.nextInt();
		transform(s);
		read.close();
	}
	/**
	 * ת�������������������ģ2ȡ��ķ���ʵ��int��������32λ��������(����)��ת�������ڿ���̨���ת����Ķ����Ʋ������ִ���
	 * ����Ǹ��������������ֵ��ԭ�룬�ӵ�λ���λ����������1֮ǰ���䣬�ӵ�һ��1���ֺ����λ����������λ����ȡ������������һ��1����
	 * @param n Ҫ����ת����int������
	 */
	public static void transform(int n) {
		if(n>=0) {
			int[] a=new int[32];  //���Ŀ�����ĵ���
			int a_index=0;  
			while(n!=0) {    //һֱģ��nΪ0Ϊֹ��
				a[a_index++]=n%2;
				n=n/2;
			}
			while(a_index<32) {  //��λ���չ�32λ�����λ����0����
				a[a_index++]=0;
			}
			for(int i=a.length-1;i>=0;i--) {  //����������ִ�a��
				System.out.print(a[i]);
			}
			System.out.println();
		}else if(n<0) {
			n=Math.abs(n);
			int[] a=new int[32];  //���Ŀ�����ĵ���
			int a_index=0;  
			while(n!=0) {    //һֱģ��nΪ0Ϊֹ��
				a[a_index++]=n%2;
				n=n/2;
			}
			while(a_index<32) {  //��λ���չ�32λ�����λ����0����
				a[a_index++]=0;
			}
			int location=0;     //�ӵ�λ���λ��λ����λ����һ������0��λ�á�
			for(int i=0;i<a.length;i++) {
				if(a[i]==0) {
					continue;
				}else {
					location=i;
					break;
				}
			}
			//���˴Ӻ���ǰ����һ��1�Լ��������0֮�⣬����λȡ����
			for(int i= location+1;i<a.length;i++) {
				if(a[i]==0) {
					a[i]=1;
				}else {
					a[i]=0;
				}
			}
			for(int i=a.length-1;i>=0;i--) {  //����������ִ�a��
				System.out.print(a[i]);
			}
			System.out.println();
		}
		
	}
}
