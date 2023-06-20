package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		/*
		 * list.stream(): Converte a Lista list para stream.
		 * .map(): Aplica uma Função a todos elementos de uma stream e recebe parâmetro um Function, que neste caso é a própria expressão lambda declarada. 
		 * .collect(Collectors.toList()): Converte uma stream em uma Lista.
		 */
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

		names.forEach(System.out::println); // Utilizando o Reference method: System.out é a classe e println é o método.
	}
}