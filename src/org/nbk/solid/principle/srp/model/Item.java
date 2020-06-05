package org.nbk.solid.principle.srp.model;

public class Item {

    private String name;
    private long quantity;
    private long price;

    public Item(String name, long quantity, long price) {
	this.name = name;
	this.quantity = quantity;
	this.price = price;
    }

    /**
     * @return the name
     */
    public String getName() {
	return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name) {
	this.name = name;
    }

    /**
     * @return the quantity
     */
    public long getQuantity() {
	return quantity;
    }

    /**
     * @param quantity
     *            the quantity to set
     */
    public void setQuantity(long quantity) {
	this.quantity = quantity;
    }

    /**
     * @return the price
     */
    public long getPrice() {
	return price;
    }

    /**
     * @param price
     *            the price to set
     */
    public void setPrice(long price) {
	this.price = price;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Item [name=");
	builder.append(name);
	builder.append(", quantity=");
	builder.append(quantity);
	builder.append(", price=");
	builder.append(price);
	builder.append("]");
	return builder.toString();
    }

}
