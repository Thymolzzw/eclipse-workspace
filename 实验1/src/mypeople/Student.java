package mypeople;


public abstract class Student 
{
	int id;
	String name;
	double math_grades;
	double computer_grades;
	
    /**
           * ���캯����
     * @param id   ѧ��
     * @param name   ���� 
     * @param math_grades   ��ѧ�ɼ�
     * @param computer_grades   ������ɼ�
     */
	public Student(int id,String name,double math_grades,double computer_grades){
		this.id=id;
		this.name=name;
		this.math_grades=math_grades;
		this.computer_grades=computer_grades;
	}
	
    /**
	 * <p>����setId��������ɶ�����id���Եĸ�ֵ��</p>
	 * @param id  Ҫ���õ���������id��ֵ
	 */
	public void setId(int id) {
		this.id=id;
	}
	/**
	 * <p>����getId�������õ���������ֵid��</p>
	 * @return   ��������id����ֵ
	 */
	public int getId() {
		return this.id;
	}
	/**
	 * <p>����setName��������ɶ�����name���Եĸ�ֵ��</p>
	 * @param name  Ҫ���õ�����name����ֵ
	 */
	public void setName(String name) {
		this.name=name;
	}
	/**
	 * <p>����geName�������õ���������ֵname��</p>
	 * @return  ������������name��ֵ
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * <p>����setMathGrades��������ɶ�����math_grades���Եĸ�ֵ��</p>
	 * @param math_grades  Ҫ���õ���������math_grades��ֵ
	 */
	public void setMathGrades(double math_grades) {
		this.math_grades=math_grades;
	}
	/**
	 * <p>����getMathGrades�������õ���������ֵmath_grades��</p>
	 * @return  ������������math_grades��ֵ
	 */
	public double getMathGrades() {
		return this.math_grades;
	}
	/**
	 * <p>����setComputerGrades��������ɶ�����computer_grades���Եĸ�ֵ��</p>
	 * @param computer_grades  Ҫ���õ���������computer_grades��ֵ
	 */
	public void setComputerGrades(double computer_grades) {
		this.computer_grades=computer_grades;
	}
	/**
	 * <p>����getComputerGrades�������õ���������ֵcomputer_grades��</p>
	 * @return  ������������computer_grades��ֵ
	 */
	public double getComputerGrades() {
		return this.computer_grades;
	}
	/**
	 * ���󷽷�����������������ǰѧ������Ϣ��
	 */
    public abstract void print(); 
	
}

