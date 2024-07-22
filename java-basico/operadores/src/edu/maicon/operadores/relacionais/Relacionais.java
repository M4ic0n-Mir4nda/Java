package edu.maicon.operadores.relacionais;

public class Relacionais {
	public static void main(String[] args) {
		// classe Operadores.java
		int a, b;

		a = 6;
		b = 6;

		/* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE */
		String resultado = "";
		
		if(a==b)
		   resultado = "verdadeiro";
		else
		   resultado = "falso";
		
		System.out.println(resultado);

		//MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
		
		String resultado2 = a == b ? "verdadeiro" : "falso";
		
		if(a==b)
			resultado2 = "verdadeiro";
		else
			resultado2 = "falso";
		
		System.out.println(resultado2);
		
	}
}
