package cyclePriceEngine.components;

public enum HandleBarwithBreaks {
	HANDLEBARTYPE1(20), HANDLEBARTYPE2(30);

	private int price;

	public int getprice() {
		return this.price;
	}

	HandleBarwithBreaks(int price) {
		this.price = price;
	}
}
