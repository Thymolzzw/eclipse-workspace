package mypackage;
import java.util.Scanner;
class CountSubString{
 

	/**
	 * �������������Ӵ��ĸ�������������ĩβ�����ַ���#��,Ȼ��ʹ��split�ķ�����
	 * @param s ����
	 * @param substring �Ӵ�
	 */
	void countSubString(String s, String substring){
      
		s=s+"#";
		String[] sList=s.split(substring);
		int sListNum=sList.length;
		System.out.println("��������"+(sListNum-1)+"���Ӵ���");
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



