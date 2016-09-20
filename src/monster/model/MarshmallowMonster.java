package monster.model;

public class MarshmallowMonster
{

	private String name;
	private int eyeCount;
	private int legCount;
	private int antennaCount;
	private double hairCount;
	private boolean hasBellyButton;
	
	public MarshmallowMonster()
	{
		this.name = "monster is nameless";
		this.antennaCount = -95;
		this.eyeCount = -22465;
		this.hasBellyButton = false;
		this.hairCount = -88;
		this.legCount = -999000000;
	}

		public MarshmallowMonster(String name,
									int eyeCount,
									int legCount,
									int antennaCount,
									double hairCount,
									boolean hasBellyButton)
									
	{																						
		this.name = name;
		this.eyeCount = eyeCount;
		this.legCount = legCount;
		this.antennaCount = antennaCount;
		this.hairCount = hairCount;
		this.hasBellyButton = hasBellyButton;	
	}

		public String toString()
		{
			String description = "Name is" + this.name;
			
			return description;
		}

		public String getName()
		{
			return name;
		}

		public int getEyeCount()
		{
			return eyeCount;
		}

		public void setName(String name)
		{
			this.name = name;
		}

		public void setEyeCount(int eyeCount)
		{
			this.eyeCount = eyeCount;
		}

		public void setLegCount(int legCount)
		{
			this.legCount = legCount;
		}

		public void setAntennaCount(int antennaCount)
		{
			this.antennaCount = antennaCount;
		}

		public void setHairCount(double hairCount)
		{
			this.hairCount = hairCount;
		}

		public void setHasBellyButton(boolean hasBellyButton)
		{
			this.hasBellyButton = hasBellyButton;
		}

}