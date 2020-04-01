package PRAC1_ex1;

public class Tank {

	private String name, description, imageBackground;
	private double length, height, width, temperature;
	private int ph;
	
	public Tank() throws Exception {
		this("Default", "Tank Description", 50.25, 10.55, 100.232, "./", 15.0, 7);	
	}

	public String getName() {
		return name;
	}
	
	// Description getter method
	public String getDescription() {
		return description;
	}
	
	// Image background getter method
	public String getImageBackground() {
		return imageBackground;
	}
	
	// Length getter method
	public Double getLength() {
		return length;
	}
	
	// Height getter method
	public Double getHeight() {
		return height;
	}
	
	// Width getter method
	public Double getWidth() {
		return width;
	}
	
	// Temperature getter method
	public Double getTemperature() {
		return temperature;
	}
	
	// PH getter method
	public int getPh() {
		return ph;
	}
	
	// Name setter method
	// Name cannot be longer than 40 characters
	public void setName(String name) throws Exception{
		if(name.length()>40) {
			throw new Exception("[ERROR] Name cannot be longer than 40 characters!!");
		}
		this.name = name;
	}
	
	// Image background setter method
	public void setImageBackground(String imageBackground){
		 this.imageBackground = imageBackground;
	}
	
	// Temperature setter method
	public void setTemperature(Double temperature){
		this.temperature = temperature;
	}
	
	// Description setter method
	public void setDescription(String description){
		this.description = description;
	}
	
	// Length setter method
	// Length cannot be less than 0.1 cm.
	public Boolean setLength(Double length) {
		if(length < 0.1) {
			return false;
		}
		
		this.length = length;
		
		return true;
	}
	
	// Height setter method
	// Height cannot be less than 0.1cm.
	public Boolean setHeight(Double height) {
		if(height < 0.1) {
			return false;
		}
		
		this.height = height;
		
		return true;
	}
	
	// Width setter method
	// Width cannot be less than 0.1 cm.
	public Boolean setWidth(Double width) {
		if(width < 0.1) {
			return false;
		}
		
		this.width = width;
		
		return true;
	}
	
	
	// PH setter method
	// PH must be a value between 0 and 14
	public Boolean setPh(int ph) {
		if(ph < 0 || ph > 14) {
			return false;
		}
		
		this.ph = ph;
		
		return true;
	}
	
	// Overload method
	// Tank setter method with all the arguments
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
