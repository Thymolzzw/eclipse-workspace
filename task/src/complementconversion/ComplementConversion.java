package complementconversion;
import java.util.Scanner;
public class ComplementConversion {

	public static void main(String[] args) {
		System.out.println("������Ҫת����int�͵�������");
		Scanner read=new Scanner(System.in);
		int s=read.nextInt();
		transform(s);
		read.close();
	}
	/**
	 * ����ת����������λ����ķ���ʵ��int��������32λ��������(����)��ת�������ڿ���̨���ת����Ķ��������ִ�
	 * @param n Ҫ����ת����int������
	 */
	public static void transform(int n) {
		int template=1;
		template=template<<31;  //2^31���൱��1������31���㡣
		int result;
		for(int i=0;i<32;i++) {
			result=template&n;   //�жϴ�ʱn�����Ƶ����λ�Ƿ���1����1��resultΪ1����0��resultΪ0��
			if(result==0) {
				System.out.print(0);
			}else {
				System.out.print(1);
			}
			n=n<<1;  //����1λ��
		}
		System.out.println();
	}
}
