package exercicios_pt2;

public class Grades {
	String name;
	Double t1,t2,t3;
	
	public double finalGrade() {
		return t1+t2+t3;
		
	}
	
	public double missingPoints() {
		if (finalGrade()<60) {
			System.out.println("FAILED");
			return 60.0-finalGrade();
		}else {
			System.out.println("PASS");
			return 0.0;
		}
	}
}
