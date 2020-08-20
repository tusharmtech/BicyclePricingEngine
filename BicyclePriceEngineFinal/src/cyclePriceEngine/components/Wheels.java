package cyclePriceEngine.components;

public enum Wheels {
	SPOKES(20), RIM(10), TUBE(10), TYRE(50), TUBELESSTYRE(70);

	private int price;

	public int getprice() {
		return this.price;
	}

	Wheels(int price) {
		this.price = price;
	}
}
