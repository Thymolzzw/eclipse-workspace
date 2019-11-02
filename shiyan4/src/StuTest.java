import mypackage.*;
public class StuTest 
{
    public static void main(String[] args) 
   {
        //可以处理文件中的学生信息

       ReadFile f=new ReadFile();
       Student[] student=f.readFile("data\\lianxi1.txt");//测试的时候，把lianxi1.txt和lianxi2.txt的内容都读一遍
       
       System.out.println("\n将文件中的信息如下所示：");
       System.out.println(student.length);
       for(int i=0;i<student.length;i++)
       {
            student[i].print();
       }
       
       System.out.println("上述信息已经被成功写入文件中。");
       System.out.println("");
        for(int j=0;j<student.length;j++)
       {
            student[j].writeReport("lianxi6.txt");
          
       }

       //可以处理非文件中的学生信息

        Student s = new Undergraduate(130824206,"李想",80,90);
        s.print();

        Student p = new Postgraduate(170824221,"陈婷" ,80,90,"杨老师", "人工智能"); 
        p.print();
    }
     
}
