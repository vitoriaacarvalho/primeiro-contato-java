package exercicios_pt2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_poo3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		
		Employee funcionario1=new Employee();
		
		System.out.println("nome do funcionario: ");
		funcionario1.name=sc.nextLine();
		
		System.out.println("salário atual: ");
		funcionario1.grossSalary=sc.nextDouble();
		
		System.out.print("imposto mensal: ");
		funcionario1.tax=sc.nextDouble();
		
		System.out.println("porcentagem de aumento: ");
		double percentage = sc.nextDouble();
		funcionario1.increaseSalary(percentage);
		
		
		
		
		
		System.out.println(funcionario1);
		
		
		sc.close();
		
	}

}
