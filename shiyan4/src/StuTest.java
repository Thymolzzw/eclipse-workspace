import mypackage.*;
public class StuTest 
{
    public static void main(String[] args) 
   {
        //���Դ����ļ��е�ѧ����Ϣ

       ReadFile f=new ReadFile();
       Student[] student=f.readFile("data\\lianxi1.txt");//���Ե�ʱ�򣬰�lianxi1.txt��lianxi2.txt�����ݶ���һ��
       
       System.out.println("\n���ļ��е���Ϣ������ʾ��");
       System.out.println(student.length);
       for(int i=0;i<student.length;i++)
       {
            student[i].print();
       }
       
       System.out.println("������Ϣ�Ѿ����ɹ�д���ļ��С�");
       System.out.println("");
        for(int j=0;j<student.length;j++)
       {
            student[j].writeReport("lianxi6.txt");
          
       }

       //���Դ�����ļ��е�ѧ����Ϣ

        Student s = new Undergraduate(130824206,"����",80,90);
        s.print();

        Student p = new Postgraduate(170824221,"����" ,80,90,"����ʦ", "�˹�����"); 
        p.print();
    }
     
}
