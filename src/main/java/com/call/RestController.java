package com.call;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.call.model.Track;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping("/")
	public List<Track> call() {
		Track[] result=restTemplate.getForObject("http://seralockalb-759407860.us-east-2.elb.amazonaws.com/packagetracking-api/view-trackingdetails/20084,jrjue565"
				, Track[].class);
		return Arrays.asList(result);
		
	}
	@GetMapping("/hello")
	public String hello(){
		return "Hello Welcome..";
	}
	

	
}
