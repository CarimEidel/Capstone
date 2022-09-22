package ecommercesystem.tables;

public class products {
	private int Id;
	private int product_category_Id;
	private int product_subcategory_Id;
	private int product_stock;
	private float price;
	private String product_name;
	private String product_img;
	private String product_description;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getProduct_category_Id() {
		return product_category_Id;
	}
	public void setProduct_category_Id(int product_category_Id) {
		this.product_category_Id = product_category_Id;
	}
	public int getProduct_subcategory_Id() {
		return product_subcategory_Id;
	}
	public void setProduct_subcategory_Id(int product_subcategory_Id) {
		this.product_subcategory_Id = product_subcategory_Id;
	}
	public int getProduct_stock() {
		return product_stock;
	}
	public void setProduct_stock(int product_stock) {
		this.product_stock = product_stock;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProduct_img() {
		return product_img;
	}
	public void setProduct_img(String product_img) {
		this.product_img = product_img;
	}
	public String getProduct_description() {
		return product_description;
	}
	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}
	
	
}
