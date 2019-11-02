package student;
/*
 * <p>����һ��ѧ���࣬��Ա���԰���ѧ����ѧ�š���������ѧ�ɼ��������ɼ���</p>
 * <p>�������������Եĸ�ֵ�����ͻ����������ֵ�ķ�����</p>
 */
public class Student implements Comparable<Student>{
		String id;
		String name;
		double math_grades;
		double computer_grades;
		static String mathOrComputer="������ѧ�ɼ�";
		/**
		 * ���캯����
		 * @param id ѧ��ѧ��
		 * @param name  ѧ������
		 * @param math_grades ѧ����ѧ�ɼ�
		 * @param computer_grades ѧ��������ɼ�
		 */
		Student(String id,String name,double math_grades,double computer_grades){
			this.id=id;
			this.name=name;
			this.math_grades=math_grades;
			this.computer_grades=computer_grades;
		}
		/**
		 * <p>����setId��������ɶ�����id���Եĸ�ֵ��</p>
		 * @param id  Ҫ���õ���������id��ֵ
		 */
		public void setId(String id) {
			this.id=id;
		}
		/**
		 * <p>����getId�������õ���������ֵid��</p>
		 * @return   ��������id����ֵ
		 */
		public String getId() {
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
		
		
		
		public int compareTo(Student o) {
			if(Student.mathOrComputer.equals("������ѧ�ɼ�")) {
				if(this.math_grades>o.math_grades) {
					return 1;
				}else if(this.math_grades<o.math_grades) {
					return -1;
				}
				return 0;
			}else if(Student.mathOrComputer.equals("���ռ�����ɼ�")){
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
