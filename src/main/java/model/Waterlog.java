package model;

import java.sql.Time;

public class Waterlog {
	
	private Time time;
	
	public Waterlog(Time time) {
		super();
		this.time = time;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}
	
}
