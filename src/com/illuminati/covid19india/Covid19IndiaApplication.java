package com.illuminati.covid19india;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.illuminati.covid19india.models.CovidData;

public class Covid19IndiaApplication {
	
	public static void main(String[] args) {
		URL url;
		try {
			url = new URL("https://api.covid19india.org/data.json");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestProperty("accept", "application/json");
			InputStream responseStream = connection.getInputStream();
			ObjectMapper mapper = new ObjectMapper();
			CovidData data = mapper.readValue(responseStream, CovidData.class);
//			data.getCases_time_series().stream().forEach(c -> System.out.println(c));
//			data.getStatewise().stream().forEach(c -> System.out.println(c));
			data.getTested().stream().forEach(c -> System.out.println(c));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
