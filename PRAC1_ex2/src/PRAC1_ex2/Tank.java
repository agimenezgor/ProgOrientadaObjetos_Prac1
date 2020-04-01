package PRAC1_ex2;

/**
 * Class that stores the tank parameters 
 * @author Alvaro Gimenez Gorris
 * @version 1.0
 */

public class Tank {

	/**
	 * @param name Attribute that stores the name of the tank
	 * @param description Attribute that stores the description of the tank
	 * @param imageBackground Attribute that stores the image background of the tank
	 * @param length Attribute that stores the length of the tank
	 * @param height Attribute that stores the height of the tank
	 * @param width Attribute that stores the width of the tank
	 * @param temperature Attribute that stores the temperature of the tank
	 * @param ph Attribute that stores the PH of the tank
	 */
	private String name, description, imageBackground;
	private double length, height, width, temperature;
	private int ph;
	
	/**
	 * Method that saves the name of the tank
	 * @throws Exception Name cannot be longer than 40 characters
	 * @throws Exception Length cannot be less than 0.1 cm.
	 * @throws Exception Height cannot be less than 0.1 cm.
	 * @throws Exception Width cannot be less than 0.1 cm.
	 * @throws Exception PH must be a value between 0 and 14 
	 */
	public Tank() throws Exception {
		this("Default", "Tank Description", 50.25, 10.55, 100.232, "./", 15.0, 7);	
	}
	
	/**
	 * Name getter method
	 * @return The method returns the name of the tank
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Description getter method
	 * @return The method returns the description of the tank
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * Image background getter method
	 * @return The method returns the image background of the tank
	 */
	public String getImageBackground() {
		return imageBackground;
	}
	
	/**
	 * Length getter method
	 * @return The method returns the length of the tank
	 */
	public Double getLength() {
		return length;
	}
	
	/**
	 * Height getter method
	 * @return The method returns the height of the tank
	 */
	public Double getHeight() {
		return height;
	}
	
	/**
	 * Width getter method
	 * @return The method returns the width of the tank
	 */
	public Double getWidth() {
		return width;
	}
	
	/**
	 * Temperature getter method
	 * @return The method returns the PH of the tank
	 */
	public Double getTemperature() {
		return temperature;
	}
	
	/**
	 * PH getter method
	 * @return The method returns the description of the tank
	 */
	public int getPh() {
		return ph;
	}
	
	/**
	 * Name setter method
	 * @param name Name of the tank
	 * @throws Exception Name cannot be longer than 40 characters
	 */
	public void setName(String name) throws Exception{
		if(name.length()>40) {
			throw new Exception("[ERROR] Name cannot be longer than 40 characters!!");
		}
		this.name = name;
	}
	
	/**
	 * @param imageBackground Image background setter method
	 */
	public void setImageBackground(String imageBackground){
		 this.imageBackground = imageBackground;
	}
	
	/**
	 * @param temperature Temperature setter method
	 */
	public void setTemperature(Double temperature){
		this.temperature = temperature;
	}
	
	/**
	 * @param description Description setter method
	 */
	public void setDescription(String description){
		this.description = description;
	}
	
	/**
	 * @param length Length setter method
	 * @throws Exception Length cannot be less than 0.1 cm.
	 */
	public void setLength(Double length) throws Exception{
		if(length < 0.1) {
			throw new Exception("[ERROR] Length cannot be less than 0.1 cm.!!");
		}
		
		this.length = length;
	}
	/**
	 * 
	 * @param height Height setter method 
	 * @throws Exception Height cannot be less than 0.1 cm.
	 */
	public void setHeight(Double height) throws Exception{
		if(height < 0.1) {
			throw new Exception("[ERROR] Height cannot be less than 0.1 cm.!!");
		}
		
		this.height = height;
	}
	
	/**
	 * @param width Width setter method
	 * @throws Exception Width cannot be less than 0.1 cm.
	 */
	public void setWidth(Double width) throws Exception{
		if(width < 0.1) {
			throw new Exception("[ERROR] Width cannot be less than 0.1 cm.!!");
		}
		
		this.width = width;
	}
	
	/**
	 * @param ph PH setter method
	 * @throws Exception PH must be a value between 0 and 14 
	 */
	public void setPh(int ph) throws Exception{
		if(ph < 0 || ph > 14) {
			throw new Exception("[ERROR] PH must be a value between 0 and 14!!");
		}
		
		this.ph = ph;
	}
	
	/**
	 * Tank setter method
	 * @param name Name attribute
	 * @param description  Description attribute
	 * @param length Length attribute
	 * @param height Height attribute
	 * @param width Width attribute
	 * @param imageBackground Image background attribute
	 * @param temperature Temperature attribute
	 * @param ph PH attribute
	 */
	public Tank(String name, String description, double length, double height,
			double width, String imageBackground, double temperature, int ph) throws Exception{
		this.name = name;
		this.description = description;
		this.length = length;
		this.height = height;
		this.width = width;
		this.imageBackground = imageBackground;
		this.temperature = temperature;
		this.ph = ph;
	}
}
