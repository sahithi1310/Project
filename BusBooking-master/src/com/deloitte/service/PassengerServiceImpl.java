package com.deloitte.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.deloitte.bean.Passenger;

import com.deloitte.dao.IPassengerDao;
import com.deloitte.exception.PassengerException;

@Transactional
@Service
public class PassengerServiceImpl implements IPassengerService{

	@Autowired
	IPassengerDao passengerDao;
	
	@Override
	public int addPassenger(Passenger passenger) throws PassengerException {
		//System.out.println("addAthlete : " + athlete);
		return passengerDao.addPassenger(passenger);
	}

	@Override
	public List<Passenger> getPassengerList() throws PassengerException {
		//System.out.println("getAthleteList");
		return passengerDao.getPassengerList();
	}

	@Override
	public List<String> getBus() throws PassengerException {
		//System.out.println("getCategory");
		return passengerDao.getBus();		
	}

	@Override
	public List<Passenger> getPassengerList(String to, String from) {
		// TODO Auto-generated method stub
		return passengerDao.getPassenger(to,from);
	}

}
