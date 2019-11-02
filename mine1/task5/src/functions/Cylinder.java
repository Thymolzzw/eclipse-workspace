package functions;


/**
 * 定义圆柱体类，继承ObjectVolume抽象类。
 * @author zzw
 *
 */
public class Cylinder extends ObjectVolume{
	double r;
	double h;
	public Cylinder(double r,double h) {
		this.r=r;
		this.h=h;
		
	}
	/**
	 * 重写getVolume(),返回圆柱体的体积。
	 */
	public double getVolume() {
		return Math.pow(r, 2)*Ball.PI*h;
	}
}
