package clone1;

class Single
{
    int z;
    Single(int z)
    {
	this.z = z;
    }
    void show()
    {
	System.out.println("z="+z+" "+ toString());
    }
}
class Pair
{
    Single x;
    Single y;
    Pair(Single x, Single y)
    {
	this.x = x;
	this.y = y;
    }
    void show()
    {
	System.out.println("Pair对象："+this.toString());
	x.show();
	y.show();
    }
    //通过new出新的Single类实例anotherX、anotherY实现深拷贝。
    protected Object clone()
    {
	Single anotherX = new Single(x.z); //x.z是基本数据类型
	Single anotherY = new Single(y.z); //y.z是基本数据类型
	Pair copy = new Pair(anotherX, anotherY);
	//anotherX与this.x是不同的对象；anotherY与this.y是不同的对象
	return copy;
    }
}

/**
 * 深拷贝
 * @author zzw
 *
 */
public class TestClone2
{
    public static void main(String[] args)
    {
	Pair a = new Pair(new Single(3), new Single(4));
	System.out.print("a: ");
	a.show();
	Pair b = (Pair)a.clone();
	System.out.print("a的拷贝b: ");
	b.show();
    }
}