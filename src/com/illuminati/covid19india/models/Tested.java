package com.illuminati.covid19india.models;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.illuminati.covid19india.deserializer.LocalLongDeserializer;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Tested {

	private long dailyrtpcrsamplescollectedicmrapplication;

	@JsonDeserialize(using = LocalLongDeserializer.class)
	private long positivecasesfromsamplesreported;

	@JsonDeserialize(using = LocalLongDeserializer.class)
	private long samplereportedtoday;
	
	private long firstdoseadministered;
	private long seconddoseadministered;
	
	private long frontlineworkersvaccinated1stdose;
	private long frontlineworkersvaccinated2nddose;
	private long healthcareworkersvaccinated1stdose;
	private long healthcareworkersvaccinated2nddose;
	
	private long over45years1stdose;
	private long over45years2nddose;
	private long over60years1stdose;
	private long over60years2nddose;
	
	@JsonProperty("registration18-45years")
	private long registration18_45years;
	private long registrationabove45years;
	private long registrationflwhcw;
	private long registrationonline;
	private long registrationonspot;
	
	private String source;
	private String source2;
	private String source3;
	private String source4;
	
	@JsonFormat(pattern = "d/M/yyyy")
	private Date lastupdatedtime;
	
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	private Date updatetimestamp;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date testedasof;

	private long testsconductedbyprivatelabs;

	@JsonProperty("to60yearswithco-morbidities1stdose")
	private long to60yearswithco_morbidities1stdose;

	@JsonProperty("to60yearswithco-morbidities2nddose")
	private long to60yearswithco_morbidities2nddose;
	
	private long totaldosesadministered;
	private long totalindividualsregistered;
	private long totalindividualstested;
	private long totalindividualsvaccinated;
	
	@JsonDeserialize(using = LocalLongDeserializer.class)
	private long totalpositivecases;
	
	private long totalrtpcrsamplescollectedicmrapplication;
	private long totalsamplestested;
	private long totalsessionsconducted;
	private long years1stdose;

}
