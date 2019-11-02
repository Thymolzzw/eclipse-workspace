package mypeople;


public class StuList implements MyList //StuListʵ����MyList�ӿ�
{
	private Student[] stu;
	private int length;   //ʵ������
	public StuList(int len)
	{
		this.stu=new Student[len];
	}
	/**
	  *�����������ж������Ƿ����
	 * @return  ����boolean���ͣ�����򷵻�true��������򷵻�false��
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
	 * �ж������Ƿ�Ϊ��
	 */
	public boolean isEmpty()    
	{
		return this.length==0 ? true : false; 
	}
	/**
	 * ���ѧ����Ϣ
	 * @param x  Ҫ���ѧ�������á�
	 * @return   ��ӳɹ�����true�����ɹ���ķ���false��
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
	  * ɾ��ָ��λ�õ�ѧ����Ϣ
	 * @param index  Ҫɾ��ѧ����λ��,�ӵ�һ����ʼ��
	 * @return  ɾ���ɹ��򷵻�true��ɾ�����ɹ��򷵻�false��
	 */
	public Student removeStu(int index)  
	{
		if(isEmpty()) {
			System.out.println("ɾ��ʧ�ܣ�ѧ����Ϊ�գ�");
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
	 * ���ճɼ����򣬲���1����ѧ���򣬲���2�����������
	 * @param x  ѡ�����.Ϊ1����ѧ�ɼ�����Ϊ2�������ɼ�����
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
	 * ������������ѧ���б����Ϣ��
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
