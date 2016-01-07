package com.mypcr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.mypcr.emulator.MyPCR;

public class Main {

	public static void main(String[] args) {
			
		Lotto a = new Lotto();
		
		int []res = a.makeLotto();
		
		for(int i : res)
		{
			System.out.println(i);
			
		}
	}

}

