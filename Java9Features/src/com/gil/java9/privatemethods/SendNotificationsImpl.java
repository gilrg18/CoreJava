package com.gil.java9.privatemethods;

public class SendNotificationsImpl implements SendNotifications {

	public static void main(String[] args) {
		SendNotifications sn = new SendNotificationsImpl();
		sn.sendNotification();
		//Use the name of the interface to use static methods inside your interface
		SendNotifications.sendNotifications();
	}

}
