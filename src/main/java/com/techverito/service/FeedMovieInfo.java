package com.techverito.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.techverito.model.Movie;
import com.techverito.model.Seats;

public class FeedMovieInfo {
	
	public static Map<Integer, Movie> getMovieInfo() {

		Map<Integer, Movie> movieInfo = new HashMap<>();

		movieInfo.put(1, getSeats (1));

		movieInfo.put(2, getSeats (2));

		movieInfo.put(3, getSeats (3));

		return movieInfo;
   }


	private static Movie getSeats (int showNo) {

		Movie movie =  new Movie(); 
		List<String> platinum = new ArrayList<>();


		List<String> gold  = new ArrayList();

		List<String> silver =  new ArrayList<>();

		if (showNo == 1) {
	
			Seats seats =  new Seats();
			String platinumSeatArray[] = new String[] {"A1","A2","A3","A4","A5","A6","A7","A8","A9"};
			platinum = Arrays.asList(platinumSeatArray);
			
			String goldSeatArray[] = new String[] {"B1","B2","B3","B4","B5","B6","B7","B8","B9"};
			gold = Arrays.asList(goldSeatArray);
			
			String silverSeatArray[] = new String[] {"C1","C2","C3","C4","C5","C6","C7","C8","C9"};
			silver = Arrays.asList(silverSeatArray);
			
			seats.setPlatinum(platinum);
			seats.setGold(gold);
			seats.setSilver(silver);
			
			movie.setShowNumber(showNo);
			movie.setShowName("Show 1");
			movie.setAvailableSeats(seats);		
		}else if (showNo == 2) {
			Seats seats =  new Seats();
			String platinumSeatArray[] = new String[] {"A1","A2","A3","A4","A5","A6","A7","A8","A9"};
			platinum = Arrays.asList(platinumSeatArray);
			
			String goldSeatArray[] = new String[] {"B1","B2","B3","B4","B5","B6","B7","B8","B9"};
			gold = Arrays.asList(goldSeatArray);
			
			String silverSeatArray[] = new String[] {"C1","C2","C3","C4","C5","C6","C7","C8","C9"};
			silver = Arrays.asList(silverSeatArray);
			
			seats.setPlatinum(platinum);
			seats.setGold(gold);
			seats.setSilver(silver);
			
			movie.setShowNumber(showNo);
			movie.setShowName("Show 2");
			movie.setAvailableSeats(seats);
		}else if (showNo == 3) {
			Seats seats =  new Seats();
			String platinumSeatArray[] = new String[] {"A1","A2","A3","A4","A5","A6","A7","A8","A9"};
			platinum = Arrays.asList(platinumSeatArray);
			
			String goldSeatArray[] = new String[] {"B1","B2","B3","B4","B5","B6","B7","B8","B9"};
			gold = Arrays.asList(goldSeatArray);
			
			String silverSeatArray[] = new String[] {"C1","C2","C3","C4","C5","C6","C7","C8","C9"};
			silver = Arrays.asList(silverSeatArray);
			
			seats.setPlatinum(platinum);
			seats.setGold(gold);
			seats.setSilver(silver);
			
			movie.setShowNumber(showNo);
			movie.setShowName("Show 3");
			movie.setAvailableSeats(seats);
		}
		return movie;
	}
}
