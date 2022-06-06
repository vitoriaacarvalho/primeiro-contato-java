package exercicios_pt2;

public class Employee {
	String name;
	Double grossSalary, tax;
	
    public void increaseSalary(double percentage) {
    	grossSalary+=((percentage*grossSalary)/100);
	}
	
	public double netSalary() {
		return grossSalary-tax;
	}
	
	public String toString() {
		return name+ ", $"+String.format("%.2f", netSalary());
	}
	
}
