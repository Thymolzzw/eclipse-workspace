package functions;


/**
 * ����Բ�����࣬�̳�ObjectVolume�����ࡣ
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
	 * ��дgetVolume(),����Բ����������
	 */
	public double getVolume() {
		return Math.pow(r, 2)*Ball.PI*h;
	}
}
