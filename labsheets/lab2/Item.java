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
