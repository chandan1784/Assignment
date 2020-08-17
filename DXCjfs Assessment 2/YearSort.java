package com.mupack.demo;

import java.util.Comparator;



public class YearSort implements Comparator<Cars> {

	@Override
	public int compare(Cars o1, Cars o2) {		
		return o1.getManuYear() - o2.getManuYear();
	}

}