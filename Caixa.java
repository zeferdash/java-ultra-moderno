public class Caixa<T>{
	private T coisaNaCaixa;

	public void guardar(T coisa){
		this.coisaNaCaixa = coisa;
	}

	public T pegar(){
		return coisaNaCaixa;
	}

public static void main(String[] args){
	Caixa<String> caixaDeTexto = new Caixa<>();
	caixaDeTexto.guardar("Guardei esse texto na caixa.");
	String texto = caixaDeTexto.pegar();
	System.out.println(texto);
	
	Caixa<Integer> caixaDeNumeros = new Caixa<>();
	Integer numero = Integer.valueOf(1);
	caixaDeNumeros.guardar(numero);
	System.out.println(caixaDeNumeros.pegar());
	}
}