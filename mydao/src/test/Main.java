package test;

import object.Score;
import object.Student;

import com.dao.*;
import java.io.File;
import java.sql.Connection;
import java.util.List;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		DaoFactory f=DaoFactory.getInstance();
//		StudentDao sd=f.getStudentDao();
//		Student stu=new Student();
//		stu.setSid("111");
//		stu.setSna("张四");
//		stu.setSex("男");
//		stu.setAge(13);
		//sd.insertPStudent(stu);
		//sd.deleteStudent(stu);
		//sd.updateStudent(stu);
		//System.out.println(sd.getStudent("108").getSna());
//		List<Student> list=sd.getStudentBySql("age > 23");
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i).getSna());
//		}
		
		
		ScoreDao sd1=f.getScoreDao();
		List<Score> list1=sd1.getScoreBySql("sid = '101'");
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i).getScore());
		}
		Score sc=new Score();
		sc.setSid("112");
		sc.setCid("113");
		sc.setScore(66);
//		sd1.insertScore(sc);
		sd1.deleteScore(sc);
		
	}

}
