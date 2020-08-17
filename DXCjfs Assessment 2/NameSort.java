package com.mupack.demo;

import java.util.Comparator;


public class NameSort implements Comparator<Cars> {

	@Override
	public int compare(Cars n1, Cars n2) {		
		return n1. getCarName().compareTo(n2. getCarName());
	}

}