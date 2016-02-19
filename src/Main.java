
public class Main {
	public static void main (String args[]){
		Problems p = new Problems();
		long s, e;
		s = System.currentTimeMillis();
		p.problem3();
		e = System.currentTimeMillis();
		System.out.println("Done in: "+(e-s)+" milliseconds");
	}
}
