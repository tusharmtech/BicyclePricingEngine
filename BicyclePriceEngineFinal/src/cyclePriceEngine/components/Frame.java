package cyclePriceEngine.components;

public enum Frame {
	STEEL(50), ALUMINIUM(70);

	private int price;

	Frame(int price) {
		this.price = price;
	}

	public int getPrice() {
		return this.price;
	}
}
