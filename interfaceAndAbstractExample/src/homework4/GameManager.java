package homework4;

public class GameManager implements IGameService{

	@Override
	public void buy(Customer customer, Game game) {
		if(customer.getBudget()>=game.getPrice()) {
			System.out.println(game.getName() + " has been uploaded to your account.");
		}else {
			System.out.println("Your balance is insufficient!");
		}
		
	}

}
