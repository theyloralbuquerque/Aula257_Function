package util;

import java.util.function.Function;

import entities.Product;

// A classe UpperCaseName implements um Function que tem como entrada um tipo Product e uma String como saída.
public class UpperCaseName implements Function<Product, String> {

	@Override
	public String apply(Product p) { // O método apply() recebe um objeto Product como parâmetro e retorna uma String.
		return p.getName().toUpperCase();
	}
}