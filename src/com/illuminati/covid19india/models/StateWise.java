package com.illuminati.covid19india.models;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class StateWise {

	private int active;
	private int confirmed;
	private int deaths;
	private int deltaconfirmed;
	private int deltadeaths;
	private int deltarecovered;
	private int migratedother;
	private int recovered;
	
	private String state;
	private String statecode;
	private String statenotes;

	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	private Date lastupdatedtime;

}
