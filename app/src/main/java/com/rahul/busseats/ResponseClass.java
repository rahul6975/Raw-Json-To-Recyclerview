package com.rahul.busseats;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class ResponseClass implements Serializable {

	@SerializedName("0")
	private JsonMember0Class jsonMember0;

	@SerializedName("1")
	private JsonMember1Class jsonMember1;

	@SerializedName("3")
	private JsonMember3Class jsonMember3;

	@SerializedName("4")
	private JsonMember4Class jsonMember4;

	public void setJsonMember0(JsonMember0Class jsonMember0){
		this.jsonMember0 = jsonMember0;
	}

	public JsonMember0Class getJsonMember0(){
		return jsonMember0;
	}

	public void setJsonMember1(JsonMember1Class jsonMember1){
		this.jsonMember1 = jsonMember1;
	}

	public JsonMember1Class getJsonMember1(){
		return jsonMember1;
	}

	public void setJsonMember3(JsonMember3Class jsonMember3){
		this.jsonMember3 = jsonMember3;
	}

	public JsonMember3Class getJsonMember3(){
		return jsonMember3;
	}

	public void setJsonMember4(JsonMember4Class jsonMember4){
		this.jsonMember4 = jsonMember4;
	}

	public JsonMember4Class getJsonMember4(){
		return jsonMember4;
	}

	@Override
 	public String toString(){
		return 
			"ResponseClass{" + 
			"0 = '" + jsonMember0 + '\'' + 
			",1 = '" + jsonMember1 + '\'' + 
			",3 = '" + jsonMember3 + '\'' + 
			",4 = '" + jsonMember4 + '\'' + 
			"}";
		}
}