package exercicios_pt2;

import java.util.Scanner;

public class decimo_quarto_exercicio_funcoes {

	public static void main(String[] args) {
		System.out.println("vamos fazer uma multiplicação!");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("escolha um número: ");
		int n1=sc.nextInt();
		
		System.out.println("escolha o segundo número: ");
		int n2=sc.nextInt();
		
		System.out.print("o resultado é: ");
		System.out.println(trabalhando_com_funcoes.numeros(n1,n2));
		
		sc.close();
		

	}

}
