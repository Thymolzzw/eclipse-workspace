package mypeople;


public abstract class Student 
{
	int id;
	String name;
	double math_grades;
	double computer_grades;
	
    /**
           * 构造函数。
     * @param id   学号
     * @param name   名字 
     * @param math_grades   数学成绩
     * @param computer_grades   计算机成绩
     */
	public Student(int id,String name,double math_grades,double computer_grades){
		this.id=id;
		this.name=name;
		this.math_grades=math_grades;
		this.computer_grades=computer_grades;
	}
	
    /**
	 * <p>定义setId方法，完成对类中id属性的赋值。</p>
	 * @param id  要设置的类中属性id的值
	 */
	public void setId(int id) {
		this.id=id;
	}
	/**
	 * <p>定义getId方法，得到类中属性值id。</p>
	 * @return   返回类中id属性值
	 */
	public int getId() {
		return this.id;
	}
	/**
	 * <p>定义setName方法，完成对类中name属性的赋值。</p>
	 * @param name  要设置的类中name属性值
	 */
	public void setName(String name) {
		this.name=name;
	}
	/**
	 * <p>定义geName方法，得到类中属性值name。</p>
	 * @return  返回类中属性name的值
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * <p>定义setMathGrades方法，完成对类中math_grades属性的赋值。</p>
	 * @param math_grades  要设置的类中属性math_grades的值
	 */
	public void setMathGrades(double math_grades) {
		this.math_grades=math_grades;
	}
	/**
	 * <p>定义getMathGrades方法，得到类中属性值math_grades。</p>
	 * @return  返回类中属性math_grades的值
	 */
	public double getMathGrades() {
		return this.math_grades;
	}
	/**
	 * <p>定义setComputerGrades方法，完成对类中computer_grades属性的赋值。</p>
	 * @param computer_grades  要设置的类中属性computer_grades的值
	 */
	public void setComputerGrades(double computer_grades) {
		this.computer_grades=computer_grades;
	}
	/**
	 * <p>定义getComputerGrades方法，得到类中属性值computer_grades。</p>
	 * @return  返回类中属性computer_grades的值
	 */
	public double getComputerGrades() {
		return this.computer_grades;
	}
	/**
	 * 抽象方法，输出函数，输出当前学生的信息。
	 */
    public abstract void print(); 
	
}

