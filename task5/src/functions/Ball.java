package functions;


/**
 * �������࣬�̳�ObjectVolume�����ࡣ
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
	 * ��дgetVolume(),������������
	 */
	public double getVolume() {
		return 4*r*r*r*PI/3;
	}

}
