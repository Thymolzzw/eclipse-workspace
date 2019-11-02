package outerclass;

public class OuterClass {
	innerClass in = new innerClass();
	public void ouf() {
		in.inf();
	}
	class innerClass{
		innerClass(){
			
		}
		public void inf() {
			
		}
		int y=0;
	}
	
	public innerClass doit() {
		in.y=4;
		return in;
	}
	
	public static void main(String[] args) {
		OuterClass out=new OuterClass();
		OuterClass.innerClass in=out.doit();
		System.out.println(in.y);
		OuterClass.innerClass in1=out.new innerClass();
		System.out.println(in1.y);
	}
}
