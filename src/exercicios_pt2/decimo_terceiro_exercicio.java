package exercicios_pt2;

import java.util.Scanner;

public class decimo_terceiro_exercicio {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Digite a quantidade de n�meros que voc� quer inserir: ");
		int quant=sc.nextInt();
		
		for (int i=0; i<=quant; i++) {
			
			if (i==0) {
				System.out.println("agora vamos montar pares!");
			}
			else {
				System.out.println("agora vamos para o round "+(i+1));
			}
			
			System.out.print("primeiro valor: ");
			int n1=sc.nextInt();
			
			System.out.print("segundo valor: ");
			int n2=sc.nextInt();
			
			//mostrando a divis�o
			
			float div=(int)n1/n2;
			if (div==0) {
				System.out.println("divis�o imposs�vel");
			}
			else {
				System.out.println("a divis�o desses n�meros foi: "+ div);
			}
			
			
			
			
		}

	}

}
