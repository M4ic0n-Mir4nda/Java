package edu.maicon.operadores.ternario;

public class Ternarios {
	public static void main(String[] args) {
		//classe Operadores.java
		int numero1 = 1;
		int numero2 = 2;

		if(numero1 > numero2)
			System.out.println("Numero 1 maior que numero 2");

		if(numero1 < numero2)
			System.out.println("Numero 1 menor que numero 2");

		if(numero1 >= numero2)
			System.out.println("Numero 1 maior ou igual que numero 2");

		if(numero1 <= numero2)
			System.out.println("Numero 1 menor ou igual que numero 2");

		if(numero1 != numero2)
			System.out.println("Numero 1 é diferente de numero 2");
		
		String nomeUm = "Maicon";
		String nomeDois = new String("Maicon"); // Aqui existem dois objetos
		
		System.out.println(nomeUm == nomeDois); // o Resultado é false por conta de o nomeDois ser um novo objeto
		System.out.println(nomeUm.equals(nomeDois)); // Neste caso é true pq o equals compara o conteudo do objeto 
	}
}
