package com.rahul.busseats;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Generated("com.robohorse.robopojogenerator")
public class JsonMember0Class implements Serializable {

	@SerializedName("sc")
	private String sc;

	@SerializedName("t")
	private String T;

	@SerializedName("n")
	private String N;

	public void setSc(String sc){
		this.sc = sc;
	}

	public String getSc(){
		return sc;
	}

	public void setT(String T){
		this.T = T;
	}

	public String getT(){
		return T;
	}

	public void setN(String N){
		this.N = N;
	}

	public String getN(){
		return N;
	}

	@Override
 	public String toString(){
		return 
			"JsonMember0Class{" + 
			"sc = '" + sc + '\'' + 
			",t = '" + T + '\'' + 
			",n = '" + N + '\'' + 
			"}";
		}
}