package mymain;
import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		Scanner readin =new Scanner(System.in);
		File[] file=new File[2];
		//���������ļ���ַ������ļ���ַ�к��в����ڵ��ļ��У��򴴽����ļ��С�
		for(int i=0;i<2;i++) {
			System.out.println("�������"+(i+1)+"���ļ���·�����ļ�����");
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
				System.out.println("�ļ�����");
			}
			file[i]=myfile;
		}
		try {
			FileWriter fw=new FileWriter(file[0]);
			System.out.println("��һ���ļ��д��ѧ������������ѧ�ɼ��ͼ�����ɼ�������֮���ÿո������");
			System.out.println("�����һ���ļ����������ݣ�");
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
				if(s.startsWith("��")) {
					fwr.write(s);
					fwr.write("\r\n");
				}
			}
			System.out.println("��һ���ļ������ŵ�ѧ����Ϣ�Ѿ���ŵ��ڶ����ļ��У��뵽����·���鿴��");
			reader.close();
			fwr.close();
		}catch(IOException e) {
			System.out.println(e);
		}
		readin.close();
	}
}
