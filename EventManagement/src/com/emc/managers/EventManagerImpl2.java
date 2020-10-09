package com.emc.managers;

import com.emc.entitites.Event;

public class EventManagerImpl2 implements EventManager {

	@Override
	public Event create(Long id) {
		return new Event(id,"Mac Book Launch", "New Generation Of Mac Books Launch");
	}
	
}
