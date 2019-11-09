
public class ItemToPurchase {
	private String itemName;
	private int itemPrice;
	private int itemQuantity;
	
	public ItemToPurchase() {
		this.itemName = "none";
		this.itemPrice = 0;
		this.itemQuantity = 0;
	}
	
	public ItemToPurchase(String itemName, int itemPrice, int itemQuantity) {
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemQuantity = itemQuantity;
	}

	public String getName() {
		return itemName;
	}

	public void setName(String itemName) {
		this.itemName = itemName;
	}

	public int getPrice() {
		return itemPrice;
	}

	public void setPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getQuantity() {
		return itemQuantity;
	}

	public void setQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	
}
