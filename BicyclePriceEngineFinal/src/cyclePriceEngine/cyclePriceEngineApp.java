package cyclePriceEngine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import cyclePriceEngine.service.CyclePrice;

public class cyclePriceEngineApp {

	public static void main(String[] args) throws IOException {
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		Future<?> future  =  executorService.submit(()->{
			try {
				createandCaclulateCyclePrice(1000);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		try {
			Object result = future.get();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void createandCaclulateCyclePrice(int bicycleCount) throws IOException {
		do {
			CyclePrice cyPrice = new CyclePrice();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int framePrice = 0, wheelPrice = 0, seatPrice = 0, chainAssemblyPrice = 0, HandleBarwithBreaksPrice = 0;
			;
			System.out.println("----------Welcome to Price Calculator---------  ");
			System.out.println("Let's Assemble your BiCycle :  ");
			System.out.println("Please Enter Cycle Component details: ");
			System.out.println("Frame Type: Steel / Aluminium  ");

			/*
			 * Cycle - Frame Price is Calculated
			 * 
			 */
			String frameType = br.readLine();
			if (!frameType.isEmpty() || (!(frameType == " "))) {
				framePrice = cyPrice.calcFramePrice(frameType);
			}

			/*
			 * Cycle - Wheel Price is Calculated
			 * 
			 */
			System.out.println("Enter Wheel Type: TUBE / TUBELESS  ");
			String wheelType = br.readLine();
			if (!wheelType.isEmpty() || (!(wheelType == " "))) {
				wheelPrice = cyPrice.calcWheelPrice(wheelType);
			}

			/*
			 * Cycle - Seat Price is Calculated
			 * 
			 */
			System.out.println("Enter Seat Type: TYPE1 / TYPE2  ");
			String seatType = br.readLine();
			if (!seatType.isEmpty() || (!(seatType == " "))) {
				seatPrice = cyPrice.calcSeatPrice(seatType);
			}

			/*
			 * Cycle - ChainAssembly Price is Calculated
			 * 
			 */
			System.out.println("Enter Gear Type: GEAR1 / GEAR4  ");
			String gearType = br.readLine();
			if (!gearType.isEmpty() || (!(gearType == " "))) {
				chainAssemblyPrice = cyPrice.calcSeatPrice(gearType);
			}

			/*
			 * Cycle - HandleBarwithBreaks Price is Calculated
			 * 
			 */
			System.out.println("Enter HandleBarwithBreaks Type: TYPE1 / TYPE2  ");
			String handleBarwithBreaksType = br.readLine();
			if (!handleBarwithBreaksType.isEmpty() || (!(gearType == " "))) {
				HandleBarwithBreaksPrice = cyPrice.calcSeatPrice(handleBarwithBreaksType);
			}

			System.out.println("After Assemble Cycle price is: " + cyPrice.calculateCyclePrice(chainAssemblyPrice,
					framePrice, HandleBarwithBreaksPrice, seatPrice, wheelPrice));
		} while (bicycleCount > 0);
	}

}
