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
		
		if(sum == 0) System.out.println("����� 1 : ��");
		if(sum == 1) System.out.println("����� 1 : 7��");
		if(sum == 2) System.out.println("����� 1 : 6��");
		if(sum == 3) System.out.println("����� 1 : 5��");
		if(sum == 4) System.out.println("����� 1 : 4��");
		if(sum == 5) System.out.println("����� 1 : 3��");
		if(sum == 6) System.out.println("����� 1 : 2��");
		if(sum == 7) System.out.println("����� 1 : 1��");
		
		for(int i = 0; i<7; i++)
		{
			for (int j = 0; j<7; j++)
				{
					if(res[i] == a2[j])
						sum ++;
					    //System.out.print(i + " ");
				}
			
		}
		
		if(sum == 0) System.out.println("����� 2 : ��");
		if(sum == 1) System.out.println("����� 2 : 7��");
		if(sum == 2) System.out.println("����� 2 : 6��");
		if(sum == 3) System.out.println("����� 2 : 5��");
		if(sum == 4) System.out.println("����� 2 : 4��");
		if(sum == 5) System.out.println("����� 2 : 3��");
		if(sum == 6) System.out.println("����� 2 : 2��");
		if(sum == 7) System.out.println("����� 2 : 1��");
		
		for(int i = 0; i<7; i++)
		{
			for (int j = 0; j<7; j++)
				{
					if(res[i] == a3[j])
						sum ++;
					    //System.out.print(i + " ");
				}
			
		}
		
		if(sum == 0) System.out.println("����� 3 : ��");
		if(sum == 1) System.out.println("����� 3 : 7��");
		if(sum == 2) System.out.println("����� 3 : 6��");
		if(sum == 3) System.out.println("����� 3 : 5��");
		if(sum == 4) System.out.println("����� 3 : 4��");
		if(sum == 5) System.out.println("����� 3 : 3��");
		if(sum == 6) System.out.println("����� 3 : 2��");
		if(sum == 7) System.out.println("����� 3 : 1��");
		
	}
	
	
}

