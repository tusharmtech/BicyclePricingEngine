package cyclePriceEngine.service;

import cyclePriceEngine.components.ChainAssembly;
import cyclePriceEngine.components.Frame;
import cyclePriceEngine.components.HandleBarwithBreaks;
import cyclePriceEngine.components.Seat;
import cyclePriceEngine.components.Wheels;

public class CyclePrice {
	/*
	 * ChainAssembly chainAssembly; Frame frame; HandleBarwithBreaks
	 * Handlebarwithbreaks; Seat seat; Wheels wheels;
	 */

	public int calculateCyclePrice(int chainAssemblyprice, int framePrice, int handlewithBreaksprice, int seatprice,
			int wheelsPrice) {
		int total = 0;
		total = chainAssemblyprice + framePrice + handlewithBreaksprice + seatprice + wheelsPrice;
		return total;
	}

	public int calcWheelPrice(String tyreType) {
		int wheelPrice = 0;
		int rimPrice = 0, spokesPrice = 0, tubePrice = 0, tyrePrice = 0;
		rimPrice = Wheels.RIM.getprice();
		spokesPrice = Wheels.SPOKES.getprice();
		tubePrice = Wheels.TUBE.getprice();
		if (tyreType.equalsIgnoreCase("TUBELESS")) {
			tyrePrice = Wheels.TUBELESSTYRE.getprice();
			tubePrice = 0;
		} else {
			tyrePrice = Wheels.TYRE.getprice();
		}
		wheelPrice = rimPrice + spokesPrice + tubePrice + tyrePrice;
		return wheelPrice;
	}

	public int calcSteelframePrice() {
		int steelframeprice = 0;
		steelframeprice = Frame.STEEL.getPrice();
		return steelframeprice;
	}

	public int calcAluminiumFramePrice() {
		int steelframeprice = 0;
		steelframeprice = Frame.ALUMINIUM.getPrice();
		return steelframeprice;
	}

	public int calcFramePrice(String frameType) {
		int framePrice = 0;
		if (frameType.trim().equalsIgnoreCase("STEEL")) {
			framePrice = calcSteelframePrice();
		} else {
			framePrice = calcAluminiumFramePrice();
		}
		return framePrice;
	}

	public int calcHandlewithbreakType1Price() {
		int handlewithBreakType1 = 0;
		handlewithBreakType1 = HandleBarwithBreaks.HANDLEBARTYPE1.getprice();
		return handlewithBreakType1;
	}

	public int calcHandlewithbreakType2Price() {
		int handlewithBreakType2 = 0;
		handlewithBreakType2 = HandleBarwithBreaks.HANDLEBARTYPE2.getprice();
		return handlewithBreakType2;
	}

	public int calcHandlewithbreakPrice(String handlewithBreaktype) {
		int handlewithBreakPrice = 0;
		if (handlewithBreaktype.trim().equalsIgnoreCase("TYPE1")) {
			handlewithBreakPrice = calcHandlewithbreakType1Price();
		} else {
			handlewithBreakPrice = calcHandlewithbreakType2Price();
		}
		return handlewithBreakPrice;
	}

	public int calcSeatType1Price() {
		int seatType1Price = 0;
		seatType1Price = Seat.SEATTYPE1.getPrice();
		return seatType1Price;
	}

	public int calcSeatType2Price() {
		int seatType2Price = 0;
		seatType2Price = Seat.SEATTYPE2.getPrice();
		return seatType2Price;
	}

	public int calcSeatPrice(String seatType) {
		int seatPrice = 0;
		if (seatType.equalsIgnoreCase("Type1")) {
			seatPrice = calcSeatType1Price();
		} else {
			seatPrice = calcSeatType2Price();
		}
		return seatPrice;
	}

	public int calcChainAssemblygear1Price() {
		int gear1Price = 0;
		gear1Price = ChainAssembly.GEAR1.getPrice();
		return gear1Price;
	}

	public int calcChainAssemblygear4Price() {
		int gear4Price = 0;
		gear4Price = ChainAssembly.GEAR4.getPrice();
		return gear4Price;
	}

	public int calcChainAssemblyPrice(String gearType) {
		int chainAssemblyPrice = 0;
		if (gearType.equalsIgnoreCase("GEAR1")) {
			chainAssemblyPrice = calcChainAssemblygear1Price();
		} else {
			chainAssemblyPrice = calcChainAssemblygear4Price();
		}
		return chainAssemblyPrice;
	}
}
