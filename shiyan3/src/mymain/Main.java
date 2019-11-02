package mymain;
import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		Scanner readin =new Scanner(System.in);
		File[] file=new File[2];
		//输入两个文件地址，如果文件地址中含有不存在的文件夹，则创建该文件夹。
		for(int i=0;i<2;i++) {
			System.out.println("请输入第"+(i+1)+"个文件的路径与文件名：");
			String filename1=readin.nextLine();
			File myfile=new File(filename1);
			
			StringBuffer sb=new StringBuffer(filename1);
			int index=sb.reverse().indexOf("\\");
			String mydir=filename1.substring(0,filename1.length()-index);	
			
			File dir=new File(mydir);
			if(!dir.isDirectory()) {
				dir.mkdirs();
			}
			try {
				myfile.createNewFile();
			}catch(Exception e) {
				System.out.println("文件出错！");
			}
			file[i]=myfile;
		}
		try {
			FileWriter fw=new FileWriter(file[0]);
			System.out.println("第一个文件夹存放学生的姓名，数学成绩和计算机成绩，各项之间用空格隔开。");
			System.out.println("请向第一个文件中输入内容：");
			String str;
			while(!(str=readin.nextLine()).equals("finish")) {
				fw.write(str);
				fw.write("\r\n");
			}
			fw.close();
			FileReader fr=new FileReader(file[0]);
			BufferedReader reader=new BufferedReader(fr);
			FileWriter fwr=new FileWriter(file[1]);
			String s=null;
			while((s=reader.readLine())!=null) {
				if(s.startsWith("张")) {
					fwr.write(s);
					fwr.write("\r\n");
				}
			}
			System.out.println("第一个文件中姓张的学生信息已经存放到第二个文件中，请到其存放路径查看！");
			reader.close();
			fwr.close();
		}catch(IOException e) {
			System.out.println(e);
		}
		readin.close();
	}
}
