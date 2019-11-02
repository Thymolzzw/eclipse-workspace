package mymain;

import java.util.*;
import java.io.*;
public class Main1 {

	public static void main(String[] args) {
		System.out.println("请输入要处理的文件名：");
		Scanner in=new Scanner(System.in);
		String mydir=in.nextLine();
		File file=new File(mydir);
		try {
			System.out.println("本程序的功能为：\n"+"1.将“data\\lianxi1.txt”中的姓名“李善”改为“王山”。\n"+"2.在“data\\lianxi1.txt”中原有的信息后继续添加学生信息。");
			
			RandomAccessFile raf= new RandomAccessFile(file,"rw");
			String str=null;
			long front=0,tail=0;
			while((str=raf.readLine())!=null) {
				String mystr=new String(str.getBytes("ISO-8859-1"));
				front=tail;
				tail=raf.getFilePointer();
				if(mystr.startsWith("李善 ")) {
					raf.seek(front);
					String str1=new String(str.getBytes("ISO-8859-1"));
					char[] s=str1.toCharArray();
					s[0]='王';
					s[1]='山';
					str1=new String(s);
					raf.write(str1.getBytes());
				}
			}
			
			System.out.println("请继续向文件“data\\lianxi1.txt”中添加新的学生信息，以finish结束。");
			
			while(!(str=in.nextLine()).equals("finish")) {
				raf.seek(raf.length());
				raf.write(str.getBytes());
				raf.write("\r\n".getBytes());
			}	
			in.close();
			raf.close();
		}catch(IOException e) {
			System.out.println(e);
		}
		
	}
}
