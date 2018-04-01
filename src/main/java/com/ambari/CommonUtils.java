package com.ambari;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CommonUtils {
	
	public static String executeScript(String scriptPath) {
		StringBuffer sb = new StringBuffer();
		try {
			String chmodScript = "chmod 777 " + scriptPath;
			Runtime.getRuntime().exec(chmodScript);
			Process ps = Runtime.getRuntime().exec(scriptPath);
			BufferedReader br = new BufferedReader(new InputStreamReader(ps.getInputStream()));
			String line = null;
			while((line = br.readLine()) != null){
				sb.append(line).append("<br/>");
			}
			ps.waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sb.toString();
	}
	
	public static String executeShellCommand(String command) {
		StringBuffer sb = new StringBuffer();
		try {
			Process ps = Runtime.getRuntime().exec(command);
			BufferedReader br = new BufferedReader(new InputStreamReader(ps.getInputStream()));
			String line = null;
			while((line = br.readLine()) != null){
				sb.append(line).append("<br/>");
			}
			ps.waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

}
