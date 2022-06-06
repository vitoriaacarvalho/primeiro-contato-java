package exercicios_pt2;

import java.util.Scanner;

public class exercicio_poo4 {

	public static void main(String[] args) {
		Grades aluno=new Grades();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("nome: ");
		aluno.name=sc.nextLine();
		
		System.out.println("primeiro trimestre: ");
		aluno.t1=sc.nextDouble();
		
		System.out.println("segundo trimestre: ");
		aluno.t2=sc.nextDouble();
		
		System.out.println("terceiro trimestre: ");
		aluno.t3=sc.nextDouble();
		
		System.out.printf("final grade: %.2f%n", aluno.finalGrade());

		System.out.println(aluno.missingPoints());
		
		sc.close();
	}

}
