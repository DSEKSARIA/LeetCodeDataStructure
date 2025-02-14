package com.streamapi;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {



	public static void main(String[] args) {
		
		List<Integer> myList = new ArrayList<>();
		for(int i=0; i<100; i++) myList.add(i);
		
		//sequential stream
		Stream<Integer> sequentialStream = myList.stream();
		
		//parallel stream
		Stream<Integer> parallelStream = myList.parallelStream();
		
		//using lambda with Stream API, filter example
		Stream<Integer> highNums = parallelStream.filter(p -> p > 90);
		//using lambda in forEach
		highNums.forEach(p -> System.out.print(" "+p));
		System.out.println("\n");
		Stream<Integer> highNumsSeq = sequentialStream.filter(p -> p > 90);
		highNumsSeq.forEach(p -> System.out.print(" "+p));

		HttpClient httpClient = HttpClient.newBuilder()
				.version(HttpClient.Version.HTTP_2)
				.connectTimeout(Duration.ofSeconds(20))
				.build();
		HttpRequest httpRequest = HttpRequest.newBuilder()
				.GET()
				.uri(URI.create("http://localhost:" + 8879))
				.build();
		HttpResponse httpResponse = null;
		try {
			httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
		} catch (IOException e) {
			throw new RuntimeException(e);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		System.out.println(httpResponse.body());
		//assertThat(httpResponse.body()).isEqualTo("Hello from the server!");

	}



}