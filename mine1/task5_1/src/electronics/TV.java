package electronics;

/**
 * 电视机类，实现UnitPrice接口。
 * @author zzw
 *
 */
public class TV implements UnitPrice{
	double price;
	public TV(double price) {
		this.price=price;
	}
	/**
	 * 重写unitprice()方法。
	 */
	public double unitprice() {
		return this.price;
	}
}
