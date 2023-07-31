package com.jsp.CloneAPIBookMyShow.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.jsp.CloneAPIBookMyShow.enums.ScreenAvailability;
import com.jsp.CloneAPIBookMyShow.enums.ScreenStatus;
import com.jsp.CloneAPIBookMyShow.enums.ScreenType;



@Entity

public class Screen {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long screenId;
	private String screenName;
//	screentype
	private ScreenType screenType;
//	screenavailability
	private ScreenAvailability availability;
//	screenStatus
	private ScreenStatus status;
	
	
	@OneToMany(mappedBy = "screen",cascade = CascadeType.ALL)
	private List<Seat> seats;
	private int noOfClassicSeat;
	private int noOfPlatinumSeat;
	private int noOfGoldSeat;
		

	@ManyToOne
	@JoinColumn
	private Theatre theatre;


	public long getScreenId() {
		return screenId;
	}


	public void setScreenId(long screenId) {
		this.screenId = screenId;
	}


	public String getScreenName() {
		return screenName;
	}


	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}


	public ScreenType getScreenType() {
		return screenType;
	}


	public void setScreenType(ScreenType screenType) {
		this.screenType = screenType;
	}


	public ScreenAvailability getAvailability() {
		return availability;
	}


	public void setAvailability(ScreenAvailability availability) {
		this.availability = availability;
	}


	public ScreenStatus getStatus() {
		return status;
	}


	public void setStatus(ScreenStatus status) {
		this.status = status;
	}


	public List<Seat> getSeats() {
		return seats;
	}


	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}


	public int getNoOfClassicSeat() {
		return noOfClassicSeat;
	}


	public void setNoOfClassicSeat(int noOfClassicSeat) {
		this.noOfClassicSeat = noOfClassicSeat;
	}


	public int getNoOfPlatinumSeat() {
		return noOfPlatinumSeat;
	}


	public void setNoOfPlatinumSeat(int noOfPlatinumSeat) {
		this.noOfPlatinumSeat = noOfPlatinumSeat;
	}


	public int getNoOfGoldSeat() {
		return noOfGoldSeat;
	}


	public void setNoOfGoldSeat(int noOfGoldSeat) {
		this.noOfGoldSeat = noOfGoldSeat;
	}


	public Theatre getTheatre() {
		return theatre;
	}


	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}

	
}
