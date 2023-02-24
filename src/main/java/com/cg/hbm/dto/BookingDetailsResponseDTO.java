package com.cg.hbm.dto;

import java.time.LocalDate;
import java.util.Date;

import lombok.Data;

@Data
public class BookingDetailsResponseDTO {
	private int bookingId;
	
	private LocalDate bookedFrom;
	private LocalDate bookedTo;
	private int noOfAdults;
	private int noOfChildren;
	private double amount;
	private String msg;
	
}
