package com.hotelbooking.response;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingResponse {

	private Long id;
	
	private LocalDate checkInDate;	
	
	private LocalDate checkOutDate;	
	
	private String guestFullName;	
	
	private String guestEmail;	
	
	private int NumOfAdults;	
	
	private int NumOfChildren;	
	
	private int totalNumOfGuest;	
	
	private String bookingConfirmationCode;
	
	private RoomResponse room;

	public BookingResponse(Long id, LocalDate checkInDate, 
			LocalDate checkOutDate, String bookingConfirmationCode) {
		this.id = id;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.bookingConfirmationCode = bookingConfirmationCode;
	}
	
	
}
