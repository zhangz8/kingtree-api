package com.kingtree.entity;

import java.io.Serializable;

public class House implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3472033421746978373L;

	private int id;
	private String title;
	private double price;
	private double space;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getSpace() {
		return space;
	}

	public void setSpace(double space) {
		this.space = space;
	}

}
