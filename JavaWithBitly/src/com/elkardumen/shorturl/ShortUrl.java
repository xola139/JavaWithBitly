package com.elkardumen.shorturl;
import com.rosaloves.bitlyj.Url;
import static com.rosaloves.bitlyj.Bitly.*;

public class ShortUrl {

	public static void main(String ...args){
		//Colocamos el API key:
		String urlLong="http://www.oracle.com/technetwork/es/java/javase/downloads/jdk7-downloads-1880260.html";
		Url url = as("o_282u8mub6u", "R_33c226de39e7c87437a6e0a3079ccf51").call(shorten(urlLong));
		System.out.println(url.getShortUrl());
		
		
	}
	
}
