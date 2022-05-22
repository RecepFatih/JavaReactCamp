package homework4;

public class CampaignManager {
	
	private BaseCampaign baseCampaign;

	public CampaignManager(BaseCampaign baseCampaign) {
		
		this.baseCampaign = baseCampaign;
	}
	
	public void campaignDiscount(Game game,double discount) {
		baseCampaign.calculate(game,discount);
	}
}
