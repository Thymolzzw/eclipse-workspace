package Parallelogram;


class Quadrangle{
	public static void draw(Quadrangle q){
		
	}
}
public class Parallelogram extends Quadrangle{
	public static void main(String[] args) {
		Quadrangle q = new Parallelogram();
		if(q instanceof Parallelogram) {
			System.out.println("yes!");
		}else {
			System.out.println("no!");
		}
	}
	
}
