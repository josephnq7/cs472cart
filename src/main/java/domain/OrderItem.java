package domain;

import java.util.Objects;

public class OrderItem {
	private int id;
	private int productQty;
	private Product product;
	private Order order;

	public OrderItem(int id, int productQty, Product product, Order order) {
		this.id = id;
		this.productQty = productQty;
		this.product = product;
		this.order = order;
	}

	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProductQty() {
		return productQty;
	}
	public void setProductQty(int productQty) {
		this.productQty = productQty;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public boolean equals(Object obj) {
		if ( obj == null || !(obj instanceof OrderItem) ) {
			return false;
		}
		OrderItem orderItem = (OrderItem) obj;
		return this.getId() == orderItem.getId();
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(this.getId());
	}
}
