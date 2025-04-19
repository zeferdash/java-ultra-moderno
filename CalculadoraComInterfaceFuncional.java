@FunctionalInterface
interface Calculadora {
	double calcular(double a, double b);
}

public class CalculadoraComInterfaceFuncional{
	public static void main(String [] args){
		
		Calculadora somar = (a, b) -> a + b;
		Calculadora subtrair = (a, b) -> a - b;
		Calculadora multiplicar = (a, b) -> a * b;
		Calculadora dividir = (a, b) -> a / b;

		System.out.println("Soma: " + somar.calcular(5,3));
		System.out.println("Subtração: " + subtrair.calcular(5,3));
		System.out.println("Multiplicação: " + multiplicar.calcular(5,3));
		System.out.println("Divisão: " + dividir.calcular(5,3));
	}
}
