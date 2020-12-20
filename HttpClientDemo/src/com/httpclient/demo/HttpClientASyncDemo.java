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
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class HttpClientASyncDemo {

	public static void main(String[] args)
			throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder(new URI("https://fakerestapi.azurewebsites.net/api/v1/Activities"))
				.GET().build();

		request = HttpRequest.newBuilder(new URI("https://fakerestapi.azurewebsites.net/api/v1/Activities"))
				.POST(BodyPublishers.ofString("{\r\n" + "  \"id\": 0,\r\n" + "  \"title\": \"string\",\r\n"
						+ "  \"dueDate\": \"2020-12-20T22:02:49.783Z\",\r\n" + "  \"completed\": true\r\n" + "}"))
				.header("Content-Type", "application/json").build();
		// remove header and get an error that contains what should be the header

		/*
		 * So here you have invoked, the send a sink method instead of simply send
		 * method then when you get
		 * 
		 * that response back, you are applying a method called HTTP body on that
		 * response so that it could
		 * 
		 * be converted on that response
		 * 
		 * Invoke the get method, you get the string respons out.
		 */
		CompletableFuture<HttpResponse<String>> response = client.sendAsync(request, BodyHandlers.ofString());
		String body = response.thenApply(HttpResponse::body).get();
		System.out.println(body);

		/*
		 * Synchronous basically means that you can only execute one thing at a time.
		 * Asynchronous means that you can execute multiple things at a time and you
		 * don't have to finish executing the current thing in order to move on to next
		 * one
		 */

	}
}
