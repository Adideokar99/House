/*
* House.java
* Author: Aditya Deokar
* Submission Date: 11/03/2017
*
* Purpose: This is a class that instantiates the House object. It contains its constructors and methods.
*
* Statement of Academic Honesty:
*
* The following code represents my own work. I have neither
* received nor given inappropriate assistance. I have not copied
* or modified code from any source other than the course webpage
* or the course textbook. I recognize that any unauthorized
* assistance or plagiarism will be handled in accordance with
* the University of Georgia's Academic Honesty Policy and the
* policies of this course. I recognize that my work is based
* on an assignment created by the Department of Computer
* Science at the University of Georgia. Any publishing
* or posting of source code for this project is strictly
* prohibited unless you have written consent from the Department
* of Computer Science at the University of Georgia.
*/
import java.util.Random;
import java.text.DecimalFormat;

/**
 * The House Class represents a house. Each house has a price, a color, width, length and height.
 * Designed to be used on a real estate platform for buying a selling houses.
 */
public class House {
	
	/**
	 * The colors a house can be
	 */
	public enum Color {
		RED, 
		GREEN,
		BLUE,
		YELLOW,
		PINK
	}
	
	/* instance variables */
	
	private Color color;
	private boolean forSale;
	private double price;
	private double width;
	private double length;
	private double height;
	
	/**
	 * The Default constructor. 
	 * Creates a house with a random color, 
	 * random price (between $1000.00 and $100,000.00),
	 * random width and length (between 30 and 200 meters)
	 * and random height (between 3 and 10 meters). 
	 * 
	 * Houses are always for sale when they are first instantiated
	 */
	public House() {
		forSale = true;
		
		Color [] colors = Color.values();
		Random r = new Random();
		color = colors[r.nextInt(colors.length)];
		
		price = (r.nextInt(9900000) + 100000) / 100.0;
		width = (r.nextInt(17000) + 3000) / 100.0;
		length =  (r.nextInt(17000) + 3000) / 100.0;
		height = (r.nextInt(700) + 300) / 100.0;
	}
	/**
	 * House constructor with specified parameters versus randomized.
	 * 
	 * Houses are always for sale when they are first instantiated.
	 * 
	 * @param color : the color of the house
	 * @param price : the price of the house
	 * @param width : this width of the house
	 * @param length : the length of the house
	 * @param height : the height of the house
	 */
	public House(Color color, double price, double width, double length, double height) {
		
		// Your code here
		this.color = color;
		this.price = price;
		this.width = width;
		this.length = length;
		this.height = height;
		forSale = true;
	}
	
	
	/**
	 * E.g.
	 * "Color: Red
	 * Area: 10.00  x 10.00 x 10.00 meters
	 * Price: $ 120,000.00"
	 * @return a string representing the house
	 */
	@Override
	public String toString() {
        DecimalFormat decimalFormatObj = (DecimalFormat) DecimalFormat.getInstance();
        decimalFormatObj.setDecimalSeparatorAlwaysShown(true);
        decimalFormatObj.setMinimumFractionDigits(3);
        decimalFormatObj.setMaximumFractionDigits(3);
		String s = "";
		s+= "Color:" + getColor() + "\n";
		s+= "Dimensions: " + decimalFormatObj.format(getLength()) + " x " + decimalFormatObj.format(getWidth()) + " x " + decimalFormatObj.format(getHeight()) + " meters\n";
        decimalFormatObj.setMinimumFractionDigits(2);
        decimalFormatObj.setMaximumFractionDigits(2);
		s+= "Price: $" + decimalFormatObj.format(getPrice()) + "\n";
		return s;
	}
	
	/**
	 * @param h : house to compare to
	 * @return if this and house h are the same
	 */
	public boolean equals(House h) {
		
		// Your code here
		if ((this.getColor().equals(h.getColor())) && (this.getHeight() == h.getHeight()) && (this.getLength() == h.getLength()) && (this.getPrice() == h.getPrice()) && (this.getWidth() == h.getWidth())) {
			return true;
		}
		else {
		return false; // replace this line with your own code
		}
	}
	
	/* Derived data */
	
	/**
	 * Area = width x length
	 * @return the area of the house
	 */
	public double area() {
		
		// Your code here
		
		return (this.getLength() * this.getWidth()); // replace this line with your own code
	}
	
	/**
	 * Volume = width x length x height
	 * @return volume of the house
	 */
	public double volume() {
		
		// Your code here
		
		return (this.area() * this.getHeight()); // replace this line with your own code
	}
	
	/* Setters */
	
	/**
	 * Changes the color of the house
	 * @param color : the new color of the house
	 */
	public void setColor(Color color) {
		
		// Your code here
		this.color = color;
	}

	/**
	 * Changes the price of the house
	 * @param price : the new price of the house
	 */
	public void setPrice(double price) {
		
		// Your code here
		this.price = price;
	}
	
	/**
	 * Changes whether or not the house is for sale
	 * @param forSale : true if the house is for sale; false otherwise
	 */
	public void setForSale(boolean forSale) {
		
		// Your code here
		this.forSale = forSale;
	}
	
	/* Getters */

	/**
	 * 
	 * @return true if the house is for sale
	 */
	public boolean isForSale() {
		
		// Your code here
		
		return forSale;
	}
	/**
	 * 
	 * @return the color of the house
	 */
	public Color getColor() {
		
		// Your code here
		
		return color;  // replace this line with your own code
	}
	
	/**
	 * 
	 * @return the price of the house
	 */
	public double getPrice() {
		
		// Your code here

		return price; // replace this line with your own code
	}
	
	/**
	 * 
	 * @return the width of the house
	 */
	public double getWidth() {
		
		// Your code here

		return width; // replace this line with your own code
	}
	
	/**
	 * 
	 * @return the length of the house
	 */
	public double getLength() {
		
		// Your code here

		return length; // replace this line with your own code
	}
	
	/**
	 * 
	 * @return the height of the house
	 */
	public double getHeight() {
		
		// Your code here

		return height; // replace this line with your own code
	}
	
}

