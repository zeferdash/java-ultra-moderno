abstract class Animal {
	public abstract void fazerSom();

}

class Cachorro extends Animal {
	public void fazerSom(){
		System.out.println("O cachorro faz au au");
	}
}

class Gato extends Animal {
	public void fazerSom(){
		System.out.println("O gato faz miau miau");
	}
}

public class TestPolimorfismo{
	public static void main(String[] args){
		Animal meuCachorro = new Cachorro();
		
		Animal meuGato = new Gato();

		meuCachorro.fazerSom();
		meuGato.fazerSom();
	}
}