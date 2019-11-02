package clone;

class Single{
      int z;
      Single(int z){
    	  this.z = z;
      }
      //输出Single类实例的信息。
      void show(){
    	  System.out.println("z="+z+" "+ toString());
      }
}
class Pair{
      Single x;
      Single y;
      Pair(Single x, Single y){
    	  this.x = x;
    	  this.y = y;
      }
      //输出Pair类实例的信息，包括其两个Single类成员变量的实例信息。
      void show(){
    	  System.out.println("Pair对象："+this.toString());
    	  x.show();
    	  y.show();
      }
      //用当前类实例的x,y构造一个新的Pair类实例，实现浅拷贝。
      protected Object clone(){
    	  Pair copy = new Pair(this.x, this.y);
    	  return copy;
      }
}

/**
 * 浅拷贝
 * @author zzw
 */
public class TestClone{
      public static void main(String[] args){
    	  Pair a = new Pair(new Single(3), new Single(4));
    	  System.out.print("a: ");
    	  a.show();
    	  Pair b =(Pair)a.clone();
    	  System.out.print("a的拷贝b: ");
    	  b.show();
      }
}