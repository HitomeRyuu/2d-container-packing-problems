package com.shuwei.test;


import static java.lang.Integer.min;
import static java.lang.Integer.max;
import static java.lang.Math.max;
import static java.lang.Math.min;

public class TestDP {



	public static void main(String[] args) {
	int bigLong = 100;
	int bigShort = 8;

	int smallLong = 100;
	int smallShort =4;

	System.out.println(DP(bigLong,bigShort,smallLong,smallShort));
	}

	
	private static Double DP(int bl, int bs, int sl, int ss){
		if(bl<Math.min(sl,ss)||bs<Math.min(sl,ss))
		{return 0.0;}
		else if (bs>sl&&bl>sl)
			//return Math.max(DP(bl,bs-sl,sl,ss)+bs>sl?Math.floor(bl/ss):0.0,DP(bl-sl,bs,sl,ss)+bl>sl?Math.floor(bs/ss):0.0);
		{return Math.max(DP(bl,bs-sl,sl,ss)+Math.floor(bl/ss),DP(bl-sl,bs,sl,ss)+Math.floor(bs/ss));}
		else
		{return Math.max(DP(bl,bs-ss,sl,ss)+Math.floor(bl/sl),DP(bl-ss,bs,sl,ss)+Math.floor(bs/sl));}
	}

}
