package electronics;

/**
 * �ֻ��࣬ʵ��UnitPrice�ӿڡ�
 * @author zzw
 *
 */
public class Phone implements UnitPrice{
	double price;
	public Phone(double price) {
		this.price=price;
	}
	/**
	 * ��дunitprice()������
	 */
	public double unitprice() {
		return this.price;
	}
}
