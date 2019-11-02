package mypackage2;
import java.util.Scanner;
class CountSubString{
 
	/**
	 * 计算主串包含子串的个数，采用indexOf方法。
	 * @param s 主串
	 * @param substring 子串
	 */
	void countSubString(String s, String substring){
	      int num=0;
	      int index=0;
	      while(s.indexOf(substring, index)!=-1) {
	    	  num++;
	    	  index=s.indexOf(substring,index)+substring.length();
	      }
	      System.out.println("主串包含"+num+"个子串。");
		
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
