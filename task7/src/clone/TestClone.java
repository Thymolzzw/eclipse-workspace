package clone;

class Single{
      int z;
      Single(int z){
    	  this.z = z;
      }
      //���Single��ʵ������Ϣ��
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
      //���Pair��ʵ������Ϣ������������Single���Ա������ʵ����Ϣ��
      void show(){
    	  System.out.println("Pair����"+this.toString());
    	  x.show();
    	  y.show();
      }
      //�õ�ǰ��ʵ����x,y����һ���µ�Pair��ʵ����ʵ��ǳ������
      protected Object clone(){
    	  Pair copy = new Pair(this.x, this.y);
    	  return copy;
      }
}

/**
 * ǳ����
 * @author zzw
 */
public class TestClone{
      public static void main(String[] args){
    	  Pair a = new Pair(new Single(3), new Single(4));
    	  System.out.print("a: ");
    	  a.show();
    	  Pair b =(Pair)a.clone();
    	  System.out.print("a�Ŀ���b: ");
    	  b.show();
      }
}