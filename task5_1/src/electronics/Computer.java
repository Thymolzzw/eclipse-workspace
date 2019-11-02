package electronics;

/**
 * 计算机类，实现UnitPrice接口。
 * @author zzw
 *
 */
public class Computer implements UnitPrice{
	double price;
	public Computer(double price) {
		this.price=price;
	}
	/**
	 * 重写unitprice()方法。
	 */
	public double unitprice() {
		return this.price;
	}
}
