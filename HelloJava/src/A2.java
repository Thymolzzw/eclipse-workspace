public class A2
{
    public static void main(String args[])
   {
         People student;
         student=new People();
         student.height=170;
      // ������1��   �����д��������student.height
         System.out.println(student.height);
       //������2��   �����д�������������಻һ����public��"
         System.out.println("���಻һ����public��");
         student.speak();
    }
}

class People
{
    int height;
    void speak()
    {
          System.out.printf("������ǣ�%d",height);
     }
}
