package mypackage;
import java.util.Scanner;
class CountSubString{
 

	/**
	 * 计算主串包含子串的个数，在主串的末尾加上字符‘#”,然后使用split的方法。
	 * @param s 主串
	 * @param substring 子串
	 */
	void countSubString(String s, String substring){
      
		s=s+"#";
		String[] sList=s.split(substring);
		int sListNum=sList.length;
		System.out.println("主串包含"+(sListNum-1)+"个子串。");
	}
}

public class CountString
{
       public static void main(String args[])
       {
              Scanner reader=new Scanner(System.in);
              System.out.println("请输入字符串：");
              String s=reader.nextLine();
              System.out.println("请输入你要检索的子串：");
              String substring=reader.nextLine();
              CountSubString a=new CountSubString();
              a.countSubString(s, substring);
              reader.close();
       }
}



