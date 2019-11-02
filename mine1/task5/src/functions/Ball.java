package functions;


/**
 * 定义球类，继承ObjectVolume抽象类。
 * @author zzw
 *
 */
public class Ball extends ObjectVolume{
	public static double PI=3.1415926;
	double r;
	public Ball(double r){
		this.r=r;
	}
	/**
	 * 重写getVolume(),返回球的体积。
	 */
	public double getVolume() {
		return 4*r*r*r*PI/3;
	}

}
