package poo;

public class criando_personagens {

	public static void main(String[] args) {
		
		Personagem heroi= new Personagem();
		heroi.nome="Tony Stark";
		heroi.nivel=3;
		heroi.forca=18;
		
		heroi.atacar("Thanos", "olhos de laser");

	}

}
