package mypackage;
import java.io.*;
import java.util.*;

public class ReadFile {
		public Student[] readFile(String filename) {
			File file=new File(filename);
			Student stu[] = null;
			try {
				FileReader reader=new FileReader(file);
				LineNumberReader lnr=new LineNumberReader(reader);
				lnr.skip(Long.MAX_VALUE);
				int num=lnr.getLineNumber()-1;
				lnr.close();
				reader.close();
				
				FileReader reader1=new FileReader(file);
				BufferedReader br=new BufferedReader(reader1);
				stu=new Student[num];
				
				String str=br.readLine();
				StringTokenizer fenxi=new StringTokenizer(str," \t");
				if(fenxi.countTokens()==6) {
					int i=0;
					while((str=br.readLine())!=null) {
						StringTokenizer myfenxi=new StringTokenizer(str," \t");
						int id=Integer.parseInt(myfenxi.nextToken());
						String name=myfenxi.nextToken();
						double math=Double.parseDouble(myfenxi.nextToken());
						double computer=Double.parseDouble(myfenxi.nextToken());
						String tutor=myfenxi.nextToken();
						String area=myfenxi.nextToken();
						stu[i++]=new Postgraduate(id,name,math,computer,tutor,area);
					}	
				}else{
					int i=0;
					while((str=br.readLine())!=null) {
						StringTokenizer myfenxi=new StringTokenizer(str," \t");
						int id=Integer.parseInt(myfenxi.nextToken());
						String name=myfenxi.nextToken();
						double math=Double.parseDouble(myfenxi.nextToken());
						double computer=Double.parseDouble(myfenxi.nextToken());
						stu[i++]=new Undergraduate(id,name,math,computer);
					}
				}
				br.close();
				reader1.close();
			}catch(IOException e){
				System.out.println(e);
			}
			return stu;
		}
}
