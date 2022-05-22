package homework4;

public class CampaignDiscount extends BaseCampaign{
	
	public void calculate(Game game,double discount) {
		game.setPrice(game.getPrice()*((100-discount)/100));
		
	}

}
