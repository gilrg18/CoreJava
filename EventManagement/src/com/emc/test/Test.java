package com.emc.test;

import com.emc.entitites.Event;
import com.emc.entitites.Organizer;
import com.emc.managers.EventManager;
import com.emc.managers.EventManagerImpl;
import com.emc.managers.EventManagerImpl2;

public class Test {
	public static void main(String[] args) {
		Organizer organizer = new Organizer();
		organizer.setId(123l);
		organizer.setName("Apple Inc");
		System.out.println(organizer);
		System.out.println(organizer.getName());
		
		Event event = new Event(456l,"IPhone 100 Launch","Grand Launch" );
	/*	event.id = 456l;
		event.name = "IPhone 100 Launch";
		event.description = "Grand Launch";*/
		System.out.println(event.getDescription());
		
		EventManager ev = new EventManagerImpl();
		System.out.println(ev.create(1234l).getId());
		
		EventManager em = new EventManagerImpl2();
		System.out.println(em.create(1234l).getName());
		
	}
}
