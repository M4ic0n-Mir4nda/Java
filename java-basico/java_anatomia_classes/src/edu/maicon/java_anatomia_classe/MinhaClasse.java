package edu.maicon.java_anatomia_classe;

public class MinhaClasse {
	public static void main(String[] args) {
		  final String BR = "Brasil"; // final é usada para reservar o valor
		// ------------------------------

		  String meuNome = "Maicon";
		  
		  int anoFabricacao = 2024; // Todo tipo de variavel - "Tipo" "Nome bem definido" = valor(podendo ser definido ou não)
		  boolean verdadeira = true;
		  
		  anoFabricacao = 2023;
		// ------------------------------

		String primeiroNome = "Maicon";
		String segundoNome = "Miranda";
		String nomeCompleto = nomeCompleto(primeiroNome, segundoNome); // Chamada de função

		System.out.print(nomeCompleto);
		// ------------------------------
	}

	// Como é feita uma função em Java
	public static String nomeCompleto(String primeiroNome, String segundoNome) { 
		return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
	}

}
