import java.util.*;

public class ExemploSet{
	public static void main(String[] args){
		Set<Integer> numeros = new HashSet<>();
		numeros.add(1);
		numeros.add(6);
		numeros.add(14);

		System.out.println("Números: " + numeros);

		// Verificando se contém o número 15
		System.out.println("Contém o número 15? : " + numeros.contains(15));
		System.out.println("Contém o número 14? : " + numeros.contains(14));
	}
}