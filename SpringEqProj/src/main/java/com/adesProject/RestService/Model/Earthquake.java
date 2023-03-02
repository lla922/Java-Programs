package com.adesProject.RestService.Model;


import java.util.Date;

import org.joda.time.DateTime;
import org.springframework.context.annotation.Bean;

public class Earthquake {
	
	public Long time;
	public String place;
	
	public String getPlace() {
		return place;
	}
	
	public Long getTime() {
		return time;
	}
	
	

	

}
