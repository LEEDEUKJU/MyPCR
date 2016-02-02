package com.mypcr;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.mypcr.emulator.Protocol;

public class Main {

	public static void main(String[] args) {
		
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader in = null;
		
		try {
			in = new BufferedReader(new FileReader(new File("ProtocolText")));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			String line = null;
			String line2 = "";
			
			/*
			str = in.readLine();
			
			while(str != null){
				System.out.println(str);
				str = in.readLine();
				
			}
			*/
			
			 while( (line = in.readLine()) != null ){
			 	line2 = line2 + line + "\n";
			 	System.out.println(line);
			 }
			
			MyPCR a = new MyPCR();
			
			ArrayList<Protocol> pcr = a.makeProtocolList(line2);			
			
			a.showProtocolList(pcr);
			 
			in.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
