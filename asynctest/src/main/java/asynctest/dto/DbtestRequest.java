package asynctest.dto;

import java.util.List;

import javax.validation.constraints.NotEmpty;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

//@Data setter getter refrenceURL
//https://qiita.com/satty3104/items/42fc67a7e9fca0f807a9
@Data
public class DbtestRequest {

	private String test;
	
	private List<Datalist> datalist;

	@Data
	public static class Datalist {		

		@JsonProperty("ID")
		@NotEmpty
		private String ID;
		
		@JsonProperty("NAME")
		private String NAME;
		@JsonProperty("NAME_KANA")
		private String NAME_KANA;
		@JsonProperty("PASS")
		private String PASS;
		@JsonProperty("MAIL")
		private String MAIL;
		@JsonProperty("JOB")
		private String JOB;
		@JsonProperty("PERMISSION")
		private String PERMISSION;
		@JsonProperty("ValidFlag")
		private String ValidFlag;
		@JsonProperty("CREATEDATE")
		private String CREATEDATE;
		@JsonProperty("UPDATEDATE")
		private String UPDATEDATE;
	}
}
