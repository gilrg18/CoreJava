package com.emc.managers;

import com.emc.entitites.Event;

public class EventManagerImpl implements EventManager {
	
	@Override
	public Event create(Long id){
		return new Event(id ,null, null);
	}
}
