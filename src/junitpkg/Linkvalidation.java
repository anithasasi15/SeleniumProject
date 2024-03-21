package junitpkg;

import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Test;

public class Linkvalidation {
	String link="https://www.google.com";
	@Test
	public void testing()
	{
	try 
	{
	URL u=new URL(link);
	HttpURLConnection con= (HttpURLConnection)u.openConnection();
	int code=con.getResponseCode();
	if(code==200)
	{
		System.out.println("The response code is 200");
	}
	else
	{
		System.out.println("The code is not expected");
	}
	}
	catch (Exception e) {
		System.out.println(e.getMessage());
	}
	
	}
}
