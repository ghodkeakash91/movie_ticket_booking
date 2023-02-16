package com.techverito.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.techverito.model.Movie;
import com.techverito.model.Seats;
import com.techverito.service.FeedMovieInfo;
import com.techverito.utilties.MovieConstant;

public class SeatSelection {

	public static Map<Integer, Movie> movieInfo = FeedMovieInfo.getMovieInfo();	
	public static void main(String[] args) {
		int totalSubTotal = 0;
		double totalSwachhBharaCes = 0.0;
		double totalServiceTax = 0.0; 
		double totalkrishikalyanCess = 0.0;

		displayMovieInfo(movieInfo);
		while(true){
		System.out.println("Enter Show no:"); 
		Scanner sc =  new Scanner(System.in); 
		int showNo  = sc.nextInt();

		System.out.println("Enter seats::");
		String seats =  sc.next().toUpperCase(); 
		List<String> seatsList =  Arrays.asList(seats.split(","));

		Movie movie =  movieInfo.get(showNo);		
		Seats availableSeats = movie.getAvailableSeats();

		if (seatsList.get(0).startsWith("A")) {
			if (availableSeats.getPlatinum().containsAll(seatsList)) {

				System.out.println("Print: Successfully Booked - " + movie.getShowName());
		
				int subTotal  = seatsList.size() * MovieConstant.platinumSeatPrice;
				System.out.println("Subtotal: Rs. " + subTotal);
		
				double serviceTax = subTotal * MovieConstant.servicetax; 
				System.out.println("Service Tax @14%: Rs. "+ serviceTax);
		
				double swachhBharaCess = subTotal * MovieConstant.swachhBharatCess;
				System.out.println("Swachh Bharat Cess @0.5%:" + swachhBharaCess);
		
				double krishikalyanCess = subTotal * MovieConstant.krishiKalyanCess; 
				System.out.println("Krishi Kalyan Cess 0.5: Rs." + krishikalyanCess);
		
				double total = subTotal + serviceTax + swachhBharaCess + krishikalyanCess;
				System.out.println("Total: Rs. " + total);
				totalSubTotal = totalSubTotal + subTotal;
				totalServiceTax =  totalServiceTax + serviceTax;
				totalSwachhBharaCes =  totalSwachhBharaCes + swachhBharaCess;
				totalkrishikalyanCess = totalkrishikalyanCess + krishikalyanCess;
		
				refreshSeats(showNo,seatsList,availableSeats.getPlatinum(), "P");
				
				System.out.println("Would you like to continue (Yes/No): ");
				String confirmation = sc.next();
				if(confirmation.equalsIgnoreCase("yes")) {
					continue;
				}
	        }else {
				StringBuilder seatNotAvailable = new StringBuilder();
				for(int i = 0; i < seatsList.size(); i++) {
					if(availableSeats.getPlatinum().contains(seatsList.get(i))) {
						seatNotAvailable.append(seatsList.get(i));
					}
				}
				System.out.println(
						"Print: " + seatNotAvailable.toString() + "Not available, Please select different seats");
				System.out.println("Would you like to continue (Yes/No): ");
				String confirmation = sc.next();
				
				if(confirmation.equalsIgnoreCase("yes")) {
					continue;
				}
			}
	  }else if (seatsList.get(0).startsWith("B")) {
		if(availableSeats.getGold().containsAll(seatsList)) {
			System.out.println("Print: Successfully Booked - " + movie.getShowName());
			int subTotal  = seatsList.size() * MovieConstant.goldSeatPrice;
			System.out.println("Subtotal: Rs. " + subTotal);
	
			double serviceTax = subTotal * MovieConstant.servicetax;
			 
			System.out.println("Service Tax @14%: Rs. "+ serviceTax);
	
			double swachhBharaCess = subTotal * MovieConstant.swachhBharatCess;
			System.out.println("Swachh Bharat Cess @0.5%:" + swachhBharaCess);
	
			double krishikalyanCess = subTotal * MovieConstant.krishiKalyanCess; 
			System.out.println("Krishi Kalyan Cess 0.5: Rs." + krishikalyanCess);
	
			double total = subTotal + serviceTax + swachhBharaCess + krishikalyanCess;
			System.out.println("Total: Rs. " + total);
			
			totalSubTotal = totalSubTotal + subTotal;
			totalServiceTax =  totalServiceTax + serviceTax;
			totalSwachhBharaCes =  totalSwachhBharaCes + swachhBharaCess;
			totalkrishikalyanCess = totalkrishikalyanCess + krishikalyanCess;
	
			refreshSeats(showNo,seatsList,availableSeats.getPlatinum(), "P");
			
			System.out.println("Would you like to continue (Yes/No): ");
			String confirmation = sc.next();
			if(confirmation.equalsIgnoreCase("yes")) {
				continue;
			}
        }else {
			StringBuilder seatNotAvailable = new StringBuilder();
			for(int i = 0; i < seatsList.size(); i++) {
				if(availableSeats.getPlatinum().contains(seatsList.get(i))) {
					seatNotAvailable.append(seatsList.get(i));
				}
			}
			System.out.println(
					"Print: " + seatNotAvailable.toString() + "Not available, Please select different seats");
			System.out.println("Would you like to continue (Yes/No): ");
			String confirmation = sc.next();
			
			if(confirmation.equalsIgnoreCase("yes")) {
				continue;
			}
		}
      }else if (seatsList.get(0).startsWith("C")) {
		if(availableSeats.getGold().containsAll(seatsList)) {
			System.out.println("Print: Successfully Booked - " + movie.getShowName());
			int subTotal  = seatsList.size() * MovieConstant.silverSeatPrice;
			System.out.println("Subtotal: Rs. " + subTotal);
	
			double serviceTax = subTotal * MovieConstant.servicetax;
			 
			System.out.println("Service Tax @14%: Rs. "+ serviceTax);
	
			double swachhBharaCess = subTotal * MovieConstant.swachhBharatCess;
			System.out.println("Swachh Bharat Cess @0.5%:" + swachhBharaCess);
	
			double krishikalyanCess = subTotal * MovieConstant.krishiKalyanCess; 
			System.out.println("Krishi Kalyan Cess 0.5: Rs." + krishikalyanCess);
	
			double total = subTotal + serviceTax + swachhBharaCess + krishikalyanCess;
			System.out.println("Total: Rs. " + total);
	
			totalSubTotal = totalSubTotal + subTotal;
			totalServiceTax =  totalServiceTax + serviceTax;
			totalSwachhBharaCes =  totalSwachhBharaCes + swachhBharaCess;
			totalkrishikalyanCess = totalkrishikalyanCess + krishikalyanCess;
	
			refreshSeats(showNo,seatsList,availableSeats.getPlatinum(), "P");
			
			System.out.println("Would you like to continue (Yes/No): ");
			String confirmation = sc.next();
			if(confirmation.equalsIgnoreCase("yes")) {
				continue;
			}
        }else {
			StringBuilder seatNotAvailable = new StringBuilder();
			for(int i = 0; i < seatsList.size(); i++) {
				if(availableSeats.getPlatinum().contains(seatsList.get(i))) {
					seatNotAvailable.append(seatsList.get(i));
				}
			}
			System.out.println(
					"Print: " + seatNotAvailable.toString() + "Not available, Please select different seats");
			System.out.println("Would you like to continue (Yes/No): ");
			String confirmation = sc.next();
			
			if(confirmation.equalsIgnoreCase("yes")) {
				continue;
			}
		}
      }
	   if(totalSubTotal > 0) {
		   System.out.println("Revenue: Rs. " + totalSubTotal);

				   System.out.println("Service Tax: Rs. " + totalServiceTax);

				   System.out.println("Swachh Bharat Cess: "+ totalSwachhBharaCes); 
				   System.out.println("Krishi Kalyan Cess: "+ totalkrishikalyanCess);
	   }		   

				   System.out.println();
				   displayMovieInfo(movieInfo);
				   return;	   
	}
}

