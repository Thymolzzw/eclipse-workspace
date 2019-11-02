package mypackage;
import java.util.*;
class MyKey implements Comparable<Object> { 
  double number=0.0; 
  MyKey(double number){
     this.number=number;
   }
  public int compareTo(Object b){ 
     MyKey st=(MyKey)b;
     if(this.number>=st.number){
           return 1;
     }
     else{
          return -1;
     }
   }
}
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
	    	TreeMap<MyKey,Student> mytreemap=new TreeMap<MyKey,Student>();
	    	Iterator<Student> iter=this.MyStuList.iterator();
	        while(iter.hasNext()){
	        	Student s = iter.next();
	        	mytreemap.put(new MyKey(s.getMathScore()), s);
	        }
		    Collection<Student> mycollection=mytreemap.values();
		    Iterator<Student> myiter=mycollection.iterator();
		    while(myiter.hasNext()) {
		    	myiter.next().print();
		    }
		    System.out.println();
		    mytreemap.clear();
	    }else if(x==2){
	    	TreeMap<MyKey,Student> mytreemap=new TreeMap<MyKey,Student>();
	    	Iterator<Student> iter=this.MyStuList.iterator();
	        while(iter.hasNext()){
	        	Student s = iter.next();
	        	mytreemap.put(new MyKey(s.getComputerScore()), s);
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
	
	public void writeReport(String fileName) {
		Iterator<Student> iter=this.MyStuList.iterator();
		while(iter.hasNext()){
			 iter.next().writeReport(fileName);
		}
	}
}
