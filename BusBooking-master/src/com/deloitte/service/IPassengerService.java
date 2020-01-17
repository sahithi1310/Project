package com.deloitte.service;

import java.util.List;


import com.deloitte.bean.Passenger;

import com.deloitte.exception.PassengerException;

public interface IPassengerService {


	int addPassenger(Passenger passenger) throws PassengerException;

	List<Passenger> getPassengerList() throws PassengerException;

	List<String> getBus() throws PassengerException;

	List<Passenger> getPassengerList(String to, String from);

}
