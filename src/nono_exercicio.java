import java.util.Scanner;

public class nono_exercicio {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int senha, loginsenha;
		
		System.out.print("Escolha sua senha numérica: ");
		senha=sc.nextInt();
		
		System.out.println("-------------------------");
		
			
		System.out.println("digite sua senha para entrar no programa: ");
		loginsenha=sc.nextInt();
		
		while(loginsenha!=senha) {
			System.out.print("ERRO! digite sua senha para entrar no programa");
			loginsenha=sc.nextInt();
		}
		
		sc.close();
		
		System.out.printf("oi! seja bem-vindo(a) ao nosso programa");
		
	}

}
