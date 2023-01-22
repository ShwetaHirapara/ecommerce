package com.ecommerce.utilities;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Verifybrokenlink {
	public int validlink=0;
	public int invalidlink=0;
	
	public void verfiybrokenlinks(String linkURL) {
		try {
			URL url=new URL(linkURL);
			HttpURLConnection httpurlconnect=(HttpURLConnection)url.openConnection();
			httpurlconnect.connect();
			
			int respcode=httpurlconnect.getResponseCode();
			
			if(respcode>=400) {
				System.out.println(linkURL+": is a broken link"+"--"+httpurlconnect.getResponseMessage()+"--"+httpurlconnect.getResponseCode());
				invalidlink=invalidlink+1;
			}else {
				System.out.println(url+":is a valid link"+"--"+httpurlconnect.getResponseMessage()+"--"+httpurlconnect.getResponseCode());
				validlink=validlink+1;
			}
			httpurlconnect.disconnect();
		}catch(MalformedURLException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
				}
		}
	
}
