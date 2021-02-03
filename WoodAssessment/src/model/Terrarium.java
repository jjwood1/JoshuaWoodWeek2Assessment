package model;
import java.util.ArrayList;
public class Terrarium {
	
	protected ArrayList<Plant> Contents = new ArrayList<Plant>();
	protected String habitatType;
	protected int habitatHeight;
	protected String sunAmount;
	public Terrarium()
	{
		
	}
	public Terrarium(String habitatType, int habitatHeight, String sunAmount)
	{
		this.habitatType = habitatType;
		this.habitatHeight = habitatHeight;
		this.sunAmount = sunAmount;
	}
	protected void trim(Plant plant)
	{
		int difference = habitatHeight - plant.getHeight();
		plant.setHeight(plant.getHeight() - difference);
		
	}
	public void addPlant(Plant plant)
	{
		if(plant.getHeight() < habitatHeight && plant.getType().equalsIgnoreCase(habitatType) && plant.getSunLevel().equalsIgnoreCase(sunAmount))
		{
			Contents.add(plant);
		}
		if(plant.getHeight() > habitatHeight)
		{
			trim(plant);
			Contents.add(plant);
		}
		if(!plant.getType().equalsIgnoreCase("habitatType"))
		{
			System.out.println("Plant type incompatible");
		}
		if(!plant.getSunLevel().equalsIgnoreCase(sunAmount))
		{
			System.out.println("Plant sun amount incompatible");
		}
		
	}
	public void setHabitatType(String habitatType)
	{
		this.habitatType = habitatType;
	}
	public void setHabitatHeight(int habitatHeight)
	{
		this.habitatHeight = habitatHeight;
	}
	public void setSunAmount(String sunAmount)
	{
		this.sunAmount = sunAmount;
	}
	public ArrayList<Plant> getContents()
	{
		return Contents;
	}
	public String getHabitatType()
	{
		return habitatType;
	}
	public int getHabitatHeight()
	{
		return habitatHeight;
	}

	
}
