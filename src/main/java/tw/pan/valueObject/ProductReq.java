package tw.pan.valueObject;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;

import lombok.Data;

@Data
public class ProductReq {
	@JsonProperty(value="p_name")
	private String p_name;
	
	@JsonProperty(value="p_main")
	private String p_main;
	
	@JsonProperty(value="p_detail")
	private String p_detail;
	
	@JsonProperty(value="price")
	private int price;
	
	@JsonProperty(value="invantory")
	private int invantory;
	
	@JsonProperty(value="description")
	private String description;
	
	@JsonProperty(value="s_description")
	private String s_description;
	
	@JsonProperty(value="p_img")
	private String p_img;
	
	@JsonProperty(value="user_acc")
	private String user_acc;

}
