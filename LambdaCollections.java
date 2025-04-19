import java.util.Arrays;
import java.util.List;

public class LambdaCollection{
	public static void main(String [] args){
		List<Integer> listaDeNumeros = Arrays.asList(1,2,3,4,5);
		listaDeNumeros.forEach((Integer numero) -> System.out.println(numero));
	}
}