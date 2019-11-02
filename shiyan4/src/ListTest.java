import mypackage.*;
public class ListTest {
    public static void main(String[] args) {

       ReadFile f=new ReadFile();
       Student[] student=f.readFile("data\\lianxi2.txt");
       StuList list = new StuList();
       for(int i=0;i<student.length;i++)
      {
           list.addStu(student[i]);
      }
       System.out.println("学生数量为："+list.size());
       System.out.println("学生信息为：");
       list.print();
        
        Student s1 = new Postgraduate(160824210,"小林", 80,90 ,"马老师", "云计算");
       
        Student s2 = new Postgraduate(160824209,"李想", 70,85 ,"沈老师", "软件工程");
        
        Student s3 = new Postgraduate(160824207,"小宇", 60,70 ,"韩老师", "人工智能");
        
        StuList list1 = new StuList();

        list1.addStu(s1);
        list1.addStu(s2);
        list1.addStu(s3);
        System.out.println("学生数量为："+list1.size());
        System.out.println("学生信息为：");
        list1.print();

        list1.sort(1);
        list1.sort(2);
        list1.writeReport("lianxi6.txt");
      
    }
}
