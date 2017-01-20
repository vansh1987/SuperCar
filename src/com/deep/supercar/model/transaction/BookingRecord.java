package com.deep.supercar.model.transaction;

import java.util.Date;

import com.deep.supercar.model.places.location.location;
import com.deep.supercar.model.usermodel.User;
import com.deep.supercar.model.vehicle.Car.Car;

public class BookingRecord 
{
	private int bookingid;
	private location source;
	private location destination;
	private User user;
	private Car car;
	private Timesheet timesheet;
	private Date dateofjourney;
	private int distance;
	private int numberofpassenger;
	private byte driver_flag;
	public int getBookingid() {
		return bookingid;
	}
	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}
	public location getSource() {
		return source;
	}
	public void setSource(location source) {
		this.source = source;
	}
	public location getDestination() {
		return destination;
	}
	public void setDestination(location destination) {
		this.destination = destination;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public Timesheet getTimesheet() {
		return timesheet;
	}
	public void setTimesheet(Timesheet timesheet) {
		this.timesheet = timesheet;
	}
	public Date getDateofjourney() {
		return dateofjourney;
	}
	public void setDateofjourney(Date dateofjourney) {
		this.dateofjourney = dateofjourney;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public int getNumberofpassenger() {
		return numberofpassenger;
	}
	public void setNumberofpassenger(int numberofpassenger) {
		this.numberofpassenger = numberofpassenger;
	}
	public byte getDriver_flag() {
		return driver_flag;
	}
	public void setDriver_flag(byte driver_flag) {
		this.driver_flag = driver_flag;
	}
	
	
	
	
}
