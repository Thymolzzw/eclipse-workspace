package electronics;

/**
 * 手机类，实现UnitPrice接口。
 * @author zzw
 *
 */
public class Phone implements UnitPrice{
	double price;
	public Phone(double price) {
		this.price=price;
	}
	/**
	 * 重写unitprice()方法。
	 */
	public double unitprice() {
		return this.price;
	}
}
