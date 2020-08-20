package cyclePriceEngine.components;

public enum Seat {
	SEATTYPE1(15), SEATTYPE2(20);

	private int price;

	Seat(int price) {
		this.price = price;
	}

	public int getPrice() {
		return this.price;
	}
}
