package com.adesProject.RestService.Service;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.adesProject.RestService.Model.Earthquake;
import com.fasterxml.jackson.databind.util.JSONPObject;

import net.minidev.json.JSONObject;

@Service
public class EqService {
	
	@Autowired
	private RestTemplate template = new RestTemplate();
	public ArrayList<Earthquake> list = new ArrayList<>();
	
	@SuppressWarnings("unchecked")
	public List<Earthquake> allTheEarthquakesInLast30Days(List<Earthquake> a){
	   
	  a = template.getForObject
			  ("https://earthquake.usgs.gov/fdsnws/event/1/query?format=text", ArrayList.class);
	  return list;
		
	}
	
	
	public String findVersion() {
		return template.getForObject("https://earthquake.usgs.gov/fdsnws/event/1/version", String.class);
	}
	
	String url = "https://earthquake.usgs.gov/fdsnws/event/1/[METHOD[?PARAMETERS]]";
	
	public String getCount(){
		return template.getForObject("https://earthquake.usgs.gov/fdsnws/event/1/count?format=text", String.class);
	}
	
	//public String getCountBasedOnDates(String starttime , String endtime) {
		
		//List<Earthquake> a = new ArrayList<>();
		
		//Earthquake[] forObject = template.getForObject("https://earthquake.usgs.gov/fdsnws/event/1/query?format=text", Earthquake[].class);
		//for(int i = 0; i < forObject.length; i++) {
			//Earthquake eq = forObject[i];
			
		//}
		
	//}
	
	public String getAllEarthquakesLast30days() {
		return template.getForObject("https://earthquake.usgs.gov/fdsnws/event/1/query?format=text", String.class);
	}
	
}
