package mypackage1;
import java.util.*;
class CountSubString{
	int num;
	/**
	 * �������������Ӵ��ĸ��������������Ӵ����տո�����Žؿ����ٽ���ƥ�䡣
	 * @param s ����
	 * @param substring �Ӵ�
	 */
	void countSubString(String s, String substring){
      
		StringTokenizer fenxi=new StringTokenizer(s," ,.:'!?");
		num=0;
		while(fenxi.hasMoreTokens()) {
			boolean flag=false;
			StringTokenizer fenxi1=new StringTokenizer(substring," ,.:'!?");
			while(fenxi1.hasMoreTokens()) {
				String str;
				if(fenxi.hasMoreTokens()) {
					str=fenxi.nextToken();
					String str1=fenxi1.nextToken();
					if(str.equals(str1)) {
						flag=true;
					}else {
						flag=false;
						break;
					}
				}else {
					flag=false;
					break;
				}
			}
			if(flag) {
				num++;
			}
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



