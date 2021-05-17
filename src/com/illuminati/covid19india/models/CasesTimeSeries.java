package com.illuminati.covid19india.models;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CasesTimeSeries {
	
	private int dailyconfirmed;
	private int dailydeceased;
	private int dailyrecovered;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date dateymd;
	
	private int totalconfirmed;
	private int totaldeceased;
	private int totalrecovered;

}
