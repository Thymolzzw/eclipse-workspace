package electronics;

/**
 * ������࣬ʵ��UnitPrice�ӿڡ�
 * @author zzw
 *
 */
public class Computer implements UnitPrice{
	double price;
	public Computer(double price) {
		this.price=price;
	}
	/**
	 * ��дunitprice()������
	 */
	public double unitprice() {
		return this.price;
	}
}
