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
       System.out.println("ѧ������Ϊ��"+list.size());
       System.out.println("ѧ����ϢΪ��");
       list.print();
        
        Student s1 = new Postgraduate(160824210,"С��", 80,90 ,"����ʦ", "�Ƽ���");
       
        Student s2 = new Postgraduate(160824209,"����", 70,85 ,"����ʦ", "�������");
        
        Student s3 = new Postgraduate(160824207,"С��", 60,70 ,"����ʦ", "�˹�����");
        
        StuList list1 = new StuList();

        list1.addStu(s1);
        list1.addStu(s2);
        list1.addStu(s3);
        System.out.println("ѧ������Ϊ��"+list1.size());
        System.out.println("ѧ����ϢΪ��");
        list1.print();

        list1.sort(1);
        list1.sort(2);
        list1.writeReport("lianxi6.txt");
      
    }
}
