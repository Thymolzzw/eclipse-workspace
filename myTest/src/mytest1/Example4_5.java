package mytest1;

public class Example4_5
{
   public static void main(String args[])
   {
	 int[] x= {10};
     double[] y= {12.58}; 
     Tom cat=new Tom();
     cat.f(x,y);
     System.out.printf("main������x��y��ֵ��Ȼ�ֱ���:%d,%3.2f\n",x[0],y[0]);
   }
}
class Tom
{  
  void f(int[] x,double[] y)
   {
       x[0]=x[0]+1;
       y[0]=y[0]+1;
       System.out.printf("����x��y��ֵ�ֱ���:%d,%3.2f\n",x[0],y[0]);
   } 
}