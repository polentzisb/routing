package com.polentzi.routing;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	public static void main(String[] args) {
		SpringApplication.run(DojoController.class, args);
	}
	
	@RequestMapping("/{track}")
    public String showLesson(@PathVariable("track") String track){
    	if (track.equals("dojo")){
    		track = "¡El Dojo es increíble!";
    	}else if (track.equals("burbank-dojo")) {
    		track = "El Dojo Burbank está localizado al sur de California"; 
    	}else if (track.equals("san-jose")) {
    		track= "El Dojo SJ es el cuartel general";		
    	}
    	return track;
    }
}