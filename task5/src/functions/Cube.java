package functions;


/**
 * �����������࣬�̳�ObjectVolume�����ࡣ
 * @author zzw
 *
 */
public class Cube extends ObjectVolume{
	double side;
	public Cube(double side){
		this.side=side;
	}
	/**
	 * ��дgetVolume(),����������������
	 */
	public double getVolume() {
		return Math.pow(side, 3);
	}
}
