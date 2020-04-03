package buyers;

import player.Player;

public class Buyers_Template 
{
	private String name;
	private int level;
	private int preis;
	private int gewinn;
	
	public Datenkauf(String name, int preis, int gewinn)
	{
		this.name = name;
		this.level = 1;
		this.preis = preis;
		this.gewinn = gewinn;
	}
	public void kauf()
	{
		if(dataAmount >= preis)
		{
			level = level + 1;
			dataAmount = dataAmount - preis;
			preis = preis * 2;
			amountOfMoney = amountOfMoney + gewinn;
		}	
	}
}
