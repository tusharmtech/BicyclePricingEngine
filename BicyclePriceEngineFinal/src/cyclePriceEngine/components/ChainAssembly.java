package cyclePriceEngine.components;

public enum ChainAssembly {
	GEAR1(10), GEAR4(25);

	private int price;

	ChainAssembly(int price) {
		this.price = price;
	}

	public int getPrice() {
		return this.price;
	}
}
