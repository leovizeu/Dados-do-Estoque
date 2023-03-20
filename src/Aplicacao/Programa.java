package Aplicacao;

import java.util.Locale;
import java.util.Scanner;
import Entidades.Produto;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		
		System.out.println("Crie novo Produto: ");
		System.out.print("Produto: ");
		produto.nome = sc.nextLine();
		
		System.out.print("Preço: ");
		produto.preco = sc.nextDouble();
		
		System.out.print("Quantidade no Estoque: ");
		produto.quantidade = sc.nextInt();
		
		System.out.println();
		System.out.println("Dados do Produto: " + produto.toString());
		
		System.out.println();
		System.out.println("Diga o número de produtos para adicionar no estoque: ");
		int quantidade = sc.nextInt();
		produto.addProduto(quantidade);
		
		System.out.println();
		System.out.println("Dados Atualizados: " + produto.toString());
		
		System.out.println();
		System.out.println("Diga o número de produtos para retirar do estoque: ");
		quantidade = sc.nextInt();
		produto.removerProduto(quantidade);
		
		System.out.println();
		System.out.println("Dados Atualizados: " + produto.toString());
		
		sc.close();
	}
}
