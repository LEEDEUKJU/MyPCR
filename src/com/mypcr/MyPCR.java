package com.mypcr;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import com.mypcr.emulator.Protocol;


public class MyPCR extends Thread {
	private double mTemp;
	private double mPrevTemp, mTargetTemp;
	private int state;
	
	private boolean isMonitor = false;
	
	private static final int STATE_READY = 0x00;
	private static final int STATE_RUN = 0x01;
	
	private static final double DEFAULT_TEMP = 25.1;
	
	public void setMonitoring(boolean monitor){
		isMonitor = monitor;
	}
	
	public boolean isMonitoring(){
		return isMonitor;
	}
	
	public MyPCR(){
		mTemp = DEFAULT_TEMP;
		mPrevTemp = DEFAULT_TEMP;
		mTargetTemp = DEFAULT_TEMP;
		state = STATE_READY;
	}
	
	public void run(){
		while(true){
			try{
				Thread.sleep(100);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			
			//100ms 마다 0.5도씩 상승
			if( state == STATE_RUN)
				mTemp = mTemp + 0.69;
			else
				mTemp = DEFAULT_TEMP;
				
			//start 일때만, ready 일때는 기본 온도로 변경
		}
	}
	
	public ArrayList<Protocol> makeProtocolList(String pcr)
	{
		
		if( pcr == null)
			return null;
		
		String[] pcrs1 = pcr.split("\n"); // 한줄 씩  \n으로 짜른다
		
		ArrayList<Protocol> list1 = new ArrayList<Protocol>();
		
		try{
			for(int i=0; i<pcrs1.length; ++i)
			{
				String[] pcrss1 = pcrs1[i].split("\t");
			
				int temp = Integer.parseInt(pcrss1[1]);
				int time = Integer.parseInt(pcrss1[2]);
			
			
				Protocol p1 = new Protocol(pcrss1[0], temp, time);
				list1.add(p1);
			
			}
		}catch(NumberFormatException e){
			System.out.println("잘못 된 PCR 파일입니다");
			return null;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("잘못 된 PCR 파일을 출력하려 했습니다");
			return null;
		}
		return list1;
	}
	
	public String loadProtocolfromFile(String path){
		String result = "";
		BufferedReader in = null;
		String line2 = "";
		
		try {
			in = new BufferedReader(new FileReader(new File(path)));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return null;
		}
		try {
			String line = null;
			//String line2 = "";
			
			/*
			str = in.readLine();
			
			while(str != null){
				System.out.println(str);
				str = in.readLine();
				
			}
			*/
			
			 while( (line = in.readLine()) != null ){
			 	line2 = line2 + line + "\n";
			 	//System.out.println(line);
			 }
			  
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		return line2;
	}

	
	public void showProtocolList(ArrayList<Protocol> list){

		
		System.out.println("======Protocol======");
		System.out.println("label	temp	Time");
		
		if(list != null){
			for(int i=0; i<list.size(); ++i){
				Protocol p = list.get(i);
				
				System.out.println(p.getLabel() + "\t" + p.getTemp() + "\t" + p.getTime());
			}
		}
	
	}
	
	private String getStateString(){
		if(state == STATE_READY)
			return "준비 중";
		else
			return "동장 중";
	}
	
	public void printStatus(){
		System.out.println(String.format("상태 : %s, 온도 : %3.1f", getStateString(), mTemp));
	}
	
	public void startPCR(){
		state = STATE_RUN;
	}
	
	public void stopPCR(){
		state = STATE_READY;
	}
		
}
