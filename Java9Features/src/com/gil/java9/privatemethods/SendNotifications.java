package com.gil.java9.privatemethods;

//Private methods in interfaces
public interface SendNotifications {
	static void sendNotifications() {
		// System.out.println("Establishing a connection..");
		establishConnection();
		System.out.println("Sending Multiple Notifications");
	}

	default void sendNotification() {
		// System.out.println("Establishing a connection..");
		establishConnection();
		System.out.println("Sending Notification");
	}

	/*
	 * So here we have a common functionality which is establishing a connection.
	 * 
	 * That is where the private methods are very useful can come up with that
	 * private void establish connection.
	 */
	private static void establishConnection() {
		System.out.println("Estabishing a connection..");
	}
}
