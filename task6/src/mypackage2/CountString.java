package mypackage2;
import java.util.Scanner;
class CountSubString{
 
	/**
	 * �������������Ӵ��ĸ���������indexOf������
	 * @param s ����
	 * @param substring �Ӵ�
	 */
	void countSubString(String s, String substring){
	      int num=0;
	      int index=0;
	      while(s.indexOf(substring, index)!=-1) {
	    	  num++;
	    	  index=s.indexOf(substring,index)+substring.length();
	      }
	      System.out.println("��������"+num+"���Ӵ���");
		
	}
}

public class CountString
{
       public static void main(String args[])
       {
              Scanner reader=new Scanner(System.in);
              System.out.println("�������ַ�����");
              String s=reader.nextLine();
              System.out.println("��������Ҫ�������Ӵ���");
              String substring=reader.nextLine();
              CountSubString a=new CountSubString();
              a.countSubString(s, substring);
              reader.close();
       }
}
