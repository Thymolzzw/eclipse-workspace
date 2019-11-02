package mystudent;


public class StuList
{
	//����һ��ѧ��������
	Student[] stu;
	//�������
	private int maxLength=0;  
	//ʵ������
	private int length=0;   
	
	/**
	 * ���캯��������ѧ���������
	 * @param maxLength  ѧ������������󳤶�
	 */
	public StuList(int maxLength){
		this.maxLength=maxLength;
		this.stu=new Student[this.maxLength];
	}
	
	/**
	 * �����������ж������Ƿ����
	 * @return  ��������true����֮���false��
	 */
	private boolean isOverflow() {    
	    return this.length>this.maxLength ? true : false;
	}
	/**
	 * �ж������Ƿ�Ϊ��
	 * @return  ����Ϊ�������true����֮�����false��
	 */
	public boolean isEmpty() {
	     return this.length==0 ? true : false;
	}

	/**
	 * ���ѧ����Ϣ
	 * @param x  Student���ͣ��β�
	 * @return  ��ӳɹ������true����Ӳ��ɹ������false��
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
	 * ɾ��ָ��λ�õ�ѧ����Ϣ
	 * @param index Ҫɾ��ѧ������ţ�ѧ����Ŵ�1��ʼ��
	 * @return ����ɾ����ѧ���ࡣ
	 */
	public Student removeStu(int index)  
	{
		if(isEmpty())
		{
			System.out.println("ѧ����յ�~~~ɾ��ʧ��~~~~");
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
	 * ���ճɼ����򣬲���1����ѧ���򣬲���2�����������
	 * @param x  ѡ�����.Ϊ1����ѧ�ɼ�����Ϊ2�������ɼ�����
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
	 * ������������ѧ���б����Ϣ��
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