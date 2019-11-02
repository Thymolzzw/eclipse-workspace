public class A2
{
    public static void main(String args[])
   {
         People student;
         student=new People();
         student.height=170;
      // 【代码1】   命令行窗口中输出student.height
         System.out.println(student.height);
       //【代码2】   命令行窗口中输出”主类不一定是public类"
         System.out.println("主类不一定是public类");
         student.speak();
    }
}

class People
{
    int height;
    void speak()
    {
          System.out.printf("我身高是：%d",height);
     }
}
