package electronics;

/**
 * ���ӻ��࣬ʵ��UnitPrice�ӿڡ�
 * @author zzw
 *
 */
public class TV implements UnitPrice{
	double price;
	public TV(double price) {
		this.price=price;
	}
	/**
	 * ��дunitprice()������
	 */
	public double unitprice() {
		return this.price;
	}
}
