package org.nbk.solid.principle.model;

import java.util.List;

public class Customer {

    private String id;
    private String name;
    private String age;
    private double billAmount;
    private List<Item> items;

    public Customer(String id, String name, String age) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
    }

    /**
     * @return the id
     */
    public String getId() {
	return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(String id) {
	this.id = id;
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
     * @return the age
     */
    public String getAge() {
	return age;
    }

    /**
     * @param age
     *            the age to set
     */
    public void setAge(String age) {
	this.age = age;
    }

    /**
     * @return the billAmount
     */
    public double getBillAmount() {
	return billAmount;
    }

    /**
     * @param bill
     *            the billAmount to set
     */
    public void setBillAmount(double bill) {
	this.billAmount = bill;
    }

    /**
     * @return the items
     */
    public List<Item> getItems() {
	return items;
    }

    /**
     * @param items
     *            the items to set
     */
    public void setItems(List<Item> items) {
	this.items = items;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Customer [id=");
	builder.append(id);
	builder.append(", name=");
	builder.append(name);
	builder.append(", age=");
	builder.append(age);
	builder.append(", billAmount=");
	builder.append(billAmount);
	builder.append(", items=");
	builder.append(items);
	builder.append("]");
	return builder.toString();
    }

}
