package mymain;

import java.util.*;
import java.io.*;
public class Main1 {

	public static void main(String[] args) {
		System.out.println("������Ҫ������ļ�����");
		Scanner in=new Scanner(System.in);
		String mydir=in.nextLine();
		File file=new File(mydir);
		try {
			System.out.println("������Ĺ���Ϊ��\n"+"1.����data\\lianxi1.txt���е����������ơ���Ϊ����ɽ����\n"+"2.�ڡ�data\\lianxi1.txt����ԭ�е���Ϣ��������ѧ����Ϣ��");
			
			RandomAccessFile raf= new RandomAccessFile(file,"rw");
			String str=null;
			long front=0,tail=0;
			while((str=raf.readLine())!=null) {
				String mystr=new String(str.getBytes("ISO-8859-1"));
				front=tail;
				tail=raf.getFilePointer();
				if(mystr.startsWith("���� ")) {
					raf.seek(front);
					String str1=new String(str.getBytes("ISO-8859-1"));
					char[] s=str1.toCharArray();
					s[0]='��';
					s[1]='ɽ';
					str1=new String(s);
					raf.write(str1.getBytes());
				}
			}
			
			System.out.println("��������ļ���data\\lianxi1.txt��������µ�ѧ����Ϣ����finish������");
			
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
