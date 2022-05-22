package homework4;

import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		
		Customer customer = new Customer(1, "Recep Fatih", "Cantekin", 1996, "",1000);
		CustomerManager customerManager = new CustomerManager(new EGovernmentServiceAdapter()) {};
		customerManager.save(customer);
		Game pubg = new Game(1, "PUBG", 1.5, 1000);
		CampaignManager campaignManager = new CampaignManager(new CampaignDiscount());
		campaignManager.campaignDiscount(pubg, 0);
		GameManager gameManager = new GameManager();
		gameManager.buy(customer, pubg);
		
	}

}
