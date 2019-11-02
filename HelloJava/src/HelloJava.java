//package Number
import A2
class A{
	void f() {
		System.out.println("I love Java!");
	}
}
public class HelloJava {
	/**pa
	 * @ram args
	 */
	public static void main(String[] args) {
		int arry[][]= {{4,3},{1,2}};
		for(int x[]:arry) {
			for(int e:x){
				if(e==x.length) {
					System.out.println(e);
				}else {
					System.out.print(e+"¡¢");
				}
				
			}
		}
		
		A a = new A();
		a.f();
		
	}
	

}
