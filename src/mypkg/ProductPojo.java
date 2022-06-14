package mypkg;

public class ProductPojo {
	
	private int productId;
	private String productName;
	float price;
	int quantity;
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public ProductPojo(int productId, String productName, float price, int quantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}

	public ProductPojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductPojo(int productId, String productName, float price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}

	public ProductPojo(int productId) {
		super();
		this.productId = productId;
		
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	
	}

	@Override
	public String toString() {
		return "ProductPojo [productId=" + productId + ", productName=" + productName + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}
	
	
	
	

}
