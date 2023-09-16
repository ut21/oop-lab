public class Item{
        private String itemName;
        private String itemidNo;
        private int itemQuantity;
        private double itemPrice;
	public Item(String itemName, String itemidNo,int itemQuantity, double itemPrice){
        this.itemName=itemName;
        this.itemidNo=itemidNo;
        this.itemQuantity=itemQuantity;
        this.itemPrice=itemPrice;
}
        public Item(String itemName, String itemidNo,int itemQuantity){
        this.itemName=itemName;
        this.itemidNo=itemidNo;
        this.itemQuantity=itemQuantity;
        this.itemPrice=500;
}
        public Item(String itemName, String itemidNo){
        this.itemName=itemName;
        this.itemidNo=itemidNo;
        this.itemQuantity=1;
        this.itemPrice=500;
}
	public String getItemName() {
        return itemName;
    }

    public String getItemIdNo() {
        return itemIdNo;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemName(String newName) {
        itemName = newName;
    }

    public void setItemIdNo(String newIdNo) {
        itemIdNo = newIdNo;
    }

    public void setItemQuantity(int newQuantity) {
        itemQuantity = newQuantity;
    }

    public void setItemPrice(double newPrice) {
        itemPrice = newPrice;
    }
}
public class Customer{
	private String name;
	private String idNo;
	private double balance;
	private Item item;

	public Customer(String name, String idNo, int balance){
	this.name=name;
	this.idNo=idNo;
	this.balance=balance;
}
	public Customer(String name, String idNo){
        this.name=name;
        this.idNo=idNo;
        this.balance=5000;
}
	public String getName() {
        return name;
    }

    public String getIdNo() {
        return idNo;
    }

    public double getBalance() {
        return balance;
    }

    public Item getItem() {
        return item;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setIdNo(String newIdNo) {
        idNo = newIdNo;
    }
}  
