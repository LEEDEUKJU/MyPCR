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
		
		final MyPCR pcr = new MyPCR();
		
		//String data = pcr.loadProtocolfromFile(("ProtocolText"));
		
		//ArrayList<Protocol> list = pcr.makeProtocolList(data);			
		
		//pcr.showProtocolList(list);
		
		pcr.start();
		
		while(true){
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
			try {
				String cmd = in.readLine();
				//System.out.println(cmd);
				
				if ( cmd.equals("start"))
					//System.out.println("start!");
					pcr.startPCR();
				else if ( cmd.equals("stop"))
					//System.out.println("stop!");
					pcr.stopPCR();
				else if ( cmd.equals("print"))
					//System.out.println("print!");
					pcr.printStatus();
				else if ( cmd.equals("monitor")){
					pcr.setMonitoring(true);
					
					Thread t = new Thread(){
						public void run(){
							while(pcr.isMonitoring()){
								try{
									Thread.sleep(10);
								}catch(InterruptedException e){
									e.printStackTrace();
								}
								
								pcr.printStatus();
							}
						}
					};
					t.start();
					
					in.readLine();
					pcr.setMonitoring(false);
				}
				else{
					
				}
					
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
