package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import domain.Product;


public class ProductDao {

	private Map<Integer, Product> productsDb = new HashMap<>();
	{
		productsDb.put(1, new Product(1, "Javascript", "book1.png","short description","Testing Full Description ...", 9.6, 1));
		productsDb.put(2, new Product(2, "PHP", "Books.png","short description","Testing... Full Description", 9.7, 1));
		productsDb.put(3, new Product(3, "Java", "book1.png","short description","Testing Full Description ...", 9.6, 1));
		productsDb.put(4, new Product(4, "Python", "Books.png","short description","Testing... Full Description", 9.7, 1));
		productsDb.put(5, new Product(5, "Network", "book1.png","short description","Testing Full Description ...", 9.6, 1));
		productsDb.put(6, new Product(6, "Ajax", "Books.png","short description","Testing... Full Description", 9.7, 1));

	}
	
	public List<Product> getProductByCategoryId(int categoryId) {
		return productsDb.entrySet().stream()
				.filter(p -> p.getValue().getCategoryId() == categoryId)
				.map(p -> p.getValue()).collect(Collectors.toList());
	}

	public Product getProductById(int id) {
		return productsDb.get(id);
	}
}
