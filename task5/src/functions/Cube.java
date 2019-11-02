package functions;


/**
 * 定义正方体类，继承ObjectVolume抽象类。
 * @author zzw
 *
 */
public class Cube extends ObjectVolume{
	double side;
	public Cube(double side){
		this.side=side;
	}
	/**
	 * 重写getVolume(),返回正方体的体积。
	 */
	public double getVolume() {
		return Math.pow(side, 3);
	}
}
