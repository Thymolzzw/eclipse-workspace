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
	//使用双链表泛型类对象存储学生信息
	LinkedList<Student> MyStuList;
	
	public StuList(){
	     this.MyStuList=new LinkedList<Student>();
	}
	
	public int size(){
		return this.MyStuList.size();
    }
	//添加学生信息
	public boolean addStu(Student x) {  
		return this.MyStuList.add(x);
	}
	//删除指定位置的学生信息
	public Student removeStu(int index)  {
	
		return this.MyStuList.remove(index);
		
	}

    public void clear() {      
        this.MyStuList.clear();
    }
	/**
	  * 使用树映射泛型类对象将学生信息按照成绩排序并且输出，参数1按数学排序，参数2按计算机排序
	 * @param x 当x为1时按数学成绩排序，当x为2时按计算机成绩排序。
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
