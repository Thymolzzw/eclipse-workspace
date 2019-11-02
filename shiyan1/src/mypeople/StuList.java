package mypeople;


public class StuList implements MyList //StuList实现了MyList接口
{
	private Student[] stu;
	private int length;   //实际容量
	public StuList(int len)
	{
		this.stu=new Student[len];
	}
	/**
	  *辅助方法，判断数组是否溢出
	 * @return  返回boolean类型，溢出则返回true，不溢出则返回false。
	 */
	private boolean isOverflow()    
	{
		if(this.length>this.stu.length) {
			return true;
		}else {
			return false;
		}
	}
	/**
	 * 判断数组是否为空
	 */
	public boolean isEmpty()    
	{
		return this.length==0 ? true : false; 
	}
	/**
	 * 添加学生信息
	 * @param x  要填的学生类引用。
	 * @return   添加成功返回true，不成功则的返回false。
	 */
	public boolean addStu(Student x)  
	{
		if(isOverflow()) {
			return false;
		}
		this.stu[this.length]=x;
		this.length++;
		return true;
	}
	/**
	  * 删除指定位置的学生信息
	 * @param index  要删除学生的位置,从第一个开始。
	 * @return  删除成功则返回true，删除不成功则返回false。
	 */
	public Student removeStu(int index)  
	{
		if(isEmpty()) {
			System.out.println("删除失败，学生表为空！");
			return null;
		}
		Student t=stu[index-1];
		for(int i=index-1;i<this.length;i++) {
			stu[i]=stu[i+1];
		}
		this.length--;
		return t;
	}
	/**
	 * 按照成绩排序，参数1按数学排序，参数2按计算机排序
	 * @param x  选择参数.为1则按数学成绩排序，为2则计算机成绩排序。
	 */
	public void sort(int x)   
	{
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
	public void print()
	{
		System.out.println("---------------------------------------------------------------------");
		for(int i=0;i<this.length;i++) {
			this.stu[i].print();
		}
		System.out.println("---------------------------------------------------------------------");
		System.out.println();
	}
		
}
