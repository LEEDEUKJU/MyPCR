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
		String pcr1 = "1	50	40\n" + "2	kk	50\n" + "3	60	100\n";
		String pcr2 = "1	25	40\n" + "2	40	50\n" + "3	60\n";
		
		MyPCR a = new MyPCR();
		ArrayList<Protocol> pcr11 = a.makeProtocolList(pcr1);
		ArrayList<Protocol> pcr22 = a.makeProtocolList(pcr2);
		
		//if(!pcr11.equals(null))
		a.showProtocolList(pcr11);
		//if(!pcr22.equals(null))
		a.showProtocolList(pcr22);
		
		/*String[] pcrs1 = pcr1.split("\n"); // 한줄 씩  \n으로 짜른다
		String[] pcrs2 = pcr2.split("\n"); // 한줄 씩  \n으로 짜른다
		
		ArrayList<Protocol> list1 = new ArrayList<Protocol>();
		ArrayList<Protocol> list2 = new ArrayList<Protocol>();
		
		try{
			for(int i=0; i<pcrs1.length; ++i)
			{
				String[] pcrss1 = pcrs1[i].split("\t");
			
				int temp = Integer.parseInt(pcrss1[1]);
				int time = Integer.parseInt(pcrss1[2]);
			
			
				Protocol p1 = new Protocol(pcrss1[0], temp, time);
				list1.add(p1);
			
			}
	
		
			System.out.println("======Protocol======");
			System.out.println("label	temp	Time");
			for(int i=0; i<list1.size(); ++i){
				Protocol p = list1.get(i);
			
				System.out.println(p.getLabel() + "\t" + p.getTemp() + "\t" + p.getTime());
			}
		}catch(NumberFormatException e){
			System.out.println("잘못 된 PCR 파일입니다");
		}

		
		try{
			for(int i=0; i<pcrs2.length; ++i)
			{
				String[] pcrss2 = pcrs2[i].split("\t");
			
				int temp = Integer.parseInt(pcrss2[1]);
				int time = Integer.parseInt(pcrss2[2]);
			
			
				Protocol p2 = new Protocol(pcrss2[0], temp, time);
				list2.add(p2);
			
			}
		
			System.out.println("======Protocol======");
			System.out.println("label	temp	Time");
			for(int i=0; i<list2.size(); ++i){
				Protocol p = list2.get(i);
			
				System.out.println(p.getLabel() + "\t" + p.getTemp() + "\t" + p.getTime());
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("잘못 된 PCR 파일을 출력하려 했습니다.");
			return;
		}*/
	}
}

