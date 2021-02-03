package model;

public class Plant {
	protected String sunLevel;
	protected int height;
	protected String type;
	
	public Plant()
	{
		
	}
	public Plant(String sunLevel, int height, String type)
	{
		this.sunLevel = sunLevel;
		this.height = height;
		this.type = type;
	}
	
	public void setSunLevel(String sunLevel)
	{
		this.sunLevel = sunLevel;
	}
	public void setHeight(int height)
	{
		this.height = height;
	}
	public void type(String type)
	{
		this.type = type;
	}
	public String getSunLevel()
	{
		return sunLevel;
	}
	public int getHeight()
	{
		return height;
	}
	public String getType()
	{
		return type;
	}
	
	
}
