/**
 * 
 */
package edu.uvg.ej1.model;

import java.util.Random;

/**
 * @author MAAG
 *
 */
public class Friend {

	private String name;
	private int phone;
	private double initialMoney;
	private double actualMoney;
	private boolean dogIsLost;
	
	public Friend(String _name, int _phone) {
		setName(_name);
		setPhone(_phone);
		Random rnd = new Random();
		initialMoney = (double)rnd.nextInt(1000);
		actualMoney = initialMoney;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the phone
	 */
	public int getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(int phone) {
		this.phone = phone;
	}
	/**
	 * @return the initialMoney
	 */
	public double getInitialMoney() {
		return initialMoney;
	}
	/**
	 * @param initialMoney the initialMoney to set
	 */
	public void setInitialMoney(double initialMoney) {
		this.initialMoney = initialMoney;
	}
	/**
	 * @return the actualMoney
	 */
	public double getActualMoney() {
		return actualMoney;
	}
	/**
	 * @param actualMoney the actualMoney to set
	 */
	public void setActualMoney(double actualMoney) {
		this.actualMoney = actualMoney;
	}
	/**
	 * @return the dogIsLost
	 */
	public boolean isDogIsLost() {
		return dogIsLost;
	}
	/**
	 * @param dogIsLost the dogIsLost to set
	 */
	public void setDogIsLost(boolean dogIsLost) {
		this.dogIsLost = dogIsLost;
	}
	
	
}
