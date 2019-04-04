package com.example.websocketdemo.controller;

//created by Rutvik Patel

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

import com.example.websocketdemo.model.LocationBean;

//controller for message send and receive form web socket
@Controller
public class CommunicationController {
	
	private static final Logger logger = LoggerFactory.getLogger(CommunicationController.class);
	
	//in-memory storage of all user's location feed
	//which change by every new request
	public static Map<String, LocationBean> latestLocationFeed = new HashMap<String, LocationBean>();
	
    @MessageMapping("/saveLocation") //for saving current user's location in memory
    @SendTo("/app/getData") //for transmitting all connected user's latest location 
    public List<LocationBean> saveLocation(@Payload LocationBean bean, SimpMessageHeaderAccessor headerAccessor) {
        //getting current user's location from web socket
        headerAccessor.getSessionAttributes().put("username", bean.getUser());
        logger.debug("\tUser:"+bean.getUser()+" >>> LocationBean:"+bean.toString());
        
        //unique user wise latest location feed set in-memory hash map
        latestLocationFeed.put(bean.getUser(), bean);
        
        //converting map to list
        Collection<LocationBean> values = latestLocationFeed.values();
        ArrayList<LocationBean> listOfValues = new ArrayList<LocationBean>(values);
        logger.info("\tPublicLocationFeed:"+listOfValues.toString());
        
        //send all user's latest location feed
        return listOfValues;
    }
}