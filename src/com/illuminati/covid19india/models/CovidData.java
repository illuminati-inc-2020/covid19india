package com.illuminati.covid19india.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CovidData {
	
	private List<CasesTimeSeries> cases_time_series;
	private List<StateWise> statewise;
	private List<Tested> tested;
	
}
