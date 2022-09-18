package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
@SpringBootApplication
public class BootApplication {

	public static void main(String[] args) throws IOException, InterruptedException {
		SpringApplication.run(BootApplication.class, args);
/*
		var url = "https://api.openweathermap.org/data/2.5/forecast?q=london&appid=d2929e9483efc82c82c32ee7e02d563e&cnt=10";
		var request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
		var client = HttpClient.newBuilder().build();
		var response = client.send(request, HttpResponse.BodyHandlers.ofString());

		JSONObject jsonObj = new JSONObject((Map) response);

		System.out.println(jsonObj);

		System.out.println(response.statusCode());
		System.out.println(response.body());*/

	}
}
