import java.util.Scanner;

public class oitavo_exercicio {

	public static void main(String[] args) {
		 System.out.print("digite um número: ");
		 
		 Scanner sc=new Scanner(System.in);
		 int numero=sc.nextInt();
		 int soma=0;
		 
		 while (numero!=0) {
			 soma+=numero;
			 System.out.print("digite um número: ");
			 numero=sc.nextInt();
			 
		 }
		 
		 sc.close();
		 
		 System.out.print("EBA! você finalmente digitou 0! e a soma de todos os números digitados foi "+ soma);

	}

}
