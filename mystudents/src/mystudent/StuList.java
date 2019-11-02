package mystudent;


public class StuList
{
	//声明一个学生类数组
	Student[] stu;
	//最大容量
	private int maxLength=0;  
	//实际容量
	private int length=0;   
	
	/**
	 * 构造函数，创建学生类的数组
	 * @param maxLength  学生类的数组的最大长度
	 */
	public StuList(int maxLength){
		this.maxLength=maxLength;
		this.stu=new Student[this.maxLength];
	}
	
	/**
	 * 辅助方法，判断数组是否溢出
	 * @return  溢出则输出true，反之输出false。
	 */
	private boolean isOverflow() {    
	    return this.length>this.maxLength ? true : false;
	}
	/**
	 * 判断数组是否为空
	 * @return  数组为空则输出true，反之则输出false。
	 */
	public boolean isEmpty() {
	     return this.length==0 ? true : false;
	}

	/**
	 * 添加学生信息
	 * @param x  Student类型，形参
	 * @return  添加成功则输出true，添加不成功则输出false。
	 */
	public boolean addStu(Student x) {
		if(isOverflow()) {
			return false;
		}
		this.stu[this.length]=new Student(x.id,x.name,x.math_grades,x.computer_grades);
		this.length++;
		return true;
	}
	
	/**
	 * 删除指定位置的学生信息
	 * @param index 要删除学生的序号，学生序号从1开始。
	 * @return 返回删除的学生类。
	 */
	public Student removeStu(int index)  
	{
		if(isEmpty())
		{
			System.out.println("学生表空的~~~删除失败~~~~");
			return null;
		}
		Student temp=stu[index-1];
		for(int i=index-1;i<this.length;i++) {
			stu[i]=stu[i+1];
		}
		this.length--;
		return temp;
	}
	
	/**
	 * 按照成绩排序，参数1按数学排序，参数2按计算机排序
	 * @param x  选择参数.为1则按数学成绩排序，为2则计算机成绩排序。
	 */
	public void sort(int x)  {
		if(x==1) {
			for(int i=1;i<this.length;i++) {
				for(int j=0;j<this.length-i;j++) {
					if(this.stu[j].getMathGrades()>this.stu[j+1].getMathGrades()) {
						Student temp;
						temp=this.stu[j];
						this.stu[j]=this.stu[j+1];
						this.stu[j+1]=temp;
					}
				}
			}
		}else if(x==2){
			for(int i=1;i<this.length;i++) {
				for(int j=0;j<this.length-i;j++) {
					if(this.stu[j].getComputerGrades()>this.stu[j+1].getComputerGrades()) {
						Student temp;
						temp=this.stu[j];
						this.stu[j]=this.stu[j+1];
						this.stu[j+1]=temp;
					}
				}
			}
		}
    }
	/**
	 * 输出函数，输出学生列表的信息。
	 */
	public void print(){
		System.out.println("---------------------------------------------------------------------");
		for(int i=0;i<this.length;i++) {
			this.stu[i].show();
		}
		System.out.println("---------------------------------------------------------------------");
		System.out.println();
	}
		
}