package com.mypcr;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Lotto {
	public int[] makeLotto()
	{
		int []a5 = new int[7];
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0; i<a5.length; i++)
		{
				/*
				System.out.print((i+1) + "입력하세요 : ");
				
				String str = in.readLine();
				
				
				int res = Integer.parseInt(str);
				*/
				int res = ((int)(Math.random()*45)+1);
				
				for(int j=0; j<i; j++){
					if(res == a5[j]){
						--i;
						System.out.println("중복입니다");
						break;
					}
				}
				
				a5[i] = res;
				
				//System.out.println((i+1) + ":" + res);
		}
		
		return a5;
	}
}