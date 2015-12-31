package com.mypcr;

import com.mypcr.emulator.MyPCR;

public class Main {

	public static void main(String[] args) {
		MyPCR mypcr = new MyPCR();
		
		int res = mypcr.add(2, 1);
		System.out.println(res);

		int res2 = mypcr.sub(2, 1);
		System.out.println(res2);
		
		int res3 = mypcr.mul(2, 1);
		System.out.println(res3);
		
		int res4 = mypcr.div(2, 0);
		System.out.println(res4);
	}

}

