/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

/**
 *
 * @author Cliftonb
 */
public class Transaction {

	String itemDescriptor; //the type of item being bought. e.g. bread, milk, etc.
	String itemBrand;
	int quantity;
	String barcode;
	double cost;
	boolean isVATExclusive;

	public Transaction(String itemDescriptor, String itemBrand, int quantity, String barcode, double cost, boolean isVATExclusive) {
		this.itemDescriptor = itemDescriptor;
		this.itemBrand = itemBrand;
		this.quantity = quantity;
		this.barcode = barcode;
		this.cost = cost;
		this.isVATExclusive = isVATExclusive;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getItemDescriptor() {
		return itemDescriptor;
	}

	public void setItemDescriptor(String itemDescriptor) {
		this.itemDescriptor = itemDescriptor;
	}

	public String getItemBrand() {
		return itemBrand;
	}

	public void setItemBrand(String itemBrand) {
		this.itemBrand = itemBrand;
	}

	public boolean isIsVATExclusive() {
		return isVATExclusive;
	}

	public void setIsVATExclusive(boolean isVATExclusive) {
		this.isVATExclusive = isVATExclusive;
	}

	public String toString() {
		return this.itemDescriptor + "#" + this.itemBrand + "#" + this.quantity + "#" + this.barcode + "#" + this.cost + "#" + this.isVATExclusive;
	}

}
