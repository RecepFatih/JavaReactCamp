package homework4;

public class Game {
	private int id;
	private String name;
	private double memory;
	private double price;
	
	public Game() {
		
	}

	public Game(int id, String name, double memory,double price) {
		super();
		this.id = id;
		this.name = name;
		this.memory = memory;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMemory() {
		return memory;
	}

	public void setMemory(double memory) {
		this.memory = memory;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
