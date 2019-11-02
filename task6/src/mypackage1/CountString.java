package mypackage1;
import java.util.*;
class CountSubString{
	int num;
	/**
	 * 计算主串包含子串的个数，将主串与子串按照空格标点符号截开，再进行匹配。
	 * @param s 主串
	 * @param substring 子串
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



