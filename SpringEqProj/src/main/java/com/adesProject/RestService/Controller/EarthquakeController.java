package com.adesProject.RestService.Controller;



import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.adesProject.RestService.Model.Earthquake;
import com.adesProject.RestService.Service.EqService;



@RestController
@RequestMapping("/")
public class EarthquakeController {
	
	@Autowired
	private EqService eqService;
	
	@GetMapping("/version")
	public String getVersionNum() {
		return eqService.findVersion();
	}
	
	//@GetMapping("/count")
	//public String getCount(String count , 
		//	@RequestParam(name = "format" , required = false) String format ,
		//	@RequestParam(name = "starttime", required = false) @DateTimeFormat(pattern="yyyy-MM-dd")DateTime starttime,
		//	@RequestParam (name = "endtime" , required = false) @DateTimeFormat(pattern="yyyy-MM-dd")DateTime endtime){
		//return eqService.getCountBasedOnDates(starttime.toString(), endtime.toString());
	}
	
	//@GetMapping("/query")
	//public String getQuery(String count , 
		//	@RequestParam(name = "format" , required = false) String format ,
			//@RequestParam(name = "starttime", required = false) String starttime,
			//@RequestParam (name = "endtime" , required = false) String endtime){
		
	//}
	
	
	
	

}