	public static void displayMovieInfo(Map<Integer, Movie> movieInfo) { 
			
	System.out.println("seating arrangement:");
	Movie movie1 =  movieInfo.get(1);

	System.out.println(movie1.getShowName()+ "Running in Audi " + movie1.getShowNumber() + ":");
	System.out.println("All	Seats:"); 
	Seats availableSeats1  = movie1.getAvailableSeats(); 
	availableSeats1.getPlatinum().forEach(s -> System.out.print(s+ " "));
	System.out.println();
	availableSeats1.getGold().forEach(s -> System.out.print(s+ " "));
	System.out.println();
	availableSeats1.getSilver().forEach(s -> System.out.print(s + " "));
	System.out.println();

	Movie movie2 =  movieInfo.get(2);
	System.out.println();
	System.out.println(movie2.getShowName()+ "Running in Audi " + movie2.getShowNumber() + ":");
	System.out.println("All Seats:");
	Seats availableSeats2  = movie1.getAvailableSeats(); 
	availableSeats1.getPlatinum().forEach(s -> System.out.print(s+ " "));
	System.out.println();
	availableSeats2.getGold().forEach(s -> System.out.print(s+ " "));
	System.out.println();
	availableSeats2.getSilver().forEach(s -> System.out.print(s + " "));
	System.out.println();
	
	Movie movie3 =  movieInfo.get(3);
	System.out.println();
	System.out.println(movie3.getShowName()+ "Running in Audi " + movie3.getShowNumber() + ":");
	System.out.println("All Seats:");
	Seats availableSeats3  = movie1.getAvailableSeats(); 
	availableSeats3.getPlatinum().forEach(s -> System.out.print(s+ " "));
	System.out.println();
	availableSeats3.getGold().forEach(s -> System.out.print(s+ " "));
	System.out.println();
	availableSeats3.getSilver().forEach(s -> System.out.print(s + " "));
	System.out.println();
	
	}
	
	public static void refreshSeats (int showNo, List<String> seats, List<String> audiSeats, String type) {
	
		List<String> dummySeats = new ArrayList<String>();

	try {
		Movie movie = movieInfo.get(showNo);	
		Seats availableSeats =  movie.getAvailableSeats(); 
		for (int i=0; i < audiSeats.size(); i++) {	
			if (!seats.contains(audiSeats.get(i))) { 
				dummySeats.add(audiSeats.get(i));
				}		
			}
			if (type.equalsIgnoreCase("P")) {		
				availableSeats.setPlatinum(dummySeats);
			}else if (type.equalsIgnoreCase("G")) {		
				availableSeats.setGold(dummySeats); 			
		    }else if (type.equalsIgnoreCase("S")) {	
		        availableSeats.setSilver(dummySeats);
		    }
		movie.setAvailableSeats(availableSeats);	
		movieInfo.put(showNo, movie);
		}catch (Exception e) { 
			e.printStackTrace();
		}
		
	}
}
