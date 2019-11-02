package student;
/*
 * <p>定义一个学生类，成员属性包括学生的学号、姓名、数学成绩与计算机成绩。</p>
 * <p>包括对类中属性的赋值方法和获得类中属性值的方法。</p>
 */
public class Student implements Comparable<Student>{
		String id;
		String name;
		double math_grades;
		double computer_grades;
		static String mathOrComputer="按照数学成绩";
		/**
		 * 构造函数。
		 * @param id 学生学号
		 * @param name  学生姓名
		 * @param math_grades 学生数学成绩
		 * @param computer_grades 学生计算机成绩
		 */
		Student(String id,String name,double math_grades,double computer_grades){
			this.id=id;
			this.name=name;
			this.math_grades=math_grades;
			this.computer_grades=computer_grades;
		}
		/**
		 * <p>定义setId方法，完成对类中id属性的赋值。</p>
		 * @param id  要设置的类中属性id的值
		 */
		public void setId(String id) {
			this.id=id;
		}
		/**
		 * <p>定义getId方法，得到类中属性值id。</p>
		 * @return   返回类中id属性值
		 */
		public String getId() {
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
		
		
		
		public int compareTo(Student o) {
			if(Student.mathOrComputer.equals("按照数学成绩")) {
				if(this.math_grades>o.math_grades) {
					return 1;
				}else if(this.math_grades<o.math_grades) {
					return -1;
				}
				return 0;
			}else if(Student.mathOrComputer.equals("按照计算机成绩")){
				if(this.computer_grades>o.computer_grades) {
					return 1;
				}else if(this.computer_grades<o.computer_grades) {
					return -1;
				}
				return 0;
			}
			return 0;
			
		}
		
}
