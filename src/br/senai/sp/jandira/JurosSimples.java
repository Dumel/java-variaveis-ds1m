package br.senai.sp.jandira;

import java.util.Scanner;                                                      //1000, 5, 6

public class JurosSimples {

	public static void main(String[] args) {
		
		double juros, capital, taxa, tempo; 
		
		Scanner leitor;
		
		leitor = new Scanner(System.in); //captura o que o usuario escreveu.
		
		System.out.print("Qual é a capital? "); //emitir uma mensagem na tela para o usuário.
		capital = leitor.nextDouble();
		
		System.out.print("Qual é a taxa de juros?");
		taxa = leitor.nextDouble();
		
		System.out.print("Qual o tempo? ");
		tempo = leitor.nextDouble();
		
		juros = capital * taxa /100 * tempo; // J = C.I.T
		
		System.out.print("O valor do juros é: " + juros); //System.out.printf("O valor do juros é %s", juros); 
		// print "f" é usado quando tem porcentagem; ex: %s.
		System.out.println();
		System.out.printf("Ao final do período você terá R$%s", juros + capital);
		
		

	}

}
