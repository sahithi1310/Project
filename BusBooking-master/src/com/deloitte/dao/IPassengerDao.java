package com.deloitte.dao;

import java.util.List;


import com.deloitte.bean.Passenger;

import com.deloitte.exception.PassengerException;

public interface IPassengerDao {

	int addPassenger(Passenger passenger) throws PassengerException;

	List<Passenger> getPassengerList() throws PassengerException;

	List<String> getBus() throws PassengerException;

	List<Passenger> getPassenger(String to, String from);

}
