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

		Event event = new Event(456l, "IPhone 100 Launch", "Grand Launch");
//<---		//To create a breakpoint, double click next to the line number
		// when u debug a program, it will stop at every breakpoint
		//Right click->debug as -> java application
		/*
		 * event.id = 456l; event.name = "IPhone 100 Launch"; event.description =
		 * "Grand Launch";
		 */
		//f8 for next breakpoint
		//f5 step into selected method and where it comes from
		//f7 step return it returns to wherever the method was called
		//f6 step over it will go into the next line
		System.out.println(event.getDescription());
		System.out.println(event.getName());

		EventManager ev = new EventManagerImpl();
		System.out.println(ev.create(1234l).getId());

		EventManager em = new EventManagerImpl2();
		System.out.println(em.create(1234l).getName());

	}
}
