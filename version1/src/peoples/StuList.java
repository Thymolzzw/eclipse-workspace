package peoples;
import java.util.*;

public class StuList implements MyList{
	//ʹ��˫�����������洢ѧ����Ϣ
	LinkedList<Student> MyStuList;
	
	public StuList(){
	     this.MyStuList=new LinkedList<Student>();
	}
	
	public int size(){
		return this.MyStuList.size();
    }
	//���ѧ����Ϣ
	public boolean addStu(Student x) {  
		return this.MyStuList.add(x);
	}
	//ɾ��ָ��λ�õ�ѧ����Ϣ
	public Student removeStu(int index)  {
		return this.MyStuList.remove(index);
	}

    public void clear() {      
        this.MyStuList.clear();
    }
	/**
	  * ʹ����ӳ�䷺�������ѧ����Ϣ���ճɼ����������������1����ѧ���򣬲���2�����������
	 * @param x ��xΪ1ʱ����ѧ�ɼ����򣬵�xΪ2ʱ��������ɼ�����
	 */
	public void sort(int x) {   
		
		
	    if(x==1){
	    	TreeMap<Double,Student> mytreemap=new TreeMap<Double,Student>();
	    	Iterator<Student> iter=this.MyStuList.iterator();
	        while(iter.hasNext()){
	        	Student s = iter.next();
	        	mytreemap.put(s.getMathScore(), s);
	        }
		    Collection<Student> mycollection=mytreemap.values();
		    Iterator<Student> myiter=mycollection.iterator();
		    while(myiter.hasNext()) {
		    	myiter.next().print();
		    }
		    System.out.println();
		    mytreemap.clear();
	    }else if(x==2){
	    	TreeMap<Double,Student> mytreemap=new TreeMap<Double,Student>();
	    	Iterator<Student> iter=this.MyStuList.iterator();
	         while(iter.hasNext()){
	        	 Student s = iter.next();
		         mytreemap.put(s.getComputerScore(), s);
	         }
		    Collection<Student> mycollection=mytreemap.values();
		    Iterator<Student> myiter=mycollection.iterator();
		    while(myiter.hasNext()) {
		    	myiter.next().print();
		    }
		    System.out.println();
		    mytreemap.clear();
	    }  
	    
	   
    }
	
	public void print(){
         Iterator<Student> iter=this.MyStuList.iterator();
         while(iter.hasNext()){
        	 iter.next().print();
         }
         System.out.println();
	}
}
