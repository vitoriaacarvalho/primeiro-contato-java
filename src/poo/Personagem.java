package poo;

import java.util.Random;

public class Personagem {

	String nome;
	int nivel;
	int forca;
	
	int calcularDano() {
		Random gerador=new Random();
		int dado20Faces=1+gerador.nextInt(19);
		
		int dano=dado20Faces+forca;
		
		return dano;
	}
	
	void atacar(String alvo, String habilidade) {
		
		int danoCausado=calcularDano();
		
		if(habilidade.length()==0) {
			System.out.printf("o personagem %s atacou %s e causou o dan %d\n", nome, alvo, danoCausado);
		}else {
			System.out.printf("o personagem %s atacou %s com a habilidade %s e causou o dano %d\n", nome, alvo, habilidade, danoCausado);
		}	
	}
}
