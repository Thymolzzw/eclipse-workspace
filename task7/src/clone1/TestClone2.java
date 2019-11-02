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
	System.out.println("Pair����"+this.toString());
	x.show();
	y.show();
    }
    //ͨ��new���µ�Single��ʵ��anotherX��anotherYʵ�������
    protected Object clone()
    {
	Single anotherX = new Single(x.z); //x.z�ǻ�����������
	Single anotherY = new Single(y.z); //y.z�ǻ�����������
	Pair copy = new Pair(anotherX, anotherY);
	//anotherX��this.x�ǲ�ͬ�Ķ���anotherY��this.y�ǲ�ͬ�Ķ���
	return copy;
    }
}

/**
 * ���
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
	System.out.print("a�Ŀ���b: ");
	b.show();
    }
}