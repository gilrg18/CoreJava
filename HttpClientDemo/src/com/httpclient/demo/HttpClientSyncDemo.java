package com.httpclient.demo;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class HttpClientSyncDemo {
	/*
	 * The first step was to create a HTTP Client
	 * 
	 * There are two ways to do it.
	 * 
	 * You can use HTTP
	 * 
	 * Client Dot new HTTP client
	 * 
	 * You will get a default HTTP client .object with default set
	 * 
	 * If you want to manually set the parameters, you will use the new builder
	 * method so that you can set
	 * 
	 * the HTTP properties on it.
	 * 
	 * Then you create HTTP request using HTTP request.
	 * 
	 * Dot new builder to that builder.
	 * 
	 * You can pass a URL like this or you can take this out.
	 * 
	 * And here you can use another method called URI
	 * 
	 * see that method .
	 * 
	 * You can pass the URI
	 * 
	 * URI like that as well.
	 * 
	 * Then you use whichever method you want to.
	 * 
	 * By default it is get anyways.
	 * 
	 * But here we are making it explicit.
	 * 
	 * Then dot Build will create a HTTP request for you.
	 * 
	 * And the next step was to call the send method pass in the HTTP request a body
	 * handler.
	 * 
	 * In this case, the body handler the string use it is HTTP response off type
	 * string on the HTTP response.
	 * 
	 * You have the status code
	 * 
	 * You have the body and there are headers also which will process later.
	 */
	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder(new URI("https://fakerestapi.azurewebsites.net/api/v1/Activities"))
				.GET().build();

		request = HttpRequest.newBuilder(new URI("https://fakerestapi.azurewebsites.net/api/v1/Activities"))
				.POST(BodyPublishers.ofString("{\r\n" + "  \"id\": 0,\r\n" + "  \"title\": \"string\",\r\n"
						+ "  \"dueDate\": \"2020-12-20T22:02:49.783Z\",\r\n" + "  \"completed\": true\r\n" + "}"))
				.header("Content-Type", "application/json").build();
				//remove header and get an error that contains what should be the header
		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
		System.out.println("Status: " + response.statusCode());
		System.out.println(response.body());
		//HANDLING HEADERS
		HttpHeaders headers = response.headers();
		System.out.println(headers.map());
	}
}
