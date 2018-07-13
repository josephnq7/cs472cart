package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import domain.Product;


public class ProductDao {

	private Map<Integer, Product> productsDb = new HashMap<>();
	{
		productsDb.put(1, new Product(1, "Javascript", "book1.pnq","short description","Testing Full Description ...", 9.6, 1));
		productsDb.put(2, new Product(2, "Javascript", "Books.pnq","short description","Testing... Full Description", 9.7, 1));

	}
	
	public List<Product> getProductByCategoryId(int categoryId) {
		return null;
	}

	public Product getProductById(int id) {
		return null;
	}
}
