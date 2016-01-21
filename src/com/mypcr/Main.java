package com.mypcr;

import java.util.ArrayList;

import com.mypcr.emulator.Protocol;

public class Main {

	public static void main(String[] args) {
		/*	
		//List
		//(data next*) -> (data next*)
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("test1");
		list.add("test2");
		list.add("test4");
		list.add("test4");
		list.add("test3");
		
		System.out.println(list.size());
		
		Collections.sort(list); // Arrays.sort 는 기본형만 지원
		
		for(String i:list)
		{
			System.out.println(i);
		}
	*/
		String pcr = "1	25	40\n" + "2	40	50\n" + "3	60	100\n";
		
		String[] pcrs = pcr.split("\n"); // 한줄 씩  \n으로 짜른다
		
		ArrayList<Protocol> list = new ArrayList<Protocol>();
		
		for(int i=0; i<pcrs.length; ++i)
		{
			String[] pcrss = pcrs[i].split("\t");
			
			int temp = Integer.parseInt(pcrss[1]);
			int time = Integer.parseInt(pcrss[2]);
			
			
			Protocol p1 = new Protocol(pcrss[0], temp, time);
			list.add(p1);
			
		}
		
		
		System.out.println("======Protocol======");
		System.out.println("label	temp	Time");
		for(int i=0; i<list.size(); ++i){
			Protocol p = list.get(i);
			
			System.out.println(p.getLabel() + "\t" + p.getTemp() + "\t" + p.getTime());
		}
		
	}
}

