package edu.maicon.incremento;

public class Operadores {
	public static void main(String[] args) {
		int numero = 5;
		
		// x repeticao
		// incremento		
		System.out.println(++ numero); // Neste caso acontece o incremento por conta de o codigo primeiro incrementar e dps vir o valor
		System.out.println(numero ++); // Já neste caso a regra é de incremente é de antes de incrementar é primeiro o valor antigo e depois o incremento
		System.out.println(numero ++);
		
		// decremento
		System.out.println(numero --); // Neste caso acontece o incremento por conta de o codigo primeiro incrementar e dps vir o valor
		System.out.println(numero --); // Já neste caso a regra é de decremento é de antes de incrementar é primeiro o valor antigo e depois o incremento
		System.out.println(numero);
		
		boolean variavel = true;
		
		variavel = !variavel;
		
		System.out.println(variavel);
	}
}
