package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ Car
 *
 * 1.개요 : 
 * 2.작성일 : 2017. 3. 23.
 * </pre>
 *
 * @author : 강태준
 * @version : 1.0
 */
public class Car {
	private String company, model, color;
	private int maxSpeed, price;
	public String getCompany() {
		return company;
	}
	public void setCompany(String newCompany) {
		company = newCompany;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String newModel) {
		model = newModel;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String newColor) {
		color = newColor;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int newMaxSpeed) {
		maxSpeed = newMaxSpeed;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int newPrice) {
		price = newPrice;
	}
	

}