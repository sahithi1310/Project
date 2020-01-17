package com.deloitte.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bus")
public class Bus {
	@Id
	private String bus;
	
	public Bus() {
	}

	public Bus(String bus) {
		this.bus = bus;
	}

	public String getBus() {
		return bus;
	}

	public void setBus(String bus) {
		this.bus = bus;
	}

	@Override
	public String toString() {
		return "Bus [bus=" + bus + "]";
	}

	
	
//create table Bus (bus varchar(20));
// insert into Bus values('Cricket');
// insert BasketBall, HighJump, Running, LongJump,..
}
