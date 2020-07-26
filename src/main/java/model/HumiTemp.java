package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HumiTemp {
	
	//private Time time;
	//private Date date;
	private float temperature;
	private float humidity;
	
	public HumiTemp(
			@JsonProperty("temperature")float temperature, 
			@JsonProperty("humidity")float humidity) {
		super();
		//this.date = new Date();
		this.temperature = temperature;
		this.humidity = humidity;
	}
	
	/*public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}*/
	public float getTemperature() {
		return temperature;
	}
	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}
	public float getHumidity() {
		return humidity;
	}
	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}
	/*
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	*/
	
}
