package buyers;

import player.Player;

public class Buyers_Template 
{
	private String name;
	private int level;
	private int price;
	private int value;
	
	public Buyers_Template(String name, int price, int value)
	{
		this.name = name;
		this.level = 0;
		this.price = price;
		this.value = value;
	}
	public void kauf()
	{
		if(player.Player.getDataAmount() >= price)
		{
			level = level + 1;
			player.Player.setDataAmount(player.Player.getDataAmount() - price);
			price = price * 2;
			player.Player.setMoneyAmount(player.Player.getMoneyAmount() + value);
		}	
	}
}
