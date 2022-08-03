/**
 * 
 */
package edu.uvg.ej1.model;

/**
 * @author MAAG
 *
 */
public class Dog {

	private String name;
	private String breed;
	private double weight;
	private String primaryColor;
	private String secondaryColor;
	
	public Dog(String name, String breed, String primaryColor) {
		setName(name);
		setBreed(breed);
		setPrimaryColor(primaryColor);
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
	 * @return the breed
	 */
	public String getBreed() {
		return breed;
	}
	/**
	 * @param breed the breed to set
	 */
	public void setBreed(String breed) {
		this.breed = breed;
	}
	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	/**
	 * @return the primaryColor
	 */
	public String getPrimaryColor() {
		return primaryColor;
	}
	/**
	 * @param primaryColor the primaryColor to set
	 */
	public void setPrimaryColor(String primaryColor) {
		this.primaryColor = primaryColor;
	}
	/**
	 * @return the secondaryColor
	 */
	public String getSecondaryColor() {
		return secondaryColor;
	}
	/**
	 * @param secondaryColor the secondaryColor to set
	 */
	public void setSecondaryColor(String secondaryColor) {
		this.secondaryColor = secondaryColor;
	}
	
	
}
