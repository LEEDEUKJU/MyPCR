package com.mypcr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.mypcr.emulator.MyPCR;

public class Main {

	public static void main(String[] args) {
			
		Lotto a = new Lotto();
		
		int []res = a.makeLotto();
		
		int []a1 = a.makeLotto();
		
		int []a2 = a.makeLotto();
		
		int []a3 = a.makeLotto();
		
		int sum = 0; 
		
		for(int i = 0; i<7; i++)
		{
			for (int j = 0; j<7; j++)
				{
					if(res[i] == a1[j])
						sum ++;
					    //System.out.print(i + " ");
					
				}
			
		}
		
		if(sum == 0) System.out.println("사용자 1 : 꽝");
		if(sum == 1) System.out.println("사용자 1 : 7등");
		if(sum == 2) System.out.println("사용자 1 : 6등");
		if(sum == 3) System.out.println("사용자 1 : 5등");
		if(sum == 4) System.out.println("사용자 1 : 4등");
		if(sum == 5) System.out.println("사용자 1 : 3등");
		if(sum == 6) System.out.println("사용자 1 : 2등");
		if(sum == 7) System.out.println("사용자 1 : 1등");
		
		for(int i = 0; i<7; i++)
		{
			for (int j = 0; j<7; j++)
				{
					if(res[i] == a2[j])
						sum ++;
					    //System.out.print(i + " ");
				}
			
		}
		
		if(sum == 0) System.out.println("사용자 2 : 꽝");
		if(sum == 1) System.out.println("사용자 2 : 7등");
		if(sum == 2) System.out.println("사용자 2 : 6등");
		if(sum == 3) System.out.println("사용자 2 : 5등");
		if(sum == 4) System.out.println("사용자 2 : 4등");
		if(sum == 5) System.out.println("사용자 2 : 3등");
		if(sum == 6) System.out.println("사용자 2 : 2등");
		if(sum == 7) System.out.println("사용자 2 : 1등");
		
		for(int i = 0; i<7; i++)
		{
			for (int j = 0; j<7; j++)
				{
					if(res[i] == a3[j])
						sum ++;
					    //System.out.print(i + " ");
				}
			
		}
		
		if(sum == 0) System.out.println("사용자 3 : 꽝");
		if(sum == 1) System.out.println("사용자 3 : 7등");
		if(sum == 2) System.out.println("사용자 3 : 6등");
		if(sum == 3) System.out.println("사용자 3 : 5등");
		if(sum == 4) System.out.println("사용자 3 : 4등");
		if(sum == 5) System.out.println("사용자 3 : 3등");
		if(sum == 6) System.out.println("사용자 3 : 2등");
		if(sum == 7) System.out.println("사용자 3 : 1등");
		
	}
	
	
}

